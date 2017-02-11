package library;
import java.util.*;
public  class Book
{
	public String book_name,auth_name,pub_name,lang;
	public int nop,year;
	private int book_id;
	public float price;
	public boolean status=true;
	ArrayList bk_per;
	public Book()
	{
		bk_per=new ArrayList();
	}
	public ArrayList addStudent()
	{
		return this.bk_per;
	}
	public ArrayList getWhoTakeBooks()
	{
		return this.bk_per;
	}
	public boolean getStatus()
	{
		return this.status;
	}
	public String getBookName()
	{
		return this.book_name;
	}
	public String getAuthName()
	{
		return this.auth_name;
	}
	public String getPubName()
	{
	   return this.pub_name;	
	}
	public String getlang()
	{
		return this.lang;
	}
	public int getNop()
	{
		return this.nop;
	}
	public float getPrice()
	{
		return this.price;
	}
	public int getYear()
	{
		return this.year;
	}
	 public int getBookId()
	  {
		  return this.book_id;
	  }
	public void setBookName(String bk_name)
	{
		this.book_name=bk_name;
	}
	public void setAuthName(String aname)
	{
		this.auth_name=aname;
	}
	public void setPubName(String pname)
	{
		this.pub_name=pname;
	}
	public void setNop(int nop)
	{
		this.nop=nop;
	}
	public void setPrice(float price)
	{
		this.price=price;
	}
	public void setLang(String lang)
	{
		this.lang=lang;
	}
	public void setYear(int year)
	{
		this.year=year;
	}
	
	  public void setBookId(int id)
	  {
		  this.book_id=id;
	  }
	  public void setStatus(boolean b)
	  {
		  this.status=b;
	  }
	
}