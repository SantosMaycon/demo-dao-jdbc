package application;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		SellerDao sellerDao = DaoFactory.createSellerDao();

		System.out.println("=== TEST 1: seller findById =====");
		Seller seller = sellerDao.findById(3);
		System.out.println(seller);
		
		System.out.println("\n=== TEST 2: seller findByDepartment =====");
		Department department = new Department(1, null);
		List<Seller> list = sellerDao.findByDepartment(department);
		for (Seller obj : list) {
			System.out.println(obj);
		}
		
		System.out.println("\n=== TEST 3: seller findAll =====");
		list = sellerDao.findAll();
		for (Seller obj : list) {
			System.out.println(obj);
		}
		
		System.out.println("\n=== TEST 4: seller Insert =====");
		seller.setName("Alex Grey Two");
		sellerDao.insert(seller);
		System.out.println("Id new seller:" + seller.getId());
		
		System.out.println("\n=== TEST 5: seller Update =====");
		Seller obj = new Seller(2, "Maycon Alves", "mayconalves.santos14@gmail.com", new Date(), 600.0, new Department(3, null));
		System.out.println(obj);
		sellerDao.update(obj);
		
		System.out.println("\n=== TEST 6: seller Delete =====");
		System.out.println("Enter id for delete test: ");
		int id = sc.nextInt();
		sellerDao.deleteById(id);
		sc.close();
	}

}
