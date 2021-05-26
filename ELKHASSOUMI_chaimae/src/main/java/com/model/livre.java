/**
 * 
 */
package com.model;

/**
 * @author CHAIMAE
 *
 */
public class livre {

	int idl;
	String titre,catégorie;
	int nbpages;
	String auteur;
	public int getIdl() {
		return idl;
	}
	public void setIdl(int idl) {
		this.idl = idl;
	}
	public String getTitre() {
		return titre;
	}
	public void setTitre(String titre) {
		this.titre = titre;
	}
	public String getCatégorie() {
		return catégorie;
	}
	public void setCatégorie(String catégorie) {
		this.catégorie = catégorie;
	}
	public int getNbpages() {
		return nbpages;
	}
	public void setNbpages(int nbpages) {
		this.nbpages = nbpages;
	}
	public String getAuteur() {
		return auteur;
	}
	public void setAuteur(String auteur) {
		this.auteur = auteur;
	}
	public livre() {
		super();
		// TODO Auto-generated constructor stub
	}
	public livre(int idl, String titre, String catégorie, int nbpages, String auteur) {
		super();
		this.idl = idl;
		this.titre = titre;
		this.catégorie = catégorie;
		this.nbpages = nbpages;
		this.auteur = auteur;
	}
	public livre(String titre, String catégorie, int nbpages, String auteur) {
		super();
		this.titre = titre;
		this.catégorie = catégorie;
		this.nbpages = nbpages;
		this.auteur = auteur;
	}
	

}
