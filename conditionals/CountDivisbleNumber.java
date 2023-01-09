package conditionals;

import java.util.Scanner;

public class CountDivisbleNumber {
    static void Number() {
        int number;
        Scanner sc = new Scanner(System.in);
        number = sc.nextInt();
        if (number%5==0 && number%3!=0) {
            System.out.println("number is divible by 5 or 3");
        }
        else{
            System.out.println("not divisible nubmer");

        }
    }
    public static void main(String args[]){
        Number();

    }
}
