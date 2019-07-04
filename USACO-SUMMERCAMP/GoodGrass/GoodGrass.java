import java.util.*;
import java.io.*;
public class GoodGrass{
  public static void main(String[] args) throws IOException {
    Scanner s = new Scanner(System.in);
    int rows = s.nextInt();
    int columns = s.nextInt();
    Vector<Integer> scores = new Vector<Integer>();
    Vector<Integer> timesX = new Vector<Integer>();
    Vector<Integer> timesY = new Vector<Integer>();

    int[][] grid = new int[rows][columns];

    for(int i = 0; i < rows ; i++){
      for(int j = 0; j < columns ; j++){
        grid[i][j] = s.nextInt();
      }
    }
    for(int i = 0 ; i < rows - 2; i++){
      for(int j = 0; j < columns - 2; j++){
        scores.add(grid[i][j] + grid[i][j + 1] + grid[i][j + 2] + grid[i + 1][j] + grid[i + 1][j + 1] + grid[i + 1][j + 2] + grid[i  + 2][j] + grid[i + 2][j + 1] + grid[i + 2][j + 2]);
        timesX.add(i);
        timesY.add(j);
      }
    }
    int greatest = 0;
    int x = 0;
    int y = 0;
    for(int i = 0; i < scores.size(); i++){
      if(scores.get(i) > greatest){
        greatest = scores.get(i);
        x = timesX.get(i + 1);
        y = timesY.get(i + 1);
      }
    }
    System.out.println(greatest);
    System.out.print(x);
    System.out.print(" ");
    System.out.print(y);
    s.close();
  }
}
