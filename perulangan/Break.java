package perulangan;

public class Break {
    public static void main(String[] args) {
        int i = 1;

        while(true){
            System.out.println("Perulangan ke-"+ i);
            i++;

            if(i >= 10){
                break;
            }
        }

        System.out.println("Perulangan Berhenti");
    }
}
