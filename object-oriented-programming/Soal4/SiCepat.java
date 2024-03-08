package OOP.Soal4;

public class SiCepat {
    // Atribut
    float p;
    float l;
    float t;
    double weight;

    // Constructor
    public SiCepat(float panjang, float lebar, float tinggi, double berat) {
        this.p = panjang;
        this.l = lebar;
        this.t = tinggi;
        this.weight = berat;
    }

    // Method untuk menghitung ongkir
    // Memakai 3 kondisi agar harga tidak bisa kurang dari baseprice
    public double hitungOngkir() {
        double dimension = p * l * t;
        double harga = 5000;
        if(dimension<=50 && weight<=1){
            return harga;
        } else if (dimension>=50 && weight<=1) {
            return harga*(dimension/50);
        } else {
            return harga*(dimension/50)*weight;
        }
    }
}
