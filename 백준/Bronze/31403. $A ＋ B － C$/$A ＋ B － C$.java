import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        
        int A = s.nextInt();
        int B = s.nextInt();
        int C = s.nextInt();
        
        int result1 = A + B - C;
        System.out.println(result1);
        
        String strab = String.valueOf(A) + String.valueOf(B);
        int result2 = Integer.parseInt(strab) - C;
        System.out.println(result2);
    }
}