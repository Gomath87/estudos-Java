//Idade da Pessoa
//Crie uma classe Usuario.
//Atributo: int idade.
//Método: mostrarIdade() que imprime "Eu tenho " + idade + " anos".
//No Main: Crie um usuário com 20 anos e chame o método.


public class Exe110_IdadeDaPessoa {
    static void main() {

        usario pessoa = new usario(20);
        pessoa.mostrarIdade();
    }
}

class usario {
    int idade;

    public usario(int idadeInformada) {
        this.idade = idadeInformada;
    }
    public void mostrarIdade(){
        System.out.println("Eu tenho "+idade+" anos");

    }
}