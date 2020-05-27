package exam.operator;

public class InfinityAndNaNCheckExample {
	public static void main(String[] args) {
		int x =5;
		double y =0.0;
		double a =x/y;
		System.out.println(a);
		
		System.out.println(Double.isFinite(a));
	}

}
