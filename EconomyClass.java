

public class EconomyClass 
    {
    private static final int NUM_ROWS = 30;
    private static final int SEATS_PER_ROW = 6;
    private int[][] econSeats = new int[NUM_ROWS][SEATS_PER_ROW];// created an integer array of 30 rows, with 6 seats each row.

    public EconomyClass() 
        {
        initEconSeating();// initializes the economy seating.
        }

    private void initEconSeating()// initializes the economy seating.
        {
        int seatNumber = 1;
        for (int i = 0; i < NUM_ROWS; i++) 
            {
            for (int j = 0; j < SEATS_PER_ROW; j++)
                {
                econSeats[i][j] = seatNumber++;
                }
            }
        }

  
    public void showEconSeating()// method to output the seats and columns to the screen...
        {
        for (int i = 0; i < 30; i++) 
            {
            for (int j = 0; j < 6; j++) 
                {
                System.out.print(econSeats[j][i] + " ");
                }
            System.out.println();
            }
        }   
    }
    
