package Tugas4;

public class Lingkaran extends BangunDatar {
    private float jari;

    public void setJari(float jari) {
        this.jari = jari;
    }

    public float getJari() {
        return jari;
    }

    public float getLuas() {
        setLuas((float) (Math.PI * jari * jari));
        return super.getLuas();
    }

    public float getKeliling() {
        setKeliling((float) (2 * Math.PI * jari));
        return super.getKeliling();
    }
}