package OOPAssignment;

/**
 * Soccerball class file
 * @author Matthew Monzon
 */

public class Soccerball extends Products {

    // Instance variables
    private Double size;
    private String colour;

    /**
     * Constructor - creates new instance of an Soccerball object
     *
     * @param price - Product price
     * @param nameOfProduct- Name of the product
     * @param size- Size of Soccerball
     * @param colour- Colour of the Soccerball
     */
    public Soccerball(Double price, String nameOfProduct, Double size, String colour) {
        super(price, nameOfProduct);
        this.size = size;
        this.colour = colour;
    }

    /**
     * Returns the Soccerball size
     * 
     * @return Soccerball size
     */
    public Double getSize() {
        return this.size;
    }

    /**
     * Returns the Soccerball colour
     * 
     * @return Soccerball colour
     */
    public String getColour() {
        return this.colour;
    }

    /**
     * Prints out Soccerball information
     */
    public void getInfo() {
        System.out.println("Size of Soccerball is " + size + "''");
        System.out.println("Colour of Soccerball is " + colour);
    }
}
