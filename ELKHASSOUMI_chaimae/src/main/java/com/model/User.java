/**
 * 
 */
package com.model;

/**
 * @author CHAIMAE
 *
 */
public class User {
int id;
String nom,log,pass,role;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getNom() {
	return nom;
}
public void setNom(String nom) {
	this.nom = nom;
}
public String getLog() {
	return log;
}
public void setLog(String log) {
	this.log = log;
}
public String getPass() {
	return pass;
}
public void setPass(String pass) {
	this.pass = pass;
}
public String getRole() {
	return role;
}
public void setRole(String role) {
	this.role = role;
}
public User() {
	super();
	// TODO Auto-generated constructor stub
}
public User(int id, String nom, String log, String pass, String role) {
	super();
	this.id = id;
	this.nom = nom;
	this.log = log;
	this.pass = pass;
	this.role = role;
}
public User(String nom, String log, String pass, String role) {
	super();
	this.nom = nom;
	this.log = log;
	this.pass = pass;
	this.role = role;
}

/**
 * @return the id
 */
    }