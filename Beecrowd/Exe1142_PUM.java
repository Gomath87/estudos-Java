
import java.util.Scanner;
public class Exe1142_PUM {
    static void main() {
        Scanner leia = new Scanner(System.in);

        int num = leia.nextInt();
        int cont = 0;
        int contador = 1;

        for (int i = cont; i < num; i++){
            System.out.println((contador)+" "+(contador+1)+" "+(contador+2)+ " PUM");
            contador+= 4;
            cont ++;

        }
    }
}
