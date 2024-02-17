
public class FirstClass 
    {
    private static final int NUM_ROWS2 = 4;
    private static final int SEATS_PER_ROW2 = 5;
    private int[][] FirstSeats = new int[NUM_ROWS2][SEATS_PER_ROW2];// created an integer array with 4 rows, with 5 seats each.

    public FirstClass() 
        {
        initFirstSeating();// initiating the first class seating.
        }


    private void initFirstSeating() 
        {
        int FirstSeatNumber = 1;// initializing the seat number.
        for (int i = 0; i < NUM_ROWS2; i++) 
            {
            for (int j = 0; j < SEATS_PER_ROW2; j++) 
                {
                FirstSeats[i][j] = FirstSeatNumber++;
                }
            }
        }

        public void showFirstSeating()// outputs the rows and seats out to the screen.
            {
            for (int i = 0; i < 5; i++) 
                {
                for (int j = 0; j < 4; j++) 
                    {
                    System.out.print(FirstSeats[j][i] + " ");
                    }
                System.out.println();
                }
            }
    }
