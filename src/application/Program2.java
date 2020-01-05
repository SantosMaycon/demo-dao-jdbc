package application;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {
	public static void main(String[] args) {
		System.out.println("== Insert Department ===");
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		departmentDao.insert(new Department(null, "Model"));
		
		System.out.println("== Update Department ===");
		departmentDao.update(new Department(12, "TI"));
		
		System.out.println("== Delete Department ===");
		departmentDao.deleteById(15);
		
		System.out.println("== findById Department ===");
		Department department = departmentDao.findById(1);
		System.out.println(department);
		
		System.out.println("== findAll Department ===");
		List<Department> list = departmentDao.findAll();
		for (Department dep : list) {
			System.out.println(dep);
		}
	}

}
