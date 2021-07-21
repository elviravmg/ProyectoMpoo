/*
 * @author elvira 
 * @version 1.0
 */
package gestion;

import java.util.Scanner;

public class Numero_cuenta {
    private float promedio;
    private int aprobadas;
    private int materias_inscritas;
    private int creditos_semestre;
    private int vel;
    private int esc;
    private int num;
    
   //Metodo para obtener el numero de cuenta
    int numero_insc(){
        vel = (creditos_semestre/60)*100;
            if(materias_inscritas>0){
                esc = (aprobadas/materias_inscritas)*100;
            }else{
                System.out.println("No puedes tener cero materias");
            }
        num = (int) (promedio*vel*esc);
        return num;
    }
    
    //Funcion para ver el numero de inscripcion
    void datos(){
        System.out.println("Numero de inscripcion: " + numero_insc());
    }
    
    //Funcion para que el usuario agregue sus datos
    int llenado(){
        //Creamos nuestro objeto de tipo scanner
        Scanner scan = new Scanner(System.in);
        
        //Le pedimos los datos que necesitamos al usuario
        System.out.println("Ingrese su promedio: ");
        promedio = scan.nextFloat();
        System.out.println("Ingrese la cantidad de materias aprobadas: ");
        aprobadas = scan.nextInt();
        System.out.println("Ingrese la cantidad de materias inscritas: ");
        materias_inscritas = scan.nextInt();
        System.out.println("Ingrese cuantos créditos cursa este semestre: ");
        creditos_semestre = scan.nextInt();
        
        return 0;
    }
}
