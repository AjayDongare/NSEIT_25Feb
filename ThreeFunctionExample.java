package corejava24feb;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

	class Student3{
		private String name;

		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name=name;
		}
		
	}

	public class  ThreeFunctionExample {

		public static void main(String[] args) {
			System.out.println("Example using predicate ......");
			
			
			Predicate<String> checkLength= str->str.length()>5;
			System.out.println(checkLength.test("AjayDongare"));
			
			System.out.println("Example using Consumer........");
			
			Student3 s=new Student3();
			Consumer<Student3> setName=t->t.setName("Ajay");
			setName.accept(s);
			System.out.println(s.getName());
			
			
			System.out.println("Example using Function........");
			
			Function<Integer,String> getInt=t->t+25+" "+"";
			System.out.println("Addition Is :");
			System.out.println(getInt.apply(3));
			
			
		
		}

	}

