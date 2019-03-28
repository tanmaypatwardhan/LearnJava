/*
ID: tanmay.4
LANG: JAVA
PROG: friday
*/
import java.io.*;
import java.util.*;
public class friday {
  public static void main(String[] args) throws IOException {
    int days_diff = 1;
    int days_offset = 12;
    BufferedReader br = new BufferedReader(new FileReader("friday.in"));
    PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("friday.out")));

    String[] days_of_the_week = {"Monday" , "Tuesday" , "Wednesday" , "Thursday" , "Friday" , "Saturday" , "Sunday"};
    int[] freq_of_thirteenths = {0 , 0 , 0 , 0 , 0 , 0 , 0};
    int starting_year = 1900;
    int num_years = Integer.parseInt(br.readLine());
    for(int y = starting_year; y < (starting_year+num_years); y ++){
      for(int m = 1 ; m <= 12 ; m++){
        if(m == 1 && y == starting_year){
          days_diff += days_offset;
          } else {
            if(m==1 && y != starting_year) {
            days_diff+=31;
          }
        }

        if( m == 3){
          if((y % 100 == 0 && y % 400 == 0) || (y % 100 != 0 && y % 4 == 0)){
            days_diff+= 29;
          } else {
            days_diff += 28;
          }
        }

        if(m == 2 || m == 4 || m == 6 || m == 8 || m == 9 || m == 11){
          days_diff+=31;
        }

        if(m ==  5 || m == 7 || m == 10 || m == 12){
          days_diff += 30;
        }

        int remainder = days_diff % 7;
        freq_of_thirteenths[remainder]++;

    }
  }

    pw.println(freq_of_thirteenths[6] + " " + freq_of_thirteenths[0] + " " + freq_of_thirteenths[1] + " " + freq_of_thirteenths[2] + " " + freq_of_thirteenths[3] + " " + freq_of_thirteenths[4] + " " + freq_of_thirteenths[5]);
    br.close();
    pw.close();
  }
}
