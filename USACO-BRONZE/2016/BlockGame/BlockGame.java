import java.io.*;
import java.util.*;
public class BlockGame {
  public static void main(String[] args) throws IOException {
  BufferedReader br = new BufferedReader(new FileReader("1.in"));
  PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("bGame.out")));

  StringTokenizer st = new StringTokenizer(br.readLine());
  int n = Integer.parseInt(st.nextToken());
  String[] words = new String[n * 2];
  int[] alphabets = new int[26];
  int j = 0;
  String result = "";

  for(int i = 0; i < n ; i++){
    words[i] = br.readLine();



  }
  for(int g = 0; g < words.length ; g++){
    String word1 = words[g].substring(0 , words[g].indexOf(" "));
    String word2 = words[g].substring(words[g].indexOf(" ")  + 1);
    pw.println(word1);
    pw.println(word2);

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
