package vn.edu.vnuk.jdbc.test;

import java.sql.SQLException;
import java.util.Calendar;
import java.util.Scanner;

import vn.edu.vnuk.jdbc.dao.ContactDao;
import vn.edu.vnuk.jdbc.model.Contact;

public class TestUpdateContact {

		public static void main(String[] args) throws SQLException{
			Scanner sc = new Scanner(System.in);
			System.out.print("UPDATE: \n\t Input Id : ");
			Long id = sc.nextLong();
			ContactDao contactDao = new ContactDao();
			
			Contact contact = contactDao.read(id);
			
			contact.setName("Han");
			contact.setEmail("GiaHan@gmail.com");
			contact.setAddress("Da Nang");
			contact.setDateOfRegister(Calendar.getInstance());
			
			contactDao.update(id, contact);
			
		}

}
