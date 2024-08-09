
public class constructordemo {

	
	public  constructordemo() {
		
		this(11,96,78); //Navigate towards the Three parameterized constructor
		System.out.println("Default constructor");
	}
	
	public constructordemo(int a) {
		this(22,45);//Navigate towards the Two parameterized constructor
		System.out.println("One parameterized constructor");
	}
	
	public constructordemo(int a,int b) {
		
		this();//Navigate towards the default parameterized constructor
		System.out.println("Two parameterized constructor");
	}
	
	public constructordemo(int a,int b,int c) {
		
		System.out.println("Three parameterized constructor");
	}
	
	public static void main(String[] args) {
		constructordemo ck=new constructordemo(21);//Navigate towards the One parameterized constructor
		
	}
	
}
