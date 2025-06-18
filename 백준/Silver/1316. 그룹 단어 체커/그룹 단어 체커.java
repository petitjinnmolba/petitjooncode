import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        
        int N = s.nextInt();
        int count = 0;
        
        for (int i = 0; i < N; i++){
            String word = s.next();
            if (isGroupWord(word)){
                count++;
            }
        }
        
        System.out.println(count);
        s.close();
    }
    
    public static boolean isGroupWord(String word){
        boolean[] seen = new boolean[26];
        char prev = 0;
        
        for (int i = 0; i < word.length(); i++){
            char curr = word.charAt(i);
            
            if (curr != prev){
                if (seen[curr - 'a']){
                    return false;
                }
                seen[curr - 'a'] = true;
            }
            prev = curr;
        }
        return true;
    }
}