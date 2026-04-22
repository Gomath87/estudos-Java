//TermômetroCrie uma classe Termometro.Atributo: double temperatura.
// Método: estaComFebre().
//  Se a temperatura for $> 37.5$, imprime "Sim", senão "Não".
//  No Main: Crie um termômetro com 38.0 e teste.

public class Exe122_Termometro {
    static void main() {

        Termometro tem = new Termometro(35.5);
        tem.estaComFebre();

    }
}



class Termometro {
    double temperatura;

    public Termometro (double valor){
        this.temperatura = valor;
    }

    public void estaComFebre(){
        if (temperatura >= 37.5){
            System.out.println("Sim");
        }else {
            System.out.println("Não");
        }

    }
}