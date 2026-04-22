
import java.util.Scanner;
public class Exe1131_Grenais {
    static void main() {
        Scanner leia = new Scanner(System.in);

        int resp = 0;
        int gremio = 0;
        int internacional = 0;
        int ggre = 0;
        int gint = 0;
        int empates = 0;
        int quantgre = 0;

        while (resp != 2){
            internacional = leia.nextInt();
            gremio = leia.nextInt();
            quantgre ++;

            if (gremio > internacional){
                ggre ++;
            } else if (internacional > gremio) {
                gint ++;
            } else {
                empates ++;
            }

            System.out.println("Novo grenal (1-sim 2-nao)");
            resp = leia.nextInt();

        }


        System.out.println(quantgre+" grenais");
        System.out.println("Inter:"+gint);
        System.out.println("Gremio:"+ggre);
        System.out.println("Empates:"+empates);
        if (gint > ggre){
            System.out.println("Inter venceu mais");
        } else if (ggre > gint) {
            System.out.println("Gremio venceu mais");
        }else {
            System.out.println("Nao houve vencedor");
        }
    }
}
