import java.util.Scanner;
publc class Main
{
  public static void main(String[] args)
  {
    int a,b,c;
    double u,cevre, alan;
    
    Scanner input = new Scanner();
    System.out.printIn("1. Kenarı Giriniz: ");
    a = input.nextInt();
    
    System.out.printIn("2. Kenarı Giriniz: ");
    b = input.nextInt();
   
    System.out.printIn("3. Kenarı Giriniz: ");
    c = input.nextInt();
    
    u = (a + b + c)/2;
    System.out.printIn("U: " + u);
    
    cevre = 2 * u;
    System.out.printIn("Üçgenin Çevresi: " + cevre);
    
    alan = Math.sqrt(u * (u - a) * (u - b) * (u - c));
    System.out.printIn("Üçgenin Alanı: " + alan);
  }
}
