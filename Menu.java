import java.util.*;
public class Menu
{
	public static void main(String [] args)
	{
		boolean menu1 = true; //This is the first menu
		int userOption1 = 0; 
		
		while(menu1 == true) //Keeps menu open until closed
		{
			Scanner console = new Scanner(System.in); //scanner
			System.out.println("What would you like to do?\n1. Option 1\n2. Option 2\n3. Option 3\n4. Option 4\n5. Exit");
			if(console.hasNextInt()) //checks to see if input is an int
			{
				userOption1	= console.nextInt(); //registers the users choice through input
				if(userOption1 == 1)
				{
					option1();
				}
				
				else if(userOption1 == 2)
				{
					option2();
				}
				
				else if(userOption1 == 3)
				{
					option3();
				}
				
				else if(userOption1 == 4)
				{
					option4();
				}
				
				else if(userOption1 == 5)
				{
					System.out.println("Goodbye");
					menu1 = false;
				}
				
				else // if input isnt valid eg. h or 6
				{
					System.out.println("This is not a valid option");
				}
			}
		}
	}
	
	public static void option1()
	{
		boolean menu2 = true; //This is the second menu
		int userOption2 = 0;
		while(menu2 == true) //Keeps menu open until closed
		{
			Scanner console = new Scanner(System.in); //scanner
			System.out.println("What would you like to do? (option 1 menu)\n1. Option 1\n2. Option 2\n3. Option 3\n4. Option 4\n5. Exit");
			if(console.hasNextInt()) //checks to see if input is an int
			{
				userOption2	= console.nextInt(); //registers the users choice through input
				if(userOption2 == 1)
				{
					subOption1();
				}
				
				else if(userOption2 == 2)
				{
					subOption2();
				}
				
				else if(userOption2 == 3)
				{
					subOption3();
				}
				
				else if(userOption2 == 4)
				{
					subOption4();
				}
				
				else if(userOption2 == 5)
				{
					System.out.println("Going back a menu");
					menu2 = false;
				}
				
				else // if input isnt valid eg. h or 6
				{
					System.out.println("This is not a valid option");
				}
			}
		}
	}
	
	public static void option2()
	{
		System.out.println("This is the second option");
	}
	
	public static void option3()
	{
		System.out.println("This is the third option");
	}
	
	public static void option4()
	{
		System.out.println("This is the fourth option");
	}
	
	
	public static void subOption1()
	{
		System.out.println("This is the first option");
		System.out.println("With the first sub-option");
	}
	
	public static void subOption2()
	{
		System.out.println("This is the first option");
		System.out.println("With the second sub-option");
	}
	
	public static void subOption3()
	{
		System.out.println("This is the first option");
		System.out.println("With the third sub-option");
	}
	
	public static void subOption4()
	{
		System.out.println("This is the first option");
		System.out.println("With the fourth sub-option");
	}
}