package vn.edu.vnuk.jdbc.test;

import java.sql.SQLException;
import java.util.Calendar;
import java.util.Scanner;

import vn.edu.vnuk.jdbc.dao.ContactDao;
import vn.edu.vnuk.jdbc.model.Contact;

public class TestUpdateContact {

	public static void main(String[] args) throws SQLException{
		
	    Scanner sc = new Scanner(System.in);
	    
	    System.out.print("UPDATE: \n\t Input Id: ");
	    long id = sc.nextLong();
	    ContactDao contactDao = new ContactDao();
		
		Contact newContact = contactDao.read(id);
		
		System.out.println("INPUT NEW DATA! IF NOT CHANGE, ENTER '0' ");
		
		System.out.print("\t Input new name: ");
		String name = sc.next();
		
		System.out.print("\t Input new email: ");
		String email = sc.next();
		
		System.out.print("\t Input new address: ");
		String address = sc.next();
		
		if (!name.equals("0")) {
			newContact.setName(name);
			System.out.println("NAME CHANGED!");
		} else {
			System.out.println("NAME UNCHANGED!");
		}
		
		if (!email.equals("0")) {
			newContact.setEmail(email);
			System.out.println("EMAIL CHANGED");
		} else {
			System.out.println("EMAIL UNCHANGED");

		}
		
		if (!address.equals("0")) {
			newContact.setAddress(address);
			System.out.println("ADDRESS CHANGED");
		} else {
			System.out.println("ADDRESS UNCHANGED");

		}

		contactDao.update(id, newContact);
		
	}
}
