package DS.conditions;

import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        System.out.println("enter number");
        while ((num = sc.nextInt()) != 0) {
            System.out.println("enter number");
            if(num > max){
                max=num;
            }
            if(num < min){
                min = num;
            }
        }
        System.out.println("Largest number: " + max);
        System.out.println("Smallest number: " + min);
    }
}
