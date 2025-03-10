package Laba2;

import java.util.Scanner;

public class num8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число a: ");
        int a = sc.nextInt();

        System.out.println("Введите число b: ");
        int b = sc.nextInt();

        if (a == 0)
            if (b == 0) {
            System.out.println("INF");
        } else {
            System.out.println("NO");
        } else if (b % a == 0) {
            int x = -b / a;
            System.out.println(x);
        } else {
            System.out.println("NO");
        }


    }
}
