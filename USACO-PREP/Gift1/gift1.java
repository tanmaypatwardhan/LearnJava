/*
ID: tanmay.4
LANG: JAVA
PROG: gift1
*/
import java.io.*;
import java.util.*;
public class gift1 {
  public static void main(String[] args) throws IOException{

      BufferedReader br = new BufferedReader(new FileReader("gift1.in"));
      PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("gift1.out")));

      int total_people = Integer.parseInt(br.readLine());
      int[] amounts = new int[total_people];
      String[] names = new String[total_people];
      for(int i = 0 ; i < total_people ; i++){
        amounts[i] = 0;
        String name = br.readLine();
        names[i] = name;
        //System.out.println(names[i]);
      }
      for (int x = 0; x < total_people; x++) {
        // This is the start of each giver's block//
              String giver = br.readLine();
              StringTokenizer st = new StringTokenizer(br.readLine());
              int amount_total = Integer.parseInt(st.nextToken());
              int num_recievers = Integer.parseInt(st.nextToken());
              int amount_distributed;
              int remainder;
              if (num_recievers==0) {
                amount_distributed=amount_total;
                remainder=0;
              } else {
                amount_distributed = amount_total / num_recievers;
                remainder = amount_total % num_recievers;
              }
              for(int i = 0 ; i  < names.length ; i++){
                  if(names[i].equals(giver)) {
                    amounts[i] = amounts[i] - amount_total + remainder;
                  }
              }

              for (int j = 0; j< num_recievers; j++) {
                String reciever = br.readLine();
                for(int k = 0 ; k  < names.length ; k++){
                    if(names[k].equals(reciever)) {
                      amounts[k] = amounts[k] + amount_distributed;
                    }
                }
              }
        // This is the end of each giver's block//
      }
      for (int i=0 ; i < total_people; i++) {
        pw.println(names[i]+" "+amounts[i]);
      }
        br.close();
        pw.close();
  }


}
