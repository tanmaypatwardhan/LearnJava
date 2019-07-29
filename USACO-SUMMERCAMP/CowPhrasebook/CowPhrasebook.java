import java.util.*;
public class CowPhrasebook {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int numPhrases = s.nextInt();
    int numCowPhrases = s.nextInt();
    int low = 0;
    int high = numPhrases - 1;
    int middle = 0;
    int count = 0;


    String[] phrases = new String[numPhrases];
    String[] cowPhrases = new String[numCowPhrases];

    for(int i = 0 ; i < numPhrases ; i++){
      phrases[i] = s.nextLine();
    }
    for(int i = 0 ; i < numCowPhrases ; i++){
      cowPhrases[i] = s.nextLine();
    }
    Arrays.sort(phrases);
    for(int i = 0; i < numCowPhrases ; i++){
      low = 0;
      high = numPhrases - 1;
      while(low < high){
        middle = (low + high + 1)/2;
        if(phrases[middle].substring(0, Math.min(phrases[middle].length() , cowPhrases[i].length())).compareTo(cowPhrases[i]) <= 0){
          low = middle;
        } else {
          high = middle - 1;
        }

      }
    }



  }
}
