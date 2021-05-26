/**
 * 
 */
package com.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.model.livre;
import com.util.DBinteraction;



/**
 * @author CHAIMAE
 *
 */
public class livreDao implements ilivre {


	@Override
	public int addlivre(livre p) {

		DBinteraction.connect();
		int j=DBinteraction.Maj("insert into livre values(null,'"+p.getTitre()+"','"+p.getCatégorie()+"',"+p.getNbpages()+",'"+p.getAuteur()+"')");
		DBinteraction.disconnect();
		
		return j;
	}
	@Override
	public int addlivre(String titre, String catégorie, int nbpages, String auteur) {

		DBinteraction.connect();
		int j=DBinteraction.Maj("insert into livre(`titre`,`catégorie`,`nbpages`,`auteur`)  values('"+titre+"','"+catégorie+"',"+nbpages+",'"+auteur+"')");
		DBinteraction.disconnect();
		
		return j;
	}

	@Override
	public livre findlivreById(int idl) {
		livre p=null;
		DBinteraction.connect();
		ResultSet rs = DBinteraction.select("select * from livre where idl="+idl);
		try {
			if (rs.next())
			{ 
				p=new livre(rs.getString(2),rs.getString(3),rs.getInt(4),rs.getString(5));
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return p;
	}

	@Override
	public int deletlivre(int idl) {
		DBinteraction.connect();
		int nb=DBinteraction.Maj("delete  from livre where idl="+idl);
		DBinteraction.disconnect();
		
		return nb;
	}

	@Override
	public List<livre> allivre() {
		
		List<livre> livres=new ArrayList<livre>();
		DBinteraction.connect();
		ResultSet rs = DBinteraction.select("select * from livre ");
		try {
			while (rs.next())
			{ 
				livre p=new livre(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getInt(4),rs.getString(5));
				livres.add(p);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return livres;
		}
	@Override
	public int updatelivre(int idl, livre p) {
	
		DBinteraction.connect();
		int nb=DBinteraction.Maj("update livre set titre='"+p.getTitre()+"',catégorie='"+p.getCatégorie()+"',nbpages="+p.getNbpages()+",+auteur='"+p.getAuteur()+"' where idl ="+idl );
		DBinteraction.disconnect();
		return nb;
	}

}
