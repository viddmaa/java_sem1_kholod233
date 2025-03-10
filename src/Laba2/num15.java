package Laba2;

import java.util.Scanner;

public class num15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите стоимость товара (сначала рубли, затем копейки): ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int e = a * 100 + b;

        System.out.println("Введите число вашей оплаты (сначала рубли, затем копейки): ");
        int c = sc.nextInt();
        int d = sc.nextInt();
        int f = c * 100 + d;

        if (f >= e) {
            int change = f - e;
            int rub = change / 100;
            int kop = change % 100;
            System.out.println("Сдача: " + rub + " руб. " + kop + "коп.");
        } else {
            System.out.println("Ошибка: не хватает денег на оплату товара");
        }

    }
}
