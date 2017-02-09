public class Static_block {

	static
	{
		System.out.println("static block is executed");
	}
	Static_block()
	{
		System.out.println("static block constructor is executed");
	}
	public static void main(String[] args) {
		Static_block sb=new Static_block();
		

	}

}
