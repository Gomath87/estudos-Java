//Soma de Intervalo: Peça dois números inteiros (início e fim). Use o for para somar todos os números nesse intervalo.

import java.util.Scanner;
public class Exe42_SomaDeIntervalo {
    static void main() {
        Scanner leia = new Scanner(System.in);

        System.out.print("Informe um número de início: ");
        int inicio = leia.nextInt();
        System.out.print("Informe um número de conclusão: ");
        int conclusao = leia.nextInt();
        int soma = 0;

        if (inicio > conclusao){
            int reserva = inicio;
            inicio = conclusao;
            conclusao = reserva;
            System.out.println("Ops, você errou a ordem, mas pode deixar que eu vou ajeitar para você!");
            System.out.println();
        }

        for (int i = inicio; i <= conclusao; i++){
            soma += i;
        }
        System.out.println("A soma dos números no intervalo entre "+inicio+" e "+conclusao+" é igual a "+soma);
    }
}
