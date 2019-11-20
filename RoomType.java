import java.util.*;
import java.time.LocalDate;
public class RoomType 
{
    private String roomType;
    private int numberOfRooms;          // Total number of rooms of this type in hotel
    private int availableRooms;          // Number of available rooms of the type in the hotel
    private int minOccupancy;
    private int maxOccupancy;
    private double[] rate;
    public RoomType(String roomType, int numberOfRooms, int minOccupancy, int maxOccupancy, double[] price)
    {   
        this.roomType = roomType;
        this.numberOfRooms = numberOfRooms;
        availableRooms = numberOfRooms;
        this.minOccupancy = minOccupancy;
        this.maxOccupancy = maxOccupancy;
        for(int i=0;i<price.length;i++)
        {
            rate[i] = price[i];
        }
        // Give values to all data fields.
    }
    public double getRate(LocalDate date, int num)
    {
        // Gets rate of stay from checkin date, number of days stayed.
        double d = 0;
        int day = date.getDayOfMonth();
        int i = 0;
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
    public ArrayList<Room> getRooms()
    {
        int j=1;
        ArrayList<Room> totalNumber = new ArrayList<Room>(numberOfRooms);
        for(Room i : totalNumber)
        {
            while(j<=numberOfRooms)
            i.setRoomID(roomType, j);
        }
        return totalNumber;
        // Generate numberOfRooms by passing this as argument to constructor, return them
    } 
    public int getNumberOfRooms()
    {
        return numberOfRooms;
    }
    public int getAvailable()
    {
        return availableRooms;
    }
    public void setAvailable(int count)
    {
        this.availableRooms = count;
    }
}
