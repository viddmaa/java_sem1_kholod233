package Laba2;

import java.util.Scanner;

public class num14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число x: ");
        int x = sc.nextInt();

        if (x > 0) {
            System.out.println("1");
        } else if (x < 0) {
            System.out.println("-1");
        } else if (x == 0) {
            System.out.println("0");
        }
    }
}
