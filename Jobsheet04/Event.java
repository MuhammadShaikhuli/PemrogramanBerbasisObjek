import java.util.ArrayList;

public class Event {
    private int id;
    private String namaEvent;
    private String tanggal;
    private int kapasitasMaksimal;
    private ArrayList<Peserta> daftarPeserta; // ArrayList of Object

    // Konstruktor
    public Event(int id, String namaEvent, String tanggal, int kapasitasMaksimal) {
        this.id = id;
        this.namaEvent = namaEvent;
        this.tanggal = tanggal;
        this.kapasitasMaksimal = kapasitasMaksimal;
        this.daftarPeserta = new ArrayList<>();
    }

    // Getter dan Setter
    public int getId() {
        return id;
    }

    public String getNamaEvent() {
        return namaEvent;
    }

    public void setNamaEvent(String namaEvent) {
        this.namaEvent = namaEvent;
    }

    public String getTanggal() {
        return tanggal;
    }

    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }

    public int getKapasitasMaksimal() {
        return kapasitasMaksimal;
    }

    public void setKapasitasMaksimal(int kapasitasMaksimal) {
        this.kapasitasMaksimal = kapasitasMaksimal;
    }

    // Method untuk menambahkan peserta ke ArrayList
    public void tambahPeserta(Peserta peserta) {
        if (daftarPeserta.size() < kapasitasMaksimal) {
            daftarPeserta.add(peserta);
            System.out.println("Berhasil mendaftarkan peserta: " + peserta.getNama());
        } else {
            System.out.println("Gagal mendaftarkan " + peserta.getNama() + ". Event sudah penuh!");
        }
    }

    // Method untuk membatalkan/menghapus peserta berdasarkan nama
    public void batalkanPeserta(String namaPeserta) {
        boolean ditemukan = false;
        for (int i = 0; i < daftarPeserta.size(); i++) {
            if (daftarPeserta.get(i).getNama().equalsIgnoreCase(namaPeserta)) {
                daftarPeserta.remove(i);
                System.out.println("Peserta " + namaPeserta + " berhasil dihapus dari event.");
                ditemukan = true;
                break;
            }
        }
        if (!ditemukan) {
            System.out.println("Peserta dengan nama " + namaPeserta + " tidak ditemukan.");
        }
    }

    // Method untuk menampilkan detail event
    public void tampilkanDetailEvent() {
        System.out.println("\n========================================");
        System.out.println("INFORMASI DETAIL EVENT");
        System.out.println("========================================");
        System.out.println("ID Event       : " + id);
        System.out.println("Nama Event     : " + namaEvent);
        System.out.println("Tanggal        : " + tanggal);
        System.out.println("Kapasitas      : " + daftarPeserta.size() + "/" + kapasitasMaksimal);
        System.out.println("Daftar Peserta :");
        if (daftarPeserta.isEmpty()) {
            System.out.println("- Belum ada peserta terdaftar.");
        } else {
            for (Peserta p : daftarPeserta) {
                p.tampilkanInfoPeserta();
            }
        }
        System.out.println("========================================\n");
    }
}
