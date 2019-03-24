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
  PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("ride.out")));
  int[] score_array={0,0};
  for(int i = 0; i < 2 ; i++) {
      String word  = br.readLine();
      char[] character_array = word.toCharArray();
      int score=1;
      for(int j = 0; j < character_array.length; j++){
        int numValue = (int) character_array[j];
        numValue = numValue - 64;
        score = score*numValue;
      }

      score_array[i] = score;
    //  System.out.println(score_array[i] +" "+ score_array[i] % 47);
  }

  if (score_array[0] % 47 == score_array[1] % 47) {
    pw.println("GO");
    } else {
    pw.println("STAY");
    }

  pw.close();
  br.close();
  }
}
