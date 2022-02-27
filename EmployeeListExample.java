package corejava24feb;

import java.util.ArrayList;
import java.util.List;

class Employee1 extends Object
{
	int empid;
	String name;
	String dept;
	public Employee1()
	{
		
	}
	

public Employee1(int empid,String name,String dept)
{
	super();
	this.empid=empid;
	this.name=name;
	this.dept=dept;
}
public String toString()
{
	return "empid : "+empid+"name : "+name+"dept : "+dept;
}
}
public class EmployeeListExample 
{
	public static void main(String[] args)
	
	{
		List<Employee1> ar=new ArrayList();
		Employee1 emp1=new Employee1(101,"Ajay","IT");
		ar.add(emp1);
		Employee1 emp2=new Employee1(102,"Sagar","Comp");
		ar.add(emp2);
		Employee1 emp3=new Employee1(101,"Suraj","ENTC");
		ar.add(emp3);
		
		System.out.println(ar);
		
	}
	
	

}
