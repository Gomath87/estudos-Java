//Contador de Vogais (String + For + If):
//Peça para o usuário digitar uma palavra.
// Use um for para percorrer a String (dica: use .charAt(i)) e conte quantas vogais ela tem.


import java.util.Scanner;
public class Exe64_ContadorDeVogais {
    static void main() {
        Scanner leia = new Scanner(System.in);
        String palavra;
        System.out.print("Digite uma palavra: ");
        palavra = leia.nextLine();
        int contadorVogais = 0;

        for (int i = 0; i < palavra.length(); i++){
            char letra = palavra.toLowerCase().charAt(i);

            if (letra == 'a' || letra =='e' || letra == 'i' || letra == 'o' || letra == 'u'){
                contadorVogais++;
            }
        }
        System.out.println("Na palavra informada possui "+contadorVogais+" vogais");
        leia.close();
    }
}
