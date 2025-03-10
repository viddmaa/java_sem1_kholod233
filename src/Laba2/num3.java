package Laba2;

import java.util.Scanner;

public class num3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите градусы по Цельсию: ");
        double c = scanner.nextDouble();
        double f = (c * 9 / 5) + 32;
        System.out.println("Эквивалент по Фаренгейту: " + f);
    }
}
