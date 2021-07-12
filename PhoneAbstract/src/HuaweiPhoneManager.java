public class HuaweiPhoneManager extends BasePhoneManager{
    HuaweiPhoneManager(String phoneModel){
        setPhoneBrand("Huawei");
        super.phoneModel = phoneModel;
    }
    @Override
    public double buyTelephone(int price, double otv){
        double totalTax = ((price*0.18)+(price*0.10)+(price*0.01));
        return (price+(price*otv)+totalTax-(price*0.25)); // Huawei telefon alanlara %25 bir ekstra fiyat ekliyoruz.
    }
}