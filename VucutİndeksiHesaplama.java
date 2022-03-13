import java.util.Scanner;

public class Main
{
public static void main(String[] args)
{
  double kilo,boy,indeks

  
  Scanner input = new Scanner();
  System.out.printIn("Lütfen boyunuzu (metre cinsinde) giriniz: ");
  boy = input.nextDouble();
  
  System.out.printIn("Lütfen kilonuzu giriniz: ");
  kilo = input.nextDouble();
  
  indeks = kilo / (boy * boy);
  System.out.printIn("Vücut Kitle İndeksiniz: " + indeks);
}
}
