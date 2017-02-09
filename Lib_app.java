package library_system;
import java.util.*;
public class Lib_app {
	public static void main(String[] args) {
		Lib_app lib=new Lib_app();
		boolean b;
		ArrayList student=new ArrayList();
		ArrayList book=new ArrayList();
		Hashtable ht=new Hashtable();
		Scanner in=new Scanner(System.in);
		do
		{
		System.out.println("1.stu_registration\n2.Book_registration.3.liststudents\n4.listbooks\n5.login\n3.logout");
		System.out.println("isavailable\ngetBook\nreturnBook\n");
		int n=in.nextInt();
		switch(n)
		{
		case 1:
			Student s=lib.stu_registration();
			student.add(s);
			break;
		case 2:
			Book bk=lib.book_registration();
		    book.add(bk);
		    break;
		case 3:
			lib.listallstudents(student);
			break;
		    
		case 4:
			lib.listallbooks(book);
		    break;
		case 5:
			System.out.println("enter the bookid");
			int bid=in.nextInt();
			lib.getBook(student, book, ht, lib, bid); 
			break;
		case 6:
			lib.list_availbooks(book);
			break;
		}
		System.out.println("do u continue");
		b=in.nextBoolean();
		}while(b!=false);
		

	}
	
	public Student stu_registration()
	{
		int reg;
		String name,pwd;
		Scanner in=new Scanner(System.in);
		System.out.println("enter the regno");
		reg=in.nextInt();
		System.out.println("enter the name");
		name=in.nextLine();
		in.nextLine();
		System.out.println("enter the password");
		pwd=in.nextLine();
		Student s=new Student(reg,name,pwd);
		return s;
		
	}
	public Book book_registration()
	{
		int nop;
		float price;
		String bookname,author_name,pub_name;
		Scanner in=new Scanner(System.in);
		System.out.println("enter the bookname");
		bookname=in.nextLine();
		System.out.println("enter the author name");
		author_name=in.nextLine();
		System.out.println("enter the publishername");
		pub_name=in.nextLine();
		System.out.println("enter the number of pages");
		nop=in.nextInt();
		System.out.println("enter the book_price");
		price=in.nextFloat();
		Book b=new Book(bookname,author_name,pub_name,nop,price);
		return b;
	}
	public void listallbooks(ArrayList books)
	{
	   for(int i=0;i<books.size();i++)
	   {
		   Book b=(Book)books.get(i);
		   System.out.println(b.book_name);
	   }
		
	}
	public void listallstudents(ArrayList student)
	{
	   for(int i=0;i<student.size();i++)
	   {
		   Student s=(Student)student.get(i);
		   System.out.println(s.stu_name);
		   
	   }
		
	}
	
	public void book_available(String bname,ArrayList book)
	{
		for(int i=0;i<book.size();i++)
		{
			Book b=(Book)book.get(i);
			System.out.println(b.book_name.equals(bname));
		}
	}
	public Student login(ArrayList student)
	{
		Scanner in=new Scanner(System.in);
		
		System.out.println("enter the regno");
        int regno=in.nextInt();
        System.out.println("enter the password");
        String pwd=in.nextLine();
        for(int i=0;i<student.size();i++)
        {
        	Student s=(Student)student.get(i);
        	if(s.verification(regno, pwd))
        	{
        		return s;
        	}
        }
        return null;
	}
	public void getBook(ArrayList student,ArrayList book,Hashtable ht,Lib_app lib,int bid)
	{
		
		Student s=lib.login(student);
		if(s!=null)
		{
			s.session=true;
			Book b=s.isavailable(bid, book);
			if(b!=null)
			{
				b.sid=s.regno;
				s.bid=b.bookid;
				b.status=false;
				ht.put(bid, s.regno);
				s.session=false;
			}
			
		}
		
	}
	public void returnBook(int bid,ArrayList book,ArrayList student,Lib_app lib)
	{
		Book b;
		for(int i=0;i<book.size();i++)
		{
		 b=(Book)book.get(i);
			if(b.bookid==bid)
			{
				b.sid=0;
				b.status=true;
				break;
			}
		}
		for(int i=0;i<student.size();i++)
		{
			Student s=(Student)student.get(i);
			if(s.bid==bid)
			{
				s.bid=0;
				break;
			}
		}
	}
	public void list_availbooks(ArrayList book)
	{
		for(int i=0;i<book.size();i++)
		{
			Book b=(Book)book.get(i);
			if(b.status==true)
			System.out.println(b.book_name);
		}
		
	}
	
}




