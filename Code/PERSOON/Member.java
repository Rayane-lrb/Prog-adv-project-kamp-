package PERSOON;



import java.time.LocalDate;

/**
 * Klasse die een lid voorstelt binnen het kamp.
 * Een lid heeft een voornaam, achternaam, geboortedatum en adres.
 * 
 * @author Laroub Rayane
 * @version 1.0 2025-05-16
 */
public class Member extends Person implements Comparable<Member> {

    /**
     * Constructor voor een lid.
     * 
     * @param firstName  de voornaam van het lid
     * @param lastName   de achternaam van het lid
     * @param dateOfBirth geboortedatum van het lid
     * @param address    het adres van het lid
     */
    public int size;

    public Member(String firstName, String lastName, LocalDate DoB, Address address){
        super(firstName, lastName, DoB, address);
}
@Override
    public int compareTo(Member member) {
        return this.getLastName().compareTo(member.getLastName());
    }
    
    /**
     * Geeft een tekstuele weergave van het lid.
     * 
     * @return string met voornaam en achternaam
     */
@Override
public String toString() {
    return "(Member)\n" + super.toString();
  }
}
