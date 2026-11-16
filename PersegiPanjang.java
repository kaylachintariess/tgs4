package Tugas4;

public class PersegiPanjang extends BangunDatar {
    private float panjang;
    private float lebar;

    public void setPanjang(float panjang) {
        this.panjang = panjang;
    }

    public float getPanjang() {
        return panjang;
    }

    public void setLebar(float lebar) {
        this.lebar = lebar;
    }

    public float getLebar() {
        return lebar;
    }

    public float getLuas() {
        setLuas(panjang * lebar);
        return super.getLuas();
    }

    public float getKeliling() {
        setKeliling(2 * (panjang + lebar));
        return super.getKeliling();
    }
}