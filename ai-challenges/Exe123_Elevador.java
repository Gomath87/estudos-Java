//Elevador (Subir/Descer)
//Crie uma classe Elevador.
//Atributo: int andarAtual (começa no 0).
//Métodos: subir() e descer().
//No Main: Suba dois andares, desça um e mostre onde o elevador parou.

public class Exe123_Elevador {
    static void main() {
        Elevador elev = new Elevador(0);

        elev.subir();
        elev.subir();
        elev.descer();

        System.out.println("O andar atual onde o elevador se encontra é o andar "+elev.andarAtual);

    }
}

class Elevador {
    int andarAtual;

    public Elevador (int valor){
        this.andarAtual = valor;

    }

    public void subir (){
        andarAtual++;
    }
    public void descer (){
        andarAtual--;
    }


}
