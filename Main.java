
import java.util.Scanner;

public class Main
    {
    public static void main(String[] args) 
        {
        AirlineSeating airline = new AirlineSeating();// instance of the AirlineSeating class created.
        EconomyClass economy = new EconomyClass();// instance of the EconomyClass class created.
        FirstClass first = new FirstClass();// instance of the FirstClass class created.
        
        Scanner scan1 = new Scanner(System.in);// scanner created for user input.
        
        System.out.println("Welcome!");
        System.out.println("Would you like to...");
        System.out.println("1. Reserve a Seat");
        System.out.println("2. View Seat Options");
        System.out.println("3. Exit");

        String UserChoice = scan1.nextLine();

        if(UserChoice.equals("1"))// if the user wants to chose a seat...
            {
            airline.addPassengers();
            }
        else if(UserChoice.equals("2"))// if the viewer would like to view the seat options, and then asks the user to chose...
            {
            Scanner scan2 = new Scanner(System.in);
            System.out.println("1. Economy Class or 2. First Class?");// ask user if they want to see first or economy seats.
            String UserChoice2 = scan2.nextLine();

            if(UserChoice2.equals("1"))// if user wants to view the economy seats...
                {
                economy.showEconSeating();// shows them.
                airline.addPassengers();// allows user to chose.
                }
            else if(UserChoice2.equals("2"))// if user wants to view the first class seats...
                {
                first.showFirstSeating();// shows them.
                airline.addPassengers();// allows user to chose.
                }
            scan2.close();
            }

        else if(UserChoice.equals("3"))// if the user choses to exit...
            {
            System.out.println("See ya");// outputs this message.
            }
        scan1.close();
        }
    }