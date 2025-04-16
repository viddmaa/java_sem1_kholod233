package Laba7;

import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        ArrayList<Product> cart = new ArrayList<>();
        Random random = new Random();

        int numberOfProducts = 10;
        for (int i = 0; i < numberOfProducts; i++) {
            // Случайная стоимость
            double cost = 1 + random.nextDouble() * (15000 - 1);
            // Случайный вес
            double weight = 0.1 + random.nextDouble() * (10 - 0.1);
            // случайное название
            ProductName[] names = ProductName.values();
            ProductName randomName = names[random.nextInt(names.length)];

            Product newProduct = new Product(randomName.toString(), weight, cost);

            if (!cart.contains(newProduct)) {
                cart.add(newProduct);
            }
        }

        cart.removeIf(p -> p.getWeight() > 5 || p.getCost() > 10000);
        Product favorite = new Product("Apple", 1.0, 9.99);
        cart.remove(favorite);
        cart.add(0, favorite);


        System.out.println("Корзина продуктов:");
        for (Product p : cart) {
            System.out.println(p);
        }

        System.out.println("\nПродукты со стоимостью < 10 и весом > 2:");
        for (Product p : cart) {
            if (p.getCost() < 10 && p.getWeight() > 2) {
                System.out.println(p);
            }
        }
    }
}
