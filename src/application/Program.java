package application;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        SellerDao sellerDao = DaoFactory.createSellerDao();

        System.out.println("== Test 1: seller findById Method ===");
        Seller seller = sellerDao.findById(3);
        System.out.println(seller);

        System.out.println("\n== Test 2: seller findByDepartment Method ===");
        Department dep = new Department(2, null);
        List<Seller> list = sellerDao.findByDepartment(dep);
        for (Seller obj : list) {
            System.out.println(obj);
        }

        System.out.println("\n== Test 3: seller findAll Method ===");
        list = sellerDao.findAll();
        for (Seller obj : list) {
            System.out.println(obj);
        }


        /*System.out.println("\n== Test 4: seller insert Method ===");
        Seller newSeller = new Seller(null, "Greg", "greg@gmail.com", new Date(), 3000.0, dep);
        sellerDao.insert(newSeller);

        System.out.println("Data inserted! Seller generated ID: " + newSeller.getId());*/


        System.out.println("\n== Test 5: seller update method ===");
        seller = sellerDao.findById(1);
        seller.setName("Martha Wayne");
        sellerDao.update(seller);
        System.out.println("Seller updated!");

        System.out.println("\n== Test 6: seller delete method ===");
        System.out.print("Write seller id to be deleted: ");
        int id = sc.nextInt();
        sellerDao.deleteById(id);

        sc.close();
    }
}
