package library_system;
import java.util.*;
public class Student implements library{
	public String stu_name;
	public int regno;
	public static int nos;
	public String pwd;
	public int bid=0;
	public boolean session;
	
	public Student(int regno,String name,String pwd)
	{
		nos++;
		this.regno=regno;
		this.stu_name=name;
		this.pwd=pwd;
	
		
		
	}
   public boolean verification(int reg,String pwd)
   {
	   if(this.regno==reg && this.pwd.equals(pwd))
	   {
		   return true;
	   }
	   return false;
   }
   public Book isavailable(int bid,ArrayList book)
   {
	   Book b;
	   for(int i=0;i<book.size();i++)
	   {
		   b=(Book)book.get(i);
		   if(b.bookid==bid)
		   {
			   if(b.status)
			   {
				  return b;
			   }
		   }
	   }
	   return null;
	   
   }
   

}
