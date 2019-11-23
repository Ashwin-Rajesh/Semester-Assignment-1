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
    private boolean reservationType;
    private LocalDate date;
    private boolean breakfast;
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
    public boolean isAvailableOn(LocalDate beg, int period)
    {
        LocalDate end = beg.plusDays(period);
        LocalDate enddate = date.plusDays(numberOfNights);
        if(end.compareTo(enddate) > 0 && beg.compareTo(date) < 0)
        {
            return true;
        }
        return false;
    }
}
