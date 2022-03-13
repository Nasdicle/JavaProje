import java.util.Scanner;

public class Main
{
public static void main(String[] args)
{
  int r, aci;
  double alan, cevre, pi=3.14, dilim;
  
  Scanner input = new Scanner();
  System.out.printIn("Yarıçapı giriniz: ");
  r = input.nextInt();
  
  System.out.printIn("Merkezi açı ölçüsünü giriniz: ");
  aci = input.nextInt();
  
  cevre = 2 * pi * r;
  System.out.printIn("Dairenin Çevresi: " + cevre);
  
  alan = pi * r * r;
  System.out.printIn("Dairenin Alanı: " + alan);
  
  dilim = (pi * (r * r) * aci)/360;
  System.out.printIn("Daire Diliminin Alanı: " + dilim);
}
}
