/*
ID: your_id_here
LANG: JAVA
PROG: ride
*/
import java.io.*;
import java.util.*;
public class ride {
  public static void main(String[] args) throws IOException {

  Scanner s = new Scanner(System.in);
  int[] score_array={0,0};
  for(int i = 0; i < 2 ; i++) {
      String word  = s.nextLine();
      char[] character_array = word.toCharArray();
      int score=1;
      for(int j = 0; j < character_array.length; j++){
        int numValue = (int) character_array[j];
        numValue = numValue - 64;
        score = score*numValue;
      }

      score_array[i] = score;
  }

  if (score_array[0] % 47 == score_array[1] % 47) {
    System.out.println("GO");
    } else {
    System.out.println("STAY");
    }
  }
}
