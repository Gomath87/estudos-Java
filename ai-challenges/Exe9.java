//Votação Obrigatória: Receba a idade. Exiba: "Não vota" ($<16$), "Voto opcional" ($16, 17$ ou $>70$) ou "Voto obrigatório" ($18$ a $70$).

public class Exe9 {
    public static void main(String[] args){
        int idade = 15;
        if (idade < 16){
            System.out.println("Não vota");
        } else if (idade >= 16 && idade <= 17 || idade > 70 ) {
            System.out.println("Voto opcional");

        }else {
            System.out.println("Voto obrigatório");
        }
    }
}
