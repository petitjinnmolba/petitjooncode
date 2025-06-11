import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        
        String A = s.next();
        String B = s.next();
        
        String reA = new StringBuilder(A).reverse().toString();
        String reB = new StringBuilder(B).reverse().toString();
        
        int numA = Integer.parseInt(reA);
        int numB = Integer.parseInt(reB);
        
        System.out.println(Math.max(numA, numB));
        
        
    }
}