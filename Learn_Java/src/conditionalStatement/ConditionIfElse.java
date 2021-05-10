package conditionalStatement;

public class ConditionIfElse {

	public static void main(String[] args) {

		int a=2;
		int b=2;
		//if-else
		if(a>b) 
			System.out.println("a is greater");
		else
			System.out.println("b is greater");
		
		//if-else if-else
		if(a>b)
			System.out.println("a is greater");
		else if (a<b)
			System.out.println("b is greater");
		else 
			System.out.println("Both are equal");
		

	}

}
