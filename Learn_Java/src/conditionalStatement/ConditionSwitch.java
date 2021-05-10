package conditionalStatement;

public class ConditionSwitch {

	public static void main(String[] args) {
		//Example 1
		int a=3;
		switch (a) {
		case 1:
			System.out.println("a is 1");
			break;
		case 2:
			System.out.println("a is 2");
			break;
		case 3:
			System.out.println("a is 3");
			break;	
		default:
			System.out.println("a Not in Case");
			break;
		}
		//Example 2
		int day = 4;
		switch (day) {
		  case 6:
		    System.out.println("Today is Saturday");
		    break;
		  case 7:
		    System.out.println("Today is Sunday");
		    break;
		  default:
		    System.out.println("Looking forward to the Weekend");
		}

	}

}
