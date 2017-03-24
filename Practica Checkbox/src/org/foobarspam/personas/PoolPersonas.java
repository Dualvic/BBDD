/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.foobarspam.personas;

import java.util.ArrayList;
import org.foobarspam.personas.Persona;

/**
 *
 * @author Victor
 */
public class PoolPersonas {
    
    /*
    * Variable declaration
    */
    
    public static ArrayList<Persona> personas = new ArrayList<>();
   
    PoolPersonas(ArrayList<Persona> personas) {
        for (Persona persona : personas) {
            this.personas.add(persona);
        }
    }
    
    /*
    * Getters & Setters
    */
    
    public static ArrayList<Persona> getPersonas() {
        return personas;
    }

    /*
    * logic
    */

    public static void addPerson(Persona persona) {
        personas.add(persona);
    }
    
    
}
