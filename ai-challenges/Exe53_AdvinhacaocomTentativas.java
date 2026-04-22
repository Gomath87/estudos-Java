//Adivinhação com Tentativas: O programa define um número secreto.
//Use um while para o usuário tentar adivinhar. A cada erro, diga se é maior ou menor.
// Limite a 5 tentativas usando um
// contador no while.

import java.util.Scanner;
public class Exe53_AdvinhacaocomTentativas {
    static void main() {
        Scanner leia = new Scanner(System.in);
        int cont = 1;
        int secret = 5;
        int numero;
        boolean result = false;

        System.out.println("-----------------------------------------------------------------------------------------");
        System.out.println("Bom neste jogo você vai tentar advinhar o número secreto, você tem 5 chances! Boa sorte!");
        System.out.println("-----------------------------------------------------------------------------------------");
        System.out.println();

        while(cont < 6){
            System.out.print("Digite o "+(cont)+"° número: ");
            numero = leia.nextInt();

            if (numero == secret){
                System.out.println("Parabéns Você acertou!!!!!");
                result = true;
                break;
            } else if (numero > secret) {
                if (cont == 5){
                    break;
                }else{
                    System.out.println("O número secreto é MENOR do que "+numero+" restam "+(5 - cont)+" tentativas: ");
                }

            } else if (numero < secret) {
                if (cont == 5) {
                    break;
                } else{
                    System.out.println("O número secreto é MAIOR do que "+numero+" restam "+(5-cont)+" tentativas");
                }

            }
            cont++;

        }

        if (result){
            System.out.println("Você venceu, obrigado por participar!");
        }else {
            System.out.println("Infelizmente não foi desta vez, tente novamente!");
        }
        leia.close();
    }
}
