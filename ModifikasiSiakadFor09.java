import java.util.Scanner;

public class ModifikasiSiakadFor09 {
    
     public static void main(String[] args) {
        
        // Deklarasi
        Scanner sc = new Scanner(System.in);
        double nilai, tertinggi = 0, terendah = 100;
        int jumlahLulus = 0, jumlahTidakLulus = 0; // Variabel untuk menghitung jumlah lulus dan tidak lulus
        final double batasKelulusan = 60.0; // Batas kelulusan minimal 60

        // For pengulangan untuk input nilai
        for (int i = 1; i <= 10; i++) {
            System.out.println("Masukkan nilai mahasiswa ke-" + i + ": ");
            nilai = sc.nextDouble();
            
            // Menentukan nilai tertinggi dan terendah
            if (nilai > tertinggi) {
                tertinggi = nilai;
            }
            if (nilai < terendah) {
                terendah = nilai;
            }
            
            // Menentukan apakah mahasiswa lulus atau tidak lulus
            if (nilai >= batasKelulusan) {
                jumlahLulus++; // Jika nilai >= 60, mahasiswa lulus
            } else {
                jumlahTidakLulus++; // Jika nilai < 60, mahasiswa tidak lulus
            }
        }

        // Menampilkan hasil nilai tertinggi dan terendah
        System.out.println("Nilai tertinggi: " + tertinggi);
        System.out.println("Nilai terendah: " + terendah);

        // Menampilkan jumlah mahasiswa yang lulus dan tidak lulus
        System.out.println("Jumlah mahasiswa lulus: " + jumlahLulus);
        System.out.println("Jumlah mahasiswa tidak lulus: " + jumlahTidakLulus);
    }
}

