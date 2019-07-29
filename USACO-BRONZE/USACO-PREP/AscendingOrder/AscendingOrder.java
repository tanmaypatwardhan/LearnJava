import java.util.*;
public class AscendingOrder {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int length = s.nextInt();
    int[] arr = new int[length];
    int temp = 0;
    int minIndex = 0;

    for(int i = 0 ; i < length ; i++){
      arr[i] = s.nextInt();
    }

    int min = arr[0];


    for(int i  = 0; i < length; i++){
        minIndex = i;
        for(int j = i ; j < length ; j++){
          if(arr[j] < min){
            temp = min;
            min = arr[j];
            arr[j] = temp;


          }
        }
        arr[minIndex] = min;


    }

    for(int i = 0 ; i < length ; i++){
      System.out.println(arr[i]);
    }


    s.close();
  }
}
