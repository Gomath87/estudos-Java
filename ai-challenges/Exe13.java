//3. Simulador de Login (Comparação de Strings)
//Objetivo: Entender que Strings são comparadas de forma diferente.
//
//Desafio: Crie um programa que peça um nome de usuário.
//
//Se o usuário digitar "admin", o programa deve pedir uma senha.
//
//Se a senha for "1234", imprima "Acesso garantido".
//
//Se errar o usuário ou a senha, imprima "Acesso negado".
//
//Dica: Em Java, não usamos == para textos. Use variavel.equals("texto").


import java.util.Scanner;

public class Exe13 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        String nome = leia.nextLine();
        if (nome.equals("admin")){
            int senha = leia.nextInt();
            if (senha == 1234){
                System.out.println("Acesso garantido");
                }
            else{
                System.out.println("Acesso negado");
            }
            }
        else{
            System.out.println("Acesso negado");
        }
    }
}
