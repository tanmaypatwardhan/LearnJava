import java.util.*;
import java.io.*;

public class TheFlowerGarden {
  public static void main(String[] args) throws IOException {
    Scanner s = new Scanner(System.in);
    int totalSlots = s.nextInt();
    int numTypes = s.nextInt();
    int emptySlots = 0;

    int[] slots = new int[totalSlots];
    int[] flowers = new int[numTypes];
    int[] iterations = new int[numTypes];

    for(int i = 0; i < numTypes; i++){
      flowers[i] = s.nextInt();
      iterations[i] = s.nextInt();
    }
    int j = 0;
    while(j < iterations.length){
      for(int i = flowers[j] - 1 ; i < totalSlots  ; i+=iterations[j]){
          slots[i] = 1;
      }
      j++;
    }

    for(int i = 0; i < totalSlots ; i++){
      if(slots[i] == 0){
        emptySlots++;
      }
    }

    System.out.println(emptySlots);

  }
}
