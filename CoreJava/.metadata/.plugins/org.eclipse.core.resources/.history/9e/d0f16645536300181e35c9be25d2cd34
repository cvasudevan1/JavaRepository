package com.learn.collections;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetTestComparator {

	public static void main(String[] args) {
		TreeSet<Employee> emp = new TreeSet<Employee>(new SortbyID());
		Employee e1 = new Employee(3, "Vasu");
		Employee e2 = new Employee(2, "Navi");
		Employee e3 = new Employee(6, "Navi");
		emp.add(e1);
		emp.add(e2);
		emp.add(e3);
		for(Employee e:emp)
		{
			System.out.println(e.empId + " " + e.name);
		}
		TreeSet<Employee> emp1 = new TreeSet<Employee>(new SortbyName());
		emp1.add(e1);
		emp1.add(e2);
		emp1.add(e3);
		for(Employee e:emp1)
		{
			System.out.println(e.empId + " " + e.name);
		}
	}

}
class Employee implements Comparable
{
	String name;
	int empId;
	Employee()
	{
	}
	Employee(int id, String name)
	{
		this.name=name;
		this.empId=id;
	}
	@Override
	public int compareTo(Object o) {
		
		return this.empId-((Employee)o).empId;
	}
	
}
class SortbyID implements Comparator
{

	@Override
	public int compare(Object o1, Object o2) {
		if(o1 instanceof Employee && o1 instanceof Employee)
			return ((Employee)o1).empId-((Employee)o2).empId;
		return 0;
	}
	
}
class SortbyName implements Comparator
{

	@Override
	public int compare(Object o1, Object o2) {
		if(o1 instanceof Employee && o1 instanceof Employee)
			return ((Employee)o1).name.compareTo(((Employee)o2).name);
		return 0;
	}
	
}
