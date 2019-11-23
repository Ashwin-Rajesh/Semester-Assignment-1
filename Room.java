import java.util.*;
public class Room
{
    private String roomID; 
    private boolean status;
    private RoomType type;
    private ArrayList<Reservation> detail;
    public Room(RoomType rt, String typeID, int roomNumber)
    {
        status = true;
        this.type = rt;
        detail = new ArrayList<Reservation>();
        setRoomID(typeID, roomNumber);
    }
    public String getRoomID()
    {
        return roomID;
    }
    public boolean getStatus()
    {
        return status;
    }
    public RoomType getType()
    {
        return type;
    }
    public String getRoomType()
    {
        return type.getRoomType();
    }
    public void setRoomID(String typeID, int roomNumber)
    {
        if(roomNumber<10)
        {
            roomID = typeID + ":000" + roomNumber;
        }
        else if(roomNumber>10 && roomNumber<100)
        {
            roomID = typeID + ":00" + roomNumber;
        }
        else
        {
            roomID = typeID + ":0" + roomNumber;
        }
    }
    public void setStatus(boolean flag)
    {
        status = flag;
    }    
}
