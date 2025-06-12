import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        int time = 0;

        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);

            if ("ABC".indexOf(ch) != -1) {
                time += 3;
            } else if ("DEF".indexOf(ch) != -1) {
                time += 4;
            } else if ("GHI".indexOf(ch) != -1) {
                time += 5;
            } else if ("JKL".indexOf(ch) != -1) {
                time += 6;
            } else if ("MNO".indexOf(ch) != -1) {
                time += 7;
            } else if ("PQRS".indexOf(ch) != -1) {
                time += 8;
            } else if ("TUV".indexOf(ch) != -1) {
                time += 9;
            } else if ("WXYZ".indexOf(ch) != -1) {
                time += 10;
            }
        }

        System.out.println(time);
    }
}
