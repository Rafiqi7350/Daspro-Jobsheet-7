import java.util.Scanner;

public class TiketBioskop09 {
     public static void main(String[] args) {
// Deklarasi
        Scanner sc = new Scanner(System.in);
        int jumlahTiket;
        int hargaTiket = 50000; 
        int totalTiketTerjual = 0;
        float totalPenjualan = 0;

// Input user
        do {
            System.out.println("Masukkan jumlah tiket yang ingin dibeli (ketik 0 untuk keluar): ");
            jumlahTiket = sc.nextInt();

            if (jumlahTiket == 0) {
                break;
            }
            if (jumlahTiket < 0) {
                System.out.println("Jumlah tiket tidak valid, silakan masukkan jumlah tiket yang valid.");
                continue; 
            }

// Total harga dengan diskon
            float hargaTotal = jumlahTiket * hargaTiket;

            if (jumlahTiket > 10) {
                hargaTotal *= 0.85; // Diskon 15%
            } else if (jumlahTiket > 4) {
                hargaTotal *= 0.90; // Diskon 10%
            }

// Total harga untuk pembelian ini
            System.out.println("Total harga untuk " + jumlahTiket + " tiket adalah: Rp " + hargaTotal);
            totalTiketTerjual += jumlahTiket;
            totalPenjualan += hargaTotal;
        } while (true); 

// Total tiket terjual dan total penjualan
        System.out.println("Total tiket terjual: " + totalTiketTerjual);
        System.out.println("Total penjualan tiket selama satu hari: Rp " + totalPenjualan);
        
    }
}
