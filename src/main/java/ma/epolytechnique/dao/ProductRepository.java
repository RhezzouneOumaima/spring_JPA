package ma.epolytechnique.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ma.epolytechnique.metier.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long>{
	
}
