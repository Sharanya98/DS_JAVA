package DS.conditions;

import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("enter number");
        while ((num = sc.nextInt()) != 0) {
            int temp =num;
            System.out.println("enter number");
            if(num > temp){
                temp=num;
                System.out.println("*");
            }
        }
        System.out.println("Largest number: " + num);
    }
}
