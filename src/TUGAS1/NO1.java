
package TUGAS1;
import java.util.Scanner;
public class NO1 {
    public static void main(String args[]){
        //instalasi objek scanner
        Scanner scanner = new Scanner (System.in);       
        System.out.print("NIM                :");
        String nim = scanner.next();
        System.out.print("NAMA MHS           :");
        String nama = scanner.next();
        System.out.print("NILAI TUGAS        :");
        float nilaiTugas = scanner.nextFloat();
        System.out.print("NILAI MID          :");
        float mid = scanner.nextFloat();
        System.out.print("NILAI SEMESTER    :");
        float nilaiSemester = scanner.nextFloat();
        scanner.close();
        
        float nilaiAkhir = (nilaiTugas * 30 / 100) + (mid * 30 / 100) + (nilaiSemester * 40 / 100);
        
        String nilaiHuruf ;
        if(nilaiAkhir >= 0 && nilaiAkhir <= 100) {
            if (nilaiAkhir >= 86) {
                nilaiHuruf = "A";
            } else if (nilaiAkhir >= 81) {
                nilaiHuruf = "A-";
            } else if (nilaiAkhir >= 76) {
                nilaiHuruf = "B+";
            } else if (nilaiAkhir >= 71) {
                nilaiHuruf = "B";
            } else if (nilaiAkhir >= 66) {
                nilaiHuruf = "B-";
            } else if (nilaiAkhir >= 61) {
                nilaiHuruf = "C+";
            } else if (nilaiAkhir >= 56) {
                nilaiHuruf = "c";
            } else if (nilaiAkhir >= 41) {
                nilaiHuruf = "D";                                      
            } else {
                nilaiHuruf = "E";
            }
        }else {
            nilaiHuruf = "NilaiAkhir di luar rentang 0-100. Program berhenti.";
            System.exit(0);
        }
        
        System.out.println("Data Nilai Ujian Algoritma dan Pemograman");
        System.out.println("-----------------------------------------");
        System.out.println("NIM             : " + nim);
        System.out.println("NAMA MHS        : " + nama);
        System.out.println("NILAI TUGAS     : " + nilaiTugas);
        System.out.println("NILAI MID       : " + mid);
        System.out.println("NILAI SEMESTER  : " + nilaiSemester);
        System.out.println("NILAI AKHIR     : " + nilaiAkhir);
        System.out.println("NILAI HURUF     : " + nilaiHuruf);
        System.out.println("------------------------------------------");
        scanner.close();        
    }    
}
