//Maior de Três: Receba três números diferentes e exiba qual deles é o maior.

public class Exe7 {

    public static void main(String[] args){

        int num1 = 3;
        int num2 = 5;
        int num3 = 8;

        int maior;

        if (num1 > num2 && num1 > num3){
            maior = num1;
        } else if (num2 > num1 && num2 > num3) {
            maior = num2;
        }else {
            maior = num3;
        }
        System.out.println("O maior número é o "+maior);
    }

}


