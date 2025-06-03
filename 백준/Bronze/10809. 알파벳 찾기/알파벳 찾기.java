import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        String x = s.nextLine();
        
        int[] ab = new int[26];
        
        for (int i =0; i <26; i++){
            ab[i] = -1;
        }
        
        for (int i =0; i <x.length(); i++){
            char ch = x.charAt(i);
            int index = ch - 'a';
            if (ab[index] == -1){
                ab[index] = i;
            }
        }
        
        for (int i = 0; i <26; i++){
            System.out.print(ab[i] + " ");
        }
    }
}