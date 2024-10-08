import java.util.Scanner;

public class SiakadFor09 {

    public static void main(String[] args) {
        
// deklarasi
        Scanner sc = new Scanner(System.in);
        double nilai, tertinggi = 0, terendah = 100;

// For pengulangan
        for (int i = 1; i <= 10; i++){
            System.out.println(("Masukkan nilai mahasiswa ke-" + i + ": "));
            nilai = sc.nextDouble();
            if (nilai> tertinggi) {
                tertinggi = nilai;
            }
            if (nilai < terendah) {
                terendah = nilai;
            }
        }

// menampilkan hasil
        System.out.println("Nilai tertinggi: " + tertinggi);
        System.out.println("Nilai terendah: " + terendah);
        
    }
}