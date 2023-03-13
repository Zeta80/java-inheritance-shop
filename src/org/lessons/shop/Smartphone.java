package org.lessons.shop;


import java.math.BigDecimal;

public class Smartphone extends Prodotto {
        private String imei;
        private int memoria;

        public Smartphone(int codice, String nome, String descrizione, double prezzo,double iva, String imei, int memoria) {
            super(codice, nome, descrizione, prezzo, iva );
            this.imei = imei;
            this.memoria = memoria;
        }

        public String getImei() {
            return imei;
        }

        public int getMemoria() {
            return memoria;
        }

    @Override
    public String toString() {

            return "Smartphone [nome=" + getNome() + ", prezzo=" + getPrezzo() + ", prezzo ivato=" + getPrezzoIvato() + ", imei=" + getImei() + "memoria=" + getMemoria() + "]";}
}