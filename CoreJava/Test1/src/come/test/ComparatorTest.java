package come.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ComparatorTest {

	public static void main(String[] args) {
		ArrayList<Employees> empArrayList = new ArrayList<Employees>();
		Employees e1=new Employees(2, "Vasu");
		Employees e2=new Employees(5, "Navi");
		Employees e3=new Employees(4, "Rithu");
		empArrayList.add(e1);
		empArrayList.add(e2);
		empArrayList.add(e3);
		Collections.sort(empArrayList, new IdCompare());
		Employees e=null;
		for(int i=0;i<empArrayList.size();i++)
		{
			e = (Employees)empArrayList.get(i);
			System.out.println("Emp ID : "+e.empId+" Name : "+e.name);
		}

	}

}

class Employees
{
	int empId;
	String name;
	public Employees(int a, String myName)
	{
		empId=a;
		name=myName;
	}
}
class IdCompare implements Comparator
{

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		if(o1==o2)
			return 0;
		else if(o1 instanceof Employees && o2 instanceof Employees)
		{
			Employees e1 = (Employees)o1;
			Employees e2 = (Employees)o2;
			return e1.empId-e2.empId;
		}
		else
			return 0;
			
	}
	
}

