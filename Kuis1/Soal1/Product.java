public class Product {
    private int productId;
    private double productPrice;
    private String productType;
    private Stock stock;

    public Product(int productId, double productPrice, String productType, Stock stock) {
        this.productId = productId;
        this.productPrice = productPrice;
        this.productType = productType;
        this.stock = stock;
    }

    public int getProductId() { return productId; }
    public double getProductPrice() { return productPrice; }
    public String getProductType() { return productType; }

    public void addProduct() {
        System.out.println("Produk ID " + productId + " berhasil ditambahkan.");
    }

    public void modifyProduct() {
        System.out.println("Produk ID " + productId + " berhasil diubah.");
    }

    public void selectProduct(int productId) {
        System.out.println("Produk ID " + productId + " dipilih.");
    }
}