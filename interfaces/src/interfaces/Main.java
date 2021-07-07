package interfaces;

public class Main {

	public static void main(String[] args) {
		Logger[] loggers= {new SmsLogger(),new DatabaseLogger()};
   
		CustomerManager customerManager=new CustomerManager(loggers);
		
		Customer Cengiz=new Customer(1,"Cengiz","Þen");
		customerManager.add(Cengiz);
		
	}

}
   