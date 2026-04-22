//Senha Infinita: Crie uma variável String senhaMestra = "java123". Peça para o usuário digitar a senha.
// Enquanto a senha digitada não for igual à senhaMestra, diga "Acesso Negado" e peça de novo. Quando acertar, diga "Bem-vindo!".
//
//Dica: Use !input.equals(senhaMestra) para o "enquanto não for igual".

import java.util.Scanner;
public class Exe38_SenhaInfinita {
    static void main() {
        Scanner leia = new Scanner(System.in);
        String senhaMestra = "java123";

        System.out.print("Digite a senha: ");
        String senha = leia.nextLine();


        while (!senha.equals(senhaMestra)) {
            System.out.println("❌ Acesso Negado! Tente novamente.");
            System.out.print("Senha: ");
            senha = leia.nextLine();

        }
        System.out.println("🔓 Bem-vindo! Acesso liberado.");
        leia.close();
    }
}
