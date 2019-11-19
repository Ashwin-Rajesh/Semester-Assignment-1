import java.util.ArrayList;
import java.time.LocalDate;
public class Hotels
{
    String hotelName;
    int starRating;//3*,4*,5*
    private ArrayList<Room> roomList;//list of ?
    private RoomType[] roomArray;//array of objects of RoomType
    /* you will need  to go through the array of room lists */
    /* get rates */
    public Hotels(RoomType[] types, String hotelName, int starRating)
    {
        this.hotelName = hotelName;
        this.starRating = starRating;
        roomList = new ArrayList<Room>(rooms);
        roomArray = types;
        for(RoomType r : types)
        {
            Room[] rooms = r.getRooms();
            for(Room rm : rooms)
            {
                roomList.add(rm);
            }
        }
    }
    public RoomType[] GetStatus()
    {
        return roomArray;
    }
    public void book(String room_id)
    {
        for(Room r1 : roomList)
        {
            if(room_id==r1.getRoomID())
            {
                r1.setStatus("NOT AVAILABLE");
            }
        }
    }   
}
