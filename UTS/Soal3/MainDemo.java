public class MainDemo {
    public static void main(String[] args) {
        System.out.println("=== SIMULASI SISTEM (DENGAN ENKAPSULASI PRIVATE) ===\n");

        Customer cust1 = new Customer(101, "pass123", "Budi Santoso", 20, "budi@mail.com");
        cust1.login(101, "pass123");
        
        cust1.applyVerification("KTP_Budi.pdf");
        System.out.println("Status Verifikasi awal: " + cust1.getVerificationStatus());
        
        System.out.println("\n----------------------------------------\n");

        Admin admin1 = new Admin(1, "adminpass", "Siti Aminah", 30, "admin@system.com");
        admin1.login(1, "adminpass");
        
        admin1.verifyUser(cust1);
        System.out.println("Status Verifikasi setelah diverifikasi Admin: " + cust1.getVerificationStatus());
        
        admin1.addVehicle("Toyota Avanza - B 1234 XYZ");
        admin1.retrieveComplain();
        
        System.out.println();
        cust1.showDocuments();
    }
}