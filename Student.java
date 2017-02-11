package library_pro;

public class Student {
	public String stu_name;
	private int stu_id;
	public static int nos;
	public String pwd;
	public int bid=0;
	public boolean status=true;
	public String last_book=null,cur_book=null;
	public String getStudentname()
	{
		return this.stu_name;
	}
	public int getStu_id()
	{
		return this.stu_id;
	}
	public Student(String snam,String pwd)
	{
		nos++;
		this.stu_name=snam;
		this.pwd=pwd;
		this.stu_id=nos;
	}
	public boolean getStatus()
	{
	return this.status;
	}
	public  static int  no_of_stud()
	{
		return nos;
	}
	public String lastTake(int sid)
	{
		return this.last_book;
	}
	public String curTake(int sid)
	{
		return this.cur_book;
	}
}
