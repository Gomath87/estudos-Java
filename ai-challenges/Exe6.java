//Login Simples: Crie uma variável usuario e uma senha. Se usuario for "admin" E senha for "1234", exiba "Acesso Permitido".


public class Exe6 {

    public static void main(String[] args){

        String usuario = "admim";
        String senha = "1234";

        if (usuario.equals("admim") && senha.equals("1234")) {
            System.out.println("Acesso permitido");
        } else{
            System.out.println("Acesso negado");
        }
    }

}
