public class ApplePhoneManager extends BasePhoneManager{
    ApplePhoneManager(String phoneModel){
        setPhoneBrand("Apple");
        super.phoneModel = phoneModel;
    }
    @Override
    public double buyTelephone(int price, double otv){
        double totalTax = ((price*0.18)+(price*0.10)+(price*0.01));
        return (price+(price*otv)+totalTax+(price*0.20)); // Iphone telefon alanlara %20 bir ekstra fiyat ekliyoruz.
    }
}