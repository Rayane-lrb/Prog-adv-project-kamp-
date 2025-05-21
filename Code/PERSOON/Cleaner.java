package PERSOON;


import java.time.LocalDate;

public class Cleaner extends Staff{
    public Cleaner(String firstName, String lastName, LocalDate DoB, Address address, String function) {
        super(firstName, lastName, DoB, address, function);
    }
   
    @Override
    public String toString() {
        return "(Cleaner) " + super.toString();
    }
    
}
