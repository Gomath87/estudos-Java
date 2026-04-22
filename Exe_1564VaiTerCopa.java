
import java.util.Scanner;
public class Exe_1564VaiTerCopa {
    static void main() {
        Scanner leia = new Scanner (System.in);

        while(leia.hasNext()){
            int numero = leia.nextInt();

            if (numero == 0){
                System.out.println("vai ter copa!");
            }else {
                System.out.println("vai ter duas!");
            }
        }

        leia.close();
    }
}
