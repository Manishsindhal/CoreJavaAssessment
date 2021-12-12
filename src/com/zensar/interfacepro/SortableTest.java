package com.zensar.interfacepro;

interface Sortable {
	boolean compare(Sortable srt);

	public static void sort(Sortable sort[]) {
		for (int i = 0; i < sort.length; i++) {
			for (int j = i + 1; j < sort.length; j++) {
				if (sort[i].compare(sort[j])) {
					Sortable temp = sort[i];
					sort[i] = sort[j];
					sort[j] = temp;
				}
			}
		}
		for (int i = 0; i < sort.length; i++) {
			System.out.println(sort[i]);
		}
	}
}

class Employeee implements Sortable {

	private double salary;

	public Employeee(double salary) {
		super();
		this.salary = salary;
	}

	@Override
	public boolean compare(Sortable srt) {
		if(this.salary > ((Employeee)srt).salary)
			return true;
		return false;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "" + this.salary;
	}

}

class Circlee implements Sortable {

	private double radius;

	public Circlee(double radius) {
		super();
		this.radius = radius;
	}
	
	@Override
	public boolean compare(Sortable srt) {
		if(this.radius > ((Circlee)srt).radius)
			return true;
		return false;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "" + this.radius;
	}
}

public class SortableTest {

	public static void main(String[] args) {

		Sortable sortEmp[] = new Sortable[3];
		sortEmp[0] = new Employeee(20000);
		sortEmp[1] = new Employeee(26000);
		sortEmp[2] = new Employeee(15000);
		
		Circlee sortCircle[] = new Circlee[3];
		sortCircle[0] = new Circlee(35);
		sortCircle[1] = new Circlee(16);
		sortCircle[2] = new Circlee(20);
		
		Sortable.sort(sortEmp);
		Sortable.sort(sortCircle);
	}
}
