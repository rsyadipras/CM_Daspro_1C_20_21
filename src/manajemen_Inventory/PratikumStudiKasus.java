package manajemen_Inventory;

import java.util.Scanner;

public class PratikumStudiKasus {

    static String[] namaItem = { "Kopi Hitam", "Cappuccino", "Teh Tarik" };
    static String[] kategori = { "Minuman", "Minuman", "Minuman" };
    static int[] stok = { 10, 5, 8 };
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("\n===== Menu Inventori Cafe =====");
            System.out.println("1. Tampilkan Menu Inventori");
            System.out.println("2. Tambah Stok Untuk Item yang Ada");
            System.out.println("3. Tambah Item Baru");
            System.out.println("4. Keluar");

            System.out.print("Pilih menu: ");

            int pilihanMenu = input.nextInt();

            if (pilihanMenu == 1) {
                tampilMenu1(namaItem, kategori, stok);
            } else if (pilihanMenu == 2) {
                tambahJmlStok2(namaItem, stok);
            } else if (pilihanMenu == 3) {

            } else if (pilihanMenu == 4) {
                break;
            }
        }
    }

    public static void tampilMenu1(String[] namaItem, String[] kategori, int[] stok) {
        System.out.println("\n ====== DATA INVENTORI =====");
        System.out.printf("%-5s %-15s %-15s %-5s\n", "No", "Nama Item", "Kategori", "Stok");
        System.out.println("-----------------------------------------------------");

        // perulangan untuk mencentak setiap baris data dari investori
        for (int i = 0; i < namaItem.length; i++) {
            // untuk menampilakn data berdasarkan data index dari inventori
            System.out.printf("%-5d %-15s %-15s %-5d\n", i + 1, namaItem[i], kategori[i], stok[i]);
        }
        System.out.println();

    }

    // menambahkan stok item
    public static void tambahJmlStok2(String[] namaItem, int[] stok) {
        // Perulangan while digunakan untuk mengulangi perintah ketika nomor item yang
        // dimasukkan tidak valid.
        while (true) {
            System.out.print("Masukkan nomor item: ");
            int nomorItem = input.nextInt();

            // Menggunakan pemilihan yang digunakan untuk melakukan perintah penambahan stok
            if (nomorItem >= 1 && nomorItem <= namaItem.length) {
                System.out.print("Masukkan jumlah stok: ");
                int jumlahStok = input.nextInt();
                stok[nomorItem - 1] += jumlahStok;
                System.out.println("Stok " + namaItem[nomorItem - 1] + " berhasil ditambah. Stok sekarang: "
                        + stok[nomorItem - 1]);
                break;
            } else {
                System.out.println("Nomor item tidak valid.");
            }
        }
    }
}
