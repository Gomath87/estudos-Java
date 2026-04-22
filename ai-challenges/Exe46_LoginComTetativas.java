//Login com Tentativas: Defina uma senha.
// Use o while para pedir a senha ao usuário. Ele só sai do laço quando acertar.

import java.util.Scanner;
public class Exe46_LoginComTetativas {
    static void main() {
        Scanner leia = new Scanner(System.in);

        String senha = "estaéasenha12345";
        String senha2;
        int tentativas = 0;
        boolean acessoGarantido = false;

        do {
            System.out.print("Digite a senha: ");
            senha2 = leia.nextLine();
            tentativas++;

            if (senha2.equals(senha)){
                acessoGarantido = true;
                break;

            }else {
                System.out.println("Senha errada! Tentativa "+ tentativas + " de 3.");
            }

        }while (tentativas < 3);

        if (acessoGarantido){
            System.out.println("Bem-vindo ao sistema!");
        }else {
            System.out.println("Conta Bloqueada! Procure o gerente.");

        }
        leia.close();
    }
}