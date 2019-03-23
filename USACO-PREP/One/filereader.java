import java.io.*;
import java.util.*;
public class filereader {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new FileReader("FamilyNames.in"));
		PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("FamilyNames.out")));

		for(int i = 0; i < 3 ; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String firstname  = st.nextToken("/");
			String lastname = st.nextToken("/");
			pw.println("Lastname: " + lastname + " Firstname: " + firstname);
		}

		pw.close();
		br.close();
	}
}
