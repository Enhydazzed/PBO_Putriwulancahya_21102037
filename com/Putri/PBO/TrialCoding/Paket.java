package com.Putri.PBO.TrialCoding;

public class Paket {
        private String namaPaket;
        private String benefit;
        private int durasi;
        private int harga;

        public Paket(String namaPaket, String benefit, int durasi, int harga) {
            this.namaPaket = namaPaket;
            this.benefit = benefit;
            this.durasi = durasi;
            this.harga = harga;
        }

        public String getNamaPaket() {
            return namaPaket;
        }

        public String getBenefit() {
            return benefit;
        }

        public int getDurasi() {
            return durasi;
        }

        public int getHarga() {
            return harga;
        }
    }


