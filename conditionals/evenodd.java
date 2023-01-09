package conditionals;

import java.util.Scanner;


public class evenodd {
    static void TakingInput() {
        int b;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        b = sc.nextInt();
        if (b % 2 == 0) {
            System.out.println("this number is divisible by 5");

        } else if (b % 2!= 0) {
            System.out.println("nubmre is not divisible by 5");

        }
    }
    static void LeapYear(){
        Scanner sc = new Scanner(System.in);
        int a;
        System.out.println("enter the year");
        a = sc.nextInt();
        if(a%4==0){
            System.out.println("this year is leap year");

        } else if (a%4!=0) {
            System.out.println("not a leap year");
            
        }

    }
    static void Absolutevalue(){
        Scanner sc = new Scanner(System.in);
        int value;
        System.out.println("enter the value");
        value = sc.nextInt();
        if(value<0){
            value = value*(-1);
            System.out.println("absalute valute is "+value);

        }System.out.println("absolute value is"+value);


    }

    public static void main(String args[]) {
        Absolutevalue();
//        LeapYear();

//        TakingInput();
//        Scanner amit = new Scanner(System.in);
//        int a;
    }
}