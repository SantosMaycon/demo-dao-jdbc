package application;

import java.util.Date;

import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		Department department = new Department(1, "Suporte");
		Seller seller = new Seller(21, "maycon", "mayc2003@hotmail.com", new Date(), 600.0, department);
		System.out.println(seller);
	}

}
