

import java.util.Scanner;
public class Exe1072_Intervalo2 {
    static void main() {
        Scanner leia = new java.util.Scanner(System.in);

        int quant = leia.nextInt();
        int num;
        int in = 0;
        int out = 0;
        for (int i = 1; i <= quant; i++){
            num = leia.nextInt();
            if ((num >= 10) && (num <= 20)){
                in ++;
            }else {
                out ++;
            }
        }
        System.out.println(in+" in");
        System.out.println(out+" out");
    }
}
