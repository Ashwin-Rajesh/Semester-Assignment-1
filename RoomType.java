import java.util.*;
import java.time.LocalDate;
public class RoomType
{
    private String Name;
    private int numberOfRooms;          // Total number of rooms of this type in hotel
    private int availableRooms;          // Number of occupied rooms of the type in the hotel
    private int minOccupancy;
    private int maxOccupancy;
    private double[] rate;
    public RoomType()
    {   
        // Give values to all data fields.
    }  
    public double getrate(LocalDate date, int num)// Gets rate of stay from checkin date, number of days stayed.
    {
        double d = 0;
        int day = date.getDayOfMonth();
        int i=0;
        while(i < num)
        {
            if(day%7 == 0)
                d = d + rate[day/7];
            else
                d = d + rate[day%7];
            i++;
        }
        return d;// Compute date from double[] rate.
    }
    public Room[] getrooms()
    {
        Room[] totalNumber = new Room[numberOfRooms];
        for(int i=0;i<numberOfRooms;i++)
        {
            totalNumber[i] = i+1;
        }
        return totalNumber;
        // Generate numberOfRooms by passing this as argument to constructor, return them
    } 
    public int getTotal()
    {
        return numberOfRooms;
    }
    public int getOccupied()
    {
        return availableRooms;
    }
    public void set()
    {
    }
}
