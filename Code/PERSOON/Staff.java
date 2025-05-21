package PERSOON;



/**
 * Klasse die een personeelslid voorstelt binnen het kamp.
 * Een personeelslid heeft een voornaam, achternaam, geboortedatum, adres en functie.
 * 
 * @author Laroub Rayane
 * @version 1.0 2025-05-17
 */
import java.time.LocalDate;

public class Staff extends Person {
   
   private String function;
  
   /**
     * Constructor voor een personeelslid.
     * 
     * @param firstName  de voornaam van het personeelslid
     * @param lastName   de achternaam van het personeelslid
     * @param dateOfBirth geboortedatum van het personeelslid
     * @param address    het adres van het personeelslid
     * @param function   de functie van het personeelslid (bijv. Leader, Cook, Cleaner)
     */
   
    public Staff(String firstName, String lastName, LocalDate DoB, Address address, String function) {
        super(firstName, lastName, DoB, address);
         this.function = function;
    }
   
    /**
     * Geeft de functie van het personeelslid terug.
     * 
     * @return de functie van het personeelslid
     */
    public String getFunction() {
        return function;
    }
    
     /**
     * Zet een nieuwe functie voor het personeelslid.
     * 
     * @param function de nieuwe functie
     */
    public void setFunction(String function) {
        this.function = function;
    }
    
    /**
     * Geeft een tekstuele weergave van het personeelslid.
     * 
     * @return string met voornaam, achternaam en functie
     */
    @Override
    public String toString() {
        return super.toString() + "\n" +
        "Function: " + function;
    }
    
}
