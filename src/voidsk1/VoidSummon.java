package voidsk1;
import java.util.Scanner;

public class VoidSummon {
    
    //variabel
    Scanner input = new Scanner(System.in);
    int pesan,pilih;
    
    //method void unuk membuat program
    void awalan(){
        System.out.print("Pilihan Menu :\n 1. bakso(Rp.1000)\n 2. Mie(Rp.2000)\n 3. soto(Rp.3000)\n");
        System.out.print("Masukkan Pilihan : ");
        pilih = input.nextInt();
        System.out.print("Banyak Pesanan : ");
        pesan = input.nextInt();
    }
  
    //method void untuk untuk memproses data
    void isi(){
    System.out.println("================");
        switch(pilih){
            case 1:
                System.out.println("Pesanan : bakso");
                System.out.println("Harga : 1000");
                System.out.println("Jumlah Pesan : "+pesan);
                System.out.println("Total Bayar : "+pesan*1000);
            break;
            case 2:
                System.out.println("Pesanan : Mie Ayam");
                System.out.println("Harga : 2000");
                System.out.println("Jumlah Pesan : "+pesan);
                System.out.println("Total Bayar : "+pesan*2000);
            break;
            case 3:
                System.out.println("Pesanan : Bakso");
                System.out.println("Harga : 3000");
                System.out.println("Jumlah Pesan : "+pesan);
                System.out.println("Total Bayar : "+pesan*3000);
            break;
            default:
            System.out.println("Salah Pilih ! :(");
        }
    }
}
