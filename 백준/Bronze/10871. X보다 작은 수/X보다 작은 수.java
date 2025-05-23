import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int N = s.nextInt(); 
        int X = s.nextInt(); 

        for (int i = 0; i < N; i++){
            int num = s.nextInt();
            
            if(num >=1 && num <=10000 && num < X){
                System.out.println(num + "");
            }
        }
        s.close();
    }
}