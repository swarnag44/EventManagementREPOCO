package com.cg.jh01.ui;

import javax.persistence.EntityManager;

import com.cg.jh01.entity.Employee;
import com.cg.jh01.util.JPAUtil;

public class App03 {

	public static void main(String[] args) {
		EntityManager em=JPAUtil.getEntityManager();
		Employee employee=em.find(Employee.class,101L);
		if(employee!=null)
			System.out.println(employee);
		else 
			System.out.println("employee not found");
		em.close();

	}

}
