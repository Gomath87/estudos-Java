//Controle de Estoque de Carros
//Classe Carro: Atributos modelo e ano.
//
//No Main: Peça ao usuário para cadastrar carros.
//Use while para continuar cadastrando até ele digitar "fim" no modelo.
//Guarde em um ArrayList. No final, mostre quantos carros foram cadastrados.

import java.util.ArrayList;
import java.util.Scanner;
public class Exe131_ControleDeEstoqueDeCarros {
    static void main() {
        Scanner leia = new Scanner(System.in);
        ArrayList<Carr> estoque = new ArrayList<>();

        String resp = "";
        String modelo = "";

        while (true) {
            System.out.println("Informe o modelo do carro (ou 'fim' para sair): ");
            modelo = leia.nextLine();

            if (modelo.equalsIgnoreCase("fim")) {
                break;
            }

            System.out.print("Informe o ano do carro: ");
            int ano = leia.nextInt();
            leia.nextLine();

            Carr novo = new Carr(modelo, ano);
            estoque.add(novo);
            System.out.println(" Carro cadastrado com sucesso!");

        }

        System.out.println("Total de carros cadastrados: " + estoque.size());

        for (Carr c : estoque) {
            System.out.println("- " + c.modelo + " (" + c.ano + ")");

        }
    }

    static class Carr {
        String modelo;
        int ano;

        public  Carr (String nome, int valor) {
            this.modelo = nome;
            this.ano = valor;

        }
    }
}
