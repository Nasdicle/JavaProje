import java.util.Scanner;
publc class Main
{
  public static void main(String[] args)
  {
    double tutar,KDV=0.18, kdvTutar, kdvliTutar;
    
    Scanner input = new Scanner(System.in);
    System.out.printIn("Tutar Giriniz: ");
    tutar = input.nextDouble();
    
    kdvTutar = tutar * KDV;
    kdvliTutar = tutar + kdvTutar;
    
    System.out.printIn("KDV'siz Tutar: " + tutar);
    System.out.printIn("KDV Oranıi: " + KDV);
    System.out.printIn("KDV Tutarı: " + kdvTutar);
    System.out.printIn("KDV'li Tutarı: " + kdvliTutar);
  }
}
