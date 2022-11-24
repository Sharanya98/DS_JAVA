package DS.conditions;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num, sum = 0;
        System.out.println("enter number");
        while ((num = sc.nextInt()) != 0) {
            System.out.println("enter number");
            sum += num;
        }
        System.out.println("sum: " + sum);
    }
}
