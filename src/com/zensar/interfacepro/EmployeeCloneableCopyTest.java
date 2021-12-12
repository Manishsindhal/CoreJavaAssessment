package com.zensar.interfacepro;

class Employe implements Cloneable {

	private String empName;
	private String dob;
	private Department department;

	public Employe(String empName, String dob, Department department) {
		super();
		this.empName = empName;
		this.dob = dob;
		this.department = department;
	}

	/* This is only for shallow copy */
//	@Override
//	protected Object clone() throws CloneNotSupportedException {
//		return super.clone();
//	}
	
	/* Customization for deep cloning  */
	@Override
	protected Object clone() throws CloneNotSupportedException {
		Employe cloned = (Employe)super.clone();
	    cloned.setDepartment((Department)cloned.getDepartment().clone());   
	    return cloned;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

}

class Department implements Cloneable {
	private int id;
	private String name;

	public Department(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	/* Customization for deep cloning  */
	@Override
	protected Object clone() throws CloneNotSupportedException {
	    return super.clone();
	}

}

public class EmployeeCloneableCopyTest {

	public static void main(String[] args) throws CloneNotSupportedException {
		Department dept = new Department(1, "Accountant");
		Employe original = new Employe("Jack", "01-06-1999", dept);

		Employe cloned = (Employe) original.clone();

		System.out.println("Original = " + cloned.getEmpName() + "   Clone Copy = " + cloned.getEmpName() + "\n"
				+ "Original = " + cloned.getDob() + "   Clone Copy = " + cloned.getDob() + "\n" + "Original = "
				+ cloned.getDepartment().getName() + "   Clone Copy = " + cloned.getDepartment().getName() + "\n");
		
		cloned.getDepartment().setName("Software Eng");
		 
        System.out.println(original.getDepartment().getName());  
        System.out.println(cloned.getDepartment().getName());
	}
}
