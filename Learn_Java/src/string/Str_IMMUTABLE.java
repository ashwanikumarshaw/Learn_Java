package string;

public class Str_IMMUTABLE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = new String ("Hello ");
		StringBuilder builder =new StringBuilder("Hello ");
		StringBuffer buffer =new StringBuffer("Hello ");
		String str1="Hello1 ";
		
		str.concat("world");
		String newStr = str.concat("Ashu");
		builder.append("world");
		buffer.append("world");
		str1.concat("world");

//		str1=str1+" number one";
//		str=str+" number two";
//		builder=builder+" number three";// error
		
		System.out.println(str); // Immutable
		System.out.println(builder);// Mutable
		System.out.println(buffer);// Mutable
		System.out.println(str1);
		System.out.println(newStr);

	}

}
