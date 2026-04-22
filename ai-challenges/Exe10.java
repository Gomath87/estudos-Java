//Conversor de Temperatura: Receba uma temperatura e uma letra ("C" ou "F"). Converta de Celsius para Fahrenheit ou vice-versa, dependendo da letra escolhida.

public class Exe10 {
    public static void main(String[] args){
        float valor = 90.5f;
        String temp = "F";
        float calculo;

        if (temp.equals("C")){
            calculo = (valor * 1.8f) + 32;
            System.out.println("A temperatura de "+valor+"c graus Celsius para Fahrenheit é igual a: "+calculo+"f");
        }else {
            calculo = (valor - 32) / 1.8f;
            System.out.println("A temperatura de "+valor+"f graus Fahrenheit é igual a: "+calculo+"c");
        }
    }
}
