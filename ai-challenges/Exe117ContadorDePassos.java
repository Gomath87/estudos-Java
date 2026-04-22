//Contador de Passos
//Crie uma classe Passos.
//Atributo: int passos.
//Método: darPasso() que faz this.passos++.
//No Main: Crie o objeto, chame o método 3 vezes e depois imprima o total de passos.

public class Exe117ContadorDePassos {
    static void main() {
        Passos pe = new Passos(0);

        pe.darPasso();
        pe.darPasso();
        pe.darPasso();

        System.out.println("Total final de passos: " + pe.passos);

    }
}

class Passos {
    int passos;

    public Passos (int pas){
        this.passos=pas;
    }
    public void darPasso(){
        passos++;

    }

}