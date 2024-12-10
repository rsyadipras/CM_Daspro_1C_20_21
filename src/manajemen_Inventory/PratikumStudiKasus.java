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
                tambahItemBaru();
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

    public static void tambahItemBaru() {
        String itemBaru = "", KategoriBaru = "";
        int stokBaru = 0;

        // menambahkan item baru
        System.out.println("\n ====== Tambah Item Baru =====");
        System.out.print("Masukan Nama Item Baru: ");
        itemBaru = input.next();
        System.out.print("Masukan Kategori item baru: ");
        KategoriBaru = input.next();
        System.out.print("Masukkan Stock Baru: ");
        stokBaru = input.nextInt();

        String[] namaItemBaru = new String[namaItem.length + 1];
        String[] namaKategoriBaru = new String[kategori.length + 1];
        int[] jumlahStokBaru = new int[stok.length + 1];

        // meng copy nilai item lama ke data item terbaru
        for (int i = 0; i < namaItem.length; i++) {
            namaItemBaru[i] = namaItem[i];
            namaKategoriBaru[i] = kategori[i];
            jumlahStokBaru[i] = stok[i];
        }

        // menambahkan data item baru ke array
        namaItemBaru[namaItem.length] = itemBaru;
        namaKategoriBaru[kategori.length] = KategoriBaru;
        jumlahStokBaru[stok.length] = stokBaru;

        // untuk memperbarui array global
        namaItem = namaItemBaru;
        kategori = namaKategoriBaru;
        stok = jumlahStokBaru;

        System.out.println(
                "\nItem baru berhasil ditambahkan: " + itemBaru + " (" + KategoriBaru + ") Stok: " + stokBaru);

    }

}
