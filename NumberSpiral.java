import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class NumberSpiral {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine()); //Length of Array
        for (int i = 0; i < num; i++) {
            String s = br.readLine(); //Input the number seperated by space
            String[] s1 = s.split(" ");
            long a = Long.parseLong(s1[0]);
            long b = Long.parseLong(s1[1]);
            System.out.println(fun(a, b));
        }
//        Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
//        int n = in.nextInt();
//        while (n-->0){
//            long x = in.nextLong();
//            long y = in.nextLong();
//            System.out.println(fun(x,y));
//        }
    }
    private static long fun(long a, long b) {
        long ans = 0;
        long max = Math.max(a, b);
        long min = Math.min(a, b);
        boolean up = max % 2 == 0;
        if (up) {
            if (a >= b) {
                ans = (max) * (max);
                ans = ans - min + 1;
            } else {
                ans = (max - 1) * (max - 1);
                ans += min;
            }
        } else {
            if (a <=b) {
                ans = (max) * (max);
                ans = ans - min + 1;
            } else {
                ans = (max - 1) * (max - 1);
                ans += min;
            }
        }
        return ans;

    }
}
