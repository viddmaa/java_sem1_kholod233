package Laba2;

import java.util.Scanner;

public class num7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число поездок: ");
        int n = sc.nextInt();
        int ticket1 = 0, ticket5 = 0, ticket10 = 0, ticket20 = 0, ticket60 = 0;

        while (n > 0) {
            if (n >=60) {
                ticket60++;
                n -= 60;
            } else if (n >= 20) {
                ticket20++;
                n -= 20;
            } else if (n >= 10) {
                ticket10++;
                n -= 10;
            } else if (n >= 5) {
                ticket5++;
                n -= 5;
            } else if (n >= 1) {
                ticket1++;
                n -= 1;
            }
        }
        System.out.println(ticket1 + " " + ticket5 + " " + ticket10 + " " + ticket20 + " " + ticket60 + " ");


    }
}
