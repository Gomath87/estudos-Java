//Caixa de Loja (Scanner + Método com Parâmetro)
//Objetivo: Usar o Scanner para passar valores para um cálculo dentro da classe.
//Classe Produto: Atributo String nome e double preco.
// Método aplicarDesconto(double porcentagem) que diminui o preço.
//No Main: Peça o nome e o preço de um produto. Depois, peça a porcentagem de desconto.
// Crie o produto, aplique o desconto e mostre o novo preço.

import java.util.Scanner;
public class Exe126_CaixaDeLoja {
    static void main() {
        Scanner leia = new Scanner(System.in);



        String produto;
        double valor;
        double percent;

        System.out.print("Informe o nome do produto: ");
        produto = leia.nextLine();

        System.out.print("Informe o valor da peça: ");
        valor = leia.nextDouble();

        System.out.print("Informe a porcentagem do desconto %: ");
        percent = leia.nextDouble();

        Produto peca = new Produto(produto,valor);
        peca.aplicarDesconto(percent);



    }
}

class Produto {
    String nome;
    double preco;

    public  Produto (String nome, double preco){
        this.nome = nome;
        this.preco = preco;


    }

    public void aplicarDesconto ( double porcentagem){
        double calculo = preco - ((preco * porcentagem) / 100) ;
        System.out.println("A peça "+nome+" que custava R$:"+preco+" com desconto vai ficar por R$:"+calculo);

    }

}