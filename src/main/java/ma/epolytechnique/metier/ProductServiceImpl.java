package ma.epolytechnique.metier;

import java.util.List;
import ma.epolytechnique.dao.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService{

	@Autowired
	private ProductRepository myrep;
	@Override
	public Product chercher(long id) {
		return myrep.getOne(id);
	}

	@Override
	public List<Product> allproduct() {
		// TODO Auto-generated method stub
		return myrep.findAll();
	}

	@Override
	public Product ajouter(Product p) {
		// TODO Auto-generated method stub
		return myrep.save(p);
	}

	@Override
	public void supprimer(long id) {
		// TODO Auto-generated method stub
		 myrep.deleteById(id);
	}

	@Override
	public void modifier(long id, String libelle, int prix, int quantite) {
		// TODO Auto-generated method stub
        Product p;
        if(myrep.existsById(id))
        {
        	p=myrep.getOne(id);
        	p.setLibelle(libelle);
        	p.setPrix(prix);
        	p.setQuantite(quantite);
        	
        }
	}

}
