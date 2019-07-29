import java.util.*;
public class CowCotillion {
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    int numLines = s.nextInt();
    String[] lines = new String[numLines];
    int[] numChars = new int[numLines];
    int count = 0;
    boolean bool = false;

    for(int i =  0; i < numLines ; i++){
      numChars[i] = s.nextInt();
      lines[i] = s.nextLine();
    }

    for(int i = 0; i < numLines ; i++){
      for(int j = 0 ; j < lines[i].length() ; j++){
        if(lines[i].charAt(j) == '>'){
          bool = false;
          count++;
        }
        if(lines[i].charAt(j) == '<'){
          if(count<= 0){
            bool = true;
            System.out.println("illegal");
            break;
          } else {
            count--;
          }
        }
      }
      if(count == 0 && bool == false){
        System.out.println("legal");
      } else if(count > 0 && bool == false){
        System.out.println("illegal");
      }
    }

    s.close();
  }
}
