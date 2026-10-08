package pertemuan7;

import java.util.Scanner;

public class studikasus218 {
public static void main(String[] args) {
    
    Scanner Tezzar = new Scanner(System.in);
   
    int jumlahdokumen;
    int peringkatjuara;
    int statuspkm;
    String namamahasiswa;
    String jeniskegiatan;

    System.out.println(" Nama Mahasiswa : ");
    namamahasiswa = Tezzar.nextLine();
    System.out.println("jenis kegiatan (BELMAWA,BAKORMA,MANDIRI,PKM,LAINNYA : ");
    jeniskegiatan = Tezzar.nextLine();
{
    if (jeniskegiatan.equalsIgnoreCase("BELMAWA") ||
        jeniskegiatan.equalsIgnoreCase("BAKORMA") ||
        jeniskegiatan.equalsIgnoreCase("MANDIRI") ){   

        
        System.out.println("peringkat juara 1/2/3, 0 bukan juara");
        peringkatjuara = Tezzar.nextInt();

        if (peringkatjuara == 1 || peringkatjuara == 2 || peringkatjuara == 3 ) {
            System.out.println("Masukkan jumlah dokumen : ");
            jumlahdokumen = Tezzar.nextInt();
          

        if (jumlahdokumen == 4) {
            System.out.println(" memenuhi ketentuan, Dana penghargaan diberikan "); 

        } else {
            System.out.println(" Dokumen belum lengkap, Dana penghargaan tidak diberikan");
        }

        } else {
            System.out.println(" bukan juara, tidak memperoleh dana penghargaan");
        }
         
        }else if (jeniskegiatan.equalsIgnoreCase("PKM")) {
            System.out.println("jumlah dokumen : ");
            jumlahdokumen = Tezzar.nextInt();

            System.out.println("status pendanaan PKM : ");
            statuspkm = Tezzar.nextInt();

            if (statuspkm ==1) {
                System.out.println("lolos pendanaan, dana penghargaan diberikan");

                if (jumlahdokumen == 4) {
                    System.out.println("PKM Lolos, berhak memperoleh dana penghargaan");

                } else {
                    System.out.println("dokumen belum lengkap, dana penghargaan tidak diberikan");

                }

             
            } else {
                System.out.println("tidak lolos, tidak memperoleh dana penghargaan");

            }
    } else {
        System.out.println("jenis kegiatan diluar ketentuan, tidak memperoleh dana penghargaan");
    }

    Tezzar.close();

}
}
}
