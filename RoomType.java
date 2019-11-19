import java.util.*;
public class RoomType
{
	private String Name;
	private int TotNumber;			// Total number of rooms of this type in hotel
	private int OccNumber;			// Number of occupied rooms of the type in the hotel
	private int MinOccupancy;
	private int MaxOccupancy;
	private double[] rate;
	
	public RoomType()
	{	
		// Give values to all data fields.
	}	
	
	public double getrate(LocalDate date, int num)	// Gets rate of stay from checkin date, number of days stayed.
	{
		// Compute date from double[] rate.
	}
	
	public Room[] getrooms()
	{
		// Generate TotNumber number of rooms by passing this as argument to constructor, return them
	}	
	
	public int gettotal()
	{
		return TotNumber;
	}
	
	public int getoccupied()
	{
		return OccNumber;
	}
}
