import java.util.ArrayList;
import java.time.LocalDate;
import java.lang.String;
public class Reservation
{
    /* Constructor, remove booking, type of booking, hotel type, room type, 
    num of nights, num of rooms, total cost, deposit, dates, */
    private int reservationNumber;
    private int numberOfNights;
    private String reservationName;
    private ArrayList<String> roomID;
    private String reservationType;
    private LocalDate date;
    private float totalCost;
    private float deposit;
    public Reservation()
    {
        roomID = new ArrayList<String>();
    }
    public void setDate()//func that sets date
    {
        date = LocalDate.now();
    }
    public int getNights()
    {
        return numberOfNights;
    }
    public float getTotalCost()
    {
        return totalCost;
    }
    
    /*@Override
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
                count = i.getAvailable() - 1;//function which gets number of rooms available at the moment of a specific type
                i.setAvailable(count);//same here
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
    }*/
}
