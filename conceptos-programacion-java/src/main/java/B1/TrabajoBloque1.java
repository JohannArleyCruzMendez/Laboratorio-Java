package B1;
import java.util.Scanner;

public class TrabajoBloque1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el primer número: ");
        Integer numero1 = scanner.nextInt();

        System.out.println("Ingrese el segundo número: ");
        Integer numero2 = scanner.nextInt();

        System.out.println("Ingrese el tercer número: ");
        Integer numero3 = scanner.nextInt();

        Integer mayor = numero1;
        if (numero2.compareTo(mayor) > 0) {
            mayor = numero2;

        }
        if (numero3.compareTo(mayor) > 0) {
            mayor = numero3;
        }

        System.out.println("El mayor de los tres números es: " + mayor);
    }
}



