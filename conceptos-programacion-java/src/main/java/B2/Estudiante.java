package B2;

public class Estudiante {

    String nombre;
    String apellido;
    String id;

    String asignatura;

    int edad;
    double nota1 = 0;
    double nota2 = 0;
    double nota3 = 0;
    double promedio = 0;
    String aprobado ;

    Estudiante(String nombre, String apellido, String asignatura, String id, int edad, double nota1, double nota2, double nota3) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.asignatura = asignatura;
        this.id = id;
        this.edad = edad;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;

    }

    String getNombre() {

        return nombre;
    }

     String getApellido(){

        return  apellido;
     }

     String getAsignatura(){

        return asignatura;
     }


      String getId(){

        return id;

      }
      int getEdad(){

      return  edad;
      }

      double getNota1(){

        return nota1;
      }

      double getNota2(){

        return  nota2;

      }

      double getNota3(){

        return nota3;

      }

      void setNombre(String nombre){

        this.nombre=nombre;
      }

       void setApellido(String apellido){
          this.apellido= apellido;
       }

       void setId(String id){

        this.id=id;
       }

       void setAsignatura(String asignatura){

        this.asignatura=asignatura;
       }

       void  setEdad(int edad){
        this.edad=edad;
       }
       void setNota1(double nota1){
           this.nota1=nota1;
       }

       void setNota2(double nota2){

        this.nota2=nota2;
       }

       void setNota3(double nota3){

        this.nota3=nota3;
       }






      String aproado(){


        promedio = (nota1+nota2+nota3)/3;

        return promedio > 3 ? "aprobado" : "reprobado" ;

      }

      void imprimirEstudiante(){

          System.out.println(" Nombre y apellido del estudiante " + nombre +" "+ apellido);
          System.out.println(" Cedula " + id);
          System.out.println(" Edad" + edad);
          System.out.println(" Asignatura"+ asignatura);
          System.out.println(" paso la asignatira ? " +aproado());

      }







}

