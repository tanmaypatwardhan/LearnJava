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
    int highest_strk = 1;
    int num_beads = Integer.parseInt(br.readLine());
    String beads_string = br.readLine();
    char[] beads_array = beads_string.toCharArray();

    Vector<Integer> streak_array = new Vector<Integer>();
    Vector<Integer> white_array = new Vector<Integer>();

    int streak = 1;
    int w_strk = 1;
    streak_array.add(1);
    for(int i = 1; i < num_beads; i++){
        if(beads_array[i-1] == beads_array[i] ){     // Increment streak at the same index//
          streak++;
          streak_array.add(streak);
        } else if(i==num_beads - 1){
          streak_array.add(1);
          if(beads_array[i] == 'w' && beads_array[i - 1] == 'w'){
            w_strk++;
            white_array.add(w_strk);
          }
        } else {
          streak_array.add(1);
          streak=1;
        }
        if(beads_array[i - 1] == 'w' && beads_array[i] == 'w'){
          w_strk++;
          white_array.add(w_strk);
        }

  }
     System.out.println(w_strk);
     for(int i = 1; i < streak_array.size() ; i++){
       if(streak_array.size() == 1){
         highest_strk = streak_array.get(0);
       } else {
         int sum = streak_array.get(i - 1) + streak_array.get(i);
         if(sum > highest_strk){
           highest_strk = sum;
       }

       }



     }
     //System.out.println(highest_strk);


  }
}
