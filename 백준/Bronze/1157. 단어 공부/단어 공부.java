import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        String input = s.nextLine().toUpperCase();
        
        int[] alphabetCount = new int[26];
        
        for(char ch : input.toCharArray()){
            if (ch >= 'A' && ch <= 'Z'){
                alphabetCount[ch - 'A']++;
            }
        }
        
        int max = -1;
        char result = '?';
        for (int i = 0; i < 26; i++){
            if (alphabetCount[i] > max){
                max = alphabetCount[i];
                result = (char) (i + 'A');
            } else if (alphabetCount[i] == max){
                result = '?';
            }
        }
        System.out.println(result);
    }
}