/* Proyecto final de MPOO. Grupo 6
@ author Elvira Magallanes
@ version 2.0
*/
package gestion;

import java.util.Scanner;
import java.util.ArrayList;
import java.io.IOException;

public class Gestion {

     //MAIN
    public static void main(String[] args) throws IOException {
        int opc; //Entero opcion
	Scanner scan = new Scanner(System.in); //Objeto de tipo Scanner
	// Creamos la lista en dónde serán almacenados los alumnos:
        ArrayList<Alumno> listaAlumnos = new ArrayList<>();

	System.out.println("\n #############################");
	System.out.println("\n    BIENVENIDO AL PROGRAMA    ");
	System.out.println("\n #############################");
	System.out.println("\nEste es un sistema de gestión escolar");
	System.out.println("Por favor, elige una opción");

	do{
            System.out.println("1. Crear alumno: ");
            System.out.println("2. Listar alumno: ");
            System.out.println("3. Eliminar alumno: ");
            System.out.println("4. Modificar alumno: ");
            System.out.println("5. Modulo registro académico: ");
            System.out.println("6. Modulo numero de inscripción: ");
            System.out.println("7. Modulo generador de nombres: ");
            System.out.println("8. Modulo datos personales: ");
            System.out.println("9. Salir: ");

            opc = scan.nextInt(); // Escaneamos la opcion que elija el usuario

            switch(opc){
				
                    case 1: //Case crear alumno
                        //Instancia alumno
                        Alumno alum = new Alumno();
                        System.out.println("Ingrese el nombre del alumno: ");
                        //Obtenemos el nombre del alumno que ingrese el usuario
                        scan.nextLine(); //Agarra el enter del anterior (NO QUITAR)
                        alum.setNombre(scan.nextLine());
                        System.out.println("Ingrese el apellido del alumno: ");
                        //Obtenemos su apellido
                        alum.setApellido(scan.nextLine());
                        System.out.println("Ingrese el numero de cuenta del alumno: ");
                        //Obtenemos su numero de cuenta
                        alum.setNum_cuenta(scan.nextLine());
                        System.out.println("Ingrese la edad del alumno: ");
                        //Obtenemos su edad
                        alum.setEdad(Integer.parseInt(scan.nextLine()));
                        
                        //Guardamos todos los datos en la array list
                        listaAlumnos.add(alum);
                        
                        //Le mostramos al usuario el alumno creado
                        System.out.println("\n ALUMNO: ");
                        System.out.println("Nombre: " + alum.getNombre());
                        System.out.println("Apellido: " + alum.getApellido());
                        System.out.println("Numero de cuenta: " + alum.getNum_cuenta());
                        System.out.println(" ");
                        break;
                    
                    case 2: //Listar todos los alumnos creados en la lisla
                        for(int i=0; i<listaAlumnos.size();i++){
                            System.out.println("Alumno: " + (i+1));
                            //Para obtener un elemento de la lista
                            Alumno estudiante = listaAlumnos.get(i);
                            
                            System.out.println("Nombre: " + estudiante.getNombre());
                            System.out.println("Apellido: " + estudiante.getApellido());
                            System.out.println("Numero de cuenta: " + estudiante.getNum_cuenta());
                            System.out.println(" ");
                        }
                    break;
                    
                    case 3: //Eliminar alumno
                        System.out.println("Ingrese el numero de cuenta del alumno a eliminar: ");
                        scan.nextLine(); //Agarra el enter del anterior (NO QUITAR)
                        String n_cuenta = scan.nextLine();
                        
                        for(int i=0; i<listaAlumnos.size(); i++){
                            Alumno estudiante = listaAlumnos.get(i);
                            //Buscamos cual numero de cuenta corresponde al alumno
                            if(n_cuenta.equals(estudiante.getNum_cuenta())){
                                //Eliminamos un elemento de la lista usando la opción .remove()
                                listaAlumnos.remove(i);
                                System.out.println("Alumno eliminado");
                            }else{
                                System.out.println("No hay alumnos en la lista");
                                System.out.println(" ");
                            }
                        }
                    break;
                    
                    case 4: //Modificar alumno
                         System.out.println("Ingrese el numero de cuenta del alumno a modificar: ");
                         scan.nextLine(); //Agarra el enter del anterior (NO QUITAR)
                         n_cuenta = scan.nextLine();
                         for(int i = 0; i<listaAlumnos.size(); i++){
                             Alumno estudiante = listaAlumnos.get(i);
                             if(n_cuenta.equals(estudiante.getNum_cuenta())){
                                 System.out.println("Nombre: " + estudiante.getNombre());
                                 System.out.println("Apellido: " + estudiante.getApellido());
                                 System.out.println("Ingrese nuevo nombre: ");
                                 String nombre = scan.nextLine();
                                 System.out.println("Ingrese nuevo apellido: ");
                                 String apellido = scan.nextLine();
                                 
                                 estudiante.setNombre(nombre);
                                 estudiante.setApellido(apellido);
                             }
                         }
                         System.out.println(" ");
                    break;
                    
                    case 5: //Modulo registro academico
                        System.out.println("Aqui está el modulo de registro academico");
                        //Creo la instancia de mi clase
                        RegistroAcademico registro = new RegistroAcademico();
                        //Mando a llamar a mis metodos
                        registro.llenarDatos();
                        registro.imprimirDatos();
                    break;
                    
                    case 6: //Modulo numero de inscripcion
                        System.out.println("Aqui esta el modulo de numero de inscripcion");
                        //Creo la instancia de mi clase
                        Numero_cuenta num_insc = new Numero_cuenta();
                        //Mando a llamar a mis metodos
                        num_insc.llenado();
                        num_insc.datos();
                    break;
                    
                    case 7:
                        //Instanciamos nuestra clase
                        GeneradorNombres names = new GeneradorNombres();
                        
                        //Llamamos al método que imprimirá 20 nombres
                        names.imprimir();
                    break;
                    
                    case 8:
                        Direcciones direc = new Direcciones();
                        direc.leerArchivo("C:\\Users\\el_vi\\Desktop\\direcciones.csv");
                    break; 
                    
                    case 9: //Salir del programa
                        System.out.println("Ha elegido salir del programa");
                    break;
                    
                    default: //En caso que se elija un numero incorrecto
                        System.out.println("¡Opción no válida!");	
            }

	}while(opc!=9);
    }
    
}
