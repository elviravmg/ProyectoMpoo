package gestion;

public class Alumno {
     private String num_cuenta;
    private String nombre;
    private String apellido;
    private int edad;

    //Constructor vacio
    public Alumno() {
    }

    //Constructor que permite crear un alumno, con estos atributos
    public Alumno(String num_cuenta, String nombre, String apellido, int edad) {
        this.num_cuenta = num_cuenta;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }
    
    //Getter y setters porque nuestros atributos son privados
    public String getNum_cuenta() {
        return num_cuenta;
    }

    public void setNum_cuenta(String num_cuenta) {
        this.num_cuenta = num_cuenta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
}
