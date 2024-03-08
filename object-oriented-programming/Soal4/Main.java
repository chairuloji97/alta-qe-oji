package OOP.Soal4;

public class Main {
    public static void main(String[] args) {
        SiCepat cust1 = new SiCepat(5,2,4,1); //vol kurang dari 50 berat = 1
        SiCepat cust2 = new SiCepat(5,2,4,0.4); // vol kurang dari 50 berat kurang dari 1
        SiCepat cust3 = new SiCepat(5,2,6,1); // vol lebih dari 50 berat = 1
        SiCepat cust4 = new SiCepat(5,2,7,0.4); // vol lebih dari 50 berat kurang dari 1
        SiCepat cust5 = new SiCepat(5,2,6,2); // vol lebih dari 50 berat lebih dari 1

        System.out.println("Harga : Rp "+cust1.hitungOngkir());
        System.out.println("Harga : Rp "+cust2.hitungOngkir());
        System.out.println("Harga : Rp "+cust3.hitungOngkir());
        System.out.println("Harga : Rp "+cust4.hitungOngkir());
        System.out.println("Harga : Rp "+cust5.hitungOngkir());
    }
}
