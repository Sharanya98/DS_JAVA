package DS.conditions;

import java.util.Scanner;

public class fibo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t1 =0;
        int t2 =1;
        int temp;

        System.out.println("enter the terms upto which you want fibonacci series");
        int Terms = sc.nextInt();
        System.out.print(t1+" ");
        System.out.print(t2+" ");
        for (int i =0;i<Terms-2;i++){
            temp = t1+t2;
            t1=t2;
            t2=temp;
            System.out.print(temp+" ");
        }
    }
}
