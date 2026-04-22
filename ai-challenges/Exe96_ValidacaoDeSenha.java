//Validação de Senha (While + If): Use um while para
// pedir uma senha (ex: "java123").
// Se o usuário errar, diga "Senha incorreta" e peça novamente.


import java.util.Scanner;
public class Exe96_ValidacaoDeSenha {
    static void main() {
        Scanner leia = new Scanner(System.in);
        String senha;

        do {
            System.out.print("Informe a senha: ");
            senha = leia.next();

            if (!senha.equals("java123")){
                System.out.println("Senha incorreta tente novamente!");
            }

        }while (!senha.equals("java123"));
        System.out.println("Login aprovado!");
    }
}
