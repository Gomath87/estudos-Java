//O Cofrinho
//Crie uma classe Cofrinho.
//Atributo: double moedas.
//Método: depositar(double valor).
//No Main: Deposite 0.50, depois 1.00 e mostre o saldo final.


public class Exe121_OCofrinho {
    static void main() {
        Cofrinho money = new Cofrinho();
        money.depositar(0.50);
        money.depositar(1.00);

        System.out.println("Saldo de R$:"+money.moedas);
    }
}

class Cofrinho {
    double moedas;
    double soma;

    public void depositar(double valor){
        this.moedas += valor;
        System.out.println("Depósito de R$:"+valor+" realizado!");

    }

}
