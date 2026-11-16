package Tugas4;

public class Segitiga extends BangunDatar {
    private float alas;
    private float tinggi;
    
    private float sisiA;
    private float sisiB;
    private float sisiC;
    
    public void setAlas(float alas) {
        this.alas = alas;
    }

    public float getAlas() {
        return alas;
    }
    
    public void setTinggi(float tinggi) {
        this.tinggi = tinggi;
    }

    public float getTinggi() {
        return tinggi;
    }

    public void setSisiA(float sisiA) {
        this.sisiA = sisiA;
    }

    public void setSisiB(float sisiB) {
        this.sisiB = sisiB;
    }
    
    public void setSisiC(float sisiC) {
        this.sisiC = sisiC;
    }
    
    public float luas() {
        float hasilLuas = 0.5f * alas * tinggi;
        setLuas(hasilLuas);
        return hasilLuas;
    }

    public float keliling() {
        float hasilKeliling = sisiA + sisiB + sisiC;
        setKeliling(hasilKeliling);
        return hasilKeliling;
    }
}