package com.uniyaz;

public class Kare extends Sekil {

    int kenarUzunlugu;

    public Kare(int kenarUzunlugu) {
        this.kenarUzunlugu = kenarUzunlugu;
    }

    public void setKenarUzunlugu(int kenarUzunlugu) {
        this.kenarUzunlugu = kenarUzunlugu;
    }

    public int getKenarUzunlugu() {
        return kenarUzunlugu;
    }

    @Override
    void alanHesapla() {
        float sonuc = kenarUzunlugu*kenarUzunlugu;
        this.setAlan(sonuc);
        System.out.println(this.getSekilAdi() + " isimli karenin alanı: "+ sonuc);
    }

    @Override
    void cevreHesapla() {
        float sonuc = kenarUzunlugu * 4;
        this.setCevre(sonuc);
        System.out.println(this.getSekilAdi()+" isimli karenin çevresi "+ sonuc);
    }
}
