package Laba2;

import java.util.Scanner;

public class num16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        boolean buy = false;
        for (int i = 0; i * 3 <= k; i++) {
            for (int j = 0; j * 5 <= k; j++) {
                if (i * 3 + j * 5 == k) {
                    buy = true;
                    break;
                }
            }
        }
        if (buy) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
