package com.uniyaz;

public class Daire extends Sekil {
    private final float piSayisi  = (float) 3.14;
    private float yaricap;

    public Daire(float yaricap) {
        this.yaricap = yaricap;
    }

    @Override
    void alanHesapla() {
        float sonuc = piSayisi * yaricap * yaricap;
        this.setAlan(sonuc);
        System.out.println(this.getSekilAdi() + " isimli dairenin alanı: "+ sonuc);
    }

    @Override
    void cevreHesapla() {
        float sonuc = 2 * piSayisi * yaricap;
        this.setAlan(sonuc);
        System.out.println(this.getSekilAdi() + " isimli dairenin çevresi: "+ sonuc);
    }


    public float getYaricap() {
        return yaricap;
    }

    public void setYaricap(float yaricap) {
        this.yaricap = yaricap;
    }
}
