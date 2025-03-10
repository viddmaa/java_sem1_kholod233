package Laba2;

import java.util.Scanner;

public class num4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите начальный вклад: ");
        double initialcontribution = scanner.nextDouble();

        System.out.println("Введите число лет: ");
        int numofyears = scanner.nextInt();

        System.out.println("Введите процентную ставку: ");
        double rate = scanner.nextDouble();

        double answer = initialcontribution;
        for (int i = 0; i < numofyears; i++) {
            answer +=  answer * (rate / 100);
        }

        System.out.println("В конце первого года вы получите: " + answer);
    }
}
