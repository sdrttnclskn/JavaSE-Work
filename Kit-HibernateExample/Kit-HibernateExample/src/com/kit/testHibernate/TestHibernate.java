package com.kit.testHibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.kit.models.Department;
import com.kit.models.Employee;
import com.kit.models.Project;

public class TestHibernate {

	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("mysqlPU");
		EntityManager entityManager = emf.createEntityManager();
		
		entityManager.getTransaction().begin();
		
		Department dept1 = new Department("Sat��");
		Department dept2 = new Department("�nsan Kaynaklar�");
		Department dept3 = new Department("Bilgi ��lem");
		
		Project proj1 = new Project("B�t�e", 1000000);
		Project proj2 = new Project("Kantin", 100);
		
		Employee emp1 = new Employee("Koray", "G�ney", dept1);
		Employee emp2 = new Employee("Do�u", "�lman", dept2);
		Employee emp3 = new Employee("Hatice", "�l�i", dept3);
		Employee emp4 = new Employee("Onur", "�olak", dept1);
		Employee emp5 = new Employee("Haluk", "Ece", dept1);
		Employee emp6 = new Employee("Suat", "Bekta�", dept2);
		
		emp1.getEmp_proj().add(proj1);
		emp2.getEmp_proj().add(proj2);
		emp3.getEmp_proj().add(proj1);
		emp4.getEmp_proj().add(proj1);
		emp5.getEmp_proj().add(proj2);
		emp6.getEmp_proj().add(proj1);
//				
//		/*
//		 * Insert (Create)
//		 */
//		entityManager.persist(dept1);
//		entityManager.persist(dept2);
//		entityManager.persist(dept3);
//		
//		entityManager.persist(emp1);
//		entityManager.persist(emp2);
//		entityManager.persist(emp3);
//		entityManager.persist(emp4);
//		entityManager.persist(emp5);
//		entityManager.persist(emp6);
//		
//		entityManager.persist(proj1);
//		entityManager.persist(proj2);
//		
		/*
		 * Select(Read)
		 */
		Employee e1 =entityManager.find(Employee.class, 1);
		System.out.println(e1.getName()+ " "+e1.getLastname());

		/*
		 * Update 
		 */
		entityManager.merge(proj2);
//		entityManager.createQuery("UPDATE Project p SET p.budget=:bdg WHERE p.id=:p_id").setParameter("bdg", 1.0).setParameter("p_id", 1).executeUpdate();
			
		
		entityManager.getTransaction().commit();
		emf.close();
		
		System.out.println("Transacition committed...");
		
		
	}

}
