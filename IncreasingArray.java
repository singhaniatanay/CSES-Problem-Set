import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class IncreasingArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int n = in.nextInt();
        long prev = -1;
        long turns = 0;
        while (n-->0){
            long curr = in.nextLong();
            if(prev==-1){
                prev = curr;
                continue;
            }
            if(curr>=prev){
                //Do Nothing
            }else{
                turns += (prev - curr);
            }
            prev = Math.max(curr,prev);
        }
        System.out.println(turns);
    }
}
