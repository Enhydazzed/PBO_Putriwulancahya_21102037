package com.Putri.PBO.TrialCoding;

import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
            Paket paketA = new Paket("Paket A", "Foto studio + 1 print", 2, 200000);
            Paket paketB = new Paket("Paket B", "Foto studio + 5 print", 3, 300000);
            Paket paketC = new Paket("Paket C", "Foto studio + 10 print", 4, 400000);

            SelfPhotoStudio sps = new SelfPhotoStudio();
            sps.tambahPaket(paketA);
            sps.tambahPaket(paketB);
            sps.tambahPaket(paketC);

            System.out.println("Selamat datang di Self Photo Studio!");
            System.out.println("Berikut adalah daftar paket yang tersedia:");

            sps.tampilkanPaket();

            Scanner input = new Scanner(System.in);
            System.out.print("Masukkan pilihan paket (pisahkan dengan koma): ");
            String inputPaket = input.nextLine();
            String[] pilihan = inputPaket.split(", ");

            int biayaTotal = sps.hitungBiaya(pilihan);
            System.out.printf("Total biaya: Rp %d\n", biayaTotal);
        }
    }


