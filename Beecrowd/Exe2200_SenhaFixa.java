
import java.util.Scanner;
public class Exe2200_SenhaFixa {
    static void main() {
        Scanner leia = new Scanner(System.in);

        int senha;

        do {

            senha = leia.nextInt();

            if (senha != 2002){
                System.out.println("Senha Invalida");
            }else {
                System.out.println("Acesso Permitido");
            }

        }while (senha != 2002);
    }
}
