package DS.conditions;

import java.util.ArrayList;
import java.util.Scanner;

public class Factor {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
       ArrayList<Integer> a = new ArrayList<Integer>();
        System.out.println("Input a number");
        int num = sc.nextInt();
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                a.add(i);
            }
        }
        System.out.println("factors: "+a);
    }
}
