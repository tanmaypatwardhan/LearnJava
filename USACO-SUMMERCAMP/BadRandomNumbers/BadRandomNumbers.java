import java.io.*;
import java.util.*;
public class BadRandomNumbers {
  public static void main(String[] args) throws IOException {
    Scanner s = new Scanner(System.in);
    int n = s.nextInt();
    int[] seen = new int[1000];
    int middle = ((n / 10) % 100);
    int square = middle * middle;

    //System.out.println(square);

    int i = 0;
    while(i < seen.length){
      n = square;
      if(n > 999){
        middle = (((n / 10) % 100));
        if(seen[middle] == middle){
          break;
        } else {
          seen[middle] = middle;
        }
      } else if(n > 9 && n <= 999){
        middle = n / 10;
        if(seen[middle] == middle){
          break;
        } else {
          seen[middle] = middle;
        }
      } else if(n < 9){
        middle = n;
        if(seen[middle] == middle){
          break;
        } else {
          seen[middle] = middle;
        }

      }





      square = middle * middle;
      i++;

    }


    System.out.println(i);

  }


}
