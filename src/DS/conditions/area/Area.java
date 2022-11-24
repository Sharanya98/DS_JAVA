package DS.conditions.area;

import java.util.Scanner;


public class Area {

    final double PI = Math.PI;
    double radius;
    int horizontal;
    int verticle;



    public void areaCicle(double radius) {
        this.radius = radius;
        System.out.println("Area of Circle is " + String.format("%.3f", PI * radius * radius));
    }

    public void areaEquTriangle(int base){
        this.horizontal = base;
        System.out.println("Area of Equilateral Triangle " +  String.format("%.3f", (Math.sqrt(3)*Math.pow(horizontal,2))/4));
    }

    public int areabh(int length,int breadth){
        this.horizontal = length;
        this.verticle = breadth;
        int result = horizontal * verticle;
        return result;

    }
    public int areaTriRho(int diagonal_1,int diagonal_2){
        this.horizontal = diagonal_1;
        this.verticle = diagonal_2;
        int result = (horizontal * verticle)/2;
        return result;
    }





}
