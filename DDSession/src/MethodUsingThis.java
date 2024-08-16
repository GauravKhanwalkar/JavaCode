
public class MethodUsingThis {
	
	public void method1() {
		this.method4();		
		System.out.println("Default method");
		this.method2();
		this.method3();
		this.method5();
	}
	
	public void method2() {
	
		System.out.println("one parameterized method");
	}
	
	public void method3() {
	
		System.out.println("two parameterized method");
	}
	
	public void method4() {
		System.out.println("three parameterized method");
	}
	
	public void method5() {
		
		System.out.println("four parameterized method");
	}
	
	public static void main(String[] args) {
		MethodUsingThis obj=new MethodUsingThis();
		obj.method1();
		
	}
	

}
