import java.io.*;
import java.util.*;
public class BlockGame {
  public static void main(String[] args) throws IOException {
  BufferedReader br = new BufferedReader(new FileReader("1.in"));
  PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("bGame.out")));

  StringTokenizer st = new StringTokenizer(br.readLine());
  int n = Integer.parseInt(st.nextToken());
  String[] words = new String[n * 2];
  String[] words2 = new String[n * 2];
  int[] alphabets = new int[26];
  int j = 0;
  String result = "";
  String word1 = "";
  String word2 = "";

  for(int i = 0; i <= n ; i++){
    words[i] = br.readLine();
    word1 = words[i].substring(0 , words[i].indexOf(" "));
    word2 = words[i].substring(words[i].indexOf(" ") + 1);

  }

  for(int x = 0; x < words2.length; x++){
    pw.println(words2[x]);
  }








  while(j<words.length - 1){
    result += words[j];
    j++;
  }
  int z = 0;
  while(z < result.length()){
    if(result.substring(z , z + 4).equals("null")){
      break;
    }
    if(result.charAt(z) != ' '){
      alphabets[((int)result.charAt(z) - 97)]++;
    } else {
      z++;
    }
    z++;

  }

  for(int t  = 0 ; t < alphabets.length; t++){
    //pw.println(alphabets[t]);
  }






  pw.close();
  br.close();

  }
}
