package B3;

public class Primos {

    int numero;

    boolean primo;

     Primos(int numero) {

         this.numero = numero;

     }
        boolean primo(){

            if (numero <1){ return false;}

            for (int i = 2; i * i <= numero; i++) {
                if (numero % i == 0) {
                    return false;
                }
            }

            return true;


    }
         void  imprimir(){

             System.out.println( numero +" ¿ es numero primo? " +primo());

           }


}
