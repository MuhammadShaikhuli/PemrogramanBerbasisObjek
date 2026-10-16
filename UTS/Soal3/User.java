import java.util.ArrayList;
import java.util.List;

class User {
    private int userId;
    private String password;
    private String name;
    private int age;
    private String emailId;
    private List<String> doc;

    public User(int userId, String password, String name, int age, String emailId) {
        this.userId = userId;
        this.password = password;
        this.name = name;
        this.age = age;
        this.emailId = emailId;
        this.doc = new ArrayList<>();
    }

    public int getUserId() {
        return userId;
    }

    public String getPassword() {
        return password;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getEmailId() {
        return emailId;
    }

    public List<String> getDoc() {
        return doc;
    }

    public void addDocument(String documentName) {
        this.doc.add(documentName);
    }

    public void editProfile(String name, String emailId) {
        this.name = name;
        this.emailId = emailId;
        System.out.println("Profil untuk " + this.name + " berhasil diperbarui.");
    }

    public void showDocuments() {
        System.out.println("Daftar dokumen milik " + name + ": " + doc);
    }

    public boolean login(int inputUserId, String inputPassword) {
        if (this.userId == inputUserId && this.password.equals(inputPassword)) {
            System.out.println("Login berhasil untuk: " + name);
            return true;
        }
        System.out.println("Login gagal! User ID atau password salah.");
        return false;
    }

    public void recoverPassword() {
        System.out.println("Instruksi pemulihan password telah dikirim ke email: " + emailId);
    }

    public void logout() {
        System.out.println(name + " telah keluar dari sistem.");
    }
}