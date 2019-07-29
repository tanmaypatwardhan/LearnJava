import java.util.*;
import java.io.*;
public class ToyShopping {
  public static void main(String[] args) throws IOException {
    Scanner s = new Scanner(System.in);
    int numToys  = s.nextInt();
    int[] joy = new int[numToys];
    int[] prices = new int[numToys];
    double[] metric = new double[numToys];
    double[] metric2 = new double[numToys];
    int first = 0;
    int second = 0;
    int third = 0;
    int price = 0 ;
    int[] indexes = new int[3];

    // Filling in arrays
    for(int i = 0 ; i < numToys; i++){
      joy[i] = s.nextInt();
      prices[i] = s.nextInt();
    }

    for(int i = 0 ; i < numToys; i++){
      metric[i] = (joy[i]/(double)price[i]);
    }

    // Saving original indexes of 
    for(int i = 0; i < numToys; i++){
      metric2[i] = metric[i];
    }

    Arrays.sort(metric2);

    for(int i = 0 ; i < numToys ; i++){
      if(metric[i] == metric2[numToys - 1]){
        first = i + 1;
        price+=prices[i];
      } else if(metric[i] == metric2[numToys - 2]){
        second = i + 1;
        price+=prices[i];
      } else if(metric[i] == metric2[numToys - 3]){
        third = i + 1;
        price+=prices[i];
      }
    }

    indexes[0] = first;
    indexes[1] = second;
    indexes[2] = third;

    System.out.println(price);
    for(int i = 0 ; i < indexes.length ; i++){
      System.out.println(indexes[i]);
    }






    s.close();
  }
}
