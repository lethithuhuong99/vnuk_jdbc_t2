package vn.edu.vnuk.jdbc.test;

import java.sql.SQLException;
import java.util.Scanner;

import vn.edu.vnuk.jdbc.dao.ContactDao;
import vn.edu.vnuk.jdbc.model.Contact;

public class TestReadContact {
	
	public static void main(String[] args) throws SQLException {
		Scanner sc = new Scanner(System.in);
		System.out.print("READ: \n\t Input Id: ");
		Long id = sc.nextLong();
		ContactDao contactDao = new ContactDao();
		Contact contact = contactDao.read(id);

	
		System.out.println(String.format("Id: %o", contact.getId()));
		System.out.println(String.format("Name: %s", contact.getName()));
		System.out.println(String.format("Address: %s", contact.getAddress()));
		System.out.println(String.format("Email: %s", contact.getEmail()));
		System.out.println(String.format("Date of register: %tD", contact.getDateOfRegister()));

	}
}