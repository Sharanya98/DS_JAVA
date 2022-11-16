package DS.conditions;

import java.util.Scanner;


public class Area {

    final double PI = Math.PI;
    double radius;
    int base;
    int height;
    int length;
    int diagonal_1;
    int diagonal_2;


    public void areaCicle(int radiuss) {
        this.radius = radiuss;
        System.out.println("Area of Circle is " + String.format("%.3f", PI * radius * radius));
    }
    public void areaTriangle(int base,int height){
        System.out.println("Area of Triangle " + base *height/2);
    }
    public void areaEquTriangle(int base){
        this.base = base;
        System.out.println("Area of Equilateral Triangle " +  String.format("%.3f", (Math.sqrt(3)*Math.pow(base,2))/4));
    }

    public void areaRectangle(int length,int breadth){
        this.length = length;
        this.height = breadth;
        System.out.println("Area of Reactangle " + length * height);
    }

    public void areaParellogram(int base,int height){
        this.base = base;
        this.height =height;
        System.out.println("Area of parellogram " + base *height);
    }

    public void areaRhombus(int diagonal_1,int diagonal_2){
        this.diagonal_1 = diagonal_1;
        this.diagonal_2 = diagonal_2;
        System.out.println("Area of rhombus " +   (diagonal_1 * diagonal_2)/2);
    }





}
