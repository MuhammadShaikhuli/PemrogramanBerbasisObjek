class Customer extends User {
    private boolean verificationStatus;

    public Customer(int userId, String password, String name, int age, String emailId) {
        super(userId, password, name, age, emailId);
        this.verificationStatus = false;
    }

    public boolean getVerificationStatus() {
        return verificationStatus;
    }

    public void setVerificationStatus(boolean verificationStatus) {
        this.verificationStatus = verificationStatus;
    }

    public void applyVerification(String documentName) {
        if (documentName.endsWith(".jpg") || documentName.endsWith(".png") || documentName.endsWith(".pdf")) {
            addDocument(documentName);
            System.out.println("Dokumen " + documentName + " berhasil diunggah. Menunggu verifikasi admin");
        } else {
            System.out.println("Format file tidak didukung! Harap unggah format jpg, png, atau pdf.");
        }
    }
}