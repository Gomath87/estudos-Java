//Média de Notas Fixas: Crie um array de 5 posições. Use um for para ler as notas, outro para somar e mostre a média.

import java.util.Scanner;
public class Exe45_MédiaDeNotasFixas {
    static void main() {
        Scanner leia = new Scanner(System.in);

        double [] lista = new double[5];


        for (int i = 0; i < lista.length; i++){
            System.out.println("Informe o "+(i+1)+"° número: ");
            double num = leia.nextDouble();
            lista[i] = num;
        }

        double soma = 0;

        for (int i = 0; i < lista.length; i++){
            soma += lista[i];
        }
        double media = soma / 5;
        System.out.printf("A média dos números informados é: %.2f",media);
        leia.close();
    }
}
