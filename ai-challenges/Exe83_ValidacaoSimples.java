//Validação simples (While): Peça para o usuário digitar "SIM" ou "NAO".
// Enquanto ele não digitar um dos dois, continue pedindo.

import java.util.Scanner;
public class Exe83_ValidacaoSimples {
    static void main() {
        Scanner  leia = new Scanner(System.in);
        String resposta;

        do {
            System.out.println("Digite SIM ou NAO:  ");
            resposta = leia.next();

        }while ((!resposta.equals("SIM")) && (!resposta.equals("NAO")));

    }
}
