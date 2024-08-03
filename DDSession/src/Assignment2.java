public class Assignment2 {
//  (((((10/2)-2)*2)-2)+2)

	public int div(int a, int b) {
		int c = a / b;
		System.out.println("result is " + c);
		return c;
	}

	public int sub(int a1, int b1) {
		int c1 = a1 - b1;
		System.out.println("result is " + c1);
		return c1;
	}

	public int multi(int a2, int b2) {
		int c2 = a2 * b2;
		System.out.println("result is " + c2);
		return c2;
	}

	public void add(int a3, int b3) {
		int c3 = a3 + b3;
		System.out.println("final result is " + c3);
	}

	public static void main(String[] args) {
		Assignment2 a = new Assignment2();
		int divresult = a.div(10, 2);
		int subresult = a.sub(divresult, 2);
		int multiresult = a.multi(subresult, 2);
		int subresult1 = a.sub(multiresult, 2);
		a.add(subresult1, 2);
	}

}
