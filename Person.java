package library;
import java.util.*;

public class Person 
{
	public String name;
	public int age,pid;
	public boolean status=true;
	ArrayList per_bk;
	public Person()
	{
		per_bk=new ArrayList();
	}
	public ArrayList addPerson()
	{
		return this.per_bk;
	}
	public ArrayList getWhichBookTake()
	{
		return this.per_bk;
	}
	
	public String getName()
	{
		return this.name;
	}
	public int getAge()
	{
		return this.age;
	}
	public int getPersonId()
	{
		return this.pid;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public void setAge(int age)
	{
		this.age=age;
	}
	public void setPersonId(int id)
	{
		this.pid=id;
	}
	public void setStatus(boolean b)
	{
		this.status=b;
	}
	public boolean getStatus()
	{
		return this.status;
	}
	

}

