package BasicOfJava;

import java.util.Scanner;

public class ProfitLoss {
    static void Input() {


        int profit, loss, sellingprize, lossprize;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the cost prize is");
        int costprize = sc.nextInt();
        System.out.println("enter the sell prize is");
        sellingprize = sc.nextInt();
        if(costprize>sellingprize){
            loss = costprize - sellingprize;
            System.out.println("loss amount is"+loss);
        } else if (sellingprize>costprize) {
            profit = sellingprize-costprize;
            System.out.println("profit of selling product is"+profit);
        }
    }
    public static void main(String[] args) {
        Input();

    }
}

