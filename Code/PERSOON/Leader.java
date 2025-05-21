package PERSOON;





import java.time.LocalDate;

public class Leader extends Staff {
    
    public Leader(String firstName, String lastName, LocalDate DoB, Address address, String function) {
        super(firstName, lastName, DoB, address, function);
    }
    @Override
    public String toString() {
    return "(Leader) " + super.toString();
    }
}
