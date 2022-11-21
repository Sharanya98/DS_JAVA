package DS.conditions;

import java.util.Scanner;

public class Master {
    public static void main(String[] args) {

        int b;
        int h;
        int result;

        Area obj = new Area();
        System.out.println("select the number for which you want to find area of :-");
        System.out.println("1.circle");
        System.out.println("2.Triangle");
        System.out.println("3.Euilateral Triangle");
        System.out.println("4.Reactangle");
        System.out.println("5.Parellelogram");
        System.out.println("6.Rhombus");

        Scanner sc = new Scanner(System.in);
        byte selected = sc.nextByte();
        switch(selected){
            case 1 -> {
                System.out.println("please provide radius");
                double r = sc.nextDouble();
                obj.areaCicle(r);
            }
            case 2 -> {
                System.out.println("please provide base");
                b = sc.nextInt();
                System.out.println("please provide height");
                h = sc.nextInt();
                result = obj.areaTriRho(b, h);
                System.out.println("Area of Triangle " + result);
            }
            case 3 -> {
                System.out.println("please provide base");
                b = sc.nextInt();
                obj.areaEquTriangle(b);
            }
            case 4 -> {
                System.out.println("please provide length");
                b = sc.nextInt();
                System.out.println("please provide height");
                h = sc.nextInt();
                result = obj.areabh(b, h);
                System.out.println("Area of Reactangle " + result);
            }
            case 5 -> {
                System.out.println("please provide base");
                b = sc.nextInt();
                System.out.println("please provide height");
                h = sc.nextInt();
                result = obj.areabh(b, h);
                System.out.println("Area of parellogram " + result);
            }
            case 6 -> {
                System.out.println("please provide diagonal1");
                b = sc.nextInt();
                System.out.println("please provide diagonal2");
                h = sc.nextInt();
                result = obj.areaTriRho(b, h);
                System.out.println("Area of rhombus " + result );
            }
            default -> System.out.println("please provide valid input");
        }


    }
}
