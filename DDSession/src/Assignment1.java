
public class Assignment1 {
//  (((((10+2)*2)-2)*2)/2)

	public int sum(int a, int b) {
		int c;
		c = a + b;
		System.out.println("result is " + c);
		return c;
	}

	public int multi(int a1, int b1) {
		int c1 = a1 * b1;
		System.out.println("result is " + c1);
		return c1;
	}

	public int sub(int a2, int b2) {
		int c2;
		c2 = a2 - b2;
		System.out.println("result is " + c2);
		return c2;
	}

	public void div(int a4, int b4) {
		int c4;
		c4 = a4 / b4;
		System.out.println("Final result is " + c4);
	}

	public static void main(String[] args) {
		Assignment1 a = new Assignment1();
		int sumresult = a.sum(10, 2);
		int multiresult = a.multi(sumresult, 2);
		int subresult = a.sub(multiresult, 2);
		int multiresult1 = a.multi(subresult, 2);
		a.div(multiresult1, 2);
	}

}
