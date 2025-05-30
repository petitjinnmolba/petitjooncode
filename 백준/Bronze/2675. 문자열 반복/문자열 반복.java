import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int T = s.nextInt();
        
        for(int i = 0; i < T; i++){
            int R = s.nextInt();
            String S = s.next();
            
            StringBuilder sb = new StringBuilder();
            
            for(int a = 0; a < S.length(); a++){
                char ch = S.charAt(a);
                for (int b = 0; b < R; b++){
                    sb.append(ch);
                }
            }
            System.out.println(sb.toString());
        }
    }
}