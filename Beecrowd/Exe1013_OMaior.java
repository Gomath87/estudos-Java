import java.util.Scanner;
public class Exe1013_OMaior {
    static void main() {
        Scanner leia = new Scanner(System.in);

        int N1 = leia.nextInt();
        int N2 = leia.nextInt();
        int N3 = leia.nextInt();

        int formulaAB = (N1 + N2 + Math.abs(N1 - N2)) / 2;
        int Maior = (formulaAB + N3 + Math.abs(formulaAB - N3)) / 2;
        System.out.println(Maior+" eh o maior");
    }
}
