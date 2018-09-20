package web.restcontroller.repos;

import org.springframework.data.repository.CrudRepository;

import web.restcontroller.entities.Product;

public interface ProductRepo extends CrudRepository<Product, Long>{

}
