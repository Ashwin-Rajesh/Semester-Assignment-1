import java.io.IOException;

public class HotelExe //This is how we run the program
{
    public static void main(String [] args) throws IOException
    {
        HotelMenu menu = new HotelMenu(); //Creates menu object
        menu.run(); //Runs Menu
    }
}
