/*
 * @author elvira 
 * @version 3.0
 */
package gestion;

import java.util.*;

public class GeneradorNombres {
     Random generate = new Random();
        String nombreCompleto[] [] = {
            {"Elvira","Magallanes"},
            {"Juan", "Lopez Lopez"},
            {"Luis", "Cesar"},
            {"Alicia", "Rey"},
            {"Jose", "Acero"},
            {"Juana", "Villa"},
            {"Jesus", "Garcia"},
            {"Maria", "Carvajal"},
            {"Pedro", "Romero"},
            {"Gianna", "Guerrero"},
            {"Julian", "Dueñas"},
            {"Juliana", "Sierra"},
            {"Eduardo", "Villamil"},
            {"Marcela", "Sanchez"},
            {"Luisa", "Jimenez"},
            {"Alejandro", "Nieto"},
            {"Camilo", "Perez"},
            {"Adriana", "Uribe"},
            {"Alexander", "Puentes"},
            {"Daniela", "Ochoa"},
            {"Carlos", "Cifuentes"},
        };
        
 void imprimir (){
     System.out.println("Alumno: " +Arrays.toString(nombreCompleto[generate.nextInt(20)]));
 }
}
