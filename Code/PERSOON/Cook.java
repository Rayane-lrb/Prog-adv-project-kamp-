package PERSOON;



import java.time.LocalDate;

public class Cook extends Staff {
   
    public Cook(String firstName, String lastName, LocalDate DoB, Address address, String function) {
        super(firstName, lastName, DoB, address, function);
    }
    @Override
    public String toString() {
        return "(Cook) " + super.toString();
    }

    
}
