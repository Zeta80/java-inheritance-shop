package org.lessons.shop;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.text.DecimalFormat;

public class Prodotto {
        private final int codice;
        private String nome;
        private String descrizione;
        private double prezzo;
        private double iva ;

        public Prodotto(int codice, String nome, String descrizione, double prezzo, double iva) {
            this.codice = codice;
            this.nome = nome;
            this.descrizione = descrizione;
            this.prezzo = prezzo;
            this.iva = iva;

        }

        public int getCodice() {
            return codice;
        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public String getDescrizione() {
            return descrizione;
        }

        public void setDescrizione(String descrizione) {
            this.descrizione = descrizione;
        }

    public double getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }

    public String getPrezzoIvato() {
        double prezzoIvato = this.prezzo + (this.prezzo * this.iva / 100);
        DecimalFormat df = new DecimalFormat("#0.00");
        return df.format(prezzoIvato);
    }

        public double getPrezzoScontato(boolean haTesseraFedelta) {
            double prezzoScontato = prezzo;
            if (haTesseraFedelta) {
                prezzoScontato = prezzo * 0.98;
            }
            return prezzoScontato;
        }
    }

