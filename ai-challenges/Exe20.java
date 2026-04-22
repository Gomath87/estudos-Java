//4. Contagem Regressiva (Foguete)
//Objetivo: Praticar o laço em ordem decrescente.
//
//Desafio: Faça um programa que conte de 10 até 0 e, ao final, imprima "Fogo!".
//
//Dica: Comece com int i = 10, use a condição i >= 0 e o incremento i--.

public class Exe20 {
    public static void main(String[] args) {
        for (int i = 10; i >= 0; i--){
            System.out.println(i);
        }
        System.out.println("Fogo!");
    }
}
