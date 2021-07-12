public abstract class BasePhoneManager {
    private String phoneBrand; // Telefon Markasý Ýçin Deðiþkenimiz.
    public String phoneModel; // Telefon Modelimizi Hafýzasýnda Tutacak Deðiþken
    public void setPhoneBrand(String phoneBrand){
        this.phoneBrand = phoneBrand; // Telefon Markamýzý Belirledik.
    }
    public String getPhoneBrand() {
        return phoneBrand;
    }
    public abstract double buyTelephone(int price,double otv);

}