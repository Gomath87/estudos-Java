//Números Primos (O Clássico)
//Objetivo: Usar um laço para testar divisões.
//
//Desafio: Peça ao usuário um número inteiro pelo Scanner. Use um for para contar quantos divisores esse número tem (testando de 1 até o próprio número usando %).
//
//Lógica: Se ao final do laço o número de divisores for exatamente 2, imprima "É primo". Caso contrário, "Não é primo".

import java.util.Scanner;

public class Exe22 {

    static void main() {

        Scanner leia = new Scanner(System.in);
        System.out.print("Informe um número inteiro: ");
        int numero = leia.nextInt();
        int contador = 0;


        if (numero == 0){
            System.out.println("O número Zero não é primo");
        }else if (numero == 1){
            System.out.println("O número '1' não é primo");
        }else{


            for (int i = 2; i <= numero; i++) {
                if (numero % i == 0) {
                    contador += 1;
                }
            }


            if (contador == 1) {
                System.out.println("O número " + numero + " é um número primo");
            } else if (contador > 1) {
                System.out.println("O número " + numero + " não é primo");
            }
        }
    }
}
