//Celular Ativo
//Crie uma classe Celular.
//Atributo: String marca.
//Método: ligar() que imprime "O celular " + marca + " está ligando...".
//No Main: Crie um "iPhone" e chame o método.



public class Exe109_CelularAtivo {
    static void main() {
        celular celular1 = new celular("Iphone");

        celular1.ligar();

    }
}

class celular {

    String marca;

    public celular (String marca){
        this.marca = marca;
    }

    public void ligar() {
        System.out.println("O celular "+ marca + " está ligando");

    }

}