import java.util.*;
public class CostumeParty {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int max = s.nextInt();
        int count = 0;
        int limit = 0;
        int[] cows = new int[n];
        for(int i = 0; i < n; i++){
            cows[i] = s.nextInt();
        }
        Arrays.sort(cows);

        for(int i = 0 ; i < n; i++){
            limit = max - cows[i];
            for(int j = i + 1; j < n; j++){
                if(cows[j] <= limit){
                    count++;
                } else {
                    count = count;
                }
            }

        }
        System.out.println(count);
        
        s.close();
    }
}
