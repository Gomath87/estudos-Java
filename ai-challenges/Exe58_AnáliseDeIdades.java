//Análise de Idades: Use um while para ler idades até que o usuário digite -1.
// No final, use if/else para dizer quantas pessoas eram menores de idade,
// quantas adultas e quantas idosas ($>60$).

import java.util.Scanner;
public class Exe58_AnáliseDeIdades {
    static void main() {
        Scanner leia = new Scanner(System.in);
        int idade = 0;
        int adulto = 0;
        int menor = 0;
        int idoso = 0;

        while (idade != -1){
            System.out.println("Digite uma idade: ");
            idade = leia.nextInt();
            if (idade == -1){
                break;
            }

            if (idade < 18){
                menor++;

            }else if (idade > 60) {
                idoso ++;
            } else if (idade > 17) {
                adulto ++;
            }


        }
        System.out.println();
        System.out.println("Segundo as idades informadas: ");
        System.out.println(menor+" são pessoa(s) menores de idade");
        System.out.println(adulto+" são pessoa(s) adultas");
        System.out.println(idoso+" são pessoa(s) idosas");

    }
}
