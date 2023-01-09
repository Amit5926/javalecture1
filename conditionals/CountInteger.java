package conditionals;

import java.util.Scanner;

public class CountInteger  {
    static void Number() {
        int Nm;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the integer value");
        Nm = sc.nextInt();

        if (Nm > 9 && Nm < 100) {
            System.out.println("this number is 2 dighit" + Nm);
        } else {
            System.out.println("this nubmer is not 2 digit");
        }
    }

    public static void main(String args[]){
        Number();

    }
}
