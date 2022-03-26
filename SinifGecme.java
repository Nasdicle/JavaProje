mport java.util.Scanner;

public class SinifGecme {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double mat,fizik,turkce,kimya,muzik,toplam=0,ortalama;
        int ders = 0;

        System.out.print("Matematik notunuz: ");
        mat = input.nextDouble();
        if (mat >= 0 && mat <= 100) 
        {
            toplam += mat;
            ders++;
        }

        System.out.print("Fizik notunuz: ");
        fizik = input.nextDouble();
        if (fizik >= 0 && fizik <= 100) 
        {
            toplam += fizik;
            ders++;
        }

        System.out.print("Türkçe notunuz: ");
        turkce = input.nextDouble();
        if (turkce >= 0 && turkce <= 100) 
        {
           toplam += turkce;
           ders++;
        }

        System.out.print("Kimya notunuz: ");
        kimya = input.nextDouble();
        if (kimya >= 0 && kimya <= 100) 
        {
            toplam += kimya;
            ders++;
        }

        System.out.print("Müzik notunuz: ");
        muzik = input.nextDouble();
        if (muzik >= 0 && muzik <= 100) 
        {
            toplam += muzik;
            ders++;
        }

        ortalama = toplam / ders;

        System.out.println("Ortalama notunuz: " + ortalama);

        if (ortalama >= 55) 
        {
            System.out.println("Tebrikler, sınıfı geçtiniz!");
        } 
        else 
        {
            System.out.println("Sınıfta kaldınız.");
        }
    }
}
