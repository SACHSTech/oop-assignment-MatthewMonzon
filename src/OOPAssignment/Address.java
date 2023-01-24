package OOPAssignment;

/**
 * Address class file
 * @author Matthew Monzon
 */
public class Address {
    private String customerStreet;
    private String customerCity;
    private String customerProvince;
    private String customerCountry;
    
    /**
     * Constructor - creates new instance of an address
     * @param customerStreet - customers street
     * @param customerCity - customers city
     * @param customerProvince - customers province
     * @param customerCountry - customers country
     */
    public Address(String customerStreet, String customerCity, String customerProvince, String customerCountry) {
        this.customerStreet = customerStreet;
        this.customerCity = customerCity;
        this.customerProvince = customerProvince;
        this.customerCountry = customerCountry;  
    }
    
    /**
     * Returns a formatted string representing the customer's address
     * @return String representing the customer's address
     */
    public String toString() {
        return String.format("%s, %s, %s, %s", customerStreet, customerCity, customerProvince, customerCountry);
    }
}