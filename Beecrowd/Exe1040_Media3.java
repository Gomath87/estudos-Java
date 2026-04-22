
import java.util.Scanner;
public class Exe1040_Media3 {
    static void main() {
        Scanner leia = new Scanner(System.in);
        leia.useLocale(java.util.Locale.US);
        float N1 = leia.nextFloat();
        float N2 = leia.nextFloat();
        float N3 = leia.nextFloat();
        float N4 = leia.nextFloat();
        float media = ((N1 * 2) + (N2 * 3) + (N3 * 4) + ( N4 * 1)) / 10;
        System.out.printf("Media: %.1f%n", media);

        if (media >= 7.0f) {
            System.out.println("Aluno aprovado.");
        } else if (media < 5.0f) {
            System.out.println("Aluno reprovado."); // Corrigido o erro de digitação
        } else {
            System.out.println("Aluno em exame.");
            float notaExam = leia.nextFloat();
            System.out.printf("Nota do exame: %.1f%n", notaExam); // Corrigida a vírgula

            float mediaFinal = (media + notaExam) / 2f;

            if (mediaFinal >= 5.0f) {
                System.out.println("Aluno aprovado.");
            } else {
                System.out.println("Aluno reprovado.");
            }
            System.out.printf("Media final: %.1f%n", mediaFinal);
        }
    }
}