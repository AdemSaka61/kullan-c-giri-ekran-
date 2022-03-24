import java.util.Scanner;


public class signİn {
    public static void main(String[] args) {
        String userName, password, select;

        Scanner input = new Scanner(System.in);

        System.out.print("Kullanıcı Adını Giriniz :");
        userName = input.nextLine();

        System.out.print("Şifreyi Giriniz :");
        password = input.nextLine();

        if (userName.equals("patika") && password.equals("java123")) {
            System.out.println("Giriş Başarılı");
        } else {
            System.out.println("Bilgiler Hatalı");
        }
        if (userName != "patika" || password != "java123") {
            System.out.println("Şifreyi Sıfırla");

            System.out.print("Yeni Şifreyi Giriniz :");
            select = input.nextLine();
            password=select;

        } if (password.equals("java123")){

            System.out.println("Şifre Oluşturulamadı");
        } else {
            System.out.println("Şifre Oluşturuldu");
        }


    }


}

