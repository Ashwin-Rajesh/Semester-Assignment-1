import java.util.ArrayList;
import java.time.LocalDate;
import java.lang.String;
public class Reservation
{
    /* Constructor, remove booking, type of booking, hotel type, room type, 
    num of nights, num of rooms, total cost, deposit, dates, */
    private int reservationNumber;
    private int numberOfNights;
    private String reservationName;
    private ArrayList<String> roomID;
    private String reservationType;
    private LocalDate date;
    private LocalDate advancedDate;
    private float totalCost;
    private float deposit;
    public Reservation()
    {
        roomID = new ArrayList<String>();
    }
    public void getCurrentDate()//func that sets date
    {
        date = LocalDate.now();
    }
    public int getNights()
    {
        return numberOfNights;
    }
    public float getTotalCost()
    {
        return totalCost;
    }
    
}
