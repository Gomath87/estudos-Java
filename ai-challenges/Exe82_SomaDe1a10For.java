//Soma de 1 a 10 (For): Use um for para somar todos os números de 1 a 10 e mostre o resultado final (55).

public class Exe82_SomaDe1a10For {
    static void main() {

        int soma = 0;

        for (int i = 1; i < 11; i++){
            soma += i;
        }
        System.out.println("A soma é igual a "+soma);
    }
}
