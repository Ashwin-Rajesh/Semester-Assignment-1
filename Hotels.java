import java.util.ArrayList;
import java.time.LocalDate;
public class Hotels
{
	String HotelName
	int StarRating
	private ArrayList<Room> RoomList;
	private RoomType[] RoomArray;
	/* you will need  to go through the array of room lists */
	/* get rates */
	
	public Hotels(RoomTypes[] types, String HotelName, int StarRating)
	{
		this.HotelName  = HotelName;
		this.StarRating = StarRating;
		RoomList = new ArrayList<Room>(rooms);
		RoomArray = types;
		for(RoomType r:types)
		{
			Room[] rooms = r.getRooms();
			for(Room rm:rooms)
				RoomList.add(rm);
		}
	}
	
	public Roomtypes[] GetStatus()
	{
		return RoomArray;
	}	
	
	public void book(String room_id)
	{
		// Search through RoomList and update it too book it, also update NumberOfRooms.
	}	
}
