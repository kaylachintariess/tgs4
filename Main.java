package Tugas4;

public class Main {
    public static void main(String[] args) {
        
        Persegi persegi = new Persegi();
        Lingkaran lingkaran = new Lingkaran();
        PersegiPanjang persegiPanjang = new PersegiPanjang();
        Segitiga segitiga = new Segitiga();
        
        persegi.setSisi(5.0f);

        lingkaran.setJari(7.0f);

        persegiPanjang.setPanjang(10.0f);
        persegiPanjang.setLebar(4.0f);
        
        segitiga.setAlas(6.0f);
        segitiga.setTinggi(8.0f);
        segitiga.setSisiA(6.0f);
        segitiga.setSisiB(8.0f);
        segitiga.setSisiC(10.0f);

        System.out.println("~~~ HASIL PERHITUNGAN BANGUN DATAR ~~~");
        
        System.out.println("\n~~~ Persegi ~~~");
        System.out.println("Sisi     : " + persegi.getSisi());
        System.out.println("Luas     : " + persegi.getLuas());
        System.out.println("Keliling : " + persegi.getKeliling());

        System.out.println("\n~~~ Lingkaran ~~~");
        System.out.println("Jari-jari: " + lingkaran.getJari());
        System.out.println("Luas     : " + lingkaran.getLuas());
        System.out.println("Keliling : " + lingkaran.getKeliling());

        System.out.println("\n~~~ Persegi Panjang ~~~");
        System.out.println("Panjang  : " + persegiPanjang.getPanjang());
        System.out.println("Lebar    : " + persegiPanjang.getLebar());
        System.out.println("Luas     : " + persegiPanjang.getLuas());
        System.out.println("Keliling : " + persegiPanjang.getKeliling());

        System.out.println("\n~~~ Segitiga ~~~");
        System.out.println("Alas     : " + segitiga.getAlas());
        System.out.println("Tinggi   : " + segitiga.getTinggi());
        System.out.println("Luas     : " + segitiga.getLuas());
        System.out.println("Keliling : " + segitiga.getKeliling());
    }
}