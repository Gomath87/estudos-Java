//Cor do Carro
//Crie uma classe Veiculo.
//Atributo: String cor.
//Método: pintar(String novaCor) que muda o atributo this.cor para a nova cor.
//No Main: Crie um veículo, use o método para pintar de "Azul" e depois dê um System.out.println na cor.

public class Exe112_CorDoCarro {
    static void main() {
        Veiculo carro = new Veiculo("Branco");
        carro.pintar("Azul");
    }
}

class Veiculo {
    String cor;

    public Veiculo (String color){
        this.cor = color;
    }

    public void pintar(String nova){
        this.cor = nova;
        System.out.println("A cor do carro é "+cor);
    }
}