package exam.operator;

public class WhileKeyControlExample {
	public static void main(String[] args) throws Exception {
		boolean run = true;
		int spead = 0;
		int keyCode = 0;
		
		while(run) {
			if (keyCode!=13 && keyCode!=10) {
				
		System.out.println("");
		System.out.println("1. 증속 2. 감속 3. 중지");
		System.out.println("");
		System.out.println("선택: ");
		System.out.println("선택: ");
				}
			
			keyCode = System.in.read();
			
			if (keyCode == 49)
				speed++;
			System.out.println("현재속도="  + speed);
		}
	}

}
