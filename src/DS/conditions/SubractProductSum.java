package DS.conditions;

import java.util.Scanner;

public class SubractProductSum {
    public static void main(String[] args) {
        System.out.println("Input number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int prod=1;
        int sum=0;
        int n1;
        //first approach
//        while(n>0){
//            n1=n%10;
//            n=n/10;
//            prod *= n1; //
//            sum+= n1;
//        }

//        modified approach - for same n1 variable used prod and sum.No of kines reduced
//        time complexity : log(n)10-cz value of n is becoming 1/10 every iteration
//        space complexity :
        while(n>0){
            prod *=n%10;
            sum+=n%10;
            n=n/10;
        }
        System.out.println(prod-sum);




    }
}
