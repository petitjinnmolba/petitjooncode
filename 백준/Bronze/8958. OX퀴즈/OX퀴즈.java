import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        
        int test = s.nextInt();
        s.nextLine();
        
        for (int i = 0; i <test; i++){
            String input = s.nextLine();
            int streak = 0;
            int score = 0;
            
            for (int a = 0; a < input.length(); a++){
                if (input.charAt(a) == 'O'){
                    streak++;
                    score += streak;
                }else {
                    streak = 0;
                }
            }
            System.out.println(score);
        }
    }
}