public class SamsungPhoneManager extends BasePhoneManager{
    SamsungPhoneManager(String phoneModel){
        setPhoneBrand("Samsung");
        super.phoneModel = phoneModel;

    }
    @Override
    public double buyTelephone(int price, double otv){
        double totalTax = ((price*0.18)+(price*0.10)+(price*0.01));
        return (price+(price*otv)+totalTax)-250;
    }
}