//O Pássaro
//Crie uma classe Passaro.
//Método: voar() que apenas imprime "O pássaro está voando!".
//No Main: Crie o objeto e chame o método (exercício sem atributos, só ação).

public class Exe111_OPassaro {
    static void main() {

        passaro pass = new passaro();
        pass.voar();

    }

}

class passaro{

    public void voar(){
        System.out.println("O pássaro está voando!");
    }

}