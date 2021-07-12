public abstract class BasePhoneManager {
    private String phoneBrand; // Telefon Markas� ��in De�i�kenimiz.
    public String phoneModel; // Telefon Modelimizi Haf�zas�nda Tutacak De�i�ken
    public void setPhoneBrand(String phoneBrand){
        this.phoneBrand = phoneBrand; // Telefon Markam�z� Belirledik.
    }
    public String getPhoneBrand() {
        return phoneBrand;
    }
    public abstract double buyTelephone(int price,double otv);

}