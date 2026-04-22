//Status do Aluno: Peça uma letra (A, B, C, D ou F).
// Imprima uma mensagem curta (A=Excelente, B=Bom, C=Regular, D=Precisa melhorar, F=Reprovado).

import java.util.Scanner;
public class Exe74_StatusDoAluno {
    static void main() {
        Scanner leia = new Scanner(System.in);
        String nota;

        System.out.print("Informe a Nota (A, B ,C, D ou F): ");
        nota = leia.next();
        nota = nota.toUpperCase();
        switch (nota){

            case "A":
                System.out.println("Excelente");
                break;
            case "B":
                System.out.println("BOM");
                break;
            case "C":
                System.out.println("REGULAR");
                break;
            case "D":
                System.out.println("PRECISA MELHORAR");
                break;
            case "F":
                System.out.println("REPROVADO");
                break;
            default:
                System.out.println("Nota inválida!");
                break;
        }

    }
}
