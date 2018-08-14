package cobaoperasistring;
import java.util.Scanner;
public class ConvertVocal2Angka {
    private static void tampilJudul(String identitas)
    {
        System.out.println("Identitas : " + identitas);
        System.out.println("\nConvert Kalimat Alay (Vokal Ke Angka)\n");
    }
    private static String tampilInput() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Masukkan Kalimat : ");
        String kalimat = scanner.nextLine();
        System.out.println("Kalimat Asli : " + kalimat);
        
        return kalimat;
    }
    public static void main(String[] args) {
        String identitas = "SADDAM RAIHAN RAMADHAN / XRPL2 / 30";
        
        tampilJudul(identitas);
        String kalimat = tampilInput();
    }
}
