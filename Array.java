public class Array {
    public static void main(String[] args) {
        String[] nama;
        nama = new String[2];

        nama[0] = "Ridwan";
        nama[1] = "Nurfauzi";

        System.out.println(nama[0]);
        System.out.println(nama[1]);

        int[] arrayInt = new int[]{
            1,2,3,4,5,6,7,8,9,10
        };

        System.out.println(arrayInt.length);

        int[][] matriks = {
            {1, 2, 4},
            {3, 4, 1},
            {0, 9, 7}
        };

        System.out.println(matriks[1][2]);
    }
}
