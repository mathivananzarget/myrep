package library;
import java.util.*;

public class Issuebook
{
	Person per;
	Book bk;
	Date issdate,retdate;
	Issuebook()
	{
		issdate=new Date();
		retdate=new Date();
	}
	public Book getBook()
	  {
		return this.bk;
	  }
	  public Person getPerson()
	  {
		  return this.per;
	  }
	  public void setBook(Book b)
	  {
		  this.bk=b;
	  }
	  public void setPerson(Person p)
	  {
		  this.per=p;
	  }
	  public void setRetDate(Date d)
	  {
		  this.retdate=d;
	  }
	  public void setIssDate(Date d)
	  {
		  this.issdate=d;
	  }
	  public Date getRetDate()
	  {
		  return this.retdate;
	  }
	  public Date getIssDate()
	  {
		  return this.issdate;
	  }
	  
	
	public static void main(String []args)
	{
		Issuebook ib=new Issuebook();
		ArrayList al=new ArrayList(); 
		ArrayList al2=new ArrayList(); 
		
		student s=new student("mathi",25);
		student s1=new student("ajees",43);
		al.add(s);
		al.add(s1);
		al2.add(s);
		al2.add(s1);
		student ss=(student)al.get(0);
		ss.name="tamil";
		
		System.out.println(s.name);
		
		
	}
	

}
class student
{
	String name;
	int age;
	student(String s,int i)
	{
		name=s;
		age=i;
	}
}
