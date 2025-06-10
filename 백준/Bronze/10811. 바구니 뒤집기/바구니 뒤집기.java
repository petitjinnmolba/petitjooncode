import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        
        int N = s.nextInt();
        int M = s.nextInt();
        
        int[] baskets = new int[N];
        for(int i = 0; i < N; i++){
            baskets[i] = i + 1;
        }
        
        for(int m = 0; m < M; m++){
            int i = s.nextInt() - 1;
            int j = s.nextInt() - 1;
            
            while(i < j){
                int t = baskets[i];
                baskets[i] = baskets[j];
                baskets[j] = t;
                i++;
                j--;
            }
        }
        
        for(int num : baskets){
            System.out.print(num +" ");
        }
    }
}