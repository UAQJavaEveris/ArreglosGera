/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Berserker
 */
public class Arreglos {

    /**
     * @param args the command line arguments
     */
    
    String nombres [] = {"uno","dos"};
    int valores [] = {1,2,3,4};
    double decimales [] = {1.1,2.2,3.3,4.4};
    Double decimales2 [] = {new Double(1.1), new Double(2.2)};
    static Persona persona [] = {new Persona(),new Persona()};
    static Persona persona2 [] = {new Persona("Gera", "Gudiño",21), 
        new Persona("Igving", "Manco")};
    
    public static void main(String[] args) {
        System.out.println("For normal\n");
        for (int i = 0; i < persona.length; i++) {
            System.out.println("Nombre: "+persona[i].getNombre());
            System.out.println("Apellido: "+persona[i].getApellido());
            System.out.println("Edad: "+persona[i].getEdad());
            System.out.println("\n");
        }
        
        System.out.println("For each\n");
        for (Persona p : persona2) {
            System.out.println("Nombre: "+p.getNombre());
            System.out.println("Apellido: "+p.getApellido());
            System.out.println("Edad: "+p.getEdad());
            System.out.println("\n");
        }
    }
    
}
