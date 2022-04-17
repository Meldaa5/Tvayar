package com.company;

public class Main {

    public static void main(String[] args) {
        Tv tv = new Tv();
        tv.ac();
        tv.setKanal(119);
        tv.setSesSeviyesi(3);
        tv.kanalyukarı();
        tv.sesArtir();


        System.out.println("tv nin yeni kanalı"+tv.getKanal()+" yeni sesi "+tv.getSesSeviyesi());
    }
}
