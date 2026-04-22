import java.util.ArrayList;
import java.util.Scanner;

public class Exe1789_ACorridaDeLesmas {

    static void main() {
        // Leitor
        Scanner leia = new Scanner(System.in);

        //While com tratamento de fim do arquivo EOF
        while(leia.hasNext()){
            int quantidade = leia.nextInt();
            //Lista que vai guardar as entradas
            ArrayList<Integer> lista = new ArrayList<>();

            // For para tratar os números que vão entrar todos de uma vez num único imput
            for (int i = 0; i < quantidade; i++){
                int num = leia.nextInt();
                lista.add(num);  // Adicionando a cada loop o número a lista!
            }

            int maior = 0;

            // for que vai percorrer a lista para obter o maior número informado
            for (int i = 0; i < lista.size(); i ++){
                // esse if vai adicionar o primeiro número como o maior, o que vai garantir que a comparação com os próximos seja facilitada devido a este método!
                if (i == 0){
                    maior = lista.get(i);
                //Aqui continua a verificação pos método no primeiro if
                }else {
                    if (lista.get(i) > maior){
                        maior = lista.get(i);
                    }
                }
            }


            //Aqui vai tratar a saída de acordo com a especificação que é exigida no problema!
            //Caso maior ou igual a 20 retorna Nivel 3
            if (maior >= 20){
                System.out.println(3);
            //Caso maior ou igual a 10 retorna Nivel 2
            } else if (maior >= 10) {
                System.out.println(2);
            //Caso menor que 10 retorna Nivel 1
            } else {
                System.out.println(1);
            }


        }
        //Uma boa prática para fechar o leitor!
        leia.close();
    }
}
