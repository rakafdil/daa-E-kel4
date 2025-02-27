import java.util.*;

public class SK1{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Masukkan jumlah elemen array: ");

        int n, pilihan, data;

        n = scan.nextInt();

        int[] A = new int[n];

        isiArray(A, n);

        do {
            System.out.println("Pilih operasi yang ingin dilakukan : ");
            System.out.println("1. Menampilkan isi array");
            System.out.println("2. Mencari nilai terkecil dan posisinya");
            System.out.println("3. Mencari semua posisi dari suatu data");
            System.out.println("4. Mencari semua posisi data genap");
            System.out.println("0. Keluar");
            System.out.println("Masukkan pilihan: ");
            pilihan = scan.nextInt();
            if (pilihan == 1) {
                cetakArray(A, n);
                System.out.println("");
            }
            if (pilihan == 2) {
                findMin(A, n);
                System.out.println("");
            }

            if (pilihan == 3) {
                System.out.println("Masukkan data yang ingin dicari posisinya: ");
                data = scan.nextInt();
                findAllPosData(A, data, n);
                System.out.println("");
            }
            if (pilihan == 4) {
                findPosGenap(A, n);
                System.out.println("");
            }
            if (pilihan > 4) {
                System.out.println("Masukkan pilihan yang valid");
            }

        } while (pilihan > 0);

        if (pilihan == 0) {
            System.out.println("Terimakasih, anda telah keluar dari program");
        }

    }

    public static void isiArray(int[] A, int n){
        Scanner scan = new Scanner(System.in);
    
        System.out.println("Masukkan elemen array:");
    
        for(int i = 0; i < n; i++){
            System.out.println("Elemen ke " + i + " : ");
            A[i] = scan.nextInt();
        }
    
    }

    public static void findMin(int[] A, int n) {
        int i, minValue;

        minValue = A[0];
        for (i = 1; i <= n - 1; i++) {
            if (A[i] < minValue) {
                minValue = A[i];
            }
        }
        for (i = 0; i <= n - 1; i++) {
            if (A[i] == minValue) {
                System.out.println("Nilai terkecil: " + minValue + " ditemukan pada posisi: " + i);
            }
        }
    }
    
    public static void cetakArray(int[] A, int n) {
        int i;
        for (i =0; i<=n-1; i++){
            System.out.println(A[i]);
        }
    }
    
    public static void findPosGenap(int[] A, int n) {
        boolean even = false;
        int i;
        
        for (i=0; i<=n-1;i++){
            if (A[i]%2==0){
                System.out.println("Posisi data genap ditemukan di indeks ke "+ i);
                even = true;
            }
        }
        if (even==false){
            System.out.println("Tidak ditemukan");
        }
    }
    
    public static void findAllPosData(int[] A,int data, int n) {
        boolean found = false;
        int i;
        for(i=0; i<=n-1; i++){
            if (A[i]==data) {
                System.out.println("Posisi data "+ data+ " ditemukan di indeks ke "+i);
                found = true;
            }
        }
        if (found==false){
            System.out.println("Tidak ditemukan");
        }
    }
}
