package string;

public class Reverse_string_WordByWord {

	public static void main(String[] args) {
		String sent="My name is Ashu  kumar";//ip
		//op:kumar Ashu is name My
	
		String revSent="";
		//int c=0;
		String arrList[]=sent.split(" ");
		for (String com:arrList)
			if(!com.equals("")) {
			revSent=com.trim()+" "+revSent;
			//System.out.println(com);
			}
		revSent=revSent.trim();
		System.out.println(revSent);
		
//		int t=revSent.length();
//		for (int i=0;i<t;i++)
//		{
//			if(revSent.charAt(i)==' ')
//				c++;
//		}
//		System.out.println(c);
	}

}
