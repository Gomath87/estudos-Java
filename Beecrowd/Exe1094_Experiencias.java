
import java.util.Scanner;
import java.util.Locale;
public class Exe1094_Experiencias {
    static void main() {
        Locale.setDefault(Locale.US);
        Scanner leia = new Scanner(System.in);
        int quantidade = leia.nextInt();
        int cont = 0;
        int coelho = 0;
        int sapo = 0;
        int rato = 0;

        while (cont != quantidade){
            int valor = leia.nextInt();
            String especie = leia.next();
            cont ++;

            if (especie.equalsIgnoreCase("C")){
                coelho += valor;
            } else if (especie.equalsIgnoreCase("R")) {
                rato += valor;
            }else if (especie.equalsIgnoreCase("S")){
                sapo += valor;
            }
        }

        int soma = coelho + sapo + rato;

        double percentualCoelhos = (coelho * 100.0) / soma;
        double percentualRatos   = (rato * 100.0) / soma;
        double percentualSapos   = (sapo * 100.0) / soma;

        System.out.println("Total: "+soma+" cobaias");
        System.out.println("Total de coelhos: "+coelho);
        System.out.println("Total de ratos: "+rato);
        System.out.println("Total de sapos: "+sapo);
        System.out.printf("Percentual de coelhos: %.2f %%%n",percentualCoelhos);
        System.out.printf("Percentual de ratos: %.2f %%%n",percentualRatos);
        System.out.printf("Percentual de sapos: %.2f %%%n",percentualSapos);

    }
}
