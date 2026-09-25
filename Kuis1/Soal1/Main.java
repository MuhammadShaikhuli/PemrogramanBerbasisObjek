public class Main {
    public static void main(String[] args) {
        // 1. Buat Objek Customer
        Customer customer1 = new Customer(101, "Ahmad", "Jl. Soekarno Hatta No. 9", "08123456789");
        customer1.addCustomer();

        // 2. Buat Objek Stock dan Product
        Stock stockLaptop = new Stock(501, 10, 1);
        Product product1 = new Product(501, 7500000.0, "Elektronik", stockLaptop);

        Stock stockMouse = new Stock(502, 25, 1);
        Product product2 = new Product(502, 150000.0, "Aksesori", stockMouse);

        // 3. Buat Objek Order dan Tambahkan Produk
        Order order1 = new Order(1001, customer1);
        order1.addProductToOrder(product1);
        order1.addProductToOrder(product2);

        // 4. Jalankan Method Order
        System.out.println("\n--- Detail Transaksi ---");
        order1.createOrder();
    }
}