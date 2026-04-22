
import java.util.Scanner;
public class Exe1146_SequenciasCrescentes {
    static void main() {
        Scanner leia = new Scanner(System.in);
        int x;
        do {
            x = leia.nextInt();
            if (x == 0) {
                break;
            }
                for (int i = 1; i <= x; i++) {
                    if (i == x) {
                        System.out.println(i);
                    } else {
                        System.out.print(i + " ");
                    }
                }
        }while (x != 0) ;

    }
}
