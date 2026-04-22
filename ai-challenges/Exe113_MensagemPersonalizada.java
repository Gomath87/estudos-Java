//9. Mensagem Personalizada
//Crie uma classe Mensageiro.
//Método: enviar(String texto) que imprime "Enviando: " + texto.
//No Main: Crie o mensageiro e mande a frase "Olá, mundo!".


public class Exe113_MensagemPersonalizada {
    static void main() {
        Mensageiro novo = new Mensageiro();
        novo.enviar("Olá mundo!");
    }
}

class Mensageiro{

    public void enviar(String texto){
        System.out.println("Enviando: "+texto);
    }

}
