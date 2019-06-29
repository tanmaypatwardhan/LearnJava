import java.io.*;
import java.util.*;
public class TheBovineShuffle {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new FileReader("2.in"));
    PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("bShuffle.out")));

    StringTokenizer st = new StringTokenizer(br.readLine());
    int n = Integer.parseInt(st.nextToken());
    ArrayList<Integer> cows = new ArrayList<Integer>(n);
    ArrayList<Integer> codes = new ArrayList<Integer>(n);
    st = new StringTokenizer(br.readLine());
    for(int i = 0; i < n ; i++){
      cows.add(Integer.parseInt(st.nextToken()));
    }
    st = new StringTokenizer(br.readLine());
    for(int j = 0; j < n; j++){
      codes.add(Integer.parseInt(st.nextToken()));

    }

    for(int x = 1; x <= n; x++){
      pw.print(codes.get(cows.indexOf(x)) + "\n");
    }

    //pw.println(cows);
    //pw.println(codes);


    pw.close();
    br.close();
  }
}
