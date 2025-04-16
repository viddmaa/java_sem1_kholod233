package Laba7;

import java.util.Objects;

public class Product {
    private String name;
    private double weight;
    private double cost;

    public Product(String name, double weight, double cost) {
        this.name = name;
        this.weight = weight;
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }

    public double getCost() {
        return cost;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", cost=" + cost +
                '}';
    }

    // Переопределяем equals и hashCode для проверки дубликатов в корзине
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Product)) return false;
        Product product = (Product) o;
        return Double.compare(product.weight, weight) == 0 &&
                Double.compare(product.cost, cost) == 0 &&
                name.equals(product.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, weight, cost);
    }
}
