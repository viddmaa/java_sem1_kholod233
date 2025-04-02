package Laba6;

public class Main {
    public static void main(String[] args) {
        Shop.Product product1 = new Shop.Product("Milk", 1.0, 100.0);
        Shop.Product product2 = new Shop.Product("Bread", 0.5, 40.0);
        Shop.Product product3 = new Shop.Product("Cheese", 0.8, 150.5);
        Shop.Product product4 = new Shop.Product("Pepsi", 0.9, 95.5);
        Shop.Product product5 = new Shop.Product("Сoca-Cola", 1.0, 85.5);

        Shop.Product[] products = {product1, product2, product3, product4, product5};

        Shop shop = new Shop(2, products, 3);
        System.out.println("Данные магазина:");
        System.out.println(shop);

        String[] categories = {"Food", "Dairy", "Bakery"};

        Supermarket supermarket = new Supermarket(3, products, 4, 150.0, categories);
        System.out.println("\nДанные супермаркета:");
        System.out.println(supermarket);
    }
}
