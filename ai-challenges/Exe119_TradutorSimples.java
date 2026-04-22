//Tradutor Simples
//Crie uma classe Tradutor.
//Método: dizerOi(String lingua). Use um switch ou if.
// Se receber "Ingles", imprime "Hello". Se receber "Espanhol", "Hola".
//No Main: Teste as duas línguas.

public class Exe119_TradutorSimples {
    static void main() {
        Tradutor traduz = new Tradutor();
        traduz.dizerOi("Espanol");
        traduz.dizerOi("Ingles");

    }
}


class Tradutor {

    public void dizerOi(String lingua){
        if (lingua.equals("Espanol")){
            System.out.println("Hola");

        } else if (lingua.equals("Ingles")) {
            System.out.println("Hello");

        }else {
            System.out.println("Língua não reconhecida: " + lingua);
        }
    }
}