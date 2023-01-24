package OOPAssignment;

     /**
     * VideoGames class file
     * @author Matthew Monzon
     * 
     */

public class VideoGames extends Games {

 
    
    private String console;
    private String gameGenre;
    private Boolean online;

    
  /**
  * Constructor - creates new instance of an basketball object
  *
  * @param price - Product price
  * @param nameOfProduct- Name of the product
  * @param playerCount- Players who can play the game
  * @param ageRate- Minimum age to play the game
  * @param console - Game the console is played on
  * @param gameGenre - Genre of the game
  * @param online - If the game is played online
  */
    public VideoGames (Double price, String nameOfProduct, int playerCount, int ageRate, String console, String gameGenre, Boolean online ){
        super(price, nameOfProduct, playerCount, ageRate);
        this.console = console;
        this.gameGenre = gameGenre;
        this.online = online;
    }

     /**
       * Returns the console the game is played on
       * 
       * @return console game is played on
       */
    public String getConsole() {
        return this.console;
    }

     /**
       * Returns the genre of the game
       * 
       * @return game genre
       */

    public String getGenre() {
        return this.gameGenre;
    }

     /**
       * Returns if the game is an online game
       * 
       * @return true or false if the game is online
       */
    public Boolean getOnline(){
        return this.online;
    }

    
    /**
    * Prints out video game information
    * 
    */
    public void getInfo(){
        System.out.println("The number of players that can play are " + getPlayer());
        System.out.println("The minimum age to play this game is " + getRate());
        System.out.println("This game is played on " +console );
        System.out.println("The game genre is " +gameGenre);
        if (online = true){
            System.out.println("Game can be played online");

        }
        else{
            System.out.println("Game cannot be played online");
        }
}
}
