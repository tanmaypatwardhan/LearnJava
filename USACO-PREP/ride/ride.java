/*
ID: your_id_here
LANG: JAVA
PROG: ride
*/
import java.io.*;
import java.util.*;
public class ride {
  public static void main(String[] args) {
    String name = "TANMAY";
    char[] character_array = name.toCharArray();
    int score=1;
    for(int i = 0; i < character_array.length ; i++){
      int numValue = (int) character_array[i];
      numValue = numValue - 64;
      score = score*numValue;
      System.out.println(character_array[i]+" "+numValue);
    }
    System.out.println("Score is: "+score);
  }
}
