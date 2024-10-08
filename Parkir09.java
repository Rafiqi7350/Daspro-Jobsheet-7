import java.util.Scanner;

public class Parkir09 {
    
    public static void main(String[] args) {
        
//Deklarasi
        Scanner sc = new Scanner(System.in);
        int jenis, durasi, total = 0;

//input user
        while (true) {
            System.out.println(" Tekan 1 untuk Mobil");
            System.out.println(" Tekan 2 untuk Motor");
            System.out.println(" Tekan 0 untuk Keluar");
            System.out.println("Masukkan jenis kendaraan");
            jenis = sc.nextInt();
            
//if else
            if (jenis == 0) {
                System.out.println("Total pembayaran : Rp "+ total);
                break;
            }
            if (jenis == 1 || jenis == 2) {
                System.out.println("Masukkan durasi parkir (JAM)");
                durasi = sc.nextInt();
                total = 0;
                if (durasi>5) {
                    total += 12500;
                } else {
                    if (jenis == 1) {
                        total += durasi * 3000;
                    } else if (jenis == 2) {
                        total += durasi * 2000;
                    }
                }
        //Total pembayaran
                System.out.println("Total Pembayaran : Rp" + total);
                total = 0;
            } else {
                System.out.println("Jenis kendaraan tidak vald. Silahkan coba lagi.");
            }
        }
    }
}
