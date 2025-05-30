import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        
        int A = s.nextInt();
        int B = s.nextInt();
        int C = s.nextInt();
        
        int result = A * B * C;
        
        int[] count = new int[10];
        
        String str = String.valueOf(result);
        for (int i = 0; i < str.length(); i++){
            int digit = str.charAt(i) - '0';
            count[digit]++;
        }
        
        for (int i = 0; i <10; i++){
            System.out.println(count[i]);
        }
        
    }
}