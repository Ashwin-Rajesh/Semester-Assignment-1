import java.util.ArrayList;
import java.time.LocalDate;
import java.lang.String;
public class Reservation
{
    
    /* Constructor, remove booking, type of booking, hotel type, room type, 
    num of nights, num of rooms, total cost, deposit, dates, occupancy min/max,
    rates, breakfast*/
    private ArrayList<Room> bookedRooms;
    private int resNumber;
    private int numberOfNights;
    private String resName;
    private String roomType;
    private String reservationType;
    private boolean breakfast;
    private LocalDate date;
    private float totalCost;
    private float deposit;
    private int strength;
    private ArrayList<Reservation> details;
    public Reservation()
    {
        details = new ArrayList<Reservation>();
        bookedRooms = new ArrayList<Room>();
    }
    
    public void setReservName(int reservNumber, String reservName)//func to ask the user to set a name to refer
    {
        for(Reservation i : details)
        {
            if(reservNumber == i.getReservNumber())
            {
                resName = reservName;
            }
        }
    }
    
    public void setDate()//func that sets date
    {
        date = LocalDate.now();
    }
    
    public void setNumberOfNights(int reservNumber, String reservName)//func to ask the user for how long
    {
        
    }
    
    public void setTotalCost(int reservNumber, String reservName)//you know the date, you know the nights
    {
       //calculation
    }
    
    public int getReservNumber()//func to get the number to refer
    {
        return resNumber;
    }
    
    public String getReservName()//func to get name of the customer
    {
        return resName;
    }
    
    public String getRoomType()//I think we need something common in the class Room and Reservation
    {
        return roomType;//let that be room type
    }
    
    public int getNights()
    {
        return numberOfNights;
    }
    
    public float getTotalCost()
    {
        return totalCost;
    }
    
    @Override
    public String toString(Reservation r1)//prints everyting as a string
    {
        String s="Reservation Name: "+r1.getReservName()
                +"Reservation Number: "+r1.getReservNumber()
                +"Room Type: "+r1.getRoomType()
                +"Number of Nights Staying: "+r1.getNights()
                +"Total Cost: "+r1.getTotalCost();
        return s;
    }
   
    public void reservRoom1(int roomNumber, String roomType)//the only function to reserve a room
    {
        if(bookRoom(roomNumber, roomType))//another function 
        {
            do
            {
                resNumber = (int)(Math.random() * (900 - 600)) + 600;//randomly picks a number btw 600 and 900
            }while(resNumber == this.getReservNumber());//why 600 and 900? I have no idea
            System.out.println("Room Allotted!!");//range is 300 because we have less than 300 rooms in total
            setDate();
        }
    }
    //I splitted both the functions to make it smaller and easier to understand
    private boolean reservRoom2(int roomNumber, String roomType)//actual function that books a room NOTE: Its private, so that func ReservRoom1 is called
    { 
        boolean flag = false;
        int roomNum, count;
        String roomTyp;
        ArrayList<Room> checkRooms = getRoomsList();//passing the whole arraylist
        for(Room i : checkRooms)
        {
            roomNum = i.getRoomNumber();
            roomTyp = i.getRoomType();
            if(roomTyp.equals(roomType) && roomNum == roomNumber)//checks for the same room number and room type
            {
                bookedRooms.add(i);//adds the object to the list of booked rooms
                count = i.getAvailRooms(roomType) - 1;//function which gets number of rooms available at the moment of a specific type
                i.setAvailRooms(roomType, count);//same here
                flag = true;
            }
            if(flag == false)
                System.out.println("Room Not Available!!");
            return flag;
        }
    }
    
    public void cancelBooking(int reservNumber, String reservName)//i have a bad feeling about this method
    {
        boolean flag = false;
        int number, count;
        String name;
        for(Reservation i : details)
        {
            number = i.getReservNumber();
            name = i.getReservName();
            if(name.equals(reservName) && number == reservNumber)
            {
                count = getAvailRooms(i.getRoomType()) + 1;//check up
                setAvailRooms(i.getRoomType(), count);//check up:)
                System.out.println("Room Cancelled!!");
                flag = true;
                bookedRooms.remove(i);
                //details.remove(i);
            }
        }
        if(flag == false)
            System.out.println("Room is not occupied!!");
    }
}