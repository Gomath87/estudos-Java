public class Exe1096_SequenciaIJ2 {
    static void main() {
        int i = 1;
        int j = 7;
        int cont = 0;

        while (i <= 9){
            System.out.println("I="+i+" J="+j);
            cont +=1;
            j -= 1;

            if (cont == 3){
                i += 2;
                cont = 0;
                j = 7;
            }


        }
    }
}
