import java.io.*;
import java.util.*;
import java.util.Scanner;

public class csvTest {

    public static void main(String[] args) {

        try {
            File file = new File("l4Hotels.csv"); 

            Scanner input = new Scanner(file); // loads file into scanner
			String line;
			int r = 1; // This int determines what info from the csv is taken eg. position 1 on line is room
			String [] fullLine = {};
			String room;
			ArrayList<String> csvInfoAL = new ArrayList<String>(); // Create an ArrayList object

			for(int i = 0; i < 2; i++) // skips the first two lines
			{
				line = input.nextLine();
			}
			
            while (input.hasNextLine()) {
                line = input.nextLine();
				fullLine = line.split(","); //splits the line of csv file at the ","
				room = fullLine[r]; // room is equal to array[] position r
                csvInfoAL.add(room);// adds room to arraylist
            }
            input.close();
			
			for(int i = 0; i < csvInfoAL.size(); i++)
			{
				System.out.println(csvInfoAL.get(i));
			}

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

}
