
import java.util.Scanner;
public class Exe1038_Lanche {
    static void main() {
        Scanner leia = new Scanner(System.in);

        int produto = leia.nextInt();
        int quantidade = leia.nextInt();
        double total = 0;
        switch (produto){

            case 1:
                total = 4 * quantidade;
                break;
            case 2:
                total = 4.50 * quantidade;
                break;
            case 3:
                total = 5 * quantidade;
                break;
            case 4:
                total = 2 * quantidade;
                break;
            case 5:
                total = 1.50 * quantidade;
                break;

        }

        System.out.printf("Total: R$ %.2f%n",total);


    }
}
