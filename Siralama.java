import java.util.Scanner;

public class Main()
{
  public static void main(String[] args)
  {
    int a,b,c;
    Scanner input = nes Scanner(System.in);
    
    System.out.println("1.sayıyı giriniz: ");
    a=input.nextInt();
    
    System.out.println("2.sayıyı giriniz: ");
    b=input.nextInt();
    
    System.out.println("3.sayıyı giriniz: ");
    c=input.nextInt();
    
    if ((a > b) && (a > c)) 
    {
            if (b > c) 
            {
                System.out.println("a > b > c");
            } 
            else if (c > a) 
            {
                System.out.println("a > c > b");
            }
    } 
    else if ((b > a) && (b > c)) 
    { 
            if (a > c) 
            {
                System.out.println("b > a > c");
            } 
            else if (c > a) 
            {
                System.out.println("b > c > a");
            } 
    }
    else if ((c > a) && (c > b)) 
    {
            if (a > b) 
            {
                System.out.println("c > a > b");
            } 
            else if (b > a) 
            {
                System.out.println("c > b > a");
            }
    }

        if ((a == b) && (a > c)) 
        {
            System.out.println("a = b > c");
        } 
        else if ((a == b) && (c > a)) 
        {
            System.out.println("c > a = b");
        }

        if ((a == c) && (a > b)) 
        {
            System.out.println("a = c > b");
        } 
        else if ((a == c) && (b > a)) 
        {
            System.out.println("b > a = c");
        }

        if ((c == b) && (c > a)) 
        {
            System.out.println("c = b > a");
        } 
        else if ((c == b) && (a > c)) 
        {
            System.out.println("a > c = b");
        } 

        if ((a == b) && (a == c) && (c == b)) 
        {
            System.out.print("a = b = c");
        }
  }
}
