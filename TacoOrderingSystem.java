import java.util.ArrayList;
import java.util.Scanner;

public class TacoOrderingSystem {
    public static void main(String[] args) {
        //Greet the customer and ask them to order
        System.out.println("Welcome to Dr. Mary's Taco House!");

        //Create a new Taco object
        Taco beefTaco = new Taco("beef", 1.99, false);
        Taco chickenTaco = new Taco(2.99);

        //Ask the user for the type of filling
        System.out.println("What would you like for your taco filling? " +
                "Beef, bean, or chicken?");

        //Create a Scanner object to get input from the user
        Scanner scanner = new Scanner(System.in);

        //Get the filling from the user
        taco.setFillingType(scanner.next());

        //Ask the user if they want hot sauce
        System.out.println("Do you want hot sauce? Y/N");

        //Set the spice level of the taco
        if(scanner.next().equals("Y")) {
            taco.setSpicy(true);
        } else {
            taco.setSpicy(false);
        }//end if

        //Print the receipt
        printReceipt(taco);

    } //end main


    //Prints the receipt for a taco order
    public static void printReceipt(Taco taco) {
        System.out.println("\n___________________________");

        //If the taco is spicy, the user
        if(taco.isSpicy()) {
            System.out.println("You ordered a spicy ");
        } else {
            System.out.println("You did ordered a mild ");
        } //end if
        System.out.println(taco.getFillingType() + " taco.");
        System.out.println("The total is: $" + taco.price);
        System.out.println("\n___________________________");
    } //end method
} //end class

