package B4;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Scanner;
public class Main {

    private static final Logger LOGGER = LogManager.getLogger(Main.class);
    public static void main(String[]args){

        Formulario Registro1 = new Formulario();

        while (true) {

            try {

                Registro1.ingresardatos();
                Registro1.imprimirEstudiante();
                break;
            }catch (Exception e){
                LOGGER.warn("Hubo un error al ingresar datos: " + e.getMessage());

            }
        }
    }
}
