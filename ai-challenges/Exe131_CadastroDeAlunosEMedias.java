// Cadastro de Alunos e Médias (Objetos + ArrayList)
// Classe Aluno: Atributos nome e nota. Método status() que retorna "Aprovado" se nota >= 6$
//  ou "Reprovado".
//  No Main: Use um for para cadastrar 3 alunos.
//  Guarde-os em um ArrayList<Aluno>.
//  Depois, use outro for para listar o nome de todos e se estão aprovados.


import java.util.ArrayList;
import java.util.Scanner;
public class Exe131_CadastroDeAlunosEMedias {
    static void main() {
        Scanner leia = new Scanner(System.in);
        ArrayList<Alunos> lista = new ArrayList<>();

        String nome;
        float nota;

        for (int i = 0; i < 3; i ++){
            System.out.println("Digite o nome do "+(i+1)+"° aluno: ");
            nome = leia.nextLine();
            System.out.println("Informe a nota do aluno "+nome+": ");
            nota = leia.nextFloat();
            leia.nextLine();

            Alunos ficha = new Alunos(nome,nota);
            lista.add(ficha);
        }

        for (int i = 0; i < lista.size(); i++) {
            Alunos a = lista.get(i);

            System.out.println("Aluno " + (i+1) + ": " + a.nome + " está " + a.status());
        }
    }
}


class Alunos {
    String nome;
    float nota;

    public Alunos (String nome, float nota){
        this.nome = nome;
        this.nota = nota;
    }

    public String status (){
        if (nota >= 6){
            return "Aprovado";
        }else {
            return "Reprovado";
        }
    }
}