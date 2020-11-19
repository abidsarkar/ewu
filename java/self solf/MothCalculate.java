package Swtch.HowManyMonthleft;

import java.util.Scanner;

public class MothCalculate {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("input the present month number");
        int MonthNumber = input.nextInt();
        int MonthLeft;
        MonthLeft = 12 - MonthNumber ;
        //System.out.println(MonthLeft);
        switch(MonthLeft){
            case 11:
                System.out.println("Current month is January");
                System.out.println("Month left February,march,april,may,jun,july,august,september,October,November,December");
                break;
            case 10:
                System.out.println("Current month is february");
                System.out.println("Month left march,april,may,jun,july,august,september,October,November,December");
                break;
            case 9:
                System.out.println("Current month is March");
                System.out.println("Month left april,may,jun,july,august,september,October,November,December");
            case 8:
                System.out.println("Current month is april");
                System.out.println("Month left may,jun,july,august,september,October,November,December");
                break;
            case 7:
                System.out.println("Current month is may");
                System.out.println("Month left jun,july,august,september,October,November,December");
                break;
            case 6:
                System.out.println("Current month is jun");
                System.out.println("Month left july,august,september,October,November,December");
                break;
            case 5:
                System.out.println("Current month is july");
                System.out.println("Month left august,september,October,November,December");
                break;
            case 4:
                System.out.println("Current month is august");
                System.out.println("Month left september,October,November,December");
                break;
            case 3:
                System.out.println("Current month is September");
                System.out.println("Month left October,November,December");
                break;
            case 2:
                System.out.println("Current month is October");
                System.out.println("Month left November,December");
                break;
            case 1:
                System.out.println("Current month is november");
                System.out.println("Month left December");
                break;
            case 0:
                System.out.println("Current month is December");
                System.out.println("this is the lsat month");
                break;
            default:
                System.out.println("You input a wrong value");


        }
}
}
