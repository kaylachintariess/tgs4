package Tugas4;

public class Persegi extends BangunDatar {
    private float sisi;

    public void setSisi(float sisi) {
        this.sisi = sisi;
    }

    public float getSisi() {
        return sisi;
    }

    public float getLuas() {
        setLuas(sisi * sisi);
        return super.getLuas();
    }

    public float getKeliling() {
        setKeliling(4 * sisi);
        return super.getKeliling();
    }
}