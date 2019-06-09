/*
ID: tanmay.4
LANG: JAVA
PROG: beads
*/
import java.io.*;
import java.util.*;

public class beads {
<<<<<<< HEAD
  public static void main (String [] args) throws IOException {
    BufferedReader f = new BufferedReader(new FileReader("beads.in"));
    PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("beads.out")));
    int beadNum = Integer.parseInt(f.readLine());
    String beads = f.readLine();
    int maxBeadsTaken = 2;
    for(int i = 0; i < beadNum; i++){
        int leftTaken = takeLeftBeads(i,beads);
        int rightTaken;
        if (i == beadNum - 1){
            rightTaken = takeRightBeads(0,beads);
        } else {
            rightTaken = takeRightBeads(i+1,beads);
        }
        int total = Math.min(leftTaken + rightTaken, beadNum);
        if(total > maxBeadsTaken){
            maxBeadsTaken = total;
        }
    }
    out.print(maxBeadsTaken+"\n");
    out.close();
  }

  public static int takeLeftBeads(int begin, String beads){
        int left = beg in;
        boolean canTake = true;
        int beadsTaken = 1;
        char colorTaken = beads.charAt(left);
        left = left == 0 ? beads.length() - 1 : left - 1;
        while(canTake && beadsTaken < beads.length()){
            char bead = beads.charAt(left);
            if(bead != 'w' && colorTaken != 'w' && bead != colorTaken){
                canTake = false;
            } else {
                if(colorTaken == 'w'){
                    colorTaken = bead;
                }
                beadsTaken++;
                left = left == 0 ? beads.length() - 1 : left - 1;
            }
        }
        return beadsTaken;
  }

  public static int takeRightBeads(int begin, String beads){
        int right = begin;
        boolean canTake = true;
        int beadsTaken = 1;
        char colorTaken = beads.charAt(right);
        right = right == beads.length()-1 ? 0: right + 1;
        while(canTake && beadsTaken < beads.length()){
            char bead = beads.charAt(right);
            if(bead != 'w' && colorTaken != 'w' && bead != colorTaken){
                canTake = false;
            } else {
                if(colorTaken == 'w'){
                    colorTaken = bead;
                }
                beadsTaken++;
                right = right == beads.length()-1 ? 0: right + 1;
            }
        }
        return beadsTaken;
=======
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new FileReader("beads.in"));
    PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("beads.out")));

    int num_beads = Integer.parseInt(br.readLine());
    String beads_string = br.readLine();
    char[] beads_array = beads_string.toCharArray();

    Vector<Integer> streak_array = new Vector<Integer>();
    int streak = 1;
    int streak_index=0;
    int highest_strk = 1;
    streak_array.add(1);
    for(int i = 1; i < num_beads; i++){
        if(beads_array[i-1] == beads_array[i] || beads_array[i-1] == 'w'|| beads_array[i] == 'w') {
          streak++;   
          // Increment streak at the same index//
          streak_array.set(streak_index, streak);
        if(i==num_beads-1){                  // Take care if the last element changes in the streak//
          streak_index++;
          streak_array.add(1);
        }
        } else {
          if(beads_array[i - 1] != beads_array[i]){
            streak_index++;                          // Increment index when streak changes and a zero to at the new index position//
            streak_array.add(1);
            streak=1;
          }
        }
        }
        System.out.println(streak_array);


     for(int i = 1; i < streak_array.size() ; i++){
       if(streak_array.size() <= 1){
         highest_strk = streak_array;
       } else if(streak_array.size() > 1){
         int sum = streak_array.get(i - 1) + streak_array.get(i);
         if(sum > highest_strk){
          highest_strk = sum;
       }
      }
     }
     System.out.println(highest_strk);

   }
>>>>>>> f6649f2a9566f47aaa55032a908925dd400a7c99

 }
