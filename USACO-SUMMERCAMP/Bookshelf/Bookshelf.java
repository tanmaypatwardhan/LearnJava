import java.util.*;
import java.io.*;
public class Bookshelf {
  public static void main(String[] args) throws IOException {
    Scanner s = new Scanner(System.in);
    int numCows = s.nextInt();
    int height = s.nextInt();
    int[] cowHeights = new int[numCows];
    int sum = 0
    int counter = 0;
    Vector<Integer> counters = new Vector<Integer>();

    for(int i = 0; i < cowHeights.length ; i++){
      cowHeights[i] = s.nextInt();
    }
    Arrays.sort(cowHeights);


    for(int i = cowHeights.length - 1 ; i > 0 ; i--){
      sum+=cowHeights[i];
      counter++;
      if(sum > height){
        counters.add(counter);
        sum = 0;
        counter = 0;
      }
    }

    int least = counters.get(0);
    for(int i = 0 ; i < counters.size() ; i++){
      if(counters.get(i) < least){
        least = counters.get(i);
      }
    }

    System.out.println(least);



    s.close();
  }
}
