package BasicOfJava;

import java.util.Scanner;

public class SumOfTwoNumber {
  static   void  Sum(){
        Scanner sc = new Scanner(System.in);
        double a,b,c;
         a = sc.nextInt();
         System.out.println( "first number is\n"+a);
         b = sc.nextInt();
         System.out.println("second number is\n"+b);

         c = (a+b)/2;
         System.out.println("sum of two number is\n"+c);


    }
    public static void main(String[]args){
        Sum();

    }
}
