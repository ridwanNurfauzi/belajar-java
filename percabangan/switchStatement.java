package percabangan;

public class switchStatement {
    public static void main(String[] args) {
        var nilai = 'A';

        switch (nilai) {
            case 'A':
                System.out.println("Nilai Sangat Bagus");
                break;
            case 'B':
                System.out.println("Nilai Bagus");
                break;
            case 'C':
                System.out.println("Nilai Cukup");
                break;
            case 'D':
                System.out.println("Nilai Tidak mencukupi");
                break;
        
            default:
            System.out.println("Nilai Tidak Tersedia");
                break;
        }
    }
}
