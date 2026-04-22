//Reajuste Salarial: Receba o salário de um funcionário. Se for até R$ 2000, aumente 15%. Se for acima de R$ 2000, aumente 10%.

public class Exe8 {
    public static void main(String[] args){

        float salario = 190000.00f;
        float novoSalario;

        if (salario <= 2000.0f){
            novoSalario = salario * 1.15f;
        }else{
            novoSalario = salario * 1.10f;
        }
        System.out.println("O novo salário é de: "+novoSalario);

    }

}
