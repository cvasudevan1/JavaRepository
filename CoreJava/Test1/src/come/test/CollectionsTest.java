package come.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;

public class CollectionsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, String> hm = new HashMap<String, String>();
		hm.put("1", "2");
		hm.put("0", "5");
		hm.put("890", "6");
		hm.put("90", "3");
		ArrayList<HashMap> a = new ArrayList<HashMap>();
			a.add(hm);;	
		Collections.sort((java.util.List) a);
		System.out.println(hm.values());
	}

}
public class Employee
{
	public String name = null;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
class SortIt implements Comparator
{
	public int compare(Employee1 e1, Employee1 e2)
	{
		String 
		return e1.getName().compareTo(e2.)
	}
}
