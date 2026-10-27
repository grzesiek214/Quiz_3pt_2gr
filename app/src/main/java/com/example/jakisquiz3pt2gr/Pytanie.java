package com.example.jakisquiz3pt2gr;

public class Pytanie {
    private long idZdjecia;
    private String trescPytania;
    private boolean czyPoprawnaOdpowiedz;
    private boolean czyPoprawnie;

    public Pytanie(long idZdjecia, String trescPytania, boolean czyPoprawnaOdpowiedz) {
        this.idZdjecia = idZdjecia;
        this.trescPytania = trescPytania;
        this.czyPoprawnaOdpowiedz = czyPoprawnaOdpowiedz;
        czyPoprawnie = false;
    }

    public long getIdZdjecia() {
        return idZdjecia;
    }

    public String getTrescPytania() {
        return trescPytania;
    }

    public boolean isCzyPoprawnaOdpowiedz() {
        return czyPoprawnaOdpowiedz;
    }

    public boolean isCzyPoprawnie() {
        return czyPoprawnie;
    }

    public void setCzyPoprawnie(boolean czyPoprawnie) {
        this.czyPoprawnie = czyPoprawnie;
    }
}
