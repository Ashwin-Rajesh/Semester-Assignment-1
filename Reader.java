
import java.io.*;
import java.util.*;

public class Reader {
  int r;
  public void fileReader(int r)  {

    try {
      File file = new File("l4Hotels.csv");

      Scanner input = new Scanner(file); //loads file
      String line;
      this.r = r; // determines what info is taken from the file.
      String[] fullLine = {};
      String room;
      ArrayList<String> csvInfoAL = new ArrayList<String>();

      for(int i = 0; i <2; i++) {
        line = input.nextLine();
      }

      while(input.hasNextLine())  {
        line = input.nextLine();
        fullLine = line.split(","); // split the lines by the ","
        room = fullLine[r];
          csvInfoAL.add(room); // add room to arrayList
      }
      input.close();

      for(int i = 0; i < csvInfoAL.size(); i++) {
        System.out.println(csvInfoAL.get(i));
      }

    } catch (Exception ex)  {
      ex.printStackTrace();
    }
  }
}
