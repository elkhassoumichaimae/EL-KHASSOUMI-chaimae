package com.dao;

import java.util.List;

import com.model.livre;

public interface ilivre {

	

	public int addlivre(livre p);
	public int addlivre(String titre, String catégorie,int nbpages, String auteur);
	public livre findlivreById(int idl);
	public int deletlivre(int idl);
	public List<livre>allivre();
	public int updatelivre(int idl, livre p);

	}

