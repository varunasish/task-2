class Product {
    int pid;
    double price;
    int quantity;

    // Parameterized constructor
    Product(int pid, double price, int quantity) {
        this.pid = pid;
        this.price = price;
        this.quantity = quantity;
    }
}

public class ProductMain {
    public static void main(String[] args) {
        Product[] products = new Product[5];
        products[0] = new Product(101, 100.5, 2);
        products[1] = new Product(102, 200.0, 1);
        products[2] = new Product(103, 150.75, 3);
        products[3] = new Product(104, 300.0, 1);
        products[4] = new Product(105, 250.0, 2);

        // b. Find Pid of the product with the highest price
        Product highest = products[0];
        for (Product p : products) {
            if (p.price > highest.price) {
                highest = p;
            }
        }
        System.out.println("Product ID with highest price: " + highest.pid);

        // c. Calculate total amount spent
        double totalAmount = calculateTotal(products);
        System.out.println("Total amount spent on products: " + totalAmount);
    }

    public static double calculateTotal(Product[] products) {
        double total = 0;
        for (Product p : products) {
            total += p.price * p.quantity;
        }
        return total;
    }
}
