package project1;
import java.util.Scanner;
public class ja {
    public static void main (String args[]) {
        int pemA,jumC,besC,uangKu,uangKuTe,sisaUaKu;
        String jurusan="";
        Scanner scanner = new Scanner (System.in);
        
        System.out.print ("Nama Mahasiswa     : ");
        String nama = scanner.next();
        System.out.print ("NPM                : ");
        String npm = scanner.next();
        System.out.print ("Kode               : ");
        String kode = scanner.next();
        System.out.print ("Pembayaran Ke     : ");
        int pemKe = scanner.nextInt();
        
        switch (kode){
            case "SI":
             jurusan = "Sistem Informasi";
             pemA = 2100000;
             jumC = 7;
             besC = 300000;
             break;
                
            case "TI":
             jurusan = "SISTEM Informasi";
             pemA = 2500000;
             jumC = 7;
             besC = 300000;
             break;
                
            case "KA":
             jurusan = "Komputer Akutansi";
             pemA = 1500000;
             jumC = 6;
             besC = 2500000;
             break;
                
            default:
             System.out.println("Kode jurusan tidak valid.");
             scanner.close();
             return;
        }
        uangKu = pemA + (jumC*besC);
        uangKuTe = pemA + (pemKe*besC);
        sisaUaKu = uangKu - uangKuTe;
        System.out.println("Mencari Sisa Uang Kuliah");
        System.out.println("PEMBAYARAN UANG KULIAH");
        System.out.println("=================================");
        System.out.println("Nama Mahasiswa         : "+nama);
        System.out.println("NPM                    : "+npm);
        System.out.println("Kode                   : "+kode);
        System.out.println("Jurusan                : "+jurusan);
        System.out.println("Pembayaran Awal Rp     : "+pemA);
        System.out.println("Jumlah Cicilan     : "+jumC);
        System.out.println("Besar Cicilan Rp   : "+besC);
        System.out.println("Pembayaran ke      : "+ pemKe);
        System.out.println("Uang Kuliah Rp     : "+uangKu);
        System.out.println("Uang Kuliah Terbayar Rp   : "+uangKuTe);
        System.out.println("Sisa Uang Kuliah Rp       : "+sisaUaKu);
        System.out.println("=================================");
        scanner.close();        
        
    }
    
}
