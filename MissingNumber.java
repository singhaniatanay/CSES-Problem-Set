import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class MissingNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        long i = (long)in.nextInt();
        long sum = (i * (i+1))/2;
        for(long j=1;j<i;j++){
            sum -= in.nextInt();
        }
        System.out.println(sum);
    }
}
