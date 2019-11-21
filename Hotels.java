import java.util.ArrayList;
import java.time.LocalDate;
public class Hotels
{
    String hotelName;
    int starRating;//3*,4*,5*
    private ArrayList<Room> listOfRooms;//list of rooms
    private ArrayList<RoomType> listOfTypes;//array of objects of RoomType
    /* you will need  to go through the array of room lists */
    /* get rates */
    public Hotels(ArrayList<RoomType> types, String hotelName, int starRating)
    {
        this.hotelName = hotelName;
        this.starRating = starRating;
        listOfRooms = new ArrayList<Room>();
        listOfTypes = types;
        for(RoomType r : types)
        {
            ArrayList<Room> rooms = r.getRooms();
            for(Room rm : rooms)
            {
                listOfRooms.add(rm);
            }
        }
    }
    public ArrayList<RoomType> getListOfTypes()
    {
        return listOfTypes;
    }
    public ArrayList<Room> getListOfRooms()
    {
        return listOfRooms;
    }
    public void book(String roomId)
    {
        for(Room r1 : listOfRooms)
        {
            if(roomId == r1.getRoomID())
            {
                r1.setStatus(false);
            }
        }
    }   
}
