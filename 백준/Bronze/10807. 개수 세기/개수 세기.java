import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        
        int N = s.nextInt();
        int[] number = new int[N];
        
        for (int i = 0; i < N; i++){
            number[i] = s.nextInt();
            
        }
        
        int V = s.nextInt();
        int count = 0;
        
        for(int i = 0; i <N; i++){
            if (number[i] == V){
                count++;
            }
        }
        System.out.println(count);
    }
}