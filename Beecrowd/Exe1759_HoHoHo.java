
import java.util.Scanner;
public class Exe1759_HoHoHo {
    static void main() {
        Scanner leia = new Scanner(System.in);

        int num = leia.nextInt();

        for (int i = 0; i <= num; i++){
            if (i == num-1){
                System.out.println("Ho!");
                break;
            }else {
                System.out.print("Ho ");
            }
        }
        leia.close();
    }
}
