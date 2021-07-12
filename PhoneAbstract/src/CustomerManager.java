import java.util.Scanner;
public class CustomerManager {
    BasePhoneManager basePhoneManager;
    Scanner scanner = new Scanner(System.in);
    int phonePrice;
    double phoneOtv;
    void infoMessage(){
        System.out.println("-----------------\n< Telefon Ücret Bilgileri >\n-----------------");
        System.out.print("-> Telefon Geliþ Ücreti: ");
        phonePrice = scanner.nextInt();
        if(phonePrice>=3000){ // OTV Hesaplamasýný Yapacak if-else-if sorgusu
            phoneOtv = 0.4;
        }
        else if(phonePrice<=3000 && phonePrice>1500){
            phoneOtv = 0.25;
        }
        else {
            phoneOtv = 0.15;
        }
        System.out.println("-> Hükümlü Olduðunuz ÖTV Ücreti: %"+phoneOtv*100);
    }
    void doTheShopping(){
        System.out.println("-----------------\n< Telefon Bilgileri >\n-----------------");
        System.out.println("-> Telefon Markasý: "+basePhoneManager.getPhoneBrand());
        System.out.println("-> Telefon Modeli: "+basePhoneManager.phoneModel);
        System.out.println("-----------------\n< Telefon Hesaplamasý >\n-----------------");
        System.out.println("-> Telefon Fiyatý: "+ basePhoneManager.buyTelephone(phonePrice,phoneOtv));
        System.out.println("-----------------");
    }
}
