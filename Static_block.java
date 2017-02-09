

public class Static_block  extends Child{
   int flag;
	static
	{
		
		System.out.println("Static_block static block is executed");
	}
	Static_block()
	{
		flag=1;
		System.out.println("Sattic-block static block constructor is executed");
	}
	{
		flag=0;
	}
	public static void main(String[] args) {
		Static_block sb=new Static_block();
		System.out.println(sb.flag);

	}

}
class Parent
{
	static 
	{
System.out.println("parent static block");
	}
	Parent(){
		System.out.println("parent class constructor");
	}
	
}
class Child extends Parent
{
	static
	{
		System.out.println("child static block");
	}
	Child()
	{
		System.out.println("child constructor called");
	}
}
