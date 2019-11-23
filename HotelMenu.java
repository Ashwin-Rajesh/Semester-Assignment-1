import java.util.*;
public class HotelMenu
{
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
                    customer();
                }
                else if(userOption == 2)
                {
                    hotelDeskPersonnel();
                }
                else if(userOption == 3)
                {
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
                    //make reservation method
                }
                else if(customerOption == 2)
                {
                    //cancel reservation method
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
}
