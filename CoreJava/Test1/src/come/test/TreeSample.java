package come.test;

import java.awt.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class TreeSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Integer> ts = new TreeSet<Integer>();
		ArrayList<Integer> as = new ArrayList<Integer>();
		HashMap hm = new HashMap();
		HashSet hs= new HashSet(ts);
		LinkedHashSet<String> lhs = new LinkedHashSet<String>();
		//lhs.
		
		hm.put(1, "One");
		hm.
		hs.add("7");
		as.add(5);
		hs.add(1);
		hs.add(2);
		hs.add(3);
		hs.add(8);
		LinkedHashMap<Integer, String> lsm = new LinkedHashMap<Integer, String>(hm);
		lsm.c
		for(Integer i:lsm.keySet())
		{
			System.out.println(lsm.get(i));
		}
		//hs.addAll(as);
		//hs.addAll(hs);
		System.out.println(hs);
		Map<Integer, String> s = new LinkedHashMap<Integer, String>();
		LinkedList<Integer> ss = new LinkedList<Integer>();
		ss.add(1);
		ss.add(5);
		LinkedList ss1 = (LinkedList)ss.clone();
		ss1.add(3);
		ss1.add(6);
		System.out.println(ss);
		System.out.println(ss1);
		System.out.println(ss.hashCode());
		System.out.println(ss1.hashCode());
		
	}

}
