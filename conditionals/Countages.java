package conditionals;

import java.util.Scanner;

class Countages {

    static void Count(){
        int ram,shyam,ajay;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the age of ram");
        ram = sc.nextInt();
        System.out.println("enter the age of shyam");
        shyam = sc.nextInt();
        System.out.println("enter the age of ajay");
        ajay = sc.nextInt();
        if(ram>shyam && ram>ajay){
            System.out.println("ram age is greatest shym and ram");
        } else if (shyam>ram && shyam>ajay) {
            System.out.println("shyam age is gereatest than ram and ajay");

        } else if (ajay>ram && ajay>shyam) {
            System.out.println("ajay age is greatest than ram and shyam");

        }

    }
    public static void main (String args[]){
    Count();
    }
}
