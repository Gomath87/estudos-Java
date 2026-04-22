// O Carro de Controle Remoto
//Crie uma classe Carrinho.
//Atributo: int bateria (começa com 100).
//Método: andar() que imprime "Vrum vrum" e tira 10 da bateria.
//No Main: Faça o carrinho andar até a bateria chegar a 80.

public class Exe118_Carro {
    static void main() {
        Carrinho car = new Carrinho(100);
        int cont = 0;

        for (int i = 0; i < 100; i++){
            car.andar();
            cont ++;
            if (cont == 10){
                car.recarregar();
                cont = 0;
            }

        }
        System.out.println();
        System.out.println("O carro andou até acabar a bateria 10 vezes!");


        //System.out.println("A bateria do carro chegou a 80%");

    }
}


class Carrinho {
    int bateria = 100;

    public Carrinho (int valor){
        this.bateria = valor;
    }

    public void andar () {
        bateria -= 10;
        System.out.println("Vrum vrum");

        switch (bateria){

            case 80:
                System.out.println("A bateria chegou a 80%");
                break;
            case 60:
                System.out.println("A bateria chegou a 60%");
                break;
            case 40:
                System.out.println("A bateria chegou a 40%");
                break;
            case 20:
                System.out.println("A bateria chegou a 20%");
                break;
            case 0:
                System.out.println("A bateria descarregou!");
                System.out.println();
                break;


        }
    }
    public void recarregar(){
        bateria = 100;
        System.out.println("Bateria recarregada!");
    }
}