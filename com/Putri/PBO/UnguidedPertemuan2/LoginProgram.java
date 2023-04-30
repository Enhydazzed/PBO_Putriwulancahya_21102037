package com.Putri.PBO.UnguidedPertemuan2;

import java.util.Scanner;

public class LoginProgram {
        public static void main(String[] args) {
            // Definisikan username dan password
            String validUsername = "Putri";
            String validPassword = "21102037";

            // Buat objek Scanner untuk menerima input dari pengguna
            Scanner scanner = new Scanner(System.in);

            // Memasukkan username dan password oleh user
            System.out.print("Masukkan username Anda: ");
            String inputUsername = scanner.nextLine();
            System.out.print("Masukkan password Anda: ");
            String inputPassword = scanner.nextLine();

            // Periksa apakah input username dan password valid
            if (inputUsername.equals(validUsername) && inputPassword.equals(validPassword)) {
                System.out.println("Login berhasil, silakan masuk!");
            } else if (inputUsername.equals("") || inputPassword.equals("")) {
                System.out.println("Silakan login dengan username dan password yang benar!");
            } else {
                System.out.println("Username dan password Anda salah!");
            }

            // Tutup objek Scanner
            scanner.close();
        }
    }


