
import java.util.Scanner;

public class AirlineSeating 
    {
    private boolean[][] economySeats = new boolean[5][4]; // Assuming 5 rows and 4 seats per row for economy class
    private boolean[][] firstClassSeats = new boolean[2][2]; // Assuming 2 rows and 2 seats per row for first class

    public void addPassengers()// method to assign seats to passengers. 
        {
        Scanner scan3 = new Scanner(System.in);
        System.out.println("1. Econ 2. First?");// asks the user whether they want an economy or first class seat.
        String userChoice3 = scan3.nextLine();

        if (userChoice3.equals("1"))// if the user choses economy seating....
            {
            if (!checkEconSeating())// checks the seating...
                {
                System.out.println("Invalid seating preference or not enough available seats. Please try again.");
                addPassengers(); // Restart from the beginning
                }
            }
        else if (userChoice3.equals("2"))// if user wants seating in the first class... 
                {
            if (!checkFirstSeating())// checks whether the seat is avaliable in first class.
                {
                System.out.println("Invalid seating preference or not enough available seats. Please try again.");
                addPassengers(); // Restart from the beginning
                }
                } 
            else 
                {
                System.out.println("Invalid choice.");
                addPassengers(); // Restart from the beginning, allows the user to chose a different seat.
                }
        scan3.close();
        }

    private boolean checkEconSeating()// the method that checks whether the seats are avaliable in the economy class or not.
        {
        Scanner scan4 = new Scanner(System.in);
        Scanner scan5 = new Scanner(System.in);

        System.out.println("Enter number of passengers traveling together (1 to 3): ");// asks the user how many passengers are traveling with them.

        int numPassengers = scan4.nextInt();

        if (numPassengers >= 1 && numPassengers <= 3) 
            {
            System.out.println("Enter seating preference (aisle, center, or window): ");// prompts the user to chose their preference.
            String seatPreference = scan5.nextLine().toLowerCase();

            for (int i = 0; i < economySeats.length; i++) 
                {
                for (int j = 0; j < economySeats[i].length; j++) 
                    {
                    if (numPassengers == 1 && seatPreference.equals("aisle") && !economySeats[i][0])// if the aisle seat is avaliable...
                        {
                        economySeats[i][0] = true;
                        System.out.println("Seats assigned successfully.");// assigns the seat to the user.
                        scan4.close();
                        scan5.close();
                        return true;
                        } 
                    else if (numPassengers <= 2 && (seatPreference.equals("aisle") || seatPreference.equals("window")) && !economySeats[i][j] && !economySeats[i][j + 1]) 
                        {
                        economySeats[i][j] = true;
                        economySeats[i][j + 1] = true;
                        System.out.println("Seats assigned successfully.");// assigns the seat/s to the user.
                        scan4.close();
                        scan5.close();
                        return true;
                        }
                   
                    }
                }
            System.out.println("No matching seats available.");
            scan4.close();
            scan5.close();
            return false;
            }
         else 
            {
            System.out.println("Invalid number of passengers for economy class.");
            scan4.close();
            scan5.close();
            return false;
            }
        }

    private boolean checkFirstSeating()// same as the method above, but modified for the first class seating.
        {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of passengers traveling together (1 or 2): ");
        int numPassengers = scanner.nextInt();

        if (numPassengers == 1 || numPassengers == 2) 
            {
            System.out.println("Enter seating preference (aisle or window): ");
            String seatPreference = scanner.next().toLowerCase();

            for (int i = 0; i < firstClassSeats.length; i++) 
                {
                for (int j = 0; j < firstClassSeats[i].length; j++) 
                    {
                    if (numPassengers == 1 && seatPreference.equals("aisle") && !firstClassSeats[i][0]) 
                        {
                        firstClassSeats[i][0] = true;
                        System.out.println("Seats assigned successfully.");
                        return true;
                        } 
                    else if (numPassengers == 2 && seatPreference.equals("window") && !firstClassSeats[i][1]) 
                        {
                        firstClassSeats[i][1] = true;
                        System.out.println("Seats assigned successfully.");
                        return true;
                        }
                    scanner.close();
                    }
                }
            System.out.println("No matching seats available.");
            scanner.close();
            return false;
            }
         else 
            {
            System.out.println("Invalid number of passengers for first class.");
            scanner.close();
            return false;
            }
        }
    }
