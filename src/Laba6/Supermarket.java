package Laba6;

import java.util.Arrays;

public class Supermarket extends Shop {
    private double area;
    private String[] categories;

    public Supermarket() {
        super();
        this.area = 0.0;
        this.categories = new String[0];
    }

    public Supermarket(int numberOfCashes, Product[] products, int numberOfSellers, double area, String[] categories) {
        super(numberOfCashes, products, numberOfSellers);
        this.area = area;
        this.categories = categories;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public String[] getCategories() {
        return categories;
    }

    public void setCategories(String[] categories) {
        this.categories = categories;
    }

    @Override
    public double calculateEfficiency() {
        double cashEff = calculateCashEfficiency();
        if (categories == null || categories.length == 0) {
            return 0.0;
        }
        double eff = (area / categories.length) * cashEff;
        return eff < 1 ? eff : eff / (1 + eff);
    }

    @Override
    public String toString() {
        return "Supermarket{" +
                "area=" + area +
                ", categories=" + Arrays.toString(categories) +
                ", efficiency=" + calculateEfficiency() +
                "} " + super.toString();
    }
}

