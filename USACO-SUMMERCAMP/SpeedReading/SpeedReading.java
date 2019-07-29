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

    int time = 0;
    int read = 0;
    int left = 0;
    Vector<Integer> times = new Vector<Integer>();

    for(int i = 0; i < numCows ; i++){
      readTimes[i] = s.nextInt();
      maxTimes[i] = s.nextInt();
      restingTimes[i] = s.nextInt();
    }



  for(int i = 0 ; i < numCows ; i++){
    time = 0;
    read = numPages;
    left = numPages;
    if(readTimes[i] * maxTimes[i] > numPages){
      if(numPages % readTimes[i] == 0){
        times.add(numPages / readTimes[i]);
      } else {
        times.add(numPages/readTimes[i] + 1);
      }
    } else {
         read = numPages - (readTimes[i] * maxTimes[i]);
         left = read;
         time+=maxTimes[i];
        time+=restingTimes[i];

        if(read <= readTimes[i] * maxTimes[i]){
            time+=(int)Math.ceil((double)read / readTimes[i]);
            times.add(time);
        } else {
            for(int j = readTimes[i] * maxTimes[i] ; j < read  ; j+=readTimes[i] * maxTimes[i]){
                left -= (readTimes[i] * maxTimes[i]);
                time+=maxTimes[i];
                time+=restingTimes[i];
            }
            time+=(int)Math.ceil((double)left / readTimes[i]);
            times.add(time);


        }



    }
  }

  for(int i = 0 ;i < times.size() ; i++){
    System.out.println(times.get(i));
  }








  }

}
