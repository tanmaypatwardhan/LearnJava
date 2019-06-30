import java.io.*;
import java.util.*;
public class BlockGame {
  public static void main(String[] args) throws IOException {
  BufferedReader br = new BufferedReader(new FileReader("10.in"));
  PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("bGame.out")));

  StringTokenizer st = new StringTokenizer(br.readLine());
  int n = Integer.parseInt(st.nextToken());
  String[] words = new String[n];
  int[] alphabets = new int[26];
  int[] pA1 = new int[26];
  int[] pA2 = new int[26];

  for(int i = 0; i < n ; i++){
    words[i] = br.readLine();
    //pw.println(words[i]);

  }

    int i = 0;
    while(i < words.length){
      for(int j = 0; j < words[i].length() ; j++){
        if(j < words[i].indexOf(" ")){
          pA1[((int)words[i].charAt(j) - 97)]++;
        }
        if(j > words[i].indexOf(" ")){
          pA2[((int)words[i].charAt(j) - 97)]++;
        }


      }
      for(int z = 0; z < alphabets.length; z++){
        alphabets[z] += Math.max(pA1[z] , pA2[z]);
        pA1[z] = 0;
        pA2[z] = 0;
      }

      i++;
    }




  for(int x = 0; x < alphabets.length; x++){
    pw.println(alphabets[x]);

  }






  pw.close();
  br.close();

  }
}
