package dataType;

public class PrimitiveDataType {

	public static void main(String[] args) {

		//1 Boolean
		boolean bol=true;//1 bit
		System.out.println(bol);
		
		//2 Numeric
		//2.1 Character
		char oneCharacter='@';//2 bytes { 1 byte = 8 bit }
		System.out.println(oneCharacter);
		
		//2.2 Integral
		//2.2.1 Integers
		byte byt=23;//1 byte { 2^8 = 256 which is (-128 to 127) } as 1st bit says 1=negative 0=positive
		System.out.println(byt);
		
		short sot=123;//	2 bytes
		System.out.println(sot);
		
		int in=1232;//4 bytes
		System.err.println(in);
		
		long lg=12345;//8 bytes
		System.out.println(lg);
		
		//2.2.2 Floating
		float flo=(float) 23.23;
		float f=2.23f;//4 bytes ,Sufficient for storing 6 to 7 decimal digits
		System.out.println(flo);
		System.out.println(f);
		
		double d=23.23;//8 bytes ,Sufficient for storing 15 decimal digits
		System.out.println(d);

	}

}
