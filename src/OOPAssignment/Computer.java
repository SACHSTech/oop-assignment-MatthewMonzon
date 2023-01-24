package OOPAssignment;

    /**
     * computer class file
     * @author Matthew Monzon
     * 
     */

public class Computer extends Products {
    
 
    // Instance variables
    private String processor;
    private Boolean hasCamera;
    private String typeOfGPU;

      /**
  * Constructor - creates new instance of an keyboard class
  *
  * @param price- Product price
  * @param nameOfProduct- Name of product
  * @param processor - Computer processor
  * @param hasCamera - If the Computer has a camera
  * @param typeOfGPU - What GPU the Computer has
  */
    public Computer (Double price, String nameOfProduct, String processor, Boolean hasCamera, String typeOfGPU) {
        super(price,nameOfProduct);
        this.processor = processor;
        this.hasCamera = hasCamera;
        this.typeOfGPU = typeOfGPU;
    }

     /**
       * Returns the Computer processor 
       * 
       * @return processor
       */
    public String getProcessor() {
        return this.processor;

    }

     /**
       * Returns if the Computer has a camera
       * 
       * @return true or false depending on if the Computer has a camera 
       */

    public Boolean hasCamera() {
        return this.hasCamera;
    }

     /**
       * Returns the GPU of the computer 
       * 
       * @return computer GPU
       */
    public String typeOfGPU() {
        return this.typeOfGPU;
    }

    /**
       * Prints out Computer information
       * 
       */
    public void getInfo(){
        System.out.println("This Computer has an "+ processor);
        System.out.println("This Computer has a "+ typeOfGPU);
        if (hasCamera = true){
            System.out.println("The Computer has a camera");

        }
        else{
            System.out.println("The computer does not have a camera");
        }
    }
}