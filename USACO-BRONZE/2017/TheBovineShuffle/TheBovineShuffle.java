import java.io.*;
import java.util.*;
/* public class TheBovineShuffle {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new FileReader("2.in"));
    PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("bShuffle.out")));

    StringTokenizer st = new StringTokenizer(br.readLine());
    int n = Integer.parseInt(st.nextToken());
    ArrayList<Integer> cows = new ArrayList<Integer>(n);
    ArrayList<Integer> codes = new ArrayList<Integer>(n);
    st = new StringTokenizer(br.readLine());
    for(int i = 0; i < n ; i++){
      cows.add(Integer.parseInt(st.nextToken()));
    }
    st = new StringTokenizer(br.readLine());
    for(int j = 0; j < n; j++){
      codes.add(Integer.parseInt(st.nextToken()));

    }

    for(int x = 1; x <= n; x++){
      pw.print(codes.get(cows.indexOf(x)) + "\n");
    }

    //pw.println(cows);
    //pw.println(codes);


    pw.close();
    br.close();
  }
}
*/
import java.util.*;
import java.io.*;

public class TheBovineShuffle {

	public static void main(String[] args) throws Exception {

		// Read the grid.
		Scanner stdin = new Scanner(new File("1.in"));
    PrintWriter out = new PrintWriter(new FileWriter("TheBovineShuffle.out"));

		// Read in perm backwards.
		int n = stdin.nextInt();
		int[] perm = new int[n];
		for (int i=0; i<n; i++) {
			int pos = stdin.nextInt();
			perm[i] = pos-1;
      out.println(perm[i]);

		}
   out.println("===============");
   
		// How we want to shuffle the input.
		int[] finalperm = new int[n];
		for (int i=0; i<n; i++){
      finalperm[i] = perm[perm[perm[i]]];
      out.println(finalperm[i]);

    }
   out.println("===============");

		// Get ending cows.
		int[] ID = new int[n];
		for (int i=0; i<n; i++)
			ID[i] = stdin.nextInt();

		// Ta da!
		//PrintWriter out = new PrintWriter(new FileWriter("TheBovineShuffle.out"));
		for (int i=0; i<n; i++)
			out.println(ID[finalperm[i]]);
		out.close();
		stdin.close();
	}
}
