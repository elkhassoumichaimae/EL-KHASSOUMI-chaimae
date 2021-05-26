/**
 * 
 */
package com.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.model.User;
import com.util.DBinteraction;

/**
 * @author CHAIMAE
 *
 */
public class UserDao implements IUser{

	@Override
	public int adduser(User u) {
		DBinteraction.connect();
		int nb=DBinteraction.Maj("insert into user values(null,'"+u.getNom()+"','"+u.getLog()+"','"+u.getPass()+"','"+u.getRole()+"')");
		DBinteraction.disconnect();
		return nb;
	}

	@Override
	public int adduser(String nom, String log, String pass) {
		DBinteraction.connect();
		int nb=DBinteraction.Maj("insert into user values(null,'"+nom+"','"+log+"','"+pass+"')");
		DBinteraction.disconnect();
		return nb;
	}

	@Override
	public User authentification(String log, String pass) {
		User u=null;
		DBinteraction.connect();
		ResultSet rs = DBinteraction.select("select * from user where log='"+log+"' and pass='"+pass+"'");
		try {
			if(rs.next())
			{
				u=new User(rs.getInt(1),rs.getString(4), rs.getString(2), rs.getString(3), rs.getString(5));
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return u;
	}

}


