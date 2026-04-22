//Somatória até Limite: Peça um "Valor Alvo" (ex: 100).
// Use um while para ler números do usuário e somá-los.
// O laço para assim que a soma atingir ou ultrapassar o "Valor Alvo".


import java.util.Scanner;
public class Exe55_SomatoriaAteLimite {
    static void main() {

        Scanner leia = new Scanner(System.in);

        int numero;
        int valorAlvo;
        int soma = 0;
        int cont = 1;

        System.out.print("Informe o Valor alvo que o programa tem de atingir: ");
        valorAlvo = leia.nextInt();

        while (soma < valorAlvo){
            System.out.print("Informe o "+cont+"° número: ");
            numero = leia.nextInt();
            soma += numero;
            cont++;
        }

        if (soma == valorAlvo){
            System.out.println("A soma: "+soma+" atingiu exatamente o Valor Alvo de: "+valorAlvo);
        }else {
            System.out.println("A soma: "+soma+" passou do Valor Alvo de: "+valorAlvo+" com exatos "+(soma - valorAlvo)+ " pontos a mais!");
        }
    }
}
