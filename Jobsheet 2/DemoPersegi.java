
public class DemoPersegi {
    public static void main(String[] args) {
        // Membuat objek dari class PersegiPanjang dengan nilai panjang 10 dan lebar 5
        PersegiPanjang persegi1 = new PersegiPanjang(10, 5);

        persegi1.displayInfo();

        System.out.println("- Luas    : " + persegi1.getLuas());
        System.out.println("- Keliling: " + persegi1.getKeliling());
    }
}