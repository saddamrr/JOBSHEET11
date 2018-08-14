package cobaoperasistring;
import java.util.Scanner;
public class ConvertVocal2Angka {
    private static void tampilJudul(String identitas)
    {
        System.out.println("Identitas : " + identitas);
        System.out.println("\nConvert Kalimat Alay (Vokal Ke Angka)\n");
    }
    
    public static void main(String[] args) {
        String identitas = "SADDAM RAIHAN RAMADHAN / XRPL2 / 30";
        
        tampilJudul(identitas);
    }
}
