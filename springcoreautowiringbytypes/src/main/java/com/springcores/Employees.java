package com.springcores;

public class Employees 
{
   private Address address;

public Address getAddress() {
	return address;
}

public void setAddress(Address address) {
	this.address = address;
}
//this no pramitries constract
public Employees() {
	super();
	// TODO Auto-generated constructor stub
}
//this is parametrise contracter
public Employees(Address address) {
	super();
	this.address = address;
	//aager aap paramert wala constecter call huga aaher  aap bean key
	//ander define kiya hai tu
	System.out.println("inside the constracter");
}

@Override
public String toString() {
	return "Employees [address=" + address + "]";
}
  

}
