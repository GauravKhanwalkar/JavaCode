
public class student {
	
	//Initialize the variable  
	int RollNo;
	int Age;
	//Method-1
	public void display1() {
		System.out.println("Welcome To All Of You");
		}
	
	//Method-2
	public void display2() {
		System.out.println("Automation is very easy");
		
	}
	
	public static void main(String[] args) {
		//object creation to access the method
		student deepak=new student();
		
		//Assigning values to the variable 
		deepak.RollNo=123;
		deepak.Age=23;
		
		System.out.println(deepak.RollNo);
		System.out.println(deepak.Age);
		
		deepak.display1();
		deepak.display2();
	}
	
	
	

}
