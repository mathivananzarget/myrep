package library;
import java.util.*;
public class Application 
{
	public  int nob,nop,nosp;
	Book book;
	Person person;
	
	Issuebook issuebook;
	ArrayList books,persons,strplaces,issue_det;
	Application()
	{
		books=new ArrayList();
		persons=new ArrayList();
		strplaces=new ArrayList();
		issue_det=new ArrayList();
	}
	
	public static void main(String[] args) 
	{
		Application app=new Application();
		Scanner in=new Scanner(System.in);
		String name;
		int id,ch,pid;
		do
		{
			System.out.println("1.addBook\n2.addPerson\n3.listAllBooks\n4.listAllPersons\n5.issueBook");
			System.out.println("6.lastTake\n7.LastBook\n8.whoHaveBooks\n9.returnBook\n10.listAllReadBooks");
			int n=in.nextInt();
			in.nextLine();
			switch(n)
			{
			case 1:
				System.out.println("Enter the book_name");
				name=in.nextLine();
				app.addBook(name);
				System.out.println(name+" id is  "+app.book.getBookId());
				break;
			case 2:
				System.out.println("Enter the person_name");
				name=in.nextLine();
				app.addPerson(name);
				System.out.println(name+" id is "+app.person.getPersonId());
				break;
			case 3:
				app.listAllBooks();
				break;
			case 4:
				app.listAllPersons();
				break;
			case 5:
				System.out.println("Enter the bookid");
				id=in.nextInt();
				System.out.println("Enter the person id");
				pid=in.nextInt();
				app.issueBook(id,pid);
				break;
			case 6:
				System.out.println("Enter the bookid");
				id=in.nextInt();
				app.lastTake(id);
				break;
			case 7:
				System.out.println("Enter the personid");
				id=in.nextInt();
				app.lastBook(id);
				break;
			case 8:
				app.whoHaveBooks();
				break;
			case 9:
				System.out.println("Enter the bookid");
				id=in.nextInt();
				app.returnBook(id);
				break;
			case 10:
				app.allReadBooks();
				break;
			}
			System.out.println("Do u continue press 1");
			ch=in.nextInt();
			
		}while(ch==1);

	}
	public void lastTake(int id)
	{
		book=(Book)books.get(id-1);
		int size=book.getWhoTakeBooks().size();
		System.out.println("Total Number of times taken  "+size);
		if(size>=1)
		System.out.println(((Person)book.getWhoTakeBooks().get(size-1)).getName());
		else
			System.out.println("Not taking any books");
	}
	public void lastBook(int id)
	{
		person=(Person)persons.get(id-1);
		int size=person.getWhichBookTake().size();
		System.out.println("Total Number of times taken  "+size);
		book=(Book)person.getWhichBookTake().get(size-1);
		System.out.println(book.getBookName());
	}
	public void listAllBooks()
	{
		Iterator itr=books.iterator();
		System.out.println("Total number of Books "+books.size());
		while(itr.hasNext())
		{
			Book b=(Book)itr.next();
			System.out.println(b.getBookId()+" "+b.getBookName());
			
		}
		
	}
	public void listAllPersons()
	{
		Iterator itr=persons.iterator();
		System.out.println("Total number of Persons "+persons.size());
		while(itr.hasNext())
		{
			Person per=(Person)itr.next();
			System.out.println(per.getPersonId()+" "+per.getName());
		}
	}

	
	public void  inc_Books()
	{
		nob++;
		
	}
	public void inc_StorePlace()
	{
		nosp++;
	}
	public void inc_Persons()
	{
		nop++;
	}
	public int  getNob()
	{
		return nob;
	}
	public int getNop()
	{
		return nop;
	}
	public int getNoSp()
	{
		return nosp;
	}
	
	public void addBook(String str)
	{
		book=new Book();
		this.inc_Books();
		int id=this.getNob();
		book.setBookName(str);
		book.setBookId(id);
		books.add(book);
		
	}
	public void addPerson(String str)
	{
		person=new Person();
		this.inc_Persons();
		int id=this.getNop();
		person.setName(str);
		person.setPersonId(id);
		persons.add(person);
	}
	public void issueBook(int bid,int pid)
	{
		book=(Book)books.get(bid-1);
		person=(Person)persons.get(pid-1);
		if(book.getStatus()&&person.getStatus())
		{
			book.setStatus(false);
			person.setStatus(false);
			book.addStudent().add(person);
			person.addPerson().add(book);
			issuebook=new Issuebook();
			issuebook.setRetDate(null);
			issuebook.setBook(book);
			issuebook.setPerson(person);
			this.issue_det.add(issuebook);
			int size=book.getWhoTakeBooks().size();
		//	System.out.println(((Person)book.getWhoTakeBooks().get(size-1)).getName());
			System.out.println(book.getBookName()+" book issued to "+person.getName());
		}
		else
		{
			System.out.println("sorry unavailable to take book now");
		}
		
	}
	public void whoHaveBooks(){
		Iterator itr=issue_det.iterator();
		System.out.println("Total number of times "+issue_det.size());
		while(itr.hasNext())
		{
			issuebook=(Issuebook)itr.next();
			book=(Book)issuebook.getBook();
			person=(Person)issuebook.getPerson();
			System.out.println(book.book_name+" "+person.getName());
		}
	}
	public void returnBook(int id)
	{
		Book b;
		Person p;
		book=(Book)books.get(id);
		int pid=book.getWhoTakeBooks().size();
		person=(Person)book.getWhoTakeBooks().get(pid-1);
		book.setStatus(true);
		person.setStatus(true);
		
		Iterator itr=issue_det.iterator();
		//sp=new Storeplace();
		while(itr.hasNext())
		{
			issuebook=(Issuebook)itr.next();
			b=(Book)issuebook.getBook();
			if(b==book)
			{
				Date d=new Date();
				issuebook.setRetDate(d);
				strplaces.add(issuebook);
				System.out.println(b.getBookName()+" "+person.getName());
				itr.remove();
				break;
				
			}
		}	
	}
	public void allReadBooks()
	{
		Iterator itr=strplaces.iterator();
		while(itr.hasNext())
		{
			issuebook=(Issuebook)itr.next();
			book=(Book)issuebook.getBook();
			person=(Person)issuebook.getPerson();
			System.out.println(book.getBookName()+" "+person.getName()+" "+issuebook.getRetDate());
		}
	}
	
}
