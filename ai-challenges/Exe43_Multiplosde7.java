//Múltiplos de 7: Use um for para imprimir todos os múltiplos de 7 entre 1 e 200.

public class Exe43_Multiplosde7 {
    static void main() {
        for (int i = 1; i <= 200; i ++){
            if (i % 7 == 0){
                System.out.print(i+" ");
            }
        }
        System.out.println();
        System.out.println("Esses são os números multiplos de 7 entre 1 e 200");
    }
}
