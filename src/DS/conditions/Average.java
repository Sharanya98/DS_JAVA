package DS.conditions;

import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        float avg = 0;
        System.out.println("enter the number of terms");
        int term = sc.nextInt();

        for (int i = 1; i <= term; i++) {
            avg= (term*(term + 1))/2;
//            avg = sum/term;
        }
        System.out.println("Avergage: "+avg);
    }
}
