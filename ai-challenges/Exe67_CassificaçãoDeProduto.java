//Classificação de Produto
//Peça o código de um produto (inteiro).
//
//Se for 1: Alimento não perecível.
//
//Se for 2, 3 ou 4: Alimento perecível.
//
//Se for 5 ou 6: Vestuário.
//
//Se for 7: Higiene Pessoal.
//
//Qualquer outro: Código inválido.
//(Dica: No switch, você pode colocar case 2, 3, 4: em versões mais novas do Java ou empilhar os cases).

import java.util.Scanner;
public class Exe67_CassificaçãoDeProduto {
    static void main() {
        Scanner leia = new Scanner(System.in);
        int produto;

        System.out.print("Digite o código do produto: ");
        produto = leia.nextInt();

        if ((produto > 7) || (produto < 1)){
            System.out.println("Código inválido.");
        }else{

            switch (produto){

                case 1:
                    System.out.println("Alimento não perecível.");
                    break;
                case 2:
                case 3:
                case 4:
                    System.out.println("Alimento perecível.");
                    break;
                case 5:
                case 6:
                    System.out.println("Vestuário.");
                    break;
                case 7:
                    System.out.println("Higiene Pessoal.");
                    break;

        }


        }




    }
}
