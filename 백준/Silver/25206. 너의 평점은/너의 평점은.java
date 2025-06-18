import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.HashMap;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        HashMap<String, Double> gradeMap = new HashMap<>();
        
        gradeMap.put("A+", 4.5);
        gradeMap.put("A0", 4.0);
        gradeMap.put("B+", 3.5);
        gradeMap.put("B0", 3.0);
        gradeMap.put("C+", 2.5);
        gradeMap.put("C0", 2.0);
        gradeMap.put("D+", 1.5);
        gradeMap.put("D0", 1.0);
        gradeMap.put("F", 0.0);
        
        double totalScore = 0.0;
        double totalCredit = 0.0;
        
        for (int i = 0; i < 20; i++){
            String[] input = br.readLine().split(" ");
            String subject = input[0];
            double credit = Double.parseDouble(input[1]);
            String grade = input[2];

            if (grade.equals("P")) {
                continue;
            }

            double gradePoint = gradeMap.get(grade);
            totalScore += credit * gradePoint;
            totalCredit += credit;
        }

        double majorGPA = totalScore / totalCredit;
        System.out.printf("%.6f\n", majorGPA);
    }
}