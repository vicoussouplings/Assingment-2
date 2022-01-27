// CS 1105 - Assignment 02
//Olumayowa Oluwasanmi - B00785929
// A brief decription of the problem: A program that will read product information from 3 categories,
// the amount of products for purchases and calculates the sales tax

import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args){

        //Declare the Scanner
        Scanner in = new Scanner(System.in);

        
        //Read from the user
        String productName = in.next();

        int category = in.nextInt();
        
        double price = in.nextDouble();

        int amount = in.nextInt();
        
    
        //Calculate tax, total and print the output
        
        //Input validation 
          if (category >= 4)
          {
          System.out.println("Invalid category, please start again");
          }
        
        //If input is correct
        if (category == 0)
        {
            double tax = 0.00;
            double totalCost = (price * amount) + tax;
            
            //Output results
         System.out.println("Item:" + " " + productName);
         System.out.printf("Cost: %.2f CAD \n", + price);
         System.out.println("Quantity:" + " " + amount);
         System.out.printf("Tax: %.2f CAD\n", + tax);
         System.out.printf("Total: %.2f CAD\n", +  totalCost);
        }


        if (category == 1)
        {
            double tax = 0.00;
            double totalCost = (price * amount) + tax;
            
          //Output results
          System.out.println("Item:" + " " + productName);
         System.out.printf("Cost: %.2f CAD \n", + price);
         System.out.println("Quantity:" + " " + amount);
         System.out.printf("Tax: %.2f CAD\n", + tax);
         System.out.printf("Total: %.2f CAD\n", +  totalCost);
        }

        if (category == 2)
        {
            double tax = price * amount * (5/100.0) ;
            double totalCost = (price * amount) + tax;
            
            //Output results
        System.out.println("Item:" + " " + productName);
         System.out.printf("Cost: %.2f CAD \n", + price);
         System.out.println("Quantity:" + " " + amount);
         System.out.printf("Tax: %.2f CAD\n", + tax);
         System.out.printf("Total: %.2f CAD\n", +  totalCost);
        }


        if (category == 3)
        {
            double tax = price * amount * (15/100.0) ;
            double totalCost = (price * amount) + tax;
            
           
            //Input validation for incorrect case
             if ( category == 3 && productName.equalsIgnoreCase("Water"))
             {
               tax = 0.00;
               totalCost = (price * amount) + tax;
             }
               
         //Output results      
         System.out.println("Item:" + " " + productName);
         System.out.printf("Cost: %.2f CAD \n", + price);
         System.out.println("Quantity:" + " " + amount);
         System.out.printf("Tax: %.2f CAD\n", + tax);
         System.out.printf("Total: %.2f CAD\n", +  totalCost);
         } 
             
        

        


    }
}