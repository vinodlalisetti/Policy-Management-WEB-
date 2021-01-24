package model;

public class Policy {
private int id;
private String name;
private long contact;

public Policy()
{
	
}

public Policy(int id,String name,long contact) 
{
	this.id=id;
	this.name=name;
	this.contact=contact;
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public long getContact() {
	return contact;
}

public void setContact(long contact) {
	this.contact = contact;
}






}
