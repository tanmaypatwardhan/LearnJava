import java.io.*;
import java.util.*;
public class test {
  public static void main(String[] args) throws IOException {
  BufferedReader br = new BufferedReader(new FileReader("bGame.in"));
  PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("test.out")));

  String str = br.readLine();
  pw.println(str);
  int[] pA1 = new int[26];
  int[] pA2 = new int[26];
  int[] alphabets = new int[26];

  for(int i = 0; i < str.length(); i++){
    if(i < str.indexOf(" ")){
      pA1[((int)str.charAt(i) - 97)]++;
    }
    if(i > str.indexOf(" ")){
      pA2[((int)str.charAt(i) - 97)]++;
    }

  }
  for(int j = 0; j < alphabets.length; j++){
     alphabets[j]+=Math.max(pA1[j] , pA2[j]);
  }

  for(int i = 0; i < alphabets.length; i++){
    pw.println(alphabets[i]);
  }

  pw.close();
  br.close();


  }
}
