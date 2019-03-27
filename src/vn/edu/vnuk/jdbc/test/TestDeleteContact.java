package vn.edu.vnuk.jdbc.test;

import java.sql.SQLException;
import java.util.Scanner;

import vn.edu.vnuk.jdbc.dao.ContactDao;

public class TestDeleteContact {

	public static void main(String[] args) throws SQLException {
		Scanner sc = new Scanner(System.in);
		System.out.print("DELETE: \n\t Input Id : ");
		Long id = sc.nextLong();
		ContactDao contactDao = new ContactDao();
		
		contactDao.delete(id);
	}
}
