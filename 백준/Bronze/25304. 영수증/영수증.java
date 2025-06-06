import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        
        int x = s.nextInt();
        int n = s.nextInt();
        
        int total = 0;
        
        for (int i = 0; i < n; i++){
            int a = s.nextInt();
            int b = s.nextInt();
            total += a * b;
        }
        
        if (total == x){
            System.out.println("Yes");
            
        }else {
            System.out.println("No");
        }
        
    }
}