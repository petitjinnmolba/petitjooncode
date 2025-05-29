import java.util.*;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        
        int n = s.nextInt();
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        
        for (int i = 0; i < n; i++){
            int num = s.nextInt();
            
            if (num < min) min = num;
            if (num > max) max = num;
        }
        
        System.out.println(min + " " + max);
    }
}