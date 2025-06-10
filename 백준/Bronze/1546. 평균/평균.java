import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner s= new Scanner(System.in);
        
        int N = s.nextInt();
        double[] scores = new double[N];
        
        double max = 0;
        for(int i = 0; i < N; i++){
            scores[i] = s.nextDouble();
            if (scores[i] > max){
                max = scores[i];
            }
        }
        
        double sum = 0;
        for(int i =0; i <N; i++){
            sum += (scores[i] / max) * 100;
        }
        
        double average = sum / N;
        System.out.println(average);
    }
}