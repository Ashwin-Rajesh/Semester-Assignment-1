import java.util.*;
public class HotelMenu
{
    int menuHandler = 0;
    public void HotelMenu()
    {
        Scanner console = new Scanner(System.in); //scanner
    }
    public void run()
    {
        boolean usermenu = true; //This is the user selection menu
        int userOption = 0; 
        while(usermenu == true) 
        {//Keeps menu open until exited
            Scanner console = new Scanner(System.in); //scanner
            System.out.println("What type of user are you?\n1. Customer\n2. Hotel Deck Personnel\n3. Supervisor\n4. Exit");
            if(console.hasNextInt()) //checks to see if input is an int
            {
                userOption  = console.nextInt(); //registers the users choice through input
                if(userOption == 1)
                {
                    menuHandler = 1;
                    customer();
                }
                else if(userOption == 2)
                {
                    menuHandler = 2;
                    hotelDeskPersonnel();
                }
                else if(userOption == 3)
                {
                    menuHandler = 3;
                    supervisor();
                }
                else if(userOption == 4)
                {
                    System.out.println("Goodbye");
                    usermenu = false;
                }
                else // if input isnt valid eg. h or 6
                {
                    System.out.println("This is not a valid option");
                }
            }
            else
            {
                System.out.println("Please input valid number");
            }
        }
    }
    public static void customer()
    {
        boolean customerMenu = true; //This is the customer menu
        int customerOption = 0;
        while(customerMenu == true) //Keeps menu open until closed
        {
            Scanner console = new Scanner(System.in); //scanner
            System.out.println("What would you like to do?\n1. Make Reservation\n2. Cancel Reservation\n3. Back");
            if(console.hasNextInt()) //checks to see if input is an int
            {
                customerOption = console.nextInt(); //registers the users choice through input
                if(customerOption == 1)
                {
                    chooseHotel(true);//true for reservation
                }
                else if(customerOption == 2)
                {
                    //calls function to select hotel name
                    //calls function to select room type of specific hotel
                    //passes
                    chooseHotel(false);//false for cancellation
                }
                else if(customerOption == 3)
                {
                    System.out.println("Going back a menu");
                    customerMenu = false;
                }
                else // if input isnt valid eg. h or 6
                {
                    System.out.println("This is not a valid option");
                }
            }
            else
            {
                System.out.println("Please input valid number");
            }
        } 
    }
    
    public static void hotelDeskPersonnel()
    {
        boolean hotelDeskPersonnelMenu = true; //This is the customer menu
        int hotelDeskPersonnelOption = 0;
        while(hotelDeskPersonnelMenu == true) //Keeps menu open until closed
        {
            Scanner console = new Scanner(System.in); //scanner
            System.out.println("What would you like to do?\n1. Make Reservation\n2. Cancel Reservation\n3. Check-in\n4. Check-out\n5. Back");
            if(console.hasNextInt()) //checks to see if input is an int
            {
                hotelDeskPersonnelOption = console.nextInt(); //registers the users choice through input
                if(hotelDeskPersonnelOption == 1)
                {
                    //make reservation method
                }
                else if(hotelDeskPersonnelOption == 2)
                {
                    //cancel reservation method
                }
                else if(hotelDeskPersonnelOption == 3)
                {
                    //Check-in method
                }
                else if(hotelDeskPersonnelOption == 4)
                {
                    //Check-out method
                }
                else if(hotelDeskPersonnelOption == 5)
                {
                    System.out.println("Going back a menu");
                    hotelDeskPersonnelMenu = false;
                }
                else // if input isnt valid eg. h or 6
                {
                    System.out.println("This is not a valid option");
                }
            }
            else
            {
                System.out.println("Please input valid number");
            }
        }
    }
    
    public static void supervisor()
    {
        boolean supervisorMenu = true; //This is the customer menu
        int supervisorOption = 0;
        while(supervisorMenu == true) //Keeps menu open until closed
        {
            Scanner console = new Scanner(System.in); //scanner
            System.out.println("What would you like to do?\n1. Make Reservation\n2. Cancel Reservation\n3. Check-in\n4. Check-out\n5. Apply Discount\n6. Back");
            if(console.hasNextInt()) //checks to see if input is an int
            {
                supervisorOption = console.nextInt(); //registers the users choice through input
                if(supervisorOption == 1)
                {
                    //make reservation method
                }
                
                else if(supervisorOption == 2)
                {
                    //cancel reservation method
                }
                
                else if(supervisorOption == 3)
                {
                    //Check-in method
                }
                
                else if(supervisorOption == 4)
                {
                    //Check-out method
                }
                
                else if(supervisorOption == 5)
                {
                    //Discount method
                }
                
                else if(supervisorOption == 6)
                {
                    System.out.println("Going back a menu");
                    supervisorMenu = false;
                }
                else
                {
                    System.out.println("This is not a valid option");
                }
            }        
            else
            {
                System.out.println("Please input valid number");
            }
        }
    }
    public static void chooseHotel(boolean flag)
    {
        int option=0;
        String str = "";
        String[] hotelName = new String[5];//why 5? because there is no thing called 6*
        //loop implemented to pass hotel names to the string
        boolean hotelMenu = true;
        while(hotelMenu)
        {
            Scanner console = new Scanner(System.in); //scanner
            System.out.println("What would you like to choose?\n1. "+hotelName[0]+"\n2. "+hotelName[1]+"\n3. "+hotelName[2]+"\n4. Exit");
            if(console.hasNextInt()) //checks to see if input is an int
            {
                option = console.nextInt();
                if(option == 1)
                {
                    //calls roomtype of 5 star and pass the value of flag
                }
                
                else if(option == 2)
                {
                    //calls room type of 4 star and pass the value of flag
                }
                
                else if(option == 3)
                {
                    //calls room type of 3 star and pass the value of flag
                }
                
                else if(option == 4)
                {
                    hotelMenu=false;
                }
                else
                {
                    System.out.println("This is not a valid option");
                }
            }        
            else
            {
                System.out.println("Please input valid number");
            }
        }
    }
    public static void chooseRoomType(Hotels h1, boolean flag)
    {
        int option=0;
        boolean roomTypeMenu = true;
        String str="";
        String[] roomTypes = new String[5];
        //loop implemented
        while(roomTypeMenu)
        {
            Scanner console = new Scanner(System.in); //scanner
            System.out.println("What would you like to choose?\n1. "+roomTypes[0]+"\n2. "+roomTypes[1]+"\n3. "+roomTypes[2]+"\n4. "+roomTypes[3]+"\n5. Exit");
            if(console.hasNextInt()) //checks to see if input is an int
            {
                option = console.nextInt();
                if(option == 1)
                {
                    //prints room of type1 and the value of flag
                }
            
                else if(option == 2)
                {
                    //prints room of type2 and the value of flag
                }   
            
                else if(option == 3)
                {
                    //prints room of type3 and the value of flag
                }
            
                else if(option == 4)
                {
                    //prints room of type4 and the value of flag
                }
            
                else if(option == 5)
                {
                    roomTypeMenu = false;
                }
                else
                {
                    System.out.println("This is not a valid option");
                }
            }  
            else
            {
                System.out.println("Please input valid number");
            }
        }
    }
    public static void chooseRoom(RoomType rt, boolean flag)
    {
        //prints the list of room ids
        //if flag == true
            //customer types in the number of rooms to book
            //customer types in the room ids
            //pass the array of room ids to chooseOther
        //if flag == false
            //calls cancel()
            //removes the reservationNumber from the list of reservations
            //change the status of room to available on the dates it was reserved
    }
    public static void chooseOther()
    {
        //asks for date
        //asks for number of nights
        //asks for breakfast
        //these 3 attrubutes are must
        //analyses the date and calculates reservation type
        //menuHandler(check up)
        //calls reserve() with everything we have
    }
}
