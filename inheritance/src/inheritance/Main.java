package inheritance;

public class Main {

	public static void main(String[] args) {
	IndividualCustomer Cengiz=new IndividualCustomer();
	Cengiz.customerNumber="25";
	
	
	
	CorporateCustomer hepsiBurada=new CorporateCustomer();
	hepsiBurada.customerNumber="2589";
	
	CustomerManager customerManager=new CustomerManager();
	
/*	customerManager.add(hepsiBurada);
    customerManager.add(Cengiz);	*/
 
	Customer[] customers= {Cengiz,hepsiBurada};
	
	customerManager.addMultiple(customers);
	}

}
