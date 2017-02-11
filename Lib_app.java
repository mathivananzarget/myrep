package library_pro;
import java.util.*;
public class Lib_app {

	public static void main(String[] args) {
		int ch,bid,sid,flag=0;
		Book bkk;
		Student std;
		Lib_app lib=new Lib_app();
		Scanner in=new Scanner(System.in);
		Hashtable books=new Hashtable();
		Hashtable students=new Hashtable();
	    Hashtable cur_status=new Hashtable(); 
	    Stack stack=new Stack();
	    ArrayList details=new ArrayList();
	    Book b1=new Book("java","james");
	    Book b2=new Book("c","dennis");
	    Book b3=new Book("c++","bjarne");
	    Book b4=new Book("HTML","lee");
	    Book b5=new Book("CSS","style");
	    Book b6=new Book("facebook","Mark");
	    Book b7=new Book("harry","jk");
	    books.put(b1.getBookid(), b1);
	    books.put(b2.getBookid(), b2);
	    books.put(b3.getBookid(), b3);
	    books.put(b4.getBookid(), b4);
	    books.put(b5.getBookid(), b5);
	    books.put(b6.getBookid(), b6);
	    books.put(b7.getBookid(), b7);
	    Student s1=new Student("mathi","qwe");
	    Student s2=new Student("ajees","asd");
	    Student s3=new Student("raghu","mjh");
	    Student s4=new Student("prabha","123");
	    Student s5=new Student("tamil","qwe");
	    Student s6=new Student("edison","njhu");
	    students.put(s1.getStu_id(), s1);
	    students.put(s2.getStu_id(), s2);
	    students.put(s3.getStu_id(), s3);
	    students.put(s4.getStu_id(), s4);
	    students.put(s5.getStu_id(), s5);
	    students.put(s6.getStu_id(), s6);
		do
		{
			System.out.println("1.Addbook\n2.Addstudent");
			System.out.println("3.List_Available_Books\n4.ReadBook\n5.Returnbook\n6.Holdbook");
			System.out.println("7.noofstudents\n8.No_of_Books\n9.TraceBook\n10.Lasttake\n11.CurTake");
			System.out.println("12.listallstudents\n13.List_all_books");
			int n=in.nextInt();
			flag=0;
			switch(n)
			{
			case 1:
				Book bk=lib.Addbook();
				books.put(bk.getBookid(), bk);
				break;
			case 2:
				Student st=(Student)lib.Addstudent();
				students.put(st.getStu_id(),st);
			    break;
			case 3:
				lib.list_availbooks(books);
				break;
			case 4:
				
				System.out.println("Enter the bookid");
				 bid=in.nextInt();
				System.out.println("Enter the stu_id");
				 sid=in.nextInt();
				 bkk=(Book)books.get(bid);
				  std=(Student)students.get(sid);
				  while(bkk==null || std==null&&flag==0)
				  {
					  System.out.println("Enter the correct bookid");
						 bid=in.nextInt();
						System.out.println("Enter the correct stu_id");
						 sid=in.nextInt();
						 System.out.println("do u leave press 1");
						 flag=in.nextInt();
						 bkk=(Book)books.get(bid);
						  std=(Student)students.get(sid);
				  }
				  if(bkk!=null&&std!=null)
				lib.readBook(bid,sid,books,students,cur_status);
			    break;
			case 5:
				 lib.return_book(books,students,cur_status,stack);
			     break;
			case 6:
				lib.own_book(cur_status);
				break;
			case 7:
				System.out.println("Number of students "+Student.no_of_stud());
				break;
			case 8:
				System.out.println("Number of books "+Book.no_of_books());
				break;
			case 9:
				lib.tracebook(stack);
				break;
			case 10:
				System.out.println("enter the student id");
				sid=in.nextInt();
				std=(Student)students.get(sid);
				while(std==null&&flag!=1)
				{
					System.out.println("enter the correct student id");
					sid=in.nextInt();
					std=(Student)students.get(sid);
					System.out.println("do u leave form press 1");
					flag=in.nextInt();
				}
				if(std!=null)
				lib.lastTake(sid,students);
				break;
			case 11:
				System.out.println("enter the student id");
				sid=in.nextInt();
				std=(Student)students.get(sid);
				while(std==null&&flag!=1)
				{
					System.out.println("enter the correct student id");
					sid=in.nextInt();
					std=(Student)students.get(sid);
					System.out.println("do u leave form press 1");
					flag=in.nextInt();
				}
				if(std!=null)
				lib.curTake(sid, students);
				break;
			case 12:
				lib.listallstudents(students);
				break;
			}
			
			System.out.println("Do u continue press any number 1 to 9 or not 0 ");
			ch=in.nextInt();
		}while(ch!=0);
		
	}
	public  Book Addbook()
	{   Scanner in=new Scanner(System.in);
		String bnam,anam;
		int bid;
		System.out.println("Enter the bookname");
		bnam=in.nextLine();
	//	System.out.println("Enter the authorname");
		anam="james";      //in.nextLine();
		Book bk=new Book(bnam,anam);
		System.out.println(bk.getBookname()+" id is "+bk.getBookid());
	    return bk;
		
	}
	public Student Addstudent()
	{
		 Scanner in=new Scanner(System.in);
		String snam,pwd;
		
		System.out.println("Enter the stu_name");
		snam=in.nextLine();
	
		pwd="pwd";   
		Student s=new Student(snam,pwd);
		System.out.println("Hi "+s.getStudentname()+"! Your id is "+s.getStu_id());
		return s;
	}
	public void readBook(int bid,int sid,Hashtable books,Hashtable students,Hashtable det)
	{
		Book bk=(Book)books.get(bid);
		Student std=(Student)students.get(sid);
		
		
		if(bk.getStatus()&&std.getStatus())
		{
			
			bk.status=false;
			std.status=false;
			std.cur_book=bk.getBookname();
			det.put(bk, std);
			students.put(sid, std);
			books.put(bid, bk);
			System.out.println(std.getStudentname()+" takes book "+bk.getBookname());
		}
		else
			
		{
			System.out.println("sorry unavailable to take book now");
		}
		
		
	}
	public void return_book(Hashtable books,Hashtable students,Hashtable det,Stack s)
	{
		int bid,sid,flag=0;
		Scanner in=new Scanner(System.in);
		HashMap hm=new HashMap();
		Student std;
		System.out.println("Enter the bookid");
		bid=in.nextInt();
		Book bk=(Book)books.get(bid);
		std=(Student)det.get(bk);
		while(std==null&&flag==0)
		{
			System.out.println("Enter the correct bookid");
			bid=in.nextInt();
		 bk=(Book)books.get(bid);
		 std=(Student)det.get(bk);
		 System.out.println("do u leave the form press 1");
		 flag=in.nextInt();
		}
		if(std!=null){
			
		bk.status=true;
		std.status=true;
		std.last_book=std.curTake(std.getStu_id());
		std.cur_book=null;
		hm.put(bk, std);
	    s.push(hm);
		det.remove(bk, std);
		System.out.println(std.getStudentname()+" returned book "+bk.book_name+" success ");
		}
		
	}
	public void list_availbooks(Hashtable books)
	{
		System.out.println("Now available to read books");
		Enumeration en=books.elements();
		while(en.hasMoreElements())
		{
			Book bk=(Book)en.nextElement();
			if(bk.getStatus())
		    System.out.println(bk.getBookid()+" "+bk.book_name);
		}	
		
	}
	public void list_allbooks(Hashtable books)
	{
		Enumeration en=books.elements();
		System.out.println(" Books in library");
		while(en.hasMoreElements())
		{
			Book bk=(Book)en.nextElement();
			
		    System.out.println(bk.getBookid()+" "+bk.book_name);
		}	
		
	}
	public void own_book(Hashtable  det)
	{
		Enumeration en=det.elements();
		Enumeration e=det.keys();
		if(det.isEmpty())
			System.out.println("nobody owns");
		while(en.hasMoreElements())
		{
			Student st=(Student)en.nextElement();
			Book bk=(Book)e.nextElement();
			System.out.println(st.stu_name+" have book "+bk.book_name);
		}	
	}
	public void tracebook(Stack s)
	{
		Enumeration e=s.elements();
		if(s.isEmpty())
		System.out.println("Nobody takes book");
		while(e.hasMoreElements())
		{
			HashMap hm=(HashMap)e.nextElement();
			Set <Map.Entry<Book, Student>>st=hm.entrySet();
			for(Map.Entry<Book, Student> mm:st)
			{
				Book bk=mm.getKey();
				Student ss=mm.getValue();
				System.out.println(bk.book_name+ " "+ss.stu_name);
			}
		}
		
	}
	public void lastTake(int sid,Hashtable students)
	{
		Student s=(Student)students.get(sid);
		System.out.println(s.getStudentname()+" "+s.lastTake(sid));
	}
	public void curTake(int sid,Hashtable students)
	{
		Student s=(Student)students.get(sid);
		System.out.println(s.stu_name+"  "+s.curTake(sid));
	}
	public void listallstudents(Hashtable students)
	{
		System.out.println("students in library");
		Enumeration en=students.keys();
		while(en.hasMoreElements())
		{
			int id=(Integer)en.nextElement();
			Student s=(Student)students.get(id);
			System.out.println(s.getStu_id()+" "+s.stu_name);
		}
		
	}
}
