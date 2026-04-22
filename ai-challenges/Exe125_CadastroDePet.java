//Cadastro de Pet (Scanner + Atributo)
//Objetivo: Ler dados do teclado e salvar no objeto.
//Classe Pet: Atributos String nome e String animal. Método exibir() que mostra "O [animal] se chama [nome]".
//No Main: Use o Scanner para perguntar o nome e que bicho é.
// Crie o objeto Pet com essas informações e chame o método exibir().

import java.util.Scanner;
public class Exe125_CadastroDePet {
    static void main() {
        Scanner leia = new Scanner(System.in);

        System.out.print("Informe o nome do animal: ");
        String nome = leia.nextLine();
        System.out.print("Informe o animal: ");
        String animal = leia.next();
        System.out.print("Informe a idade do animal: ");
        int idade = leia.nextInt();

        Pet pet1 = new Pet( nome, animal , idade);

        pet1.exibir();
        pet1.idadehumana();


    }
}

class Pet {
    String nome;
    String animal;
    int idade;

    public Pet (String nome, String animal , int idade) {
        this.nome = nome;
        this.animal = animal;
        this.idade = idade;


    }

    public void exibir () {
        System.out.println("O animal é: "+animal);
        System.out.println("O nome do animal é: "+nome);

    }

    public void idadehumana () {
        System.out.println("Em anos humanos, o "+nome+" teria "+(idade*7)+" anos");
    }

}
