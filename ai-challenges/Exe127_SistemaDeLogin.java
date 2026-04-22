//Sistema de Login (Scanner + While + Classe)
//Objetivo: Usar um loop no main para interagir com o objeto.
//Classe Usuario: Atributo String senhaCorreta = "1234".
// Método tentarAcesso(String tentativa) que retorna um boolean (true se acertar, false se errar).
//No Main: Crie o usuário. Use um while que pede a senha. Chame o método tentarAcesso.
// Se o método retornar false, o while continua pedindo.

import java.util.Scanner;
public class Exe127_SistemaDeLogin {
    static void main() {
        Scanner leia = new Scanner(System.in);
        Usuario login = new Usuario();
        boolean logado = false;
        do {
            System.out.print("Digite a senha: ");
            String tentativa = leia.nextLine();

            logado = login.tentarAcesso(tentativa);

            if (!logado) {
                System.out.println("Senha incorreta! Tente novamente.");
            }
        }while (logado == false);

        System.out.println("Acesso liberado! Bem-vindo ao sistema.");
    }
}

class Usuario {
    String senhaCorreta = "1234";

    public boolean tentarAcesso(String tentativa){

        if (tentativa.equals(senhaCorreta)){
            return true;
        }else {
            return false;
        }

    }


}
