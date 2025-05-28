import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        
        for (int a = 1; a<=N; a++){
            for (int sp = 1; sp<= N - a; sp++){
                System.out.print(" "); 
            }
            
            for (int b = 1; b <=a; b++){
                System.out.print("*");
            }
            
            System.out.println();
        }
    }
}
