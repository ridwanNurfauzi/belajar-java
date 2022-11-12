package methode;

public class MethodeReturnValue {
    public static void main(String[] args) {
        System.out.println(penjumlahan(3, 4));
    }

    static int penjumlahan(int a, int b){
        int c = a + b;
        return c;
    }
}
