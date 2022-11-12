package oop;

class Kendaraan{
    public String warna;
    public String merk;
    public int jumlahBan;
}

class Motor extends Kendaraan{
    Motor(String warna, String merk, int jumlahBan){
        this.warna = warna;
        this.merk = merk;
        this.jumlahBan = jumlahBan;
    }

    public void maju(){
        System.out.println("Motor maju");
    }
    public void berhenti(){
        System.out.println("Motor berhenti");
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Motor motorHonda = new Motor("hitam", "Honda", 2);
        motorHonda.maju();
        System.out.println(motorHonda.warna);
    }
}
