
import java.io.*;
import java.util.*;
public class SpeedingTicket {
  public static void main(String[] args) throws IOException {
  BufferedReader br = new BufferedReader(new FileReader("6.in"));
  PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("sTicket.out")));

  StringTokenizer st = new StringTokenizer(br.readLine());
  int N = Integer.parseInt(st.nextToken());
  int M = Integer.parseInt(st.nextToken());

  int[] nSegments = new int[N];
  int[] nSpeeds = new int[N];
  int[] mSegments = new int[M];
  int[] mSpeeds = new int[M];
  int j = 0;
  int greatestSpeed = 0;
  int max = 100;
  int df = 0;
  int rI = 0;
  int cI = 0;


  for(int i = 0; i < nSegments.length; i++){
    st = new StringTokenizer(br.readLine());
    nSegments[i] = Integer.parseInt(st.nextToken());
    nSpeeds[i] =  Integer.parseInt(st.nextToken());



  }

  for(int i = 0; i < mSegments.length; i++){
    st = new StringTokenizer(br.readLine());
    mSegments[i] = Integer.parseInt(st.nextToken());
    mSpeeds[i] =  Integer.parseInt(st.nextToken());



  }
  int sum1 = nSegments[0];
  int sum2 = mSegments[0];

  while(j <= max){

    if(j >= sum1){
      if(rI >= nSegments.length -1 ){
        rI = nSegments.length - 1;
      } else {

        rI++;
        sum1+=nSegments[rI];
      }
    }
    if(j >= sum2){
      if(cI >= mSegments.length - 1){
        cI = mSegments.length - 1;
      } else {

        cI++;
        sum2+=mSegments[cI];
      }
    }
    df = mSpeeds[cI] - nSpeeds[rI];


    if(df > greatestSpeed){
      greatestSpeed = df;
    }
    j++;
  }




    pw.println(greatestSpeed);







    br.close();
    pw.close();
  }







}
