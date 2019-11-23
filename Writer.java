import java.io.*;

public class Writer {
  public static void main(String[] args) {

    try (PrintWriter writer = new PrintWriter(new File("l4Analysis.csv"))) {

      StringBuilder sb = new StringBuilder();
      sb.append("id,");
      sb.append(',');
      sb.append("Name");
      sb.append('\n');

      sb.append("1");
      sb.append(',');
      sb.append("Prashant Ghimire");
      sb.append('\n');

      writer.write(sb.toString());

      System.out.println("done!");

    } catch (FileNotFoundException e) {
      System.out.println(e.getMessage());
    }

  }
}
/* Example csv writer we can amend it for when we need it*/
