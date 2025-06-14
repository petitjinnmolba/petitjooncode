import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner s= new Scanner(System.in);
        int N = s.nextInt();
        
        for (int i = 1; i <= N; i++){
            printSpaces(N - i);
            printStars(2 * i - 1);
            System.out.println();
        }
        
        for (int i = N - 1; i >= 1; i--){
            printSpaces(N - i);
            printStars(2 * i - 1);
            System.out.println();
        }
    }
    
    private static void printSpaces(int count){
        for (int i = 0; i < count; i++){
            System.out.print(" ");
        }    
    }
    private static void printStars(int count){
        for (int i = 0; i < count; i++){
            System.out.print("*");
        }
    }
}