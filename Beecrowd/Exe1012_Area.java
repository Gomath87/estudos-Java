import java.util.Scanner;
public class Exe1012_Area {
    static void main() {
        Scanner leia = new Scanner(System.in);
        double A = leia.nextDouble();
        double B = leia.nextDouble();
        double C = leia.nextDouble();

        double Triangulo = A * C / 2;
        double Circulo = 3.14159 * (Math.pow(C,2));
        double Trapezio = ((A + B) * C)/2;
        double Quadrado = Math.pow(B,2);
        double Retangulo = A * B;

        System.out.printf("TRIANGULO: %.3f%n",Triangulo);
        System.out.printf("CIRCULO: %.3f%n",Circulo);
        System.out.printf("TRAPEZIO: %.3f%n",Trapezio);
        System.out.printf("QUADRADO: %.3f%n",Quadrado);
        System.out.printf("RETANGULO: %.3f%n",Retangulo);

        leia.close();
    }
}
