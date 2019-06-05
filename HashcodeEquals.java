import java.util.*;
class Student
{
	private String name;
	private int roll_no;
	Student(String name,int roll_no){
	this.name = name;
	this.roll_no = roll_no;
	}

	String getName(){
	return name;
	}
	int getRollno(){
	return roll_no;
	}
}
class  HashcodeEquals
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		Student std1 = new Student("Amit",1);
		Student std2 = new Student("Amit",1);

		Integer i1 = new Integer(1);
		Integer i2 = new Integer(1);

		HashMap hm = new HashMap();
		hm.put(std1,1);
		hm.put(std2,2);
		System.out.println("map size : "+hm.size());

		String name = std1.getName();
		int rollno = std2.getRollno();
		System.out.println(name +" "+rollno);
		/*hm.put(i1,1);
		hm.put(i2,2);
		System.out.println("map size : "+hm.size());*/

	}
}
