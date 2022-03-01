package jdbcprograms;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Students
 {
	String name;
	int marks;
	public Students(String name, int marks) 
	{
		super();
		this.name = name;
		this.marks = marks;
	}
	@Override
	public String toString() 
	{
		return "Name:"+name+", Marks: "+marks+"\n";
	}
}
public class StudentStreamExample 
{
	public static void main(String[] args) 
	{
		
		ArrayList<Students> std=new ArrayList();
		std.add(0, new Students("Ajay",80));
		std.add(1, new Students("Sagar",85));
		std.add(2, new Students("Rakesh",60));
		std.add(3, new Students("Amar",90));
		std.add(4, new Students("Prem",89));
		
		Stream s=std.stream();
		
		Predicate<Students> p1= x->x.marks>80;
		
		List<Students> data3=(List<Students>)s.filter(p1).collect(Collectors.toList());
		System.out.println(data3);

	}

}