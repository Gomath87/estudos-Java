//O Objeto Animal
//Crie uma classe Animal.
//Atributo: String especie.
//Método: exibirEspecie() que imprime "Eu sou um " + especie.
//No Main: Crie um objeto "Cachorro" e chame o método.


public class Exe107_OObjetoAnimal {
    static void main() {

        //Cria o objeto
        animal cachoro = new animal("Cachorro");
        animal gato = new animal("Gato");

        //Chama o método
        cachoro.exibirEspecie();
        gato.exibirEspecie();
    }
}

// classe ou o projeto
class animal{

    //Atributos do animal
    String especie;

    //Atributo
    public animal (String especie){
        this.especie = especie;
    }

    //Exibe o atibuto
    public void exibirEspecie() {
        System.out.println("Eu sou um " + especie);
    }


}