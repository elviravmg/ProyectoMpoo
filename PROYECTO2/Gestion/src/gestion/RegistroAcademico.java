/*
 * @author elvira 
 * @version 1.0
 */
package gestion;

import java.util.Scanner;
import java.util.ArrayList; 

public class RegistroAcademico {
    private String nombre;
    private int clave;
    public ArrayList<String> listaMaterias;
    int numMaterias;

    //Mi constructor vacio 
    public RegistroAcademico() {
        //Inicializo mi objeto
        listaMaterias = new ArrayList();
    }
    
    //Constructor con los siguientes atributos
    public RegistroAcademico(String nombre, int clave, ArrayList<String> listaMaterias, int numMaterias) {
        this.nombre = nombre;
        this.clave = clave;
        this.listaMaterias = listaMaterias;
        this.numMaterias = numMaterias;
    }


    //Getter y setters por los atributos privados
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getClave() {
        return clave;
    }

    public void setClave(int clave) {
        this.clave = clave;
    }
    
    //Vamos a hacer nuestros metodos llenar datos y mostrar datos
    public void llenarDatos(){
        //Creamos nuestro objeto de tipo scanner
        Scanner scan = new Scanner(System.in);
        
        //Vamos a preguntarle al usuario cuantas materias desea agregar a la lista
        System.out.println("¿Cuántas materias está cursando este semestre?");
        numMaterias = scan.nextInt();
        
        //Agregamos un for loop
        for(int i=0; i<=numMaterias; i++){
            //Le pedimos los datos que necesitamos al usuario
            System.out.println("Ingrese el nombre de la materia: ");
            scan.nextLine(); //Agarra el enter del anterior (NO QUITAR)
            nombre = scan.nextLine();

            //Le paso los datos de la materia
            listaMaterias.add(nombre);
        }
    }

    public RegistroAcademico(int numMaterias) {
        this.numMaterias = numMaterias;
    }
    
    public void imprimirDatos(){
        System.out.println("[---------- LISTA MATERIAS ----------]");
        //For each para recorrer la lista
        for(String materias: listaMaterias){
            System.out.println(materias);
        }
    }
    
}
