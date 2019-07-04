import java.util.*;
import java.io.*;
public class MooSick {
  public static void main(String[] args) throws IOException {
    Scanner s = new Scanner(System.in);
    int numNotes = s.nextInt();
    int[] notes = new int[numNotes];
    int count = 0;
    for(int i = 0; i < notes.length ; i++){
      notes[i] = s.nextInt();
    }
    Vector<Integer> sorted = new Vector<Integer>();
    int numRuminant = s.nextInt();
    int[] temp = new int[numRuminant];
    int[] rChords = new int[numRuminant];
    for(int i = 0; i < rChords.length ; i++){
      rChords[i] = s.nextInt();

    }

    for(int i = 0; i <= notes.length - numRuminant; i++){
      Arrays.sort(notes, i , i+numRuminant);
      for(int j = 0; j < numRuminant; j++){
        sorted.add(notes[i + j]);
      }

    }


    System.out.println(sorted);



    s.close();
  }
}
