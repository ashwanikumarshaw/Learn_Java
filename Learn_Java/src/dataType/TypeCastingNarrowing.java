package dataType;

public class TypeCastingNarrowing {

	public static void main(String[] args) {
		// Narrowing Casting (manually) - converting a larger type to a smaller size type
		//double -> float -> long -> int -> char -> short -> byte
		double num=3.149;
		byte newNum=(byte) num;
		System.out.println(newNum);//print floor value
	}

}
