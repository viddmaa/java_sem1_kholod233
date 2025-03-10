package Laba2;

import java.util.Scanner;

public class num2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите количество долларов: ");
        double dollars = scanner.nextDouble();

        double pounds = dollars / 1.487;
        double franks = dollars / 0.172;
        double marks = dollars / 0.584;
        double yen = dollars / 0.00955;

        System.out.print("Вы получите: ");
        System.out.print(pounds + " фунта, ");
        System.out.print(franks + " франков, ");
        System.out.print(marks + " немецкой марки, ");
        System.out.print(yen + " йен. ");

    }
}
