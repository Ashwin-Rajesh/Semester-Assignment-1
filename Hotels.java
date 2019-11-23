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
    public String getHotelName()
    {
        return hotelName;
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
            if(type.equalsIgnoreCase(i.getType().getRoomType()))
            {
                temp.add(i);
            }
        }
        return temp;
    }
    public Room getRoomOfID(String roomID)
    {
        for(Room r : listOfRooms)
        {
            if(roomID.equals(r.getRoomID()))
            {
                return r;
            }   
        }
        return null;
    }    
    public void reserve(ArrayList<String> roomID, boolean reservType, boolean breakfast, LocalDate date, int numberOfNights)
    {
        double cost = 0;
        boolean flag = true;
        for(String s : roomID)                 // Checking if all rooms are available and simultaneously finding cost
        {
            Room r = getRoomOfID(s);
            if(!r.isAvailableOn(date,numberOfNights))
            {
                System.out.println(" The room of id " + s + " is not available on given date.");
                flag = false;
                return;
            }
            cost += r.getType().returnRate(date,numberOfNights);
        }
        if(reservType)  
        {
            cost = cost / 20;       // ReservType is true for Advanced Booking
        }
        if(flag)
        {
            Reservation res = new Reservation();    // Pass all generated values to constructor once implemented.
            for(String s : roomID)                 // Goes and updates all rooms to be reserved
            {
                Room r = getRoomOfID(s);
                listOfReservations.add(res);
            }   
        }
    }   
    public void cancel(int resID)
    {
        for(Reservation r : listOfReservations)
        {
            if(r.getReservationID() == resID)
            {
                listOfReservations.remove(r);
            }
        }
    }  
}
