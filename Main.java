import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        int x,y,z;
         x = 5;
         y = 6;
         z =7;
         System.out.println("first number is "+x);
         System.out.println("second number is "+y);
         System.out.println("thrird number is "+z);
         System.out.println(x+y+z);
         System.out.println(y+10);
         System.out.println("sum of third number is"+(x+y+z));
         y = y+10;
         System.out.println("the value of x is" +y);


        System.out.println("Hello world!");
        Scanner sc = new Scanner(System.in);
        int num_1,num_2,num_3;
        num_1 = sc.nextInt();
        System.out.println("enter the first number");

        System.out.println("first number is");
        System.out.println(num_1);

        num_2 = sc.nextInt();

    }
}