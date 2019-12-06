package com.uniyaz;

public abstract class Sekil {
    private float alan;
    private float cevre;
    private String sekilAdi;


    public String getSekilAdi() {
        return sekilAdi;
    }

    public void setSekilAdi(String sekilAdi) {
        this.sekilAdi = sekilAdi;
    }

    public float getCevre() {
        return cevre;
    }

    public void setCevre(float cevre) {
        this.cevre = cevre;
    }

    public float getAlan() {
        return alan;
    }

    public void setAlan(float alan) {
        this.alan = alan;
    }

    abstract void alanHesapla();

    abstract void cevreHesapla();

}
