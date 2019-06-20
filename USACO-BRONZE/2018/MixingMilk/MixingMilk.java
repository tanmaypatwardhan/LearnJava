import java.io.*;
import java.util.*;
public class MixingMilk {
  public static void main(String[] args) throws IOException{

    BufferedReader br = new BufferedReader(new FileReader("6.in"));
    PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("mm.out")));

    StringTokenizer st = new StringTokenizer(br.readLine());
    int c1 = Integer.parseInt(st.nextToken());
    int m1 = Integer.parseInt(st.nextToken());

    st = new StringTokenizer(br.readLine());
    int c2 =  Integer.parseInt(st.nextToken());
    int m2 = Integer.parseInt(st.nextToken());

    st = new StringTokenizer(br.readLine());
    int c3 =  Integer.parseInt(st.nextToken());
    int m3 = Integer.parseInt(st.nextToken());

    int max = 100;
    int i = 0;
    if(m1 == c1 && m2 == c2 && m3 == c3){
      pw.println(m1);
      pw.println(m2);
      pw.println(m3);

    } else {
      while(true){
        if((m2 + m1) > c2){
          m1 = m1 - (c2 - m2);
          m2 = c2;
          i++;
        } else {
          m2= m2 + m1;
          m1 = 0;
          i++;
        }
        if(i == max){
          break;
        }
        // 2 to 3
        if(m2 + m3 > c3){
          m2 = m2- (c3 - m3);
          m3 = c3;
          i++;
        } else {
          m3=m3 + m2;
          m2 = 0;
          i++;
        }
        if(i == max){
          break;
        }
        // 3 to 1
        if(m3 + m1 > c1){
          m3 = m3 - (c1 - m1);
          m1 = c1;
          i++;
        } else {
          m1= m1 + m3;
          m3 = 0;
          i++;
        }
        if(i == max){
          break;
        }

      }

      pw.println(m1);
      pw.println(m2);
      pw.print(m3);


    }


    br.close();
    pw.close();


  }
}
