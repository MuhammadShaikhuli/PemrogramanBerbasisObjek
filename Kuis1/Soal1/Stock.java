public class Stock {
    private int productId;
    private int quantity;
    private int shopNo;
    
    public Stock(int productId, int quantity, int shopNo) {
        this.productId = productId;
        this.quantity = quantity;
        this.shopNo = shopNo;
    }

    public int getQuantity() { return quantity; }
    public void setQuantity(int quantity) { this.quantity = quantity; }

    public void addStock() {
        System.out.println("Stok untuk produk ID " + productId + " ditambahkan.");
    }

    public void modifyStock(int productId) {
        System.out.println("Stok produk ID " + productId + " diperbarui.");
    }

    public void selectStockItem(int productId) {
        System.out.println("Memilih stok item untuk produk ID: " + productId);
    }
}