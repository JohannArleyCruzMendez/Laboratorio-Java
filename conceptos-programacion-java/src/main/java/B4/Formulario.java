
package B4;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Scanner;


public class Formulario {


  private  String nombre;
  private String apellido;

  private  String telefono;
  private  String id;

  private  String carreraAcursar;
  private  double promedioNotaESescolares;
  private  String aprobado ;

  private static final Logger LOGGER = LogManager.getLogger(Formulario.class);


  public  Formulario(){



  }

    Formulario(String nombre, String apellido, String telefono, String id, String carreraAcursar,   double promedioNotaESescolares) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.id=id;
        this.carreraAcursar= carreraAcursar;
        this.promedioNotaESescolares = promedioNotaESescolares;




    }

    String getNombre() {

        return nombre;
    }

    String getApellido(){

        return  apellido;
    }

    String getTelefono(){

        return telefono;
    }

    String getId(){

        return id;

    }


    String getCarreraAcursar(){

        return carreraAcursar;
    }

    double getPromedioNotaESescolares(){

        return promedioNotaESescolares;
    }

    void setNombre(String nombre){

        this.nombre=nombre;
    }

    void setApellido(String apellido){
        this.apellido= apellido;
    }


    void setTelefono(String telefono) {
        this.telefono=telefono;
    }

    void setId(String id){

        this.id=id;
    }

    void setCarreraAcursar(String carreraAcursar){

        this.carreraAcursar= carreraAcursar;
    }

   void setPromedioNotaESescolares( double promedioNotaESescolares){

        this.promedioNotaESescolares=promedioNotaESescolares;
   }




    String aproado(){




        return promedioNotaESescolares > 3 ? "aprobado" : "reprobado" ;

    }

    void imprimirEstudiante(){

        LOGGER.info("Datos ingresados: Nombre: " + nombre + ", Apellido: " + apellido + ", ID: " + id +
                ", Carrera a cursar: " + carreraAcursar + ", Promedio de notas escolares: " + promedioNotaESescolares
        +"¿ el candidato es aprobado en la universidad)"+ aproado());





    }

    public void ingresardatos(){

        Scanner ingresadato = new Scanner(System.in);

         while(true){

             System.out.print("Nombre: ");
             nombre = ingresadato.nextLine();

             System.out.print("Apellido: ");
             apellido = ingresadato.nextLine();

             System.out.print("Teléfono: ");
             telefono = ingresadato.nextLine();

             System.out.print("Cédula: ");
             id = ingresadato.nextLine();

             System.out.print("Carrera a cursar: ");
             carreraAcursar = ingresadato.nextLine();

             System.out.print("Promedio de notas escolares: ");
             promedioNotaESescolares =  ingresadato.nextDouble();
             System.out.println("¿el estudiante es admitido ?" +aproado());



        }
        }







}

