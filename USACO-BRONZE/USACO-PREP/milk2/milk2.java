import java.io.*;
import java.util.*;
public class milk2 {
  public static void main(String[] args) throws IOException {
      BufferedReader br = new BufferedReader(new FileReader("milk2.in"));
        PrintWriter bw = new PrintWriter(new BufferedWriter(new FileWriter("milk2.new.in")));
        ArrayList<String>lines = new ArrayList<String>();
        String currentLine = br.readLine();
        String currentLine2 = br.readLine();
        System.out.println(currentLine);
        while (currentLine2 != null) {
          lines.add(currentLine2);

          currentLine2 = br.readLine();
        }
        Collections.sort(lines);
        System.out.println(lines);


  }
}
