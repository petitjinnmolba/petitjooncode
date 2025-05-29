import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        
        int T = s.nextInt();
        
        for(int t = 0; t < T; t++){
            int h = s.nextInt();
            int w = s.nextInt();
            int n = s.nextInt();
            
            int floor = n % h;
            int room = n / h;
            
            if (floor == 0){
                floor = h;
                
            } else {
                room += 1;
            }
            System.out.printf("%d%02d\n", floor, room);
        }
    }
}