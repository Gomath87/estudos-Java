//Contador com Switch: Peça um número entre 1 e 3. Se for 1,
// faça um for de 1 a 5. Se for 2, faça um for de 5 a 1. Se for 3, não faça nada.


import java.util.Scanner;
public class Exe77_ContadorComSwitch {
    static void main() {
        Scanner leia = new Scanner(System.in);

        int num;
        System.out.print("Infome um número entre 1 e 3: ");
        num = leia.nextInt();

        switch (num){
            case 1:
                for (int i = 1; i < 6; i++){
                    System.out.println(i);
                }
                break;
            case 2:
                for ( int i = 5; i > 0; i--){
                    System.out.println(i);
                }
                break;
            case 3:
                System.out.println("Nenhuma ação é necessária");
                break;
            default:
                System.out.println("Número inválido!");
                break;

        }
    }
}
