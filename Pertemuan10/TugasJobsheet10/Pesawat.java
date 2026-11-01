public abstract class Pesawat {
    private String kodePesawat;
    private int jarakMaks;

    public Pesawat(String kodePesawat, int jarakMaks) {
        this.kodePesawat = kodePesawat;
        this.jarakMaks = jarakMaks;
    }

    public String getKodePesawat() {
        return kodePesawat;
    }

    public int getJarakMaks() {
        return jarakMaks;
    }

    public abstract void terbang();
}