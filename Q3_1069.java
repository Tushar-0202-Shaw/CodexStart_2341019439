/*
Name :- Tushar Shaw
Regd No. :- 2341019439
Linl :- https://cses.fi/problemset/task/1069
    */
import java.util.Scanner;
public class Q3_1069{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int result = count(str);
        System.out.println(result);
    }
    public static int count(String str) {
        int max_Repetition = 0;
        int current_Repetition = 1;
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == str.charAt(i - 1)) {
                current_Repetition++;
            } else {
                max_Repetition = Math.max(max_Repetition, current_Repetition);
                current_Repetition = 1;
            }
        }
        max_Repetition = Math.max(max_Repetition, current_Repetition);
        return max_Repetition;
    }
}
