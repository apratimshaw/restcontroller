package web.restcontroller.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import web.restcontroller.entities.Product;
import web.restcontroller.services.ProductService;

@RestController
public class ProductController {
	
	@Autowired
	ProductService prodService;
	
	@GetMapping("/products")
	public List<Product> getProducts() {
		List<Product> plist = prodService.getProducts();
		return plist;
	}
	
	@PostMapping("/products")
	public void setProducts() {
		Product pb = new Product();
		 prodService.setProducts(pb);
	}

}
