import java.util.*;

public class Main{
    public static void main(String[] args){
        int[] correct = {1,1,2,2,2,8};
        Scanner s = new Scanner(System.in);
        int[] input = new int[6];
        
        for (int i = 0; i < 6; i++){
            input[i] = s.nextInt();
        }
        
        for (int i = 0; i < 6; i++){
            System.out.print((correct[i] - input[i]) + " ");
        }
        
    }
}