/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.foobarspam.personas;

import java.util.ArrayList;

/**
 *
 * @author Victor
 */

public class Persona {
    
    String name = "Unknown name";
    String surname = "Unknown surname";
    //Enum estatus={"Paro","Trabajando","Estudiando"};
    String status = "";
    String genre = "Unkown genre";
    
   
      
    public Persona (String name, String surname, String status, String genre ) {
        this.name = name;
        this.surname = surname;
        this.status = status;
        this.genre = genre;
}
    public String toStringPesona() {
        return "la persona de nombre " + name + ", apellido " + surname + ", estado " + status + " y genero " + genre;
    }
    
}
