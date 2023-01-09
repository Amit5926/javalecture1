package BasicOfJava;

import java.util.Scanner;

public class CalculatePercentage{
    static void Calculate(){
        double num_1,num_2,num_3,num_4,num_5;
        Scanner sc = new Scanner(System.in);
        num_1 = sc.nextDouble();
        System.out.println("first subject number is"+num_1);
        num_2 = sc.nextDouble();
        System.out.println("second number is "+num_2);
        num_3 = sc.nextDouble();
        System.out.println("3rd subject number is"+num_3);
        num_4 = sc.nextDouble();
        System.out.println("4th subject number is "+num_4);
        num_5 = sc.nextDouble();
        System.out.println("5th subject number is"+num_5);
        double number = (num_1+ num_2+ num_3+num_4+num_5)/2;
        System.out.println("\nSTudent percentage of "+number);

    }
    public static void main(String args[]){
        Calculate();
    }
}
