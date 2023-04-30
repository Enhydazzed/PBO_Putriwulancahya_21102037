package com.Putri.PBO.TrialCoding;

import java.util.ArrayList;

public class SelfPhotoStudio {
        private ArrayList<Paket> daftarPaket;

        public SelfPhotoStudio() {
            daftarPaket = new ArrayList<>();
        }

        public void tambahPaket(Paket paket) {
            daftarPaket.add(paket);
        }

        public void tampilkanPaket() {
            for (Paket paket : daftarPaket) {
                System.out.printf("%s: %s (%d menit) - Rp %d\n", paket.getNamaPaket(), paket.getBenefit(), paket.getDurasi(), paket.getHarga());
            }
        }

        public int hitungBiaya(String[] pilihan) {
            int biayaTotal = 0;
            for (String namaPaket : pilihan) {
                boolean paketDitemukan = false;
                for (Paket paket : daftarPaket) {
                    if (namaPaket.equals(paket.getNamaPaket())) {
                        biayaTotal += paket.getHarga();
                        paketDitemukan = true;
                        break;
                    }
                }
                if (!paketDitemukan) {
                    System.out.printf("Paket %s tidak ditemukan.\n", namaPaket);
                }
            }
            return biayaTotal;
        }
    }


