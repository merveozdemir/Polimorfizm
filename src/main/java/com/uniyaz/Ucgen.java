package com.uniyaz;

public class Ucgen extends Sekil {
    private float yukseklik;
    private float tabanUzunlugu;
    private float ikinciKenarUzunluk;
    private float ucuncuKenarUzunluk;

    public Ucgen(float yukseklik, float tabanUzunlugu, float ikinciKenarUzunluk, float ucuncuKenarUzunluk) {
        this.yukseklik = yukseklik;
        this.tabanUzunlugu = tabanUzunlugu;
        this.ikinciKenarUzunluk = ikinciKenarUzunluk;
        this.ucuncuKenarUzunluk = ucuncuKenarUzunluk;
    }

    @Override
    void alanHesapla() {
        float sonuc = (tabanUzunlugu*yukseklik)/2;
        this.setAlan(sonuc);
        System.out.println(this.getSekilAdi() + " isimli üçgenin alanı: "+ sonuc);
    }

    @Override
    void cevreHesapla() {
        float sonuc = tabanUzunlugu + ikinciKenarUzunluk + ucuncuKenarUzunluk;
        this.setCevre(sonuc);
        System.out.println(this.getSekilAdi() + " isimli üçgenin çevresi: "+ sonuc);
    }

    public float getYukseklik() {
        return yukseklik;
    }

    public void setYukseklik(float yukseklik) {
        this.yukseklik = yukseklik;
    }

    public float getTabanUzunlugu() {
        return tabanUzunlugu;
    }

    public void setTabanUzunlugu(float tabanUzunlugu) {
        this.tabanUzunlugu = tabanUzunlugu;
    }
}
