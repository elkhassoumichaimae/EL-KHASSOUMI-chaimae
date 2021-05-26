/**
 * 
 */
package com.util;

import com.dao.livreDao;

/**
 * @author CHAIMAE
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
livreDao pm=new livreDao();
int nbr=pm.addlivre("formidable","japon",400,"ALI");
		
System.out.println("salam"+nbr);


}

}
