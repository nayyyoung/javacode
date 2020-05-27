package exam.operator;

public class SwitchExample {
	public static void main(String[] args) {
		int num = (int)(Math.random() *6)+1; 
		switch(num) {
		case 1:
			System.out.println("1번");
			break;
		case 2:
			  System.out.println("2번");
			  break;
			  default:
			     System.out.println("기본");
			     break;
			     default:
			    	 System.out.println("기본");
			    	 
			    	 char grade = 'A+';
			    	 char grade = 'B';
			    	 char grade = 'C';
			    	 char grade = 'D';
			    	 char grade = 'F';
			    	 
			    	 Switch(grade) {
			    		 case 'A':
			    		 case 'B':
			    		 case 'c':
			    			 System.out.println("100점은 A+");
			    	 }
			    	 System.out.println('A');
			    	 
			    	 System.out.println('B');
			    	 System.out.println('c'); 
		}