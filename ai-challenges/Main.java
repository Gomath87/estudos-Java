

  /*      // numeros inteiros = 100, 234345, 255, 120, 1, 91939393939939394
        byte => 8 bits => -128 a 127;
        short => 16 bits => -32.768 a 32.767;
        int => 32 bits => -2.147.483.648 a 2.147.483.647;
        long => 64 bits => -9.223.372.036.854.775.808 a 9.223.372.036.854.775.807;
        //numeros decimais = 1.2, 3.4, 5.6, 8.7, 9.0
        float => 32 bits => precisão simples;
        double => 64 bits > precisão dupla

        String => representar palavras e frases
        char => representar um unico caractere => a, b, c, d
        char meuChar = 'a'
        boolean => true ou false

   */

package java_curso;

public class Main {

    public static void main(String[] args) {
        Carro meuCarro = new Carro("Fusca");
        Carro meuCarro1 = new Carro("Sandero");
        Carro meuCarro2 = new Carro("BMW");

        meuCarro1.acelerar();
        meuCarro2.acelerar();
        meuCarro.acelerar();

    }
}

    class Carro {
        String modelo;
        public Carro(String modelo){
            this.modelo = modelo;

            }

            public void acelerar(){
                System.out.println("Acelerando o carro " + this.modelo);
            }

        }


