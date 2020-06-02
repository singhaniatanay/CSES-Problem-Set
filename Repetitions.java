import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Repetitions {
    public static void main(String[] args) {
        Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        char[] inp = in.next().toCharArray();
        char prev = ' ';
        int count = 0;
        int max_count =0;
        for(char i:inp){
            if(prev==' '){
                prev = i;
                count = 1;
                continue;
            }
            if(prev==i){
                count++;
            }else{
                max_count = Math.max(count,max_count);
                prev = i;
                count = 1;
            }
        }
        max_count = Math.max(count,max_count);
        System.out.println(max_count);
    }
}
