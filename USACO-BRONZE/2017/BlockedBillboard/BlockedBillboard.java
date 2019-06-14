import java.io.*;
import java.util.*;
public class BlockedBillboard {
  public static void main(String[] args) throws IOException {
  BufferedReader br = new BufferedReader(new FileReader("3.in"));
  PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("BlockedBillboard.out")));

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

  st = new StringTokenizer(br.readLine());
  int x5 = Integer.parseInt(st.nextToken());
  int y5 = Integer.parseInt(st.nextToken());
  int x6 = Integer.parseInt(st.nextToken());
  int y6 = Integer.parseInt(st.nextToken());

  if((x5 >= x2 && x6 <= x3) || (x5 >= x4) || (x6 <= x1) || (y5 >=Math.max(y2 , y4)) || (y6 <= Math.min(y1 , y3))){
    pw.println(((x2 - x1) * (y2 - y1)) + ((x4 - x3) * (y4 - y3)));
  }

  pw.close();
  br.close();

  }
}
