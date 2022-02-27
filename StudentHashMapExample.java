package corejava24feb;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class StudentHashMapExample 
{

	public static void main(String[] args) 
	{
		ArrayList<Integer> mark1 = new ArrayList();
		ArrayList<Integer> mark2 = new ArrayList();
		ArrayList<Integer> mark3 = new ArrayList();
		
		mark1.add(50);
		mark1.add(55);
		mark1.add(60);
		mark1.add(65);
		
		mark2.add(70);
		mark2.add(75);
		mark2.add(80);
		mark2.add(85);
		
		mark3.add(90);
		mark3.add(85);
		mark3.add(80);
		mark3.add(75);
		
		HashMap<String,List> results = new HashMap();
		results.put("Kishore",mark1);
		results.put("Sunil",mark2);
		results.put("Anil",mark3);
		System.out.println(results);
		
		Set<Map.Entry<String, List>> entries = results.entrySet();
		Iterator itr = entries.iterator();
		
		while(itr.hasNext())
		{
			Map.Entry<String,List> temp = (Entry<String, List>) itr.next();
			List<Integer> marks = temp.getValue();
			int sum=0;
			for(Integer i :marks)
			sum=sum+i;
			System.out.println("Name: "+temp.getKey()+" "+"Total: "+sum);
		}

	}

}
