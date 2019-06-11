import java.util.*;
import java.io.*;

public class fencePainting {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new FileReader("10.in"));
    PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("fPainting.out")));

    StringTokenizer s = new StringTokenizer(br.readLine());
    int a = Integer.parseInt(s.nextToken());
    int b = Integer.parseInt(s.nextToken());

    s = new StringTokenizer(br.readLine());
    int c = Integer.parseInt(s.nextToken());
    int d = Integer.parseInt(s.nextToken());

    if((b < c) || (d < a)){
      pw.println((b - a) + (d - c));
    } else {
      pw.println(Math.max(b , d) - Math.min(a, c));
    }

    pw.close();
    br.close();
  }
}
