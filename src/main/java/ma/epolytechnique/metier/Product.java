package ma.epolytechnique.metier;

import java.io.Serializable;

import javax.persistence.*;

@Entity
public class Product implements Serializable{

@Id
@GeneratedValue
private long idprod;
private String libelle;
private int prix;
private int quantite;


public Product() {
super();
// TODO Auto-generated constructor stub
}
public Product( String libelle, int prix, int quantite) {
super();
this.libelle = libelle;
this.prix = prix;
this.quantite = quantite;
}
public long getIdprod() {
return idprod;
}
public void setIdprod(long idprod) {
this.idprod = idprod;
}
public String getLibelle() {
return libelle;
}
public void setLibelle(String libelle) {
this.libelle = libelle;
}
public int getPrix() {
return prix;
}
public void setPrix(int prix) {
this.prix = prix;
}
public int getQuantite() {
return quantite;
}
public void setQuantite(int quantite) {
this.quantite = quantite;
}




}




