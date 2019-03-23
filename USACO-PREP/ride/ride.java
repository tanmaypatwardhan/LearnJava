/*
ID: your_id_here
LANG: JAVA
PROG: ride
*/
import java.io.*;
import java.util.*;
public class ride {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new FileReader("ride.in"));
    PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("ride.out ")));

    for(int i = 0; i <= 2 ; i++) {
      StringTokenizer st = new StringTokenizer(br.readLine());
      String word = st.nextToken();
      char[] character_array = word.toCharArray();

      int score=1;
      for(int j = 0; j < character_array.length; j++){
        int numValue = (int) character_array[j];
        numValue = numValue - 64;
        score = score*numValue;
       }
       System.out.println(score);
      /*
      score_array[i] =
      if(score_array[0] % 47 == score_array[1] % 47){
          System.out.println("GO");
      } else {
          System.out.println("STAY");
      }
      */

    }
   pw.close();
   br.close();

  }
}
