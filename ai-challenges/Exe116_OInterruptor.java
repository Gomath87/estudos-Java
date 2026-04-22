//O Interruptor
//Crie uma classe Interruptor.
//Atributo: boolean ligado.
//Método: clicar() que inverte o valor (se estiver true vira false, e vice-versa).
//No Main: Crie o interruptor e clique duas vezes, imprimindo o status após cada clique.

public class Exe116_OInterruptor {
    static void main() {

        Interruptor inte = new Interruptor(false);
        inte.clicar();



    }
}




class Interruptor {
    boolean ligado;

    public Interruptor (boolean resp){
        this.ligado = resp;
    }
    public void clicar () {
        if (this.ligado == true) {
            this.ligado = false;
            System.out.println("Você desligou a lâmpada!");
        } else {
            this.ligado = true;
            System.out.println("Você ligou a lâmpada!");
        }
    }
}