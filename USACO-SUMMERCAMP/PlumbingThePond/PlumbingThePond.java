import java.util.*;
public class PlumbingThePond {
    public static void main (String[] args){
        Scanner s = new Scanner(System.in);
        int rows = s.nextInt();
        int columns = s.nextInt();
        int[][] grid = new int[rows][columns];
        int max = 0;


        for(int i= 0 ; i < rows ; i++){
            for(int j = 0 ; j < columns; j++){
                grid[i][j] = s.nextInt();
                if(grid[i][j] > max){
                  max = grid[i][j];
                }
            }
        }

        int[] nums = new int[max];

        for(int i = 0 ; i < rows ; i++){
          for(int j  = 0 ; j < columns ; j++){
            
          }
        }


    }
}
