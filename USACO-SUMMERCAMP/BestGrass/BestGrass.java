import java.io.*;
import java.util.*;
public class BestGrass {
  public static void main(String[] args) throws IOException {
    Scanner s = new Scanner(System.in);
    int rows = s.nextInt();
    int columns = s.nextInt();
    char[][] grid = new char[rows][columns];
    int clumps = 0;
    int duplicate = 0;

   for(int i = 0; i < rows ; i++){
       String str = s.next();
       for(int j = 0; j < columns ; j++){
           grid[i][j] = str.charAt(j);
           //System.out.println(grid[i][j]);
       }
   }

   for(int i = 1 ; i < rows - 1; i++){
     for(int j = 1; j < columns - 1; j++){
         if((grid[i][j] == '#' && grid[i + 1][j] == '#') || (grid[i][j] == '#' && grid[i][j + 1] == '# ')){
           clumps++;
         }
        if((grid[i][j] == '#' && grid[i - 1][j] == '#') || (grid[i][j] == '#' && grid[i][ - 1j] == '# ')){
           clumps = clumps;

         }


       }
     }




  }
}
