import java.io.*;
import java.util.*;
public class TheCowSignal {
  public static void main(String[] args) throws IOException {
    Scanner s = new Scanner(new File("1.in"));
    int rows = s.nextInt();
    int columns  = s.nextInt();
    int n = s.nextInt();
    char[][] grid = new char[rows][columns];
    Vector<Integer> v = new Vector<Integer>();
    for(int i = 0 ;  i < rows ; i++){
      String str = s.next();
      for(int j = 0 ; j < columns ; j++) grid[i][j] = str.charAt(j);
    }

    for(int i = 0 ; i < rows ; i++){
      for(int j = 0 ; j < columsn ; j++){
        if(grid[i][j] == 'X'){
          v.add('X');
          v.add('X');
        } else {
          v.add('.');
          v.add('.');
        }
      }
    }

    System.out.println(v);




    pw.close();

  }
}
