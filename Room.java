import java.util.*;
public class Room
{
    private String roomID;
    private boolean breakfast;
    private String status;
    
    public Room()
    {
        status = "AVAILABLE";
    }
    public String getRoomID()
    {
        return roomID;
    }
    public String getStatus()
    {
        return status;
    }
    public boolean getBreakfast()
    {
        return breakfast;
    }
    public void setRoomID(String roomType, int roomNumber)
    {
        roomID = roomType+roomNumber;
    }
    public void setStatus(String s)
    {
        status = s;
    }
    public void setBreakfast(boolean flag)
    {
        breakfast = flag;
    }
    public String getRoomType(String id)
    {
        String s="";
        if("DD".equals(id.substring(0,2)))
        {
            s="Deluxe Double";
        }
        if("DT".equals(id.substring(0,2)))
        {
            s="Deluxe Twin";
        }
        if("DS".equals(id.substring(0,2)))
        {
            s="Deluxe Single";
        }
        if("DF".equals(id.substring(0,2)))
        {
            s="Deluxe Family";
        }
        if("ED".equals(id.substring(0,2)))
        {
            s="Executive Double";
        }
        if("ET".equals(id.substring(0,2)))
        {
            s="Executive Twin";
        }
        if("ES".equals(id.substring(0,2)))
        {
            s="Executive Single";
        }
        if("CD".equals(id.substring(0,2)))
        {
            s="Classic Double";
        }
        if("CT".equals(id.substring(0,2)))
        {
            s="Classic Twin";
        }
        if("CS".equals(id.substring(0,2)))
        {
            s="Classic Single";
        }
        return s;
    }
}
