package cobaoperasistring;

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
        
        System.out.println("isi x sama dengan y : " + x.equals(y));
        
        String z = "Operasi";
        System.out.println("isi variabel z : "+ z);
        System.out.println("isi x sama dengan z(Case Sensitive): "
        + x.equals(z));
        
        String r = "Operasi";
        System.out.println("isi variabel z : "+ z);
        System.out.println("isi x sama dengan r (Case Sensitive) : "
        + x.equals(r));
        System.out.println("isi x sama dengan r (Not Case Sensitive) : "
        + x.equalsIgnoreCase(r));
       }   
}
