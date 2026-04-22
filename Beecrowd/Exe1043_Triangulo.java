

import java.util.Scanner;
public class Exe1043_Triangulo {
    static void main() {

        Scanner leia = new Scanner(System.in);
        leia.useLocale(java.util.Locale.US);

        float A = leia.nextFloat();
        float B = leia.nextFloat();
        float C = leia.nextFloat();

        if ((A < (B+C)) && (B < (A+C)) && (C < (A + B))){
            float perimetro = A+B+C;
            System.out.printf("Perimetro = %.1f%n",perimetro);

        }else{
            double area = ((A + B) * C) / 2.0;
            System.out.printf("Area = %.1f%n",area);
        }
    }
}
