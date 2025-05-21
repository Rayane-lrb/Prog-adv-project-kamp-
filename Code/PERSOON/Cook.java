package PERSOON;



import java.time.LocalDate;

/**
 * Klasse die een kok (Cook) representeert.
 * Een kok is een speciaal soort personeelslid (Staff).
 * 
 * Deze klasse erft van Staff en specificeert koks apart.
 * 
 * @author Laroub Rayane
 * @version 1.0
 */
public class Cook extends Staff {
   
       /**
     * Constructor voor een kok.
     * 
     * @param firstName  de voornaam van de kok
     * @param lastName   de achternaam van de kok
     * @param DoB        de geboortedatum van de kok
     * @param address    het adres van de kok
     * @param function   de functie of rol van de kok
     */
    public Cook(String firstName, String lastName, LocalDate DoB, Address address, String function) {
        super(firstName, lastName, DoB, address, function);
    }

      /**
     * Geeft een tekstuele representatie van de kok.
     * Maakt duidelijk dat het om een kok gaat door (Cook) toe te voegen.
     * 
     * @return stringrepresentatie van de kok
     */
    @Override
    public String toString() {
        return "(Cook) " + super.toString();
    }

    
}
