package com.uniyaz;

import java.util.List;

public class HesapIslemleri implements Hesaplanabilir {
    @Override
    public void alanlariHesapla(List<Sekil> sekilListe) {
        System.out.println("----Alanlar Hesaplanıyor----");
        for (Sekil sekil : sekilListe) {
            sekil.alanHesapla();
        }
    }

    @Override
    public void cevreleriHesapla(List<Sekil> sekilListe) {
        System.out.println("----Çevreler Hesaplanıyor----");
        for (Sekil sekil : sekilListe) {
            sekil.cevreHesapla();
        }
    }
}
