import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner s= new Scanner(System.in);
        String word = s.nextLine();
        
        String[] croatian = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
        
        for (String str : croatian){
            word = word.replace(str, "*");
        }
        System.out.println(word.length());
    }
}