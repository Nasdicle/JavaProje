import java.util.Scanner;
public class Login 
{
    public static void main(String[] args) 
    {
        // username : dicle , password : 12345
        String userName, password;
        Scanner input = new Scanner(System.in);
        System.out.print("Kullanıcı Adınız : ");
        userName = input.nextLine();
        System.out.print("Şifreniz : ");
        password = input.nextLine();
        if (userName.equals("dicle") && password.equals("12345")) 
        {
            System.out.println("Giriş Başarılı.");
        } 
        else if (!userName.equals("dicle") && password.equals("12345")) 
        {
            System.out.println("Kullanıcı adını yanlış girdiniz");
        } 
        else if (userName.equals("dicle") && !password.equals("12345")) 
        {
            System.out.println("Şifreniz yanlış !");
            System.out.print("Şifrenizi sıfırlamak ister misiniz ?\n1=Evet.\n2=Hayır. ");
            int resetpassword ;
            resetpassword = input.nextInt();
            switch (resetpassword) 
            {
                case 1 :
                    System.out.print("Yeni Şifreniz : " + input.nextLine());
                    String newPassword = input.nextLine();
                    if (newPassword.equals ("12345")) 
                    {
                    System.out.println("Yeni şifre , eski şifreyle aynı olamaz.");
                    break;
                    }
                    else 
                    {
                    System.out.println("Şifreniz başarıyla değiştirildi.");
                    break;
                    }
                case 2 :
                    System.out.println("Şifre sıfırlanmadı.");
                    break;
            }
        }
        else 
        {
            System.out.println("Bilgilerinizi kontrol ediniz !");
        }

    }
}
