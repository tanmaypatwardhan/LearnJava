import java.io.*;
import java.util.*;
public class SpeedReading {
  public static void main(String[] args) throws IOException {
    Scanner s = new Scanner(System.in);
    int numPages = s.nextInt();
    int numCows = s.nextInt();

    int[] readTimes = new int[numCows];
    int[] maxTimes  = new int[numCows];
    int[] restingTimes = new int[numCows];
    int n = 0;
    int j = 0;
    int time = 0;
    int read = 0;
    Vector<Integer> times = new Vector<Integer>();

    for(int i = 0; i < numCows ; i++){
      readTimes[i] = s.nextInt();
      maxTimes[i] = s.nextInt();
      restingTimes[i] = s.nextInt();
    }

    while(n < numPages){
      while(n <= maxTimes[j]){
        n+=readTimes[j];
        time++;
      }
      time+=restingTimes[j];
      time+=((numPages - n) / readTimes[i]);
      


    }

    System.out.println(time);




  }

}
