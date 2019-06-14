import java.io.*;
import java.util.*;
public class SquarePasture {
  public static void main(String[] args) throws IOException {
  BufferedReader br = new BufferedReader(new FileReader("6.in"));
  PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("SquarePasture.out")));

  StringTokenizer st = new StringTokenizer(br.readLine());
  int x1 = Integer.parseInt(st.nextToken());
  int y1 = Integer.parseInt(st.nextToken());
  int x2 = Integer.parseInt(st.nextToken());
  int y2 = Integer.parseInt(st.nextToken());

  st = new StringTokenizer(br.readLine());
  int x3 = Integer.parseInt(st.nextToken());
  int y3 = Integer.parseInt(st.nextToken());
  int x4 = Integer.parseInt(st.nextToken());
  int y4 = Integer.parseInt(st.nextToken());

  if(Math.abs(y4 - y1) > Math.abs(x2 - x3)){
    pw.println((Math.abs(y4 - y1)) * (Math.abs(y4 - y2)));
  } else {
      pw.println((Math.abs(x3 - x2)) * (Math.abs(x3 - x2)));
  }

  pw.close();
  br.close();
  }
}
