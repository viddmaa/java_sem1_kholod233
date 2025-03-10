package Laba2;

import java.util.Scanner;

public class num11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число a: ");
        int a = sc.nextInt();
        System.out.println("Введите число b: ");
        int b = sc.nextInt();

        for (int i = a; i <= b; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
