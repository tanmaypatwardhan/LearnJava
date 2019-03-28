/*
ID: tanmay.4
LANG: JAVA
PROG: friday
*/
import java.io.*;
import java.util.*;
public class friday {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new FileReader("friday.in"));
    PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("friday.out")));

    String[] days_of_the_week = {"Monday" , "Tuesday" , "Wednesday" , "Thursday" , "Friday" , "Saturday" , "Sunday"};
    int[] freq_of_thirteenths = {0 , 0 , 0 , 0 , 0 , 0 , 0};
    int starting_year = 1990;

    int num_years = Integer.parseInt(br.readLine());
    //System.out.println(num_years);

    int days_diff = 425;
    int remainder = days_diff % 7;
   for(int i  = 0; i < days_of_the_week.length ; i++){
     if(days_of_the_week[i].equals("Monday")){
       System.out.println(days_of_the_week[i + remainder]);
     }
   }

    br.close();
    pw.close();
  }
}
