import java.util.Scanner;
import java.util.HashSet;

public class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        HashSet<Integer> remainder = new HashSet();
        
        for(int i = 0; i < 10; i++){
            int num = s.nextInt();
            remainder.add(num % 42);
        }
        
        System.out.println(remainder.size());
    }
}