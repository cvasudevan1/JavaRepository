package come.test;

import java.util.ArrayList;
import java.util.Collections;
public class SortAList extends Thread
{
	public  ArrayList<String> nameList=null;
	public  SortAList(String name1, String name2,String name3)
	{
		nameList=new ArrayList<String>();
		if(name1!=null)
			this.nameList.add(name1);
		if(name2!=null)
			this.nameList.add(name2);
		if(name2!=null)
			this.nameList.add(name3);
	}

	public static void main(String args[]) throws Exception
	{
		SortAList sortingList = new SortAList("Vasu", "Rithu", "Navi");
		
		synchronized (sortingList.nameList) {
			sortingList.start();
			//sortingList.join();
		}
		ArrayList abc = new ArrayList<>();
		abc.add("Steve");
		abc.add("Kumar");
		abc.add("Sharang");
		
		//sortingList.nameList=abc;
		
		SortAList sortingList2=new SortAList("Steve", "Kumar", "Sharang");
		sortingList2.start();
		//sortingList2.start();
		if(sortingList2.isAlive())
			sortingList2.interrupt();
		//sortingList2.join();
		System.out.println(sortingList.equals(sortingList2.nameList));
	}
	public synchronized void run()
	{
		Collections.sort(this.nameList);
		System.out.println(this.nameList);
		try {
			this.sleep(5000);
		} catch (InterruptedException e) {
			System.out.println("Thread Interrupted");
		}
	}
	@Override
	public int hashCode() {
		int i = 1;
		return i;
	}
	@Override
	public boolean equals(Object obj) {
		if(this.nameList==obj)
		{
			System.out.println("1");

			return true;
		}
			else if(this.nameList.containsAll((ArrayList)obj))
			{
				System.out.println("2");

		return true;
			}
		else 
			return false;
	}
	
}