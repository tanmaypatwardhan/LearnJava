import java.util.*;
import java.io.*;
public class CountingHaybales {
  public static void main(String[] args) throws IOException{
    Scanner s = new Scanner(System.in);
    int low = 0;
    int n = s.nextInt();
    int high = n - 1;
    int middle = 0;
    int q = s.nextInt();
    int[] locations = new int[n + 1];
    for(int i = 0 ; i < n ; i++){
      locations[i] = s.nextInt();
    }
    int count = 0;
    int[] startTimes = new int[q];
    int[] endTimes = new int[q];
    Vector<Integer> ranges = new Vector<Integer>();

    for(int i = 0; i  < q ; i++){
      startTimes[i] = s.nextInt();
      endTimes[i] = s.nextInt();
    }

    for(int i = 0 ; i < q; i++){
    low = 0;
    high = n -1;
      if(locations[low] != startTimes[i]){
          while(low <  high){
              middle = (low + high + 1)/2;
              if(locations[middle] < startTimes[i]){
                  low = middle;
              } else {
                  high = middle - 1;
              }
          }
          if(locations[low + 1] == startTimes[i]){
            //System.out.println(low + 1);
            //ranges.add(low + 1);
            System.out.println(locations[low + 1]);
        } else {
          System.out.println(-1);
        }
      } else {
        if(locations[low] >= startTimes[i]){
          System.out.println(-1);
        } else {
          //System.out.println(low);
          //ranges.add(low);
          System.out.println(locations[low]);
        }

      }
  }

  //System.out.println(ranges);

    s.close();
  }
}
