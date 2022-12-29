package ma.epolytechnique;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import ma.epolytechnique.metier.Product;
import ma.epolytechnique.metier.ProductService;
import ma.epolytechnique.metier.ProductServiceImpl;

@SpringBootApplication
public class DemoJpa1Application {

	@Autowired
	private ProductServiceImpl productServiceImpl;
	public static void main(String[] args) {
		/*ApplicationContext ctx= */
		SpringApplication.run(DemoJpa1Application.class, args);
		/*ProductService service=ctx.getBean(ProductService.class);
		service.ajouter(new Product("Product1",300,20));
		service.ajouter(new Product("Product2",200,10));
		service.ajouter(new Product("Product3",100,30));*/

	}

}
