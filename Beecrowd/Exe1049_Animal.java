
import java.util.Scanner;
public class Exe1049_Animal {
    static void main() {
        Scanner leia = new Scanner(System.in);

        String one = leia.next();
        String two = leia.next();
        String three = leia.next();

        if (one.equals("vertebrado")){

            if (two.equals("ave")){
                if (three.equals("carnivoro")){
                    System.out.println("aguia");
                }else {
                    System.out.println("pomba");
                }

            }else {
                if (three.equals("onivoro")){
                    System.out.println("homem");
                }else {
                    System.out.println("vaca");
                }
            }


        }else {
            if (two.equals("inseto")){
                if (three.equals("hematofago")){
                    System.out.println("pulga");
                }else {
                    System.out.println("lagarta");
                }

            }else {
                if (three.equals("hematofago")){
                    System.out.println("sanguessuga");
                }else {
                    System.out.println("minhoca");
                }
            }
        }
    }
}
