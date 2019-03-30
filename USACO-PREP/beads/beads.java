/*
ID: tanmay.4
LANG: JAVA
PROG: beads
*/
import java.io.*;
import java.util.*;

public class beads {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new FileReader("beads.in"));
    PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("beads.out")));

    int num_beads = Integer.parseInt(br.readLine());
    //System.out.println(num_beads);
    int[] streak_array = {};
    char[] beads_array = new char[num_beads];
    //System.out.println(beads_array.length);

    for(int i = 0; i < beads_array.length; i++){
      int streak = 1;
      if( i < beads_array.length){
        if(beads_array[i] == beads_array[i + 1]){
          streak++;
        } else {
          streak_array[i] = streak;
          streak = 0;
        }
      }
    }

    for(int i = 0; i < streak_array.length; i++){
      System.out.println(streak_array[i]);
    }

  }
}
