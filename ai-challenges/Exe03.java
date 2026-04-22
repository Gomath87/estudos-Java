//Aprovação Escolar: Crie três variáveis para notas. Calcule a média.
// Se a média for $\geq 7$, exiba "Aprovado". Se for entre 5 e 6.9, "Recuperação". Se for $< 5$, "Reprovado".

public class Exe03 {
    public static void main(String[] args) {
        float nota1 = 8.5f;
        float nota2 = 8.7f;
        float nota3 = 8.0f;
        float media = (nota1 + nota2 + nota3) / 3;
        if (media >= 7.0){
            System.out.println("Aprovado");
        }
        else if (media >= 5.0) {
            System.out.println("Recuperação");

        }
        else{
            System.out.println("Reprovado");
        }
    }
}
