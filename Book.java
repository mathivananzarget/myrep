package library_system;

import java.util.ArrayList;

public class Book implements library{
public String book_name,author_name,pub_name;
public int nop,bookid;
public float price;
public static int nob;
public boolean status=true;
public int sid=0;

public Book(String bname,String aname,String pname,int n,float p)
{
	nob++;
	this.book_name=bname;
	this.author_name=aname;
	this.pub_name=pname;
	this.nop=n;
	this.price=p;
	this.bookid=nob;
}


}
