package com.example.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.demo.vtalent.StudentDetails;

public class SpringDemo1Application {

	public static void main(String[] args) {

		System.out.println(" Spring Application has been ready ....");

		StudentDetails stu1 = new StudentDetails("Mahesh", 25);
		System.out.println(stu1.getStudentName());
		System.out.println(stu1.getBatchNo());

		ApplicationContext springrun = new ClassPathXmlApplicationContext("com/example/demo/vtalent/mahesh.xml");

		StudentDetails studentBean = (StudentDetails) springrun.getBean("maheshDetails1");
		// Here we have to pass the id of the bean.

		studentBean.getBatchNo();
		studentBean.getClass();

		studentBean.setStudentName("MaheshAnnaSenior");
		studentBean.setBatchNo(35);

		System.out.println("Set the name by the help of seeter method");
		System.out.println(studentBean.getStudentName());
		System.out.println(studentBean.getBatchNo());

		studentBean.setStudentName("MaheshAnnaSenior1234");
		studentBean.setBatchNo(352);

		System.out.println(studentBean.getStudentName());
		System.out.println(studentBean.getBatchNo());

		System.out.println("---------- From Here we can able to set the value trough the help of beans -------");
		System.out.println("Name :" + studentBean.getStudentName());
		System.out.println("Batch Number : " + studentBean.getBatchNo());

		System.out.println("----------Performing bean operation by the setter  -------");
		System.out.println("Name :" + studentBean.getStudentName());
		System.out.println("Batch Number : " + studentBean.getBatchNo());
		
		System.out.println("-------------------------------------------------------");
		
		studentBean.StudentPlacementRecord();
		
		


	}

}
