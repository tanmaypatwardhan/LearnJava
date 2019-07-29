import java.util.*;
import java.io.*;
public class Crosswords {
  public static void main(String[] args) throws IOException {
    Scanner s = new Scanner(System.in);
    int rows = s.nextInt();
    int columns = s.nextInt();
    char[][] grid = new char[rows][columns];
    Vector<Integer> x = new Vector<Integer>();
    Vector<Integer> y = new Vector<Integer>();

    for(int i = 0; i < rows ; i++){
      String s = s.nextLine();
      for(int j = 0; j < columns ; j++){
        grid[i][j] = s.charAt(j);
      }
    }

    for(int i = 0 ; i < rows - 2; i ++){
      for(int  = 0; i < columns - 2; i++){
        if((j == 0 || grid[i][j - 1] == '#') && grid[i][j + 1] == '.' && grid[i][j + 2] == '.' && grid[i][j] == '*' ){
          x.add(i);
          x.add(i);
          x.add(i);

          y.add(i);
          y.add(i + 1);
          y.add(i + 2);
        }

        System.out.print(x);
        System.out.print(y);
      }
    }
  }
}
