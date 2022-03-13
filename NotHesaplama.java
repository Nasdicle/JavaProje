import java.util.Scanner;
public class NotHesaplama 
{
public static void main(String[] args)
{
  int mat, fizik, kimya, turkce, tarih, muzik;
  Scanner scanner = new Scanner(System.in);
  
  System.out.println("Matematik Notunuzu Girin:  ");
  mat = scanner.nextInt();
  
  System.out.println("Fizik Notunuzu Girin:  ");
  fizik = scanner.nextInt();
  
  System.out.println("Kimya Notunuzu Girin:  ");
  kimya = scanner.nextInt();
  
  System.out.println("Türkçe Notunuzu Girin:  ");
  turkce = scanner.nextInt();
  
  System.out.println("Tarih Notunuzu Girin:  ");
	tarih = scanner.nextInt();
  
  System.out.println("Müzik Notunuzu Girin:  ");
	muzik = scanner.nextInt();
  
  float Ortalama = (mat + fizik + kimya + turkce + tarih + muzik) / 6 ;
  System.out.println("Not ortalamanız: " + Ortalama);
  
  System.out.println(Ortalama > 60 ? "Sınıfı geçtiniz" : "Sınıfta kaldınız");
}
}
