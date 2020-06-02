import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Weird_Algorithm {
    public static void main(String[] args) {
        Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        long t = (long)(in.nextInt());
        System.out.print(t + " ");
        while(t!=1){
            if(t%2==0){
                t /=2;
            }else{
                t = 3*t +1;
            }
            System.out.print(t+ " ");
        }
    }
}
