import java.io.*;
import java.util.*;
public class cowPals {
  public static void main(String[] args) throws IOException {
    Scanner stdin = new Scanner(System.in);
  //PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("cowpals.out")));

    //StringTokenizer st = new StringTokenizer(br.readLine());
    int S = stdin.nextInt();
    Vector<Integer> divisors1 = new Vector<Integer>();
    Vector<Integer> divisors2 = new Vector<Integer>();
    int sum = 0;
    int sum2 = 0;

    int i = S;
    int length = 0;
    while(true){
      for(int j = 1; j < i; j++){
        if(i % j == 0 && j != i){
          divisors1.add(j);
          sum+=j;
        }
      }
      for(int x = 1; x < sum; x++){
        if(sum % x == 0 && x != sum2){
          divisors2.add(x);
          sum2+=x;
        }
      }
      if(sum2 == i){
        break;
      } else {
        for(int f = 0; f < divisors1.size() ; f++){
          divisors1.remove(f);
        }
        for(int f = 0; f < divisors2.size() ; f++){
          divisors2.remove(f);
        }

        sum = 0;
        sum2 = 0;

        i++;
      }
    }


    System.out.print(sum2);
    System.out.print(" ");
    System.out.print(sum);
    stdin.close();
  }
}
