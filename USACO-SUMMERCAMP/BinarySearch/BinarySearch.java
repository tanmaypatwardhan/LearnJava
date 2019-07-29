import java.util.*;
import java.io.*;
public class BinarySearch {
  public static void main(String[] args) throws IOException {
    Scanner s = new Scanner(System.in);
    int n = s.nextInt();
    int q = s.nextInt();
    int[] sorted = new int[n + 1];
    int[] queries = new int[q];
    int low = 0;
    int high = n - 1;
    int middle = 0;

    for(int i = 0 ; i < n ; i++){
      sorted[i] = s.nextInt();
    }

    for(int i = 0 ; i < q ; i++){
        queries[i] = s.nextInt();
    }



      if(n != 0){
          for(int i = 0 ; i < q; i++){
          low = 0;
          high = n -1;
            if(sorted[low] != queries[i]){
                while(low <  high){
                    middle = (low + high + 1)/2;
                    if(sorted[middle] <= queries[i]){
                        low = middle;
                    } else {
                        high = middle - 1;
                    }
                }
                if(sorted[low + 1] == queries[i]){
                  System.out.println(low + 1);
              } else {
                System.out.println(-1);
              }
            } else {
              if(sorted[low] > queries[i]){
                System.out.println(-1);
              } else {
                System.out.println(low);
              }

            }
        }
      } else {
          for(int i = 0 ; i < q; i++){
              System.out.println(-1);
          }
      }





    s.close();
  }
}
