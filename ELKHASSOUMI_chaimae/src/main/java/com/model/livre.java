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
	String titre,cat�gorie;
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
	public String getCat�gorie() {
		return cat�gorie;
	}
	public void setCat�gorie(String cat�gorie) {
		this.cat�gorie = cat�gorie;
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
	public livre(int idl, String titre, String cat�gorie, int nbpages, String auteur) {
		super();
		this.idl = idl;
		this.titre = titre;
		this.cat�gorie = cat�gorie;
		this.nbpages = nbpages;
		this.auteur = auteur;
	}
	public livre(String titre, String cat�gorie, int nbpages, String auteur) {
		super();
		this.titre = titre;
		this.cat�gorie = cat�gorie;
		this.nbpages = nbpages;
		this.auteur = auteur;
	}
	

}
