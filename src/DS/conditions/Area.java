package DS.conditions;

import java.util.Scanner;


public class Area {
    public static void main(String[] args) {

        final double PI = Math.PI;
        Scanner sc = new Scanner(System.in);
        System.out.println("please input radius");
        double radius = sc.nextDouble();
        System.out.println("Area of circel is " + String.format("%.3f",PI * radius * radius));
    }
}
