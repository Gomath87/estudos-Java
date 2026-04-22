//Caneta Colorida
//Crie uma classe Caneta.
//Atributos: String cor e int carga.
//Método: status() que imprime a cor e quanto de carga ela tem.
//No Main: Crie uma caneta "Azul" com "100" de carga e mostre o status.

public class Exe114_CanetaColorida {
    static void main() {

        Caneta caneta1 = new Caneta("Azul", 100);

        caneta1.status();

    }
}

class Caneta{
    String cor;
    int carga;

    public Caneta(String corInformada, int cargaInformada) {
        this.cor = corInformada;
        this.carga = cargaInformada;
    }

    public void status (){
        System.out.println("A caneta é da cor "+cor+" e está com carga de "+carga+"%");

    }
}