package array;

public class ArrayAll {

	public static void main(String[] args) {

	//by default values of all the element in array is 0 in Integral
	int[] arrInt=new int[5];
	System.out.println(arrInt[3]);
	
	byte[] arrByte=new byte[5];
	System.out.println(arrByte[3]);
	
	long[] arrLon=new long[5];
	System.out.println(arrLon[3]);
	
	//by default values of all the element in array is 0.0 in Floating
	float[] arrFloat =new float[5];
	System.out.println(arrFloat[4]);
	double[] arrDoub= new double[5];
	System.out.println(arrDoub[3]);
	
	//by default values of all the element in array is false in boolean
	boolean[] arrbool=new boolean[5];
	System.out.println(arrbool[4]);
	
	//by default values of all the element in array is empty in Char
	char[] arrChar=new char[5];
	System.out.println(arrChar[4]);
	
	//by default values of all the element in array is null in String
	String[] arrString =new String[5];
	System.out.println(arrString[3]);
	
	// to know the length of array
	System.out.println(arrChar.length);
	}

}
