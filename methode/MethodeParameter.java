package methode;

public class MethodeParameter {
    public static void main(String[] args) {
        ucapHalo("rdwn");
        tampilkanNama("Ridwan", "Nurfauzi");
    }

    static void ucapHalo(String nama) {
        System.out.println("Halo, " + nama);
    }

    static void tampilkanNama(String firstName, String lastName) {
        System.out.println("First name : " + firstName);
        System.out.println("Last Name  : " + lastName);
    }
}
