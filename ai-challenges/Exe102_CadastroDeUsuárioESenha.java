//Cadastro de Usuário e Senha (While + If + Break)
//Crie um sistema onde o usuário tem apenas 3 tentativas para acertar a senha (use um while com um contador).
//Se ele acertar, use break para sair e diga "Acesso Permitido".
//Se estourarem as 3 tentativas, diga "Cartão Bloqueado".

import  java.util.Scanner;

public class Exe102_CadastroDeUsuárioESenha {
    static void main() {
        Scanner leia = new Scanner(System.in);

        int senha = 1211;
        int resposta;
        int tentativas = 0;

        do {
            System.out.print("Informe a senha do cartão: ");
            resposta = leia.nextInt();

            tentativas ++;

            if (tentativas == 3){
                if (resposta != senha){
                    System.out.println("Cartão bloqueado, contate a administradora do seu cartão!");
                    break;
                }
            }

            if (resposta == senha){
                System.out.println("Acesso Autorizado! Bem vindo novamente!");
                break;
            }else {
                System.out.println("Acesso negado, tente novamente, restam "+(3-tentativas)+" tentativas!");
            }


        }while (resposta != senha);

        leia.close();
    }

}
