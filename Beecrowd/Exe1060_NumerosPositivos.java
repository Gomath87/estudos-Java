

import java.util.Scanner;
public class Exe1060_NumerosPositivos {
    static void main() {
        Scanner leia = new Scanner(System.in);
        float numero;
        int contador = 0;
        for (int i = 0 ; i < 6; i++){
            numero = leia.nextFloat();
            if (numero > 0){
                contador ++;
            }
        }
        System.out.println(contador+" valores positivos");
        leia.close();
    }
}
