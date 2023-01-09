package conditionals;

import java.util.Scanner;

public class PercentageCalculater {
    static void Calculator(){
        Scanner sc = new Scanner(System.in);
        int score;
        System.out.println("enter the score");
        score =sc.nextInt();
        if(score>90) {
            System.out.println("Excellent");
        } else if (score>80) {
            System.out.println("very good");

        } else if (score>70) {
            System.out.println("good");


        } else if (score>60) {
            System.out.println("can do better");

        }

    }
    public static void main(String args[]){

    }
}
