package library_pro;
 class Book extends GeneralBook
{
  private int bookid;
  public boolean status=true;
  public int sid=0;
  public Book(String bname,String aname)
  {   
	  super(bname,aname);
	  this.bookid=nob; 
  }
  public int getBookid()
  {
	  return this.bookid; 
  }
  public boolean getStatus()
  {
	  return this.status;
  }
  
  
  
}
 class GeneralBook
 {
	 public String book_name,author_name,pub_name;
	 public float price;
	  public static int nob;
	  public int nop;
	  public static int no_of_books()
	  {
		  return nob;
	  }
	  GeneralBook(String bname,String aname)
	  {   nob++;
		  this.book_name=bname;
		  this.author_name=aname;  
	  }
	  public String getBookname()
	  {
		return this.book_name;
	  } 
	  public String getAuthorname()
	  {
		  return this.author_name;
	  }
	 
 }