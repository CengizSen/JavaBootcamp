import java.util.Scanner;
public class CustomerManager {
    BasePhoneManager basePhoneManager;
    Scanner scanner = new Scanner(System.in);
    int phonePrice;
    double phoneOtv;
    void infoMessage(){
        System.out.println("-----------------\n< Telefon �cret Bilgileri >\n-----------------");
        System.out.print("-> Telefon Geli� �creti: ");
        phonePrice = scanner.nextInt();
        if(phonePrice>=3000){ // OTV Hesaplamas�n� Yapacak if-else-if sorgusu
            phoneOtv = 0.4;
        }
        else if(phonePrice<=3000 && phonePrice>1500){
            phoneOtv = 0.25;
        }
        else {
            phoneOtv = 0.15;
        }
        System.out.println("-> H�k�ml� Oldu�unuz �TV �creti: %"+phoneOtv*100);
    }
    void doTheShopping(){
        System.out.println("-----------------\n< Telefon Bilgileri >\n-----------------");
        System.out.println("-> Telefon Markas�: "+basePhoneManager.getPhoneBrand());
        System.out.println("-> Telefon Modeli: "+basePhoneManager.phoneModel);
        System.out.println("-----------------\n< Telefon Hesaplamas� >\n-----------------");
        System.out.println("-> Telefon Fiyat�: "+ basePhoneManager.buyTelephone(phonePrice,phoneOtv));
        System.out.println("-----------------");
    }
}
