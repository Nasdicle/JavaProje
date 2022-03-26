import java.util.Scanner; 
public class Main
{
  public static void Main(String[] args)
  {
    int sicaklik;
    Scanner input = new Scanner(System.in);
    sicaklik = input.nextInt();
    
    if(sicaklik < 5)
    {
      System.out.println("Kayağa gidebilirsiniz.")
    }
    elseif(sicaklik >=5 && sicaklik<15)
    {
      System.out.println("Sinemaya gidebilirsiniz.")
    }
    elseif(sicaklik >=15 && sicaklik<=25)
    {
      System.out.println("Pikniğe gidebilirsiniz.")
    }
    else
    {
      System.out.println("Yüzmeye gidebilirsiniz.")
    }
  }
}
