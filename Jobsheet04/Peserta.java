
public class Peserta {
    private int id;
    private String nama;
    private String email;

    // Konstruktor
    public Peserta(int id, String nama, String email) {
        this.id = id;
        this.nama = nama;
        this.email = email;
    }

    // Getter dan Setter
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // Method untuk menampilkan info peserta
    public void tampilkanInfoPeserta() {
        System.out.println("- ID: " + id + " | Nama: " + nama + " | Email: " + email);
    }
}