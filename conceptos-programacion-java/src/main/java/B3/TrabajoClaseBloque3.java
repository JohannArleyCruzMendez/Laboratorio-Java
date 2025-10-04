package B3;

public class TrabajoClaseBloque3 {

    public static void main(String[] args) {


        int[] numeros = {3, 0, -1, 2, 4};
        int i = numeros.length - 1;

        System.out.print("{");
        while (i >= 0) {
            System.out.print(numeros[i]);
            if (i > 0) {
                System.out.print(", ");
            }
            i--;
        }
        System.out.println("}");

         }
    }









