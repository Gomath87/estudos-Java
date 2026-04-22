//Categorizador de Peso (IMC Simples)Objetivo: Praticar else if (o "elif" do Python).
// Desafio: Leia o peso (ex: 70.5) e a altura (ex: 1.75).
// Calcule o IMC: $peso / (altura * altura)$.
// Se IMC < 18.5: "Abaixo do peso".
// Se IMC entre 18.5 e 24.9: "Peso ideal".
// Se IMC >= 25: "Sobrepeso".


import java.util.Scanner;

public class Exe14 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        System.out.println("CALCULO IMC");
        System.out.println("-----------------");
        System.out.println("Informe o peso:");
        float peso = leia.nextFloat();
        System.out.println("Informe a altura:");
        float altura = leia.nextFloat();
        float calculo = peso / (altura * altura);

        if (calculo >= 25.0) {
            System.out.println("Sobrepeso");
        } else if (calculo >=18.5) {
            System.out.println("Peso ideal");
        } else {
            System.out.println("Abaixo do peso");
        }


    }
}
