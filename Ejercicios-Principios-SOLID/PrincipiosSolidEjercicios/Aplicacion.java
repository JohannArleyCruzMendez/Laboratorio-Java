public class Aplicacion {


        public static void main(String[] args) {
            Persona p1 = new Persona("Ana", 1990);
            ImpresoraPersona impresora = new ImpresoraPersona();

            impresora.imprimir(p1);
        }
    }

