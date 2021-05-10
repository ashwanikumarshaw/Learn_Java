package dataType;

public class TypeCastingWidening {

	public static void main(String[] args) {
		//Widening Casting (automatically) - converting a smaller type to a larger type size
		//byte -> short -> char -> int -> long -> float -> double
		int num=12;
		double newNum=num;
		
		System.out.println(newNum);

	}

}
