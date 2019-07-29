import java.util.*;
public class Beats {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int q = s.nextInt();
        int[] beats = new int[n];
        int[] queries = new int[q];
        int[] sortedQueries = new int[q];
        Vector<Integer> v = new Vector<Integer>();
        int beat = 1;
        int sum = 0;

        for(int i = 0; i < n ; i++){
          beats[i] = s.nextInt();
        }
        for(int i = 0 ; i < q ; i++){
          queries[i] = s.nextInt();
        }

        for(int i =  0;  i < q ; i++){
          sortedQueries[i] = queries[i];
        }
        Arrays.sort(sortedQueries);





        System.out.println(v);





    }
}
