class Admin extends User {

    public Admin(int userId, String password, String name, int age, String emailId) {
        super(userId, password, name, age, emailId);
    }

    public void verifyUser(Customer customer) {
        customer.setVerificationStatus(true);
        System.out.println("Admin " + getName() + " berhasil memverifikasi akun customer: " + customer.getName());
    }

    public void addVehicle(String vehicleName) {
        System.out.println("Admin " + getName() + " berhasil menambahkan kendaraan baru: " + vehicleName);
    }

    public void updateVehicleDetails(int vehicleId) {
        System.out.println("Memperbarui detail untuk Vehicle ID: " + vehicleId);
    }

    public void retrieveComplain() {
        System.out.println("Mengambil daftar keluhan masuk dari pelanggan...");
    }
}