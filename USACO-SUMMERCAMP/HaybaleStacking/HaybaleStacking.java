import java.util.*;
import java.io.*;
public class HaybaleStacking {
  public static void main(String[] args) throws IOException {
    Scanner s = new Scanner(System.in);
    int stacks = s.nextInt();
    int numInstructions = s.nextInt();
    int[] starts = new int[numInstructions];
    int[] ends = new int[numInstructions];
    int[] prefix = new int[stacks + 1];
    int sum = 0;
    int[] stackArr = new int[stacks];
    for(int i = 0; i < numInstructions; i++){
      starts[i] = s.nextInt();
      ends[i] = s.nextInt();
    }
    for(int i = 0; i < starts.length; i++){
      prefix[starts[i] - 1]++;
      prefix[ends[j]]--;
    }
    for(int i = 0 ; i < stackArr.length ; i++){
      sum += prefix[i];
      stackArr[i] += sum;
    }
    Arrays.sort(stackArr);
    System.out.println(stackArr[stackArr.length/2]);
  }
}
