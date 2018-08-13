package cobaoperasistring;
import java.util.Locale;
public class OperasiString {

    public static void main(String[] args) {
        String identitas = "SADDAM RAIHAN RAMADHAN / XRPL 2 / 30";
        System.out.println("identitas : " + identitas);
        
        String x = "Operasi";
        System.out.println("isi variabel x : "+ x);
        System.out.println("\""+ x + "\" panjang karakter ="+ x.length());
        
        System.out.println("x adalah kosong : " + x.isEmpty());
        
        String y = "";
        System.out.println("isi variabel y : "+ y);
        System.out.println("y adalah kosong : " + y.isEmpty());
       }   
}
