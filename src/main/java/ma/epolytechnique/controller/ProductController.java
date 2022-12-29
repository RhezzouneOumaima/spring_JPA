package ma.epolytechnique.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import ma.epolytechnique.metier.ProductService;

@Controller
public class ProductController {
	@Autowired
	private ProductService productService;
	
	@RequestMapping(value = "/products",method =RequestMethod.GET)
	public String allproducts(Model model)
	{
		model.addAttribute("products",productService.allproduct());
		return "products";
	}

}
