//Calculadora de IMC: Receba peso e altura. Calcule $IMC = \frac{peso}{altura^2}$. Exiba se está "Abaixo do peso" ($<18.5$),
// "Peso ideal" ($18.5$ a $24.9$) ou "Sobrepeso" ($\geq 25$).

public class Exe04 {

    public static void main(String[] args){

        float altura = 1.82f;
        float peso = 99.50f;
        float calculo = peso / (altura * 2);

        if (calculo >= 25){
            System.out.println("Sobrepeso");
        }
        else if (calculo >= 18.5) {
            System.out.println("Peso ideal");
        }
        else {
            System.out.println("Abaixo do peso");
        }
    }
}
