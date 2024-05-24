import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /* ejemplo con clase Alumno
        Alumno alumno1 = new Alumno(); //alumno sin nombre
        alumno1.setNombre("Pedro");
        Alumno alumno2 = new Alumno("Jorge");
        Alumno alumno3 = new Alumno("Manuel", "manuel@umg.edu.gt");
        //System.out.println(alumno1.getNombre());
        //System.out.println(alumno2.getNombre());
        //System.out.println(alumno3.getNombre() + " - " + alumno3.getCorreo());
        List<Alumno> alumnoList = new ArrayList<>();
        for(int i=0; i<=25; i++){
            String nombreObjeto = "Alumno" + i;
            Alumno alumno = new Alumno(nombreObjeto);
            alumnoList.add(alumno);
        }
        for (Alumno alumno: alumnoList){
            System.out.println(alumno.getNombre());
        }*/
        //ejemplo con clase calculadora
        Calculadora calculadora1=new Calculadora("miCalculadora");
        int resultadoSuma = calculadora1.sumar(5,10);
        System.out.println(resultadoSuma);
        Scanner scanner = new Scanner(System.in);//objeto scanner para recibir datos de teclado
        //System.out.println("Ingrese el nombre de la otra calculadora");
        //String nombreCalculadora = scanner.nextLine();
        //Calculadora calculadora2 = new Calculadora(nombreCalculadora);
        //System.out.println("El nombre es - " + calculadora2.getNombreCalculadora());

        Calculadora calculadora3 = new Calculadora("ejemploCalculadora");
        System.out.println("Ingrese el primer numero");
        int primeroNumero = scanner.nextInt();
        System.out.println("Ingrese el segundo numero");
        int segundoNumero = scanner.nextInt();

        int resultado = calculadora3.sumar(primeroNumero, segundoNumero);
        System.out.println("El Resultado es :" + resultado);
    }
}
