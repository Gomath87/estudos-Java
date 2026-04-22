//O Livro
//Crie uma classe Livro.
//Atributo: String titulo.
//Método: ler() que imprime "Você está lendo: " + titulo.
//No Main: Crie o livro "Harry Potter" e chame o método.


public class Exe109_OLivro {
    static void main() {

        livro nome = new livro("O homem mais rico da babilônia");

        nome.ler();


    }
}

class livro {
    String titulo;

    public livro(String titulo){
        this.titulo=titulo;
    }

    public void ler(){
        System.out.println("Você está lendo: "+titulo);
    }
}