package corejava24feb;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class setExample {

	public static void main(String[] args)
	{
		//Insertion Order
		Set<String> hs=new LinkedHashSet();
		hs.add("India");
		hs.add("Japan");
		hs.add("China");
		hs.add("Nepal");
		System.out.println("Elements of LinkedHashSet");
		System.out.println(hs);
		hs.add("India");
		
		
		//Random Order
		Set<String> hs1=new HashSet();
		hs1.add("India");
		hs1.add("Japan");
		hs1.add("China");
		hs1.add("Nepal");
		System.out.println("Elements of HashSet");
		System.out.println(hs1);
		hs1.add("India");
		
		
		//Sorted Order
		Set<String> hs2=new TreeSet();
		hs2.add("India");
		hs2.add("Japan");
		hs2.add("China");
		hs2.add("Nepal");
		System.out.println("Elements of TreeSet");
		System.out.println(hs2);
		hs2.add("India");
	}
	

}
