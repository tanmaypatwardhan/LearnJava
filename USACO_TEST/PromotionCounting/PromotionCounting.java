import java.util.*;
import java.io.*;
public class PromotionCounting {
  public static void main(String[] args) throws IOException {
    Scanner s = new Scanner(new File("1.in"));
    PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("pc.out")));
    int[] before = new int[4];
    int[] after = new int[4];
    Vector<Integer> v = new Vector<Integer>();

    for(int i = 0 ; i < 4 ; i++){
      before[i] = s.nextInt();
      after[i] = s.nextInt();
    }

    v.add(after[1] - before[1] + after[2] - before[2] + after[3] - before[3]);
    v.add(after[2] - before[2] + after[3] - before[3]);
    v.add(after[3] - before[3]);

    for(int i = 0 ; i < v.size() ; i++){
      pw.println(v.get(i));
    }

    s.close();
    pw.close();


  }
}
