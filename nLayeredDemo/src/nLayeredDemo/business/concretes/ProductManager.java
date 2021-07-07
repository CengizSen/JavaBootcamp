package nLayeredDemo.business.concretes;

import java.util.List;

import nLayeredDemo.business.abstracts.ProductService;
import nLayeredDemo.core.LoggerService;
import nLayeredDemo.dataAccess.abstracts.ProductDao;
import nLayeredDemo.entities.concretes.Product;

public class ProductManager implements ProductService {

	private ProductDao productDao;
	private LoggerService loggerService;
	
	public ProductManager(ProductDao dao,LoggerService loggerService) {
		super();
		this.productDao = dao;
		this.loggerService=loggerService;
	}

	@Override
	public void add(Product product) {
       if (product.getId()==1) {
		System.out.println("Bu Kategoride �r�n Kabul Edilmemektedir.");
		return;
		
	       }
       
      this.productDao.add(product);
      this.loggerService.logToSystem("Urun Eklendi"+product.getName());
       
	}

	@Override
	public List<Product> getAll() {
		return null;
	}

	
}
