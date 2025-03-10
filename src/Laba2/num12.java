package Laba2;

import java.util.Scanner;

public class num12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число a: ");
        int a = sc.nextInt();
        System.out.println("Введите число b: ");
        int b = sc.nextInt();

        if (a > b) {
            System.out.println(a);
        } else {
            System.out.println(b);
        }

    }
}
