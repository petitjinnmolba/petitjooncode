import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        
        int t = s.nextInt();
        s.nextLine();
        
        for(int i = 0; i < t; i++){
            String str = s.nextLine();
            char first = str.charAt(0);
            char last = str.charAt(str.length() - 1);
            System.out.println("" + first + last);
        }
    }
}