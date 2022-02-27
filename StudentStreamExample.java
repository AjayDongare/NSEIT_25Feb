package corejava24feb;

import java.util.ArrayList;
import java.util.stream.Stream;

class Student3
{
	String name;
	int marks;
}

public class StudentStreamExample
{

	public static void main(String[] args)
	{
		ArrayList<Integer> mark1 = new ArrayList();
		mark1.add(50);
		mark1.add(40);
		mark1.add(70);
		mark1.add(80);
		mark1.add(90);
		
		System.out.println(mark1);
		
		
		Stream s1 = data.stream();
		long cnt = s1.filter(mark).count();
		System.out.println("The numbers divisible by 4 are:");
		System.out.println(cnt);
		
		
	}

}
