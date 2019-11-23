import java.util.ArrayList;
import java.time.LocalDate;
public class Hotels
{
    String hotelName;
    private ArrayList<Room> listOfRooms;        //list of rooms
    private ArrayList<RoomType> listOfTypes;    //array of objects of RoomType
    private ArrayList<Reservation> listOfReservations;
    /* you will need  to go through the array of room lists */
    /* get rates */
    public Hotels(ArrayList<RoomType> types, String hotelName)
    {
        this.hotelName = hotelName;
        listOfRooms = new ArrayList<Room>();
        listOfTypes = types;
        for(RoomType r : types)
        {
            ArrayList<Room> rooms = r.setRooms();
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
    public ArrayList<Room> getListOfRoomsOfType(String type)
    {
        ArrayList<Room> temp = new ArrayList<Room>();
        for(Room i : listOfRooms)
        {
            if(type.equalsIgnoreCase(i.getRoomType()))
            {
                temp.add(i);
            }
        }
        return temp;
    }
    public Room getRoomOfID(String roomID)
    {
        for(Room r : listOfRooms)
            if(roomID.equals(r.getRoomID()))
                return r;
        return null;
    }    
    public void book(Arraylist<String> roomIDs, boolean reservType, boolean breakfast, LocalDate date, int period)
    {
        double cost = 0;
        for(String s : roomIDs)                 // Checking if all rooms are available and simultaneously finding cost
        {
            Room r = getRoomOfID(roomID);
            if(!r.isAvailableOn(date,period))
            {
                System.out.println(" The room of id " + s + " is not available on given date.");
                return;
            }
            cost += r.getType().returnRate(date,period);
        }
        if(reservType)  cost = cost / 20;       // ReservType is true for Advanced Booking
        Reservation res = new Reservation();    // Pass all generated values to constructor once implemented.
        
        for(String s : roomIDs)                 // Goes and updates all rooms to be reserved
        {
            Room r = getRoomOfID(roomID);
            r.book(res);
        }
    }   
}
