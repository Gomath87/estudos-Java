//O Sistema de Cachorro (Básico)
//Objetivo: Praticar atributos (características) e métodos (ações).
//Crie uma classe Cachorro.
//Dê a ela um atributo String nome.
//Crie um método latir() que imprima: "[nome do cachorro] está latindo: Au Au!".
//No main, crie dois cachorros diferentes e faça-os latir.


public class Exe104_OSistemaCachorro {
    static void main() {

        // Criando os objetos (Instanciação)
        cachorro cachorro1 = new cachorro("Bradok");
        cachorro cachorro2 = new cachorro("Rex");


        // Chamando as ações (Métodos)
        cachorro1.latir();
        cachorro2.latir();



    }

}


class cachorro {
    String nome;

    // CONSTRUTOR: Necessário para aceitar o nome no "new"
    public cachorro(String nome) {
        this.nome = nome;
    }

    // MÉTODO: Note os parênteses () obrigatórios
    public void latir() {
        System.out.println(this.nome + " está latindo: Au Au!");
    }
}

