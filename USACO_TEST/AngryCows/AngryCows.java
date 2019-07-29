import java.util.*;
import java.io.*;
public class AngryCows {
  public static void main(String[] args) throws IOException {
    Scanner s = new Scanner(new File("1.in"));
    PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("ac.out")));
    int n = s.nextInt();
    Vector<Integer> v= new Vector<Integer>();
    for(int i = 0 ; i < n ; i++){
      v.add(s.nextInt());
    }

    Collections.sort(v);
    pw.println(v);

    int j = 0;
    while(j < v.size()){
      for(int g=  0;  g < v.size() ; g++){
        
      }
    }

    s.close();
    pw.close();
  }
}
