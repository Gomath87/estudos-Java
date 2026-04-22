//Perfil de Rede Social
//Crie uma classe Perfil.
//Atributos: String biografia e int seguidores.
//Método: exibirPerfil() que mostra a bio e o número de seguidores.
//No Main: Crie seu perfil fictício e exiba.

public class Exe124_PerfilDeRedeSocial {
    static void main() {
        Perfil n = new Perfil("max",1450);
        n.exibirPerfil();

    }
}


class Perfil {
    String biografia;
    int seguidores;

    public Perfil (String nome, int valor){
        this.biografia = nome;
        this.seguidores = valor;
    }

    public void  exibirPerfil() {
        System.out.println("Nome: "+biografia);
        System.out.println("Seguidores: "+seguidores);
    }
}