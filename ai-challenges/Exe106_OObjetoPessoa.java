//O Objeto Pessoa
//Crie uma classe Pessoa.
//Atributo: String nome.
//Método: falarNome() que imprime "Meu nome é " + nome.
//No Main: Crie uma pessoa chamada "Maria" e chame o método.

public class Exe106_OObjetoPessoa {
    static void main() {
        pessoa pessoa1 = new pessoa("Maria");
        pessoa1.chamar();


    }
}

class pessoa {
    String nome;

    public pessoa (String nome){
        this.nome = nome;
    }

    public void chamar(){
        System.out.println("Olá o nome dela é "+nome);
    }
}