// Crie uma classe Aluno.
// Atributos: String nome e double nota.
// Método: verificarAprovacao() que usa um if.
//  Se a nota for $\geq 6$, imprime "Aprovado!", senão "Reprovado!".
//  No Main: Crie um aluno com nota 8.5 e chame o método.


public class Exe115_OAlunoNota10 {
    static void main() {

        Aluno aluno = new Aluno("Matheus",10);
        aluno.verificarAprovacao();


    }
}


class Aluno {
    String nome;
    double nota;

    public Aluno (String nomeAluno, double notaAluno){
        this.nome=nomeAluno;
        this.nota=notaAluno;

    }

    public void verificarAprovacao(){
        if (nota >= 6){
            System.out.println("Aprovado!");
        }else {
            System.out.println("Reprovado!");
        }

    }

}