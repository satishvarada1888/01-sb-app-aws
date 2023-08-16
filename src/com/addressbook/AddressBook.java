package com.addressbook;

import java.util.ArrayList;
import java.util.List;

public class AddressBook {
	private String addrBookName;
	private String addrBookType; 
	private ArrayList<Contact> myAddrBook;
	
	AddressBook(){
	}
	
	public AddressBook(String addrBookName,String addrBookType,ArrayList<Contact> myAddrBook) {
		super();
		this.addrBookName=addrBookName;
		this.addrBookType=addrBookType;
		this.myAddrBook=new ArrayList<Contact>();
	}

	public String getAddrBookName() {
		return addrBookName;
	}

	public void setAddrBookName(String addrBookName) {
		this.addrBookName = addrBookName;
	}

	public String getAddrBookType() {
		return addrBookType;
	}

	public void setAddrBookType(String addrBookType) {
		this.addrBookType = addrBookType;
	}

	public ArrayList<Contact> getMyAddrBook() {
		return myAddrBook;
	}

	public void setMyAddrBook(ArrayList<Contact> myAddrBook) {
		this.myAddrBook = myAddrBook;
	}
	
	//Add contact to the addressbook
	public  List addContact(String name,String address,int phoneNumber){
		//contact not availble then add contact using ==null
		if(searchContact(phoneNumber) == null) {
			System.out.println("Adding New Contact");
			this.myAddrBook.add(new Contact(name,phoneNumber,address));
		}
		else {
			System.out.println("This PhoneNumber Already Exists");
			return  null;
			}
		return  myAddrBook ;
		
	}
	//search contact in the addressbook class
	//check whether the phonenumber is available in the Contact class
	public Contact searchContact(int phoneNumber){
		for(Contact c:myAddrBook) {
			if(c.getPhoneNumber() == phoneNumber) {
				return c;
			}
		}
		return null;
		
	}
	
	
}
