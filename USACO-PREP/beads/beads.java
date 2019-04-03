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
    String beads_string = br.readLine();
    char[] beads_array = beads_string.toCharArray();

    Vector<Integer> streak_array = new Vector<Integer>();
    int streak = 1;
    int streak_index=0;
    streak_array.add(1);
    for(int i = 1; i < num_beads; i++){
        if(beads_array[i-1] == beads_array[i] || beads_array[i-1] == 'w'|| beads_array[i] == 'w') {   // Increment streak at the same index//
          streak++;
          streak_array.set(streak_index, streak);
        } else if(i==num_beads-1){                  // Take care if the last element changes in the streak//
          streak_index++;
          streak_array.add(1);
        } else {
          streak_index++;                          // Increment index when streak changes and a zero to at the new index position//
          streak_array.add(1);
          streak=1;
        }
        }
     System.out.println(streak_array);
  }
}
