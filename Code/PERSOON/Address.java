package PERSOON;




public class Address {

    private String street;
    private int houseNumber;
    private int zipCode;
    private String city;

    public Address(String street, int houseNUmber, int zipCode, String city) {
        if(street == null || city == null) {
            throw new IllegalArgumentException("None of the parameters should be empty!");
        }
        this.street = street;
        this.houseNumber = houseNUmber;
        this.zipCode = zipCode;
        this.city = city;
    }

    public String getStreet() {
        return street;
    }
    public void setStreet(String street) {
        this.street = street;
    }
    public int getHouseNumber() {
        return houseNumber;
    }
    public void setHouseNumber(int houseNumber) {
        if(this.houseNumber >= 0) {
            this.houseNumber = houseNumber;
        }else throw new IllegalArgumentException("Can't be lower than 0!");
    }
    public int getZipCode() {
        return zipCode;
    }
    public void setzipCode(int zipCode) {
        if(this.zipCode >= 0) {
            this.zipCode = zipCode;
        }else throw new IllegalArgumentException("Zipcode can't be lower than 0!");
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    
    @Override
    public String toString() {
        return " " + street + " " + houseNumber  + ", " + zipCode + " " + city;
    } 
}