package DS.conditions;

import java.util.Scanner;

public class ElectricityBill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double money;
        System.out.println("enter the number of units");
        int unit = sc.nextInt();

        if(unit <=100){
            money = unit * 1.2;
        }
        else if( unit>100 && unit <300){
            money = 100*1.20 +(unit -100)*2;
        }
        else{
            money = 100*1.20+200*2+(unit-300)*3;
        }
        System.out.println("total money :" + money);
    }
}
