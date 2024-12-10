package manajemen_Inventory;

import java.util.Scanner;

public class PratikumStudiKasus {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String[] namaItem = { "Kopi Hitam", "Cappuccino", "Teh Tarik" };
        String[] kategori = { "Minuman", "Minuman", "Minuman" };
        int[] stok = { 10, 5, 8 };

        while (true) {
            System.out.println("===== Menu Inventori Cafe =====");
            System.out.println("1. Tampilkan Menu Inventori");
            System.out.println("2. Tambah Stok Untuk Item yang Ada");
            System.out.println("3. Tambah Item Baru");
            System.out.println("4. Keluar");

            System.out.print("Pilih menu: ");

            int pilihanMenu = input.nextInt();

            if (pilihanMenu == 1) {
                tampilMenu1(namaItem, kategori, stok);
            } else {

            }
        }
    }

    public static void tampilMenu1(String[] namaItem, String[] kategori, int[] stok) {
        System.out.println("\n ====== DATA INVENTORI =====");
        System.out.printf("%-5s %-20s %-15s %-5s\n", "No", "Nama Item", "Kategori", "Stok");
        System.out.println("---------------------------------------------------------------------------");

        // perulangan untuk mencentak setiap baris data dari investori
        for (int i = 0; i < namaItem.length; i++) {
            // untuk menampilakn data berdasarkan data index dari inventori
            System.out.printf("%-5d %-20s %-15s %-5d\n", i + 1, namaItem[i], kategori[i], stok[i]);
        }
        System.out.println();

    }

    public static int tampilMenu2() {

    }

}
