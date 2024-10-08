import java.util.Scanner;

public class KafeDoWhile09 {
    
    public static void main(String[] args) {
    
// Deklarasi
        Scanner sc = new Scanner(System.in);
        int kopi, teh, roti;
        String namPelanggan;
        float totalHarga, hargaKopi = 12000, hargaTeh = 7000, hargaRoti = 20000;

// DO-WHILE Perulangan
        do {
            System.out.println("Masukkan nama pelanggan (ketik 'batal untuk keluar'): ");
            namPelanggan = sc.nextLine();
            if (namPelanggan.equalsIgnoreCase("batal")) {
                System.out.println("TRANSAKSI DIBATALKAN");
                break;
            }
// input user
            System.out.println("Jumlah kopi: ");
            kopi = sc.nextInt();
            System.out.println("Jumlah teh: ");
            teh = sc.nextInt();
            System.out.println("Jumlah roti: ");
            roti = sc.nextInt();
            
// Penghitungan total
            totalHarga = (kopi * hargaKopi) + (teh * hargaTeh) + (roti * hargaRoti);
            System.out.println("Total yang harus dibayar: Rp " + totalHarga);
            sc.nextLine();
        } while (true);

        System.out.println("Semua transaksi selesai");
    }
}
