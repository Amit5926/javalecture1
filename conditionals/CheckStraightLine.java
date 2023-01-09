package conditionals;
import java.util.Scanner;
public class CheckStraightLine {
    static void Line(){
//        Scanner sc = new Scanner(System.in);
//        double x1,x2,y1,y2,y3,x3;
//        System.out.println("enter the x1 value");
//        x1 = sc.nextInt();
        double x1,x2,x3,y1,y2,y3;
        Scanner sc = new Scanner(System.in);
        System.out.println("ente the first x1 value in strign line");
        x1 = sc.nextInt();
        System.out.println("enter the seconde x2 value in straight line");
        x2= sc.nextInt();
        System.out.println("enter the 3rd value of x3 is");
        x3 = sc.nextInt();
        System.out.println("enter the cordinate value of y1 is");
        y1 = sc.nextInt();
        System.out.println("enter the cordinate value of y2 is");
        y2 = sc.nextInt();
        System.out.println("enter the third value of  y3 is");
        y3 = sc.nextInt();
        double m1,m2;
        m1 =(y2-y1)/(x2-x1);
        m2 = (y3-y2)/(x3-x2);
        if (m1==m2)             {
            System.out.println("the three points lie on a single line");
        }else{
            System.out.println("not a straight line ");
        }


    }


    public static void main(String[] args) {
       Line();
}
}
