import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        
        if ((N % 4 == 0 && N % 100 != 0)|| N % 400 == 0){
            System.out.println("1");
        }else{
            System.out.println("0");
        }
        
        s.close();
    
    
    }
}