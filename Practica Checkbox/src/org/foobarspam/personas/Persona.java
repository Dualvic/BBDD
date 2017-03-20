package org.foobarspam.personas;

/**
 * @author Victor
 */

public class Persona {
    
    /*
    * Variable declaration
    */
    String name = "Unknown name";
    String surname = "Unknown surname";
    String status = "";
    String genre = "Unkown genre";
      
    /*
    * Constructor
    */
    public Persona (String name, String surname, String status, String genre ) {
        this.name = name;
        this.surname = surname;
        this.status = status;
        this.genre = genre;
}
    /*
    * Getter & setters
    */

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getStatus() {
        return status;
    }

    public String getGenre() {
        return genre;
    }
    
    
    /*
    * function to convert the person object to string
    */
    
    public String toStringPesona() {
        return "la persona de nombre " + name + ", apellido " + surname + ", estado " + status + " y genero " + genre;
    }
    
}
