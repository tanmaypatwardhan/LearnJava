<<<<<<< HEAD
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
=======
import java.util.*;
import java.io.*;

public class squarePasture {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new FileReader("10.in"));
    PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("sPasture.out")));

    StringTokenizer st = new StringTokenizer(br.readLine());
    int x1 = Integer.parseInt(st.nextToken());
    int y1 = Integer.parseInt(st.nextToken());
    int x2 = Integer.parseInt(st.nextToken());
    int y2 = Integer.parseInt(st.nextToken());

    st = new StringTokenizer(br.readLine());
    int x3  = Integer.parseInt(st.nextToken());
    int y3 = Integer.parseInt(st.nextToken());
    int x4 = Integer.parseInt(st.nextToken());
    int y4 = Integer.parseInt(st.nextToken());







    if(y2 > y4){
      if(x3 > x1){
          pw.println(Math.max((x4 - x1) , (y2 - y3)) * Math.max((x4 - x1) , (y2 - y3)));
      } else {
        if(y1 < y3){
          pw.println(Math.max((x2 - x3) , (y2 - y1)) * Math.max((x2 - x3) , (y2 - y1)));
        } else {
          pw.println(Math.max((x4 - x1) , (y2 - y3)) * Math.max((x4 - x1) , (y2 - y3)));
        }
      }
    }
    if(y2 < y4){
      if(x3 > x1){
        if(y3 < y1){
          pw.println(Math.max((x4 - x1) , (y4- y3)) * Math.max((x4 - x1) , (y4 - y3)));
        } else {
          pw.println(Math.max((x4 - x1) , (y4- y1)) * Math.max((x4 - x1) , (y4 - y1)));
        }
      } else {
        pw.println(Math.max((x2 - x3) , (y4 - y1)) * Math.max((x2 - x3) , (y4 - y1)));
      }
    }

    pw.close();
    br.close();

>>>>>>> bde4264f083fa4731531b74f8756542989e4ff0d
  }
}
