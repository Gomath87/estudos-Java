//Sistema de Votação (While + Switch + If)
//Crie um programa de votação com 3 candidatos (1, 2 e 3). Use um while que roda até o usuário digitar 0.
//Use switch para contar os votos de cada candidato.
//No final, use if para mostrar quem ganhou (quem teve mais votos).


import java.util.Scanner;
public class Exe100_SistemaDeVotacao {
    static void main() {
        Scanner leia = new Scanner(System.in);
        int resposta;
        int candidato1 = 0;
        int candidato2 = 0;
        int candidato3 = 0;

        do {

            System.out.println("Qual seu voto? (1, 2 ou 3)? ");
            resposta = leia.nextInt();

            switch (resposta){

                case 1:
                    candidato1 ++;
                    break;
                case 2:
                    candidato2 ++;
                    break;
                case 3:
                    candidato3 ++;
                    break;
                case 0:
                    System.out.println("Obrigado pela cooperação!");
                    break;
                default:
                    System.out.println("Por favor digite uma opção válida!");

            }

        }while (resposta != 0);

        if ((candidato1 > candidato2) && ( candidato1 > candidato3)){
            System.out.println("O vencedor foi o candidato 1");

        } else if ((candidato2 > candidato1) && (candidato2 > candidato3)) {
            System.out.println("O vencedor foi o candidato 2 ");

        }else if ((candidato3 > candidato1) && (candidato3 > candidato2)){
            System.out.println("O vencedor foi o candidato 3");

        } else if ((candidato1 == candidato2) && (candidato3 == candidato1)) {
            System.out.println("Ambos os três candidatos ficaram empatados!");

        } else if (candidato1 == candidato2) {
            System.out.println("Houve um empate entre o candidato 1 e o 2");

        } else if (candidato1 == candidato3) {
            System.out.println("Houve um empate entre o candidato 1 e o 3");

        } else if (candidato3 == candidato2) {
            System.out.println("Houve um empate entre o candidato 3 e o 2");

        }
    }
}


