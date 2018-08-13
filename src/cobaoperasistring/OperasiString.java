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
        
        System.out.println("perbandingan isi x dengan y : " + x.compareTo(y));
        System.out.println("perbandingan isi x dengan z (Case Sensitive) : "
        + x.compareTo(z));
        System.out.println("perbandingan isi x dengan r (Case Sensitive) : "
        + x.compareTo(r));
        System.out.println("perbandingan isi x dengan r (Not Case Sensitive) : "
                + x.compareToIgnoreCase(r));
        
        String s = "Operasi";
        System.out.println("isi variabel s : "+ s);
        System.out.println("perbandingan isi r dengan s (Case Sensitive) : "
                + r.compareTo(s));
        
        System.out.println("pada x terdapat huruf 'a' : " + x.contains("a"));
        
        System.out.println("isi variabel x besar semua : "+ x.toUpperCase());
        System.out.println("isi variabel x kecil semua : "+ x.toLowerCase());
        
        String t = "   operasi String   ";
        System.out.println("isi variabel t : \""+ t +"\"");
        System.out.println("isi variabel t tanpa spasi : \""+ t.trim() +"\"");
        
        System.out.println("gabungkan isi variabel x dengan r : "+ x.concat(r));
       }   
}
