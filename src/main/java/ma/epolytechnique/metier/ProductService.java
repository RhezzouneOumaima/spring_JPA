package ma.epolytechnique.metier;

import java.util.List;

public interface ProductService {
	
	public Product chercher(long id);
	public List<Product> allproduct();
	public Product ajouter(Product p);
	public void supprimer(long id);
	public void modifier(long id, String libelle, int prix, int quantite);

	

}
