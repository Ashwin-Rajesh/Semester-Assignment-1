import java.util.*;
import java.time.LocalDate;
import java.time.DayOfWeek;
public class RoomType 
{
    private String roomType;
    private String typeID;
    private int numberOfRooms;          // Total number of rooms of this type in hotel
    private int availableRooms;         // Number of available rooms of the type in the hotel
    private int[] minOccupancy = new int[2];
    private int[] maxOccupancy = new int[2];
    private double[] rate = new double[7];             //start of the week : monday
    public RoomType(String roomType, int numberOfRooms, int[] minOccupancy, int[] maxOccupancy, double[] price)
    {   
        this.roomType = roomType;
        this.numberOfRooms = numberOfRooms;
        availableRooms = numberOfRooms;
        for(int i=0;i<price.length;i++)
        {
            if(i<2)
            {
                this.minOccupancy[i] = minOccupancy[i];
                this.maxOccupancy[i] = maxOccupancy[i];
            }
            rate[i] = price[i];
        }
        // Give values to all data fields.
    }
    public double getRate(LocalDate date, int num)
    {
        // Gets rate of stay from checkin date, number of days stayed.
        double total = 0;
        int index = date.getDayOfWeek().getValue()-1;
        for(int j=index;j<rate.length;j++)
        {
            total = total + rate[j];
            if(index==6)
            {
                index=0;
            }
        }     
        return total;// Compute date from double[] rate.
    }
    public ArrayList<Room> getRooms()
    {
        ArrayList<Room> temp = new ArrayList<Room>(numberOfRooms);
        for(int i=1;i<=numberOfRooms;i++)
        {
            new Room(this, getTypeID(), i);
        }
        return temp;
        // Generate numberOfRooms by passing this as argument to constructor, return them
    }
    public String getTypeID()
    {
        int i = roomType.indexOf(" ");
        return roomType.substring(0,1) + roomType.substring(i+1,i+2);
    }
    public int getNumberOfRooms()
    {
        return numberOfRooms;
    }
    public int getAvailable()
    {
        return availableRooms;
    }
    public String getRoomType()
    {
        return roomType;
    }
    public int[] getMinOccupancy()
    {
        return minOccupancy;
    }
    public int[] getMaxOccupancy()
    {
        return maxOccupancy;
    }
    public void setAvailable(int count)
    {
        this.availableRooms = count;
    }
}
