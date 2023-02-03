import.java.util.Scanner;

public class latArray {
    public static void main(String[] args) {
        long[] larik; // tipe data dari array
        larik = new long[100]; // membuat array sebanyak maksimum 100
        int nElemen = 0; // untuk menghitung jumlah data dalam array
        int i;
        long cariData; // data yang dicari
    }

    // ----------------------------------------------------------------------
    // menu utama
    Scanner input = new Scanner(System.in);
    int pilihan;do
    {
        System.out.println("Menu Utama");
        System.out.println("1. Input Data");
        System.out.println("2. cari Data");
        System.out.println("3. Hapus Data");
        System.out.println("4. Keluar");
        System.out.print("Masukkan pilihan : ");
        pilihan = input.nextInt();
        System.out.println("");
        switch(pilihan) {
            case 1: // input data
                System.out.print("Masukkan jumlah data : ");
                nElemen = input.nextInt();
                for (i = 0; i < nElemen; i++) {
                System.out.print("Masukkan data ke-" + (i + 1) + " : ");
                larik[i] = input.nextInt();
                }
                break;
            case 2: // cari data
                System.out.print("Masukkan data yang dicari : ");
                cariData = input.nextInt();
                for (i = 0; i < nElemen; i++) {
                    if (larik[i] == cariData) {
                    System.out.println("Data ditemukan pada indeks ke-" + i);
                    break;
                 }
                }
                     if (i == nElemen) {
                     System.out.println("Data tidak ditemukan");
                 }
                break;
            case 3: // hapus data
                System.out.print("Masukkan data yang akan dihapus : ");
                cariData = input.nextInt();
                for (i = 0; i < nElemen; i++) {
                    if (larik[i] == cariData) {
                    break;
                }
            }
                if (i == nElemen) {
                    System.out.println("Data tidak ditemukan");
                } else {
                    for (int j = i; j < nElemen - 1; j++) {
                        larik[j] = larik[j + 1];
                    }
                    nElemen--;
                    System.out.println("Data berhasil dihapus");
                }
                break;
            case 4: // keluar
                System.out.println("Terima kasih telah menggunakan program ini, semoga bermanfaat");
                break;
            default:
                System.out.println("Pilihan tidak tersedia");
        }
        System.out.println("");
    }while(pilihan!=4);
}
