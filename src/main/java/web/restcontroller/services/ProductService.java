package web.restcontroller.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import web.restcontroller.entities.Product;
import web.restcontroller.repos.ProductRepo;

@Component
public class ProductService {
	
	@Autowired
	ProductRepo prodRepo;

	public List<Product> getProducts() {
		return (List<Product>) prodRepo.findAll();
	}

	public void setProducts(Product p) {
		prodRepo.save(p);
		
	}

}
