import java.io.*;
import java.util.*;
public class ContaminatedMilk {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new FileReader("1.in"));
    PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("cMilk.out")));
    StringTokenizer st = new StringTokenizer(br.readLine());
    // Variables
    int N = Integer.parseInt(st.nextToken());
    int M = Integer.parseInt(st.nextToken());
    int D = Integer.parseInt(st.nextToken());
    int S = Integer.parseInt(st.nextToken());
    ArrayList<Integer> people = new ArrayList<Integer>(D);
    ArrayList<Integer> milk = new ArrayList<Integer>(D);
    ArrayList<Integer> times = new ArrayList<Integer>(D);
    ArrayList<Integer> sPeople = new ArrayList<Integer>(S);
    ArrayList<Integer> sTimes = new ArrayList<Integer>(S);
      Vector<Integer> sick = new Vector<Integer>();

    // Filling in arrays
    for(int i = 0 ; i < D ; i++){
      st = new StringTokenizer(br.readLine());
      people.add(Integer.parseInt(st.nextToken()));
      milk.add(Integer.parseInt(st.nextToken()));
      times.add(Integer.parseInt(st.nextToken()));

    }

    for(int i = 0 ; i < S ; i++){
      st = new StringTokenizer(br.readLine());
      sPeople.add(Integer.parseInt(st.nextToken()));
      sTimes.add(Integer.parseInt(st.nextToken()));

    }

    for(int i = 0 ; i < D ; i++){
      if(sPeople.indexOf(people.get(i)) != -1){
        sick.add(people.get(i));
      }
    }

    pw.println(sick);







    pw.close();
    br.close();

  }
}
