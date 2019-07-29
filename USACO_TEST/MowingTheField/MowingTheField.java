import java.util.*;
import java.io.*;
public class MowingTheField {
  public static void main(String[] args) throws IOException {
    Scanner s = new Scanner(new File("1.in"));
    PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("mw.out")));
    int n = s.nextInt();
    char[] directions = new char[n];
    int[] nums = new int[n];
    int width = 0;
    int height = 0;
    int time = 1;
    int time2 = 1;

    for(int i = 0 ; i < n ; i++){
      directions[i] = s.next().charAt(0);
      nums[i] = s.nextInt();
    }

    for(int i = 0 ; i < n; i++){
      if(directions[i] == 'W' || directions[i] == 'E'){
        if(nums[i] > width){
          width = nums[i];
        }
      }
    if(directions[i] == 'N' || directions[i] == 'S'){
      if(nums[i] > height){
          height = nums[i];
        }
      }

    }
    int currentPosX = width;
    int currentPosY = height;

    boolean[][] grid = new boolean[width * 2][height * 2];
    int[][] grid2 = new int[width * 2][height * 2];
    grid[width][height] = true;
    for(int i = 0 ; i < n ; i++){
      if(directions[i] == 'N'){
        for(int j = 0; j < nums[i] - 1; j++){
          time2++;
          currentPosY = currentPosY + 1;
          grid[currentPosX][currentPosY] = true;
          grid2[currentPosX][currentPosY] = time2;

        }
      }

      if(directions[i] == 'W'){
        for(int j = 0; j < nums[i] - 1; j++){
          time2++;
          currentPosX = currentPosX - 1;
          grid[currentPosX][currentPosY] = true;
          grid2[currentPosX][currentPosY] = time2;

        }
      }
      if(directions[i] == 'S'){
        for(int j = 0; j < nums[i] - 1; j++){
          time2++;
          currentPosY = currentPosY - 1;
          grid[currentPosX][currentPosY] = true;
          grid2[currentPosX][currentPosY] = time2;

        }
      }
      if(directions[i] == 'E'){
        for(int j = 0; j < nums[i] - 1; j++){
          time2++;
          currentPosX = currentPosX + 1;
          grid[currentPosX][currentPosY] = true;
          grid2[currentPosX][currentPosY] = time2;

        }
      }


    }

    for(int i  = 0 ; i < width * 2 ; i++){
      for(int j = 0 ; j < height * 2 ; j++){
        if(i == (width * 2) - 1){
          pw.print(grid[i][j] + " " +  "\n");
        } else {
          pw.print(grid[i][j] + " ");
        }
      }
    }


    s.close();
    pw.close();
  }
}
