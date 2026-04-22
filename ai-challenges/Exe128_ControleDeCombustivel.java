//Controle de Combustível (Scanner + If/Else + Atributos)
//Objetivo: Tomar decisões no main baseadas no estado do objeto.
//Classe Car: Atributo double tanque. Método abastecer(double litros).
//No Main: Crie um carro com 10 litros.
// Pergunte ao usuário: "Quanto quer abastecer?".
// Se ele digitar um valor negativo, use um if para dizer "Valor inválido", senão,
// chame o método e mostre o total no tanque.

import java.util.Scanner;
public class Exe128_ControleDeCombustivel {
    static void main() {
        Scanner leia = new Scanner(System.in);
        Car carro = new Car(10);

        double valor;

        System.out.println("Quanto quer abastecer?");
        valor = leia.nextDouble();
        if (valor < 0 ){
            System.out.println("Valor negativo!");
        }else{
            carro.abastecer(valor);
        }

    }
}

class Car {
    double tanque;
    public Car (double lit){
        this.tanque = lit;
    }

    public void abastecer(double litros){
        tanque += litros;
        System.out.println("Total no tanque: "+tanque);

    }

}
