  import java.io.*;
  import java.util.*;
  public class Exploration {
    public static void main(String[] args) throws IOException {
      Scanner s = new Scanner(System.in);
      int maxMinutes = s.nextInt();
      int numLandmarks = s.nextInt();
      int time = 0;
      int count = 0;
      int[] landmarks = new int[numLandmarks];
      Vector<Integer> negatives = new Vector<Integer>();
      int j = 0;

      for(int i = 0; i < landmarks.length ; i++){
        landmarks[i] = s.nextInt();
      }

      for(int i = 0 ; i < landmarks.length ; i++){
        if(landmarks[i] < 0){
          negatives.add(landmarks[i]);
        }
      }

      for(int i = 0; i < landmarks.length ; i++){
        landmarks[i] = Math.abs(landmarks[i]);
      }

      Arrays.sort(landmarks);


      while(j < landmarks.length - 1){
        if(time>=maxMinutes){
          break;
        }
          while(j < negatives.size()){
            if(landmarks[j] == negatives.get(j) * -1){
              time+=landmarks[j] + landmarks[j + 1];
              count++;
            } else {
              time+=landmarks[j + 1] - landmarks[j];
              count++;
            }
          }
          time+=landmarks[j + 1] - landmarks[j];
          count++;
          j++;
      }



      System.out.println(count);

      
      s.close();
    }
  }
