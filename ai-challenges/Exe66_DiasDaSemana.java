//Peça um número de 1 a 7.
// Use o switch para imprimir o nome do dia correspondente (1 para Domingo, 2 para Segunda, etc.).
// Se for um número fora desse intervalo, use o default para dizer "Dia inválido".

import java.util.Scanner;
public class Exe66_DiasDaSemana {
    static void main() {
        Scanner leia = new Scanner(System.in);
        int dia;
        System.out.println("Digite um número entre 1 e 7");
        dia = leia.nextInt();

        if ((dia > 7) || (dia < 1)){

            while ((dia > 7) || (dia < 1)) {
                System.out.println("Por favor digite um número válido entre 1 e 7");
                dia = leia.nextInt();
            }
        }

        switch (dia){
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda-Feira");
                break;
            case 3:
                System.out.println("Terça - Feira");
                break;
            case 4:
                System.out.println("Quarta - Feira");
                break;
            case 5:
                System.out.println("Quinta - Feira");
                break;
            case 6:
                System.out.println("Sexta - Feira");
                break;
            case 7:
                System.out.println("Sábado");
                break;



        }
    }
}
