package corejava24feb;

import java.util.LinkedList;
import java.util.ListIterator;

public class ListIteratorExample 
{
	public static void main(String[] args)
	{
		LinkedList<String> ar = new LinkedList();
		
		ar.add("India");
		ar.add("China");
		ar.add("Japan");
		ar.add("Nepal");
		ar.add("Nepal");
		System.out.println("Elements In Forward Direction");
		
		ListIterator ltr = ar.listIterator();
		while(ltr.hasNext())
		System.out.println(ltr.next());
		System.out.println("Elements In Backward Direction");
		while(ltr.hasPrevious())
		System.out.println(ltr.previous());

		 }

}
