//Validação de Idade: Use o while para obrigar o usuário a digitar uma idade entre 0 e 120.
// Se ele digitar algo fora disso, o programa diz "Erro" e pede novamente.

import java.util.Scanner;
public class Exe49_ValidaçãoDeIdade {
    static void main() {
        Scanner leia = new Scanner(System.in);
        int idade = -1;

        do {
            System.out.print("Informe uma idade entre 0 e 120: ");
            idade = leia.nextInt();

            if (idade < 0 || idade > 120) {
                System.out.println("❌ Erro! Idade inválida.");
            }

        }while ((idade < 0) || (idade > 120));

        System.out.println("Programa finalizado!");

     leia.close();
    }
}
