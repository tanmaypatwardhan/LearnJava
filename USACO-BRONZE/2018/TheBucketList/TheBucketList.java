import java.util.*;
import java.io.*;

public class TheBucketList {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new FileReader("10.in"));
    PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("bList.out")));

    StringTokenizer st = new StringTokenizer(br.readLine());
    int n = Integer.parseInt(st.nextToken());
    int[] startTimes = new int[n];
    int[] endTimes = new int[n];
    int[] numBuckets = new int[n];
    int eBuckets  = 0;
    int result = 0;

    for(int i = 0; i < n ; i++){
      st = new StringTokenizer(br.readLine());
      startTimes[i] = Integer.parseInt(st.nextToken());
      endTimes[i] = Integer.parseInt(st.nextToken());
      numBuckets[i] = Integer.parseInt(st.nextToken());
    }

    int least = startTimes[0];
    int greatest = endTimes[0];

    for(int i  = 0 ; i < n ; i++){
      if(startTimes[i] < least){
        least = startTimes[i];
      }
      if(endTimes[i] > greatest){
        greatest = endTimes[i];
      }
    }
    //pw.println(greatest);
    //pw.println(least);
    for(int i = least ; i <= greatest ; i++){
      eBuckets = 0;
      for(int j = 0 ; j <= n - 1; j++){
          if(i >= startTimes[j] && i <= endTimes[j]){
            eBuckets = eBuckets + numBuckets[j];
            if(eBuckets >= result){
              result = eBuckets;
            }

          }
          //pw.println(eBuckets);

      }
    }
    pw.println(result);
    pw.close();
    br.close();

  }
}
