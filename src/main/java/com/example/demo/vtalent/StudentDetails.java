package com.example.demo.vtalent;

//

public class StudentDetails {

	String studentName; // instance or static or local or global.
	int batchNo;
	StudentPlacements placement; // Fild what 
	
	
	StudentDetails(String studentName,int batchNo,StudentPlacements placement){
		this.studentName=studentName;
		this.batchNo=batchNo;
		this.placement=placement;
	}
	
	public StudentPlacements getPlacement() {
		return placement;
	}

	public void setPlacement(StudentPlacements placement) {
		this.placement = placement;
	}

	StudentDetails(String name){
		this.studentName=name;           // 1 paramaeterised constructor. // mohan , 25
	}

	public StudentDetails() {
		System.out.println("Default Student Details Constructor is Running....");
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public int getBatchNo() {
		return batchNo;
	}

	public void setBatchNo(int batchNo) {
		this.batchNo = batchNo;
	}

	public StudentDetails(String studentName, int batchNo) { // 2 parameterised constructor.
		super();
		this.studentName = studentName;
		this.batchNo = batchNo;
	}

	@Override
	public String toString() {
		return "StudentDetails [studentName=" + studentName + ", batchNo=" + batchNo + "]";
	}
	
	
	StudentDetails(StudentPlacements placement){

		this.placement=placement;
	}
	
	public void StudentPlacementRecord() {
		System.out.println("Student Name : "+studentName+"batch Number :"+ batchNo);
		System.out.println("The above has student has been placed sucessfully from the vtalent...");
		placement.PlacementDetails();
		
	}

}
