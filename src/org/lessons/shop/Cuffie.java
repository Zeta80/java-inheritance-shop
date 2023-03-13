package org.lessons.shop;

public class Cuffie extends Prodotto {
    private String colore;
    private boolean isWireless;

    public Cuffie(int codice, String nome, String descrizione, double prezzo, double iva, String colore, boolean isWireless) {
        super(codice, nome, descrizione, prezzo, iva );
        this.colore = colore;
        this.isWireless = isWireless;
    }

    public String getColore() {
        return colore;
    }

    public boolean getisWireless() {
        return isWireless;
    }
}


