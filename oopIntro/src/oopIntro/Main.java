package oopIntro;

public class Main {

	public static void main(String[] args) {
	
		Product product1 =new Product(1,"Lenovo v14",15000,"16 GB RAM",10, 0);
		
		Product product2 =new Product();
	    product2.setId(2);
	    product2.setName("Lenovo 15");
	    product2.setDetail("16 GB RAM");
	    product2.setDiscount(10);
	    product2.setUnitPrice(16000);
		
	    
	    System.out.println(product2.getUnitPriceAfterDiscount());
		//Product product3 =new Product();

		
		
		
		
   /*  Product [] products= {product1,product2,product3};
     for(Product product:products) {
    	 System.out.println(product.name);
     }
     
     
     System.out.println(products.length);*/
     
     
     
     
     
 	Category category1=new Category();
 	category1.setId(1);;
 	category1.setName("Bilgisayar");
 	
	Category category2=new Category();
	category2.setId(2);;
 	category2.setName("Ev Ürünleri");
	
	Category category3=new Category();
	category3.setId(3);;
 	category3.setName("Bahçe");
 	
 	System.out.println(category1.getName());
	System.out.println(category2.getName());
	System.out.println(category3.getName());
 	
 	
	}
}
	
	/*Category[]categorys= {category1,category2,category3};
	
	for(Category category:categorys) {
		System.out.println(category.getName());
	}*/
/*
 	ProductManager productManager=new ProductManager();
 	productManager.addToCart(product1);
	}
	*/
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

