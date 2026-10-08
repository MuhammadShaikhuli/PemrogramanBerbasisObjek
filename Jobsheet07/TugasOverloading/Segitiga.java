public class Segitiga {
    private int sudut;

    // Overloading 1 parameter
    public int totalSudut(int sudutA) {
        sudut = 180 - sudutA;
        return sudut;
    }

    // Overloading 2 parameter
    public int totalSudut(int sudutA, int sudutB) {
        sudut = 180 - (sudutA + sudutB);
        return sudut;
    }

    // Overloading 3 parameter int
    public int keliling(int sisiA, int sisiB, int sisiC) {
        return sisiA + sisiB + sisiC;
    }

    // Overloading 2
    public double keliling(int sisiA, int sisiB) {
        return Math.sqrt(Math.pow(sisiA, 2) + Math.pow(sisiB, 2));
    }

    public static void main(String[] args) {
        Segitiga sg = new Segitiga();

        System.out.println("Total Sudut (1 parameter) : " + sg.totalSudut(60));
        System.out.println("Total Sudut (2 parameter) : " + sg.totalSudut(60, 40));
        System.out.println("Keliling (3 parameter)     : " + sg.keliling(3, 4, 5));
        System.out.println("Keliling (2 parameter)     : " + sg.keliling(3, 4));
    }
}