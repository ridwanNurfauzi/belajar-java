package percabangan;

public class ifStatement {
    public static void main(String[] args) {
        var nilai = 88;

        if(nilai >= 75){
            System.out.println("Lulus");
        }
        else{
            System.out.println("Tidak Lulus");
        }

        if(nilai >= 90){
            System.out.println("Nilai : A");
        }
        else if(nilai >= 80){
            System.out.println("Nilai : B");
        }
        else if(nilai >= 65){
            System.out.println("Nilai : C");
        }
        else if(nilai >= 50){
            System.out.println("Nilai : D");
        }
        else if(nilai >= 30){
            System.out.println("Nilai : E");
        }
        else if(nilai >= 0){
            System.out.println("Nilai : F");
        }
    }
}
