import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Order {
    private int orderId;
    private double amount;
    private LocalDateTime orderDate;
    private Customer customer;
    private List<Product> products;

    public Order(int orderId, Customer customer) {
        this.orderId = orderId;
        this.customer = customer;
        this.orderDate = LocalDateTime.now();
        this.products = new ArrayList<>();
        this.amount = 0.0;
    }

    public void addProductToOrder(Product product) {
        products.add(product);
        amount += product.getProductPrice();
    }

    public void createOrder() {
        System.out.println("Order #" + orderId + " berhasil dibuat untuk pelanggan: " + customer.getCustomerName());
        System.out.println("Waktu Order: " + orderDate);
        System.out.println("Jumlah Produk: " + products.size());
        System.out.println("Total Amount: Rp" + amount);
    }

    public void editOrder(int orderId) {
        System.out.println("Order #" + orderId + " berhasil diperbarui.");
    }
}