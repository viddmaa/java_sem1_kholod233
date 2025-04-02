package Laba6;

import java.util.Arrays;

public class Shop {
    private int numberOfCashes;
    private Product[] products;
    private int numberOfSellers;

    public Shop() {
        this.numberOfCashes = numberOfCashes;
        this.products = new Product[0];
        this.numberOfSellers = 0;
    }

    public Shop(int numberOfCashes, Product[] products, int numberOfSellers) {
        this.numberOfCashes = numberOfCashes;
        this.products = products;
        this.numberOfSellers = numberOfSellers;

    }

    public int getNumberOfCashes() {
        return numberOfCashes;
    }

    public void setNumberOfCashes(int numberOfCashes) {
        this.numberOfCashes = numberOfCashes;
    }

    public Product[] getProducts() {
        return products;
    }

    public void setProducts(Product[] products) {
        this.products = products;
    }

    public int getNumberOfSellers() {
        return numberOfSellers;
    }

    public void setNumberOfSellers(int numberOfSellers) {
        this.numberOfSellers = numberOfSellers;
    }

    public static class Product {
        private String name;
        private double weight;
        private double price;


        public Product() {
            this.name = "";
            this.weight = 0.0;
            this.price = 0.0;
        }

        public Product(String name, double weight, double price) {
            this.name = name;
            this.weight = weight;
            this.price = price;
        }

        public double getWeight() {
            return weight;
        }

        public void setWeight(double weight) {
            this.weight = weight;
        }

        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            this.price = price;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "Product{" +
                    "name='" + name + '\'' +
                    ", weight=" + weight +
                    ", price=" + price +
                    '}';
        }
    }

    // вес
    public double calculateAverageProductWeight() {
        if (products == null || products.length == 0) {
            return 0.0;
        }
        double totalWeight = 0.0;
        for (Product p : products) {
            totalWeight += p.getWeight();
        }
        return totalWeight / products.length;
    }

    // продавцы/кассы
    public double calculateCashEfficiency() {
        if (numberOfCashes == 0) {
            return 0.0;
        }
        return (double) numberOfSellers / numberOfCashes;
    }

    // эффективность магазина = (средний вес товара) / (эффективность кассы), с масштабированием для значения < 1
    public double calculateEfficiency() {
        double avgWeight = calculateAverageProductWeight();
        double cashEff = calculateCashEfficiency();
        if (cashEff == 0) {
            return 0.0;
        }
        double efficiency = avgWeight / cashEff;
        return efficiency < 1 ? efficiency : efficiency / (1 + efficiency);
    }

    @Override
    public String toString() {
        return "Shop{" +
                "numberOfCashes=" + numberOfCashes +
                ", numberOfSellers=" + numberOfSellers +
                ", averageProductWeight=" + calculateAverageProductWeight() +
                ", cashEfficiency=" + calculateCashEfficiency() +
                ", efficiency=" + calculateEfficiency() +
                ", products=" + Arrays.toString(products) +
                '}';
    }
}





