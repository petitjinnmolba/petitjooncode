import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner s= new Scanner(System.in);
        int N = s.nextInt();
        String numbers = s.next();
        
        int sum = 0;
        
        for(int i = 0; i<N; i++){
            sum += numbers.charAt(i) -'0';
        }
        
        System.out.println(sum);
    }
}