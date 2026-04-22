//3. Buscador de Nomes
//Objetivo: Usar Arrays de Strings e comparação de texto.
//Desafio: Crie um array com 5 nomes de amigos. Depois, peça para o usuário digitar um nome qualquer. O programa deve percorrer o array e dizer se esse nome está na lista ou não.
//Dica: Lembre-se de usar nomes[i].equals(nomeDigitado) em vez de ==.

import java.util.Scanner;
public class Exe30 {
    static void main() {
        Scanner leia = new Scanner (System.in);
        String [] nomes = {"Natália","Matheus","Maria","Jose","Cleiton","Lin"};
        int contem = 0;

        System.out.print("Informe um nome para a busca no array: ");
        String nome = leia.nextLine();

        for (int i = 0; i < nomes.length; i++){
            if (nomes[i].equalsIgnoreCase(nome)){
                contem +=1;
            }
        }
        if (contem == 1){
            System.out.println("O nome "+nome+" foi encontrado no array!");

        }else{
            System.out.println("O nome "+nome+" não se encontra no array!");
        }
    }
}
