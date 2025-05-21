package PERSOON;


import java.time.LocalDate;

/**
 * Klasse die een schoonmaker (Cleaner) representeert.
 * Een schoonmaker is een speciaal soort personeelslid (Staff).
 * 
 * Deze klasse erft van Staff en specificeert schoonmakers apart.
 * 
 * @author Laroub Rayane
 * @version 1.0
 */
public class Cleaner extends Staff{
    
      /**
     * Constructor voor een schoonmaker.
     * 
     * @param firstName  de voornaam van de schoonmaker
     * @param lastName   de achternaam van de schoonmaker
     * @param DoB        de geboortedatum van de schoonmaker
     * @param address    het adres van de schoonmaker
     * @param function   de functie of rol van de schoonmaker
     */
    public Cleaner(String firstName, String lastName, LocalDate DoB, Address address, String function) {
        super(firstName, lastName, DoB, address, function);
    }
   
      /**
     * Geeft een tekstuele representatie van de schoonmaker.
     * Maakt duidelijk dat het om een schoonmaker gaat door (Cleaner) toe te voegen.
     * 
     * @return stringrepresentatie van de schoonmaker
     */
    @Override
    public String toString() {
        return "(Cleaner) " + super.toString();
    }
    
}
