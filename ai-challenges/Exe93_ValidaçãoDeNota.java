//Validação de nota (If + Else): Peça uma nota.
// Se for maior ou igual a 6, imprima "Aprovado", senão, "Reprovado".

import java.util.Scanner;
public class Exe93_ValidaçãoDeNota {
    static void main() {
        Scanner leia = new Scanner(System.in);

        Double nota;
        System.out.print("Informe uma nota: ");
        nota = leia.nextDouble();

        if (nota >= 6.0){
            System.out.println("Aprovado!");

        }else{
            System.out.println("Reprovado");
        }
        leia.close();
    }
}
