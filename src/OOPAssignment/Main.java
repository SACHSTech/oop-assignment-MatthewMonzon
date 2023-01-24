package OOPAssignment;

import java.io.*;
import java.util.ArrayList;
import java.text.DecimalFormat;


public class Main {
    
    public static void main(String[] args) throws IOException {

        //Objects
        Customer userCustomer;
        OnlineCart userCart;
        Soccerball smallBall;
        Soccerball bigBall;
        MechanicalKeyboard redSwitchKeyboard;
        Keyboard normalKeyboard;
        Computer gamingComputer;
        Computer workComputer;
        VideoGames terraria;
        Boardgames monopoly;

        
        // Variables
        String firstName;
        String lastName;
        String street;
        String city;
        String province;
        String country;
        Double moneyAmount;
        Boolean onApp = true;
        Boolean emptyCart = true;
        Double totalCost; 
        totalCost = 0.00;
        int n = 0;
        ArrayList<Products> itemNames = new ArrayList<Products>();
        int itemSize = 0;
        DecimalFormat dollarsDecimal = new DecimalFormat("0.00");
      

        BufferedReader key = new BufferedReader(new InputStreamReader(System.in));

        // Asks the user information
        System.out.println("Welcome to the Online Shopping for Super Store");
        System.out.println("Give us some personal information for your account");
        System.out.print("Enter your first name: ");
        firstName = key.readLine();
        System.out.print("Enter your last name: ");
        lastName = key.readLine();
        System.out.print("Enter your street: ");
        street = key.readLine();
        System.out.print("Enter your city: ");
        city = key.readLine();
        System.out.print("Enter your province: ");
        province = key.readLine();
        System.out.print("Enter your country: ");
        country = key.readLine();
        System.out.print("How much money would you like to add to your account?. \nYou can add or withdraw money later on: ");
        moneyAmount = Double.parseDouble(key.readLine());      
        
        // Creating user and cart 
        userCustomer = new Customer (firstName, lastName, new Address(street, city, province, country), moneyAmount);
        userCart = new OnlineCart(itemSize, totalCost, emptyCart, itemNames);
        
        // Creating product objects
        
        smallBall = new Soccerball(21.00, "Small Soccerball", 20.00, "red");
        bigBall = new Soccerball(30.00, "Big Soccerball", 29.5, "white");
        redSwitchKeyboard = new MechanicalKeyboard(100.00, "red Switch Keyboard" ,100, true, "red Switch", true);
        normalKeyboard = new Keyboard(10.00, "Membrane keyboard" ,100, false);
        gamingComputer = new Computer (1500.00, "Gaming Computer", "I9", true, "RTX 30");
        workComputer = new Computer(700.00, "Work Computer" ,"I5", true, "RTX 10");
        terraria = new VideoGames(15.00, "terraria", 5, 10, "PC", "Open world", true);
        monopoly = new Boardgames(20.00, "Monopoly", 8, 8, 400, "Dice" );
       

        
        System.out.println("You can now get started with shopping.  ");
        System.out.println("Commands: \n 1. Shop \n 2. Moneycheck \n 3. Totalcost \n 4. Cartsize \n 5. Purchase \n 6. Balance \n 7. Remove \n 8. Cart items \n 9. Command \n 10. Product info \n 11. Log off \n");
        
        // Loops while user is still online
        while(onApp == true) {
       
        // Reads the input from the user
        System.out.print("What would you like to do?: ");
        String command = key.readLine();

       
        // Checks to see if user enters "shop"
        if(command.equalsIgnoreCase("Shop")) {
            System.out.print("Items:\n 1. Small Soccerball $21.00\n 2. Big Soccerball $30.00 \n 3. red switch keyboard $100.00 \n 4. Membrane keyboard $10.00 \n 5. Gaming Computer $1500.00\n 6. Work Computer $700.00\n 7. terraria $15.00 \n 8. Monopoly $20.00\n");
            // Asks the user what to purchase
            System.out.print(" What would you like to purchase: ");
            String item = key.readLine();
   
            // Code below will check if the user enters one of the products
            if (item.equalsIgnoreCase("Small Soccerball")){
                // Makes sure that the user has enough money to buy the product
                if (moneyAmount > 28){
                itemNames.add(smallBall);
                itemSize = itemNames.size();
                n++;
                userCart.moneyPay(28.0);
                userCustomer.moneyMinus(28.0);
                System.out.print("You have purchased a small Soccerball for $" +dollarsDecimal.format(smallBall.getPrice()));
            }
            else{
                System.out.println("You do not have enough money to complete your order.");
            }
        }
            else if (item.equalsIgnoreCase("Big Soccerball")){
               if (moneyAmount > 35){
                itemNames.add(bigBall);
                itemSize = itemNames.size();
                n++;
                userCart.moneyPay(35.0);
                userCustomer.moneyMinus(35.0);
                System.out.print("You have purchased a big Soccerball for $" +dollarsDecimal.format(bigBall.getPrice()));
            }
            else{
                System.out.println("You do not have enough money to complete your order.");
            }
                
            
        }

            else if (item.equalsIgnoreCase("red switch keyboard")){
                if (moneyAmount > 100){
                itemNames.add(redSwitchKeyboard);
                itemSize = itemNames.size();
                n++;
                userCart.moneyPay(100.0);
                userCustomer.moneyMinus(100.0);;
                System.out.print("You have purchased a red switch keyboard for $" +dollarsDecimal.format(redSwitchKeyboard.getPrice()));
            }
                else{
                    System.out.println("You do not have enough money to complete your order.");
                }
            }

            
            else if (item.equalsIgnoreCase("Membrane keyboard") && moneyAmount > 10){
                if (moneyAmount > 10){
                itemNames.add(normalKeyboard);
                itemSize = itemNames.size();
                n++;
                userCart.moneyPay(10.0);
                userCustomer.moneyMinus(10.0);
                System.out.print("You have purchased a work keyboardfor $" +dollarsDecimal.format(normalKeyboard.getPrice()));
                }

                else{
                    System.out.println("You do not have enough money to complete your order.");
                }
            }

            else if (item.equalsIgnoreCase("Gaming Computer")){
                if (moneyAmount > 1500){
                itemNames.add(gamingComputer);
                itemSize = itemNames.size();
                n++;
                userCart.moneyPay(1500.0);
                userCustomer.moneyMinus(1500.0);
                System.out.print("You have purchased a gaming Computer for $" +dollarsDecimal.format(gamingComputer.getPrice()));
                }
                else{
                    System.out.println("You do not have enough money to complete your order.");
                }
            }

            else if (item.equalsIgnoreCase("Work Computer")){
                if(moneyAmount > 700){
                itemNames.add(workComputer);
                itemSize = itemNames.size();
                n++;
                userCart.moneyPay(700.0);
                userCustomer.moneyMinus(700.0);
                System.out.print("You have purchased a work Computer for $" +dollarsDecimal.format(workComputer.getPrice()));
                }

                else{
                    System.out.println("You do not have enough money to complete your order.");
                }
            }

            else if (item.equalsIgnoreCase("terraria")){
                if(moneyAmount > 35){
                itemNames.add(terraria);
                itemSize = itemNames.size();
                n++;
                userCart.moneyPay(35.0);
                userCustomer.moneyMinus(35.0);
                System.out.print("You have purchased terraria for $" + dollarsDecimal.format(terraria.getPrice()));
                }
                else{
                    System.out.println("You do not have enough money to complete your order.");
                }
            }

            else if(item.equalsIgnoreCase("Monopoly")){ 
                if (moneyAmount > 20){
                itemNames.add(monopoly);
                itemSize = itemNames.size();
                n++;
                userCart.moneyPay(20.0);
                userCustomer.moneyMinus(20.0);
                System.out.print("You have purchased monopoly for $" + dollarsDecimal.format(monopoly.getPrice()));
                }
                else{
                    System.out.println("You do not have enough money to complete your order.");
                }
            }

            else{
                System.out.print("Invalid request");
            }
            
        }
        // Checks to see if user enters "moneyCheck"
        else if (command.equalsIgnoreCase("moneyCheck")) {
            // Outputs how much money the user has left
            System.out.println("You have $" + dollarsDecimal.format(userCustomer.getMoney())+" left");
            
        }

        // Checks to see if user enters "totalCost"
        else if(command.equalsIgnoreCase("totalCost")){
            // Outputs the total cost of the cart 
            System.out.println("Total cost of $" + dollarsDecimal.format(userCart.getTotalCost()));
        }

        // Checks to see if the user enters "cartSize"
        else if(command.equalsIgnoreCase("cartSize")){ 
            // Outputs total number of items in the cart
            System.out.println("You have a total of " +userCart.getNumberOfItems() + " items");
        }

        // Checks to see if the user enters "Purchase"
        else if (command.equalsIgnoreCase("Purchase")){
            // Confirms the purchase and will log user off the app
            System.out.println("Thank you for confirming your purhcase "  + userCustomer.getFirstName() + "! We will ship everything to " + userCustomer.getAddress());
            System.out.println("You will now log off");
            onApp = false;
        }

        // Checks to see if the user has entered "balance"
        else if (command.equalsIgnoreCase("Balance")){
            System.out.println("Do you want to deposit or withdraw money from your account?: ");
            String balance = key.readLine();

            // Checks to see if the user enters "deposit"
            if (balance.equalsIgnoreCase("Deposit")){
                System.out.println("How much money are you going to deposit?: ");
                Double putMoney = Double.parseDouble(key.readLine());
                // Adds amount of money user enters 
                userCustomer.moneyAdd(putMoney);
                System.out.println("You have deposited $" +dollarsDecimal.format(putMoney));
            }

            // Checks to see if the user enters "withdraw"
            else if (balance.equalsIgnoreCase("Withdraw")){
                System.out.println("How much money are you going to take out?: ");
                Double withdrawMoney = Double.parseDouble(key.readLine());
                // Makes sure that user does not have negative money have withdrawing
                if (withdrawMoney > userCustomer.getMoney()) {
                    System.out.print("Your balance will go in the negatives!.");

                }
                else{
                    // Substracts the money user enters 
                    userCustomer.moneyMinus(withdrawMoney);
                    System.out.println("You have withdrew $" + dollarsDecimal.format(withdrawMoney));
                }

            }

            else{
                System.out.println("Invalid option.");
            }
        }

        // Checks to see if user enters "remove"
        else if(command.equalsIgnoreCase("Remove")){
            if (userCart.getNumberOfItems() > 0){
            System.out.println("Which item do you want to remove.");
            // Outputs list of items user has in the cart
            for (int i = 0; i < n ; i++) {
                System.out.println(i+1 + ". " +itemNames.get(i).getProductName());

                
            }

            int takeOut = Integer.parseInt(key.readLine()) - 1;
            System.out.println("You have removed " + itemNames.get(takeOut).getProductName());

            // Deducts cost from cart depending on which item was picked
            if (itemNames.get(takeOut).getProductName().equalsIgnoreCase("Small Soccerball")){
                userCart.moneyTake(21.00);
                userCustomer.moneyAdd(21.00);
              
            }

            else if (itemNames.get(takeOut).getProductName().equalsIgnoreCase("Big Soccerball")){
                userCart.moneyTake(30.00);
                userCustomer.moneyAdd(30.00);
                
            }

            else if (itemNames.get(takeOut).getProductName().equalsIgnoreCase("red switch keyboard")){
                userCart.moneyTake(100.00);
                userCustomer.moneyAdd(100.00);
            }

            
            else if (itemNames.get(takeOut).getProductName().equalsIgnoreCase("Work keyboard")){
                userCart.moneyTake(10.00);
                userCustomer.moneyAdd(10.00);
     
            }

            else if (itemNames.get(takeOut).getProductName().equalsIgnoreCase("Gaming Computer")){
                userCart.moneyTake(1500.00);
                userCustomer.moneyAdd(1500.00);

            }

            else if (itemNames.get(takeOut).getProductName().equalsIgnoreCase("Work Computer")){
                userCart.moneyTake(700.00);
                userCustomer.moneyAdd(700.00);
               
            }

            else if (itemNames.get(takeOut).getProductName().equalsIgnoreCase("terraria")){
                userCart.moneyTake(15.00);
                userCustomer.moneyAdd(15.00);
            }

            else if (itemNames.get(takeOut).getProductName().equalsIgnoreCase("Monopoly")){
                userCart.moneyTake(20.00);
                userCustomer.moneyAdd(20.00);
            }

            else{
                System.out.println("Invalid option");
            }

            // Removes item from the cart
            itemNames.remove(takeOut);
            userCart.cartChange();
                
        }
         else{
            System.out.println("You have no items to remove.");
        }

        }

        // Checks to see if user enters "cart items"
        else if(command.equalsIgnoreCase("Cart items") && itemSize > 0){
           // Displays the content of the cart
            for (int i = 0; i < n; i++){
                System.out.println(itemNames.get(i).getProductName());
            }
           
        }

        // Checks to see if user enters "command"
        else if(command.equalsIgnoreCase("Command")) {
            // Outputs commands that can be used
            System.out.print("Commands: \n 1. Shop \n 2. Moneycheck \n 3. Totalcost \n 4. Cartsize \n 5. Purchase \n 6. Balance \n 7. Remove \n 8. Cart items \n 9. Command \n 10. Product info \n 11. Log off");
        }

        // Checks to see if the user enters "Product info"
        else if(command.equalsIgnoreCase("Product info")){
            System.out.println("Items:\n 1. Small Soccerball $21.00\n 2. Big Soccerball $30.00 \n 3. red switch keyboard $100.00 \n 4. Membrane keyboard $10.00 \n 5. Gaming Computer $1500.00\n 6. Work Computer $700.00\n 7. terraria $15.00 \n 8. Monopoly $20.00\n");
            System.out.println("Which product information do you want to check?: ");
            String information = key.readLine();

            // Outputs product information based on the user input
            if (information.equalsIgnoreCase("Small Soccerball")){
                smallBall.getInfo();
              
            }

            else if (information.equalsIgnoreCase("Big Soccerball")){
                bigBall.getInfo();
                
            }

            else if (information.equalsIgnoreCase("red switch keyboard")){
                redSwitchKeyboard.getInfo();
            }

            
            else if (information.equalsIgnoreCase("Membrane keyboard")){
                normalKeyboard.getInfo();
     
            }

            else if (information.equalsIgnoreCase("Gaming Computer")){
                gamingComputer.getInfo();

            }

            else if (information.equalsIgnoreCase("Work Computer")){
                workComputer.getInfo();
               
            }

            else if (information.equalsIgnoreCase("terraria")){
                terraria.getInfo();
            }

            else if (information.equalsIgnoreCase("Monopoly")){
                monopoly.getInfo();
            }
            
            else{
                System.out.println("Invalid option.");
            }

            
        }

        // Checks to see if user enters "Log off"
        else if(command.equalsIgnoreCase("Log off")) {
            System.out.println("You will now log off. Thank you for shopping on our app!");
            // Stops while loop
            onApp = false;
        }

        
        else{
            // Outputs when user enters an invalid command
            System.out.print("Invalid request. Please type one of the listed commands.");
        }
      System.out.println("");
      userCart.cartChange();
    }
    }
}