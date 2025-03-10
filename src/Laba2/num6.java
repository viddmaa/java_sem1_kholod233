package Laba2;

import java.util.Scanner;

public class num6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        if (a % 2 == 0) {
            System.out.println("ДА");
        } else {
            System.out.println("НЕТ");
        }
    }
}
