package PERSOON;

/**
 * Klasse die een adres representeert.
 * Bevat straat, huisnummer, postcode en plaats.
 * 
 * @author Laroub Rayane
 * @version 1.0
 */                                                                                                                                         


public class Address {

    private String street;
    private int houseNumber;
    private int zipCode;
    private String city;

    /**
     * Constructor voor een adres.
     * 
     * @param street     de straatnaam
     * @param houseNumber het huisnummer
     * @param zipCode    de postcode
     * @param city       de plaatsnaam
     * @throws IllegalArgumentException als street of city null is
     */
    public Address(String street, int houseNUmber, int zipCode, String city) {
        if(street == null || city == null) {
            throw new IllegalArgumentException("None of the parameters should be empty!");
        }
        this.street = street;
        this.houseNumber = houseNUmber;
        this.zipCode = zipCode;
        this.city = city;
    }

    
    /**
     * Geeft de straatnaam terug.
     * @return straatnaam
     */
    public String getStreet() {
        return street;
    }

      /**
     * Stelt de straatnaam in.
     * @param street nieuwe straatnaam
     */
    public void setStreet(String street) {
        this.street = street;
    }

    /**
     * Geeft het huisnummer terug.
     * @return huisnummer
     */
    public int getHouseNumber() {
        return houseNumber;
    }

     /**
     * Stelt het huisnummer in.
     * Huisnummer mag niet negatief zijn.
     * 
     * @param houseNumber nieuw huisnummer
     * @throws IllegalArgumentException als houseNumber negatief is
     */
    public void setHouseNumber(int houseNumber) {
        if(this.houseNumber >= 0) {
            this.houseNumber = houseNumber;
        }else throw new IllegalArgumentException("Can't be lower than 0!");
    }

      /**
     * Geeft de postcode terug.
     * @return postcode
     */
    public int getZipCode() {
        return zipCode;
    }

      /**
     * Stelt de postcode in.
     * Postcode mag niet negatief zijn.
     * 
     * @param zipCode nieuwe postcode
     * @throws IllegalArgumentException als zipCode negatief is
     */
    public void setzipCode(int zipCode) {
        if(this.zipCode >= 0) {
            this.zipCode = zipCode;
        }else throw new IllegalArgumentException("Zipcode can't be lower than 0!");
    }

     /**
     * Geeft de plaatsnaam terug.
     * @return plaatsnaam
     */
    public String getCity() {
        return city;
    }

       /**
     * Stelt de plaatsnaam in.
     * @param city nieuwe plaatsnaam
     */
    public void setCity(String city) {
        this.city = city;
    }
    
      /**
     * Geeft een tekstuele representatie van het adres.
     * 
     * @return adres als string
     */
    @Override
    public String toString() {
        return " " + street + " " + houseNumber  + ", " + zipCode + " " + city;
    } 
}