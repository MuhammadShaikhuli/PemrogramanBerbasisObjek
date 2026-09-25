public class Customer {
    private int customerId;
    private String customerName;
    private String address;
    private String phone;

    public Customer(int customerId, String customerName, String address, String phone) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.address = address;
        this.phone = phone;
    }

    public int getCustomerId() { return customerId; }
    public String getCustomerName() { return customerName; }
    public String getAddress() { return address; }
    public String getPhone() { return phone; }

    public void addCustomer() {
        System.out.println("Customer " + customerName + " berhasil ditambahkan");
    }

    public void editCustomer() {
        System.out.println("Data customer " + customerName + " berhasil diperbarui");
    }

    public void deleteCustomer() {
        System.out.println("Customer " + customerName + " berhasil dihapus");
    }
}