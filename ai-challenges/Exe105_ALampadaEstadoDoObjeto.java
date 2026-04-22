//A Lâmpada (Estado do Objeto)
//Objetivo: Aprender que o objeto pode mudar de "estado".
//Crie uma classe Lampada.
//Dê a ela um atributo boolean ligada.
//Crie um método ligar() que muda o valor para true e um desligar() que muda para false.
//No main, crie uma lâmpada e teste ligar e desligar.



public class Exe105_ALampadaEstadoDoObjeto {
    static void main() {
        // Criando o objeto (A lâmpada nasce desligada por padrão)
        lampada lampada1 = new lampada();

        // Acionando o método no OBJETO (lampada1)
        lampada1.ligar();
        lampada1.mostrarEstado();

        lampada1.desligar();
        lampada1.mostrarEstado();



    }


}

class lampada{
    boolean ligada; // Atributo (Estado)

    // Método para LIGAR
    public void ligar() {
        this.ligada = true; // Muda o estado interno
        System.out.println("Você apertou o interruptor para CIMA.");
    }

    // Método para DESLIGAR
    public void desligar() {
        this.ligada = false; // Muda o estado interno
        System.out.println("Você apertou o interruptor para BAIXO.");
    }


    // Método para VERIFICAR como ela está
    public void mostrarEstado() {
        if (this.ligada) {
            System.out.println("A lâmpada está BRILHANDO! ");
        } else {
            System.out.println("Está tudo escuro por aqui... ");
        }



    }
}
