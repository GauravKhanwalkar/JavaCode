
public class constructordemo {

	
	public  constructordemo() {
		
		this(11,96,78);
		System.out.println("default constructor");
	}
	
	public constructordemo(int a) {
		this(22,45);
		System.out.println("one parameterized constructor");
	}
	
	public constructordemo(int a,int b) {
		
		this();
		System.out.println("two parameterized constructor");
	}
	
	public constructordemo(int a,int b,int c) {
		
		System.out.println("three parameterized constructor");
	}
	
	public static void main(String[] args) {
		constructordemo cd=new constructordemo(21);
		
	}
	
}
