package application;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

import java.util.Scanner;

public class Program2 {

    public static void main(String[] args) {

        Scanner sc =  new Scanner(System.in);
        DepartmentDao departmentDao = DaoFactory.createDepartmentDao();


        /*System.out.println("\n== Test 1: department insert method ===");
        System.out.print("\nName of the department: ");
        String departmentName = sc.next();
        Department department = new Department(departmentName);
        departmentDao.insert(department);
        System.out.println("Department successfully inserted!, department id: " + department.getId());*/

        

    }

}