import java.util.*;
import java.io.*;
public class ThePerfectCow {
  public static void main(String[] args) throws IOException {
    Scanner s = new Scanner(System.in);
    int n = s.nextInt();

    int[][] grid = new int[n][n];
    int[] medians = new int[n];

    for(int i = 0 ; i < n ; i++){
      for(int j  = 0; j < n ; j++){
        grid[i][j] = s.nextInt();

      }
      Arrays.sort(grid[i]);
      medians[i] = grid[i][n/2];


    }

    for(int i = 0; i < medians.length ; i++){
      System.out.println(medians[i]);
    }

    Arrays.sort(medians);

    System.out.println(medians[n/2]);

    s.close();






  }
}
