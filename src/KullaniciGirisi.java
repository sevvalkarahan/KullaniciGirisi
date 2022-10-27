import java.util.Scanner;

public class KullaniciGirisi {
    public static void main(String[] args) {
        Scanner klavye=new Scanner(System.in);
        System.out.println("Kullanıcı adınızı giriniz: ");
        String userName=klavye.nextLine();
        System.out.println("Şifrenizi giriniz: ");
        String password=klavye.nextLine();
        if (userName.equals("kodluyoruz") && password.equals("java101"))
            System.out.println("GİRİŞ YAPTINIZ.");
        else {
            System.err.println("Kullanıcı adı veya şifre hatalı");
            System.out.println("şifrenizi sıfırlamak ister misiniz? (evet veya hayır) ");
            String cvp=klavye.nextLine();
            if (cvp.equals("hayır")){
                System.out.println("Sistemden çıkılıyor.");
            }
            else if (cvp.equals("evet")){

                    System.out.println("Yeni şifre:");
                    String newPassword = klavye.nextLine();

                    if (newPassword.equals("java101") || newPassword.equals(password))
                        System.err.println("yeni şifre eskisiyle ve hatalı girdiğiniz şifre ile aynı olamaz.");
                    else
                        System.out.println("Yeni şifre oluşturuldu.");
                }
            else
                System.err.println("Geçersiz işlem !!");
        }
    }
}
