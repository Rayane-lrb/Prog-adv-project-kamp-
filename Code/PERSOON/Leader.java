package PERSOON;





import java.time.LocalDate;

/**
 * Klasse die een leider (Leader) representeert.
 * Een leider is een speciaal soort personeelslid (Staff).
 * 
 * Deze klasse erft van Staff en voegt geen extra attributen toe,
 * maar kan worden gebruikt om leiders specifiek aan te duiden.
 * 
 * @author Laroub Rayane
 * @version 1.0
 */
public class Leader extends Staff {
    
    public Leader(String firstName, String lastName, LocalDate DoB, Address address, String function) {
        super(firstName, lastName, DoB, address, function);
    }
    @Override
    public String toString() {
    return "(Leader) " + super.toString();
    }
}
