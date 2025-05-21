package PERSOON;



import java.time.LocalDate;

public class Staff extends Person {
   
   private String function;
   
    public Staff(String firstName, String lastName, LocalDate DoB, Address address, String function) {
        super(firstName, lastName, DoB, address);
         this.function = function;
    }

    public String getFunction() {
        return function;
    }
    public void setFunction(String function) {
        this.function = function;
    }
    @Override
    public String toString() {
        return super.toString() + "\n" +
        "Function: " + function;
    }
    
}
