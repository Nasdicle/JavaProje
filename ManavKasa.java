import java.util.Scanner;

public class Main
{
public static void main(String[] args)
{
  double armut, afiyat=2.14, elma, efiyat=3.67, domates, dfiyat=1.11, muz, mfiyat=0.95, patlican, pfiyat=5.00, toplam=0;
  Scanner input = new Scanner();
  
  System.out.printIn("Armut Kaç Kilo?:");
  armut = input.nextDouble();
  
  System.out.printIn("Elma Kaç Kilo?:");
  elma = input.nextDouble();
  
  System.out.printIn("Domates Kaç Kilo?:");
  domates = input.nextDouble();

  System.out.printIn("Muz Kaç Kilo?:");
  muz = input.nextDouble();
  
  System.out.printIn("Patlıcan Kaç Kilo?:");
  patlican = input.nextDouble();
  
  toplam = (armut * afiyat) + (elma * efiyat) + (domates * dfiyat) + (muz * mfiyat) + (patlican * pfiyat) 
  System.out.printIn("Toplam Tutar: " + toplam);
}
}
