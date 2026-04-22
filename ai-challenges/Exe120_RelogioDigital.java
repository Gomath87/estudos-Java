//Relógio Digital
//Crie uma classe Relogio.
//Atributo: int hora.
//Método: ajustarHora(int novaHora).
//No Main: Ajuste para 15 e imprima: "Agora são 15 horas".


public class Exe120_RelogioDigital {
    static void main() {

        Relogio hou = new Relogio();
        hou.ajustarHora(15);

    }
}


class Relogio {
    int hora;

    public void ajustarHora(int novaHora){
        this.hora = novaHora;
        System.out.println("Agora são "+hora+" horas");

    }

}