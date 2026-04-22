//Validador de Notas com Média: Use um while para forçar o usuário a digitar 4 notas válidas
// (entre 0 e 10). Se ele digitar errado, peça de novo. Depois,
// use um if para dizer se ele passou (média >= 7).
import java.util.ArrayList;
import java.util.Scanner;

public class Exe50_ValidadorDeNotasComMédia {
    static void main() {

        Scanner leia = new Scanner(System.in);
        ArrayList<Integer> lista = new ArrayList<>();

        int nota;
        int cont = 1;
        double media = 0;

        do {
            System.out.print("Informe o "+cont+"° número: ");
            nota = leia.nextInt();

            if ((nota < 0) || (nota > 10)){
                System.out.println("Digite uma nota no intervalo entre 0 e 10 por favor!");
            }else {
                lista.add(nota);
                System.out.println(cont+"° nota adicionada com sucesso!");
                cont += 1;
                media += nota;

            }

        }while (cont <=4);
        media /= 4;

        if (media >= 7){
            System.out.printf("Parabéns você passou! Com média de: %.2f",media," pontos");
        }else {
            System.out.printf("Infelizmente sua nota não atingiu a média! NOTA: %.2f",media);
        }
    }
}
