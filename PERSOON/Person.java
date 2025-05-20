package PERSOON;



import java.time.LocalDate;

public class Person {

    private String firstName;
    private String lastName;
    private LocalDate DoB;
    // DoB = Date of Birth
    private Address address;
    // classe Adress aanmaken om een goede structuur/vaste structuur te hebben

    public Person(String firstName, String lastName, LocalDate DoB, Address address) {
        if(firstName == null || lastName == null || DoB == null || address == null) {
            throw new IllegalArgumentException("None of the parameters should be empty!");
        }
        this.firstName = firstName;
        this.lastName = lastName;
        this.DoB = DoB;
        this.address = address;

    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public LocalDate getDoB() {
        return DoB;
    }
    public void setDoB(LocalDate DoB) {
        this.DoB = DoB;
    }
    public Address getAddress() {
        return address;
    }
    public void setAddress(Address address) {
        this.address = address;
    }

    public String toString() {
        return "Name: " + firstName + " " + lastName + "\n" +
               "Date of birth: " + DoB + "\n" +
               "Address: " + address;
    }



}