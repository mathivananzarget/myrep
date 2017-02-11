package library_pro;
import java.util.*;

public class Base  {
	
	public static void main(String []args)
	{
		Person p=new Person("mathi",21);
		Person p1=new Person("ajees",23);
		Person p2=new Person("raghu",25);
		Person p3=new Person("tamil",23);
		Bike b=new Bike(1,1000);
		Bike b1=new Bike(2,200);
		Bike b2=new Bike(3,2100);
		Bike b3=new Bike(4,3400);
		Hashtable ht=new Hashtable();
		ht.put(p, b);
		ht.put(p1, b1);
		ht.put(p2, b);
		Bike pppp=(Bike)ht.get(p);
		pppp.price=345;
		 System.out.println(b.price);
		Enumeration en=ht.elements();
		Enumeration val=ht.keys();
		Person ppp=(Person)ht.get(p3);
		System.out.println(ppp);
		while(en.hasMoreElements())
		{
			Person pp=(Person)val.nextElement();
			Bike bb=(Bike)en.nextElement();
			System.out.println(pp.name);
			System.out.println(bb.price);
		
		}
		Bike tmp=(Bike)ht.get(p);
		System.out.println(tmp.price+" "+ht.size());
		tmp=(Bike)ht.get(p1);
		System.out.println(ht.remove(p));
		
		
	}

}
class Person
{
	
	String name;
	int age;
	Person(String name,int age)
	{
		this.name=name;
		this.age=age;
	}
}
class issue
{
	Book book;
	
	Student student;
	
	is Retiurned;
	
	Dagte date;
	
	
}