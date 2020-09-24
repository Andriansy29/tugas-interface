
package tugasinterface;
public class Arsipku implements Biodata, Nilai{
    public static void main(String[] args) {
        Arsipku ps = new Arsipku ();
        ps.namakelompok();
        ps.tempatLahir();
        ps.hobi();
        ps.Agama();
        ps.BahasaIndonesia();
        ps.Matematika();
        ps.Namapembuat();
    }
    public void namakelompok() {
            System.out.println("Nama Kelompok                    : Rita Monika");
            System.out.println("                                                : Nila Ayu Hapsari");
            System.out.println("                                                : Salud Sabila");
    }
    public void tempatLahir() {
            System.out.println("Tempat Lahir                       : Jember01 Januari 2003");
            System.out.println("                                            : Jember09 September 2003");
            System.out.println("                                            : Jember21 April 2003");
    }
    public void hobi() {
            System.out.println("Hobi                                     : Makan");
            System.out.println("Hobi                                     : Tidur");
            System.out.println("Hobi                                     : Ghibah");
    }
     public void Agama() { 
            System.out.println("Nilai Agama                          : 80, 98, 79");
            System.out.println("                                             : 80, 98, 79");
            System.out.println("                                             : 80, 98, 79");
  }
       public void BahasaIndonesia() { 
            System.out.println("Nilai Bahasa Indonesia          : 98, 85, 87");
            System.out.println("                                             : 80, 98, 79");
            System.out.println("                                             : 80, 98, 79");
  }
       public void Matematika() { 
            System.out.println("Nilai Matematika                   : 100, 100, 100");
            System.out.println("                                              : 100, 100, 100");
            System.out.println("                                              : 100, 100, 100");
  }
       public void Namapembuat() { 
            System.out.println("Pembuat : Rita Monika");
  }
    }
