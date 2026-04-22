//Menor Preço: Peça ao usuário para digitar preços de produtos.
// Enquanto o preço for diferente de 0, continue lendo.
// Ao final, mostre qual foi o menor preço digitado.

import java.util.Scanner;
public class Exe48_MenorPreço {
    static void main() {
        Scanner leia = new Scanner(System.in);
        int preco;
        int menor = 0;
        int posicao = 0;
        int cont = 0;

        System.out.println("Informe os preços dos produtos, caso queira encerrar digite '0'");

        do {
            System.out.print("Informe o preço do "+ (cont+1)+" produto: ");
            preco = leia.nextInt();

            if (preco != 0){
                cont += 1;

                if (cont == 1){
                    menor = preco;
                    posicao = cont + 1;
                }
                if (preco < menor){
                    menor = preco;
                    posicao = cont;
                }
            }




        }while (preco != 0);

        System.out.println("O menor valor informado se encontra na posição: "+ posicao + "° e possue o valor de: "+ menor);

    }


}