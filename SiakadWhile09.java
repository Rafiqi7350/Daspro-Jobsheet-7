import java.util.Scanner;

public class SiakadWhile09 {
    
    public static void main(String[] args) {
        
// Deklarasi
        Scanner sc = new Scanner(System.in);
        int nilai, jumlah, i = 0;

// input user
        System.out.println("Masukkan jumlah mahasiswa: ");
        jumlah = sc.nextInt();

//While perulangan
        while (i < jumlah) {
            i++;
            System.out.println("Masukkan nilai mahasiswa ke-" + (i)+ ": ");
            nilai = sc.nextInt();

            if (nilai < 0 || nilai > 100) {
                System.out.println("Nilai tidak valid, Masukkan lagi nilai yang valid!");
                continue;
            }
            if (nilai >80 && nilai <=100) {
                System.out.println("Nilai mahasiswa ke-" + (i) + " adalah A");
                System.out.println("--------------------------------------------");             
            } else if (nilai > 73 && nilai <=80) {
                System.out.println("Nilai mahasiswa ke-" + (i) + " adalah B+");   
                System.out.println("--------------------------------------------");             
            } else if (nilai > 65 && nilai <= 73) {
                System.out.println("Nilai mahasiswa ke-" + (i) + " adalah B");
                System.out.println("--------------------------------------------");                
            } else if (nilai > 60 && nilai<= 65) {
                System.out.println("Nilai mahasiswa ke-" + (i) + " adalah C+");   
                System.out.println("--------------------------------------------");             
            } else if (nilai > 50 && nilai <=60) {
                System.out.println("Nilai mahasiswa ke-" + (i) + " adalah C");   
                System.out.println("--------------------------------------------");             
            } else if (nilai > 39 && nilai <= 50) {
                System.out.println("Nilai mahasiswa ke-" + (i) + " adalah D");   
                System.out.println("--------------------------------------------");             
            } else {
                System.out.println("Nilai mahasiswa ke-" + (i) + " adalah E"); 
                System.out.println("--------------------------------------------");             
 
            }
        }
    }
}
