package conditionals;

import java.util.Scanner;

public class nestedIf {
    static void Nested(){
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        n = sc.nextInt();
        if(n%5==0 || n%3==0){
          if(n%15 != 0){
              System.out.println("the number is not divisible by 15");
          }  else{
              System.out.println("number is  divisble by 5 or 3 and  divisible by 15");
          }
        }else{
            System.out.println("not");
        }
    }
    public static void main(String[] args) {
Nested();
    }
}
