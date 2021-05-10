package string;

public class String_op {

	public static void main(String[] args) {
		String sobj=new String("ashu"); //create "ashu" heap area as well as pool area
		String s1="ashu";//check in pool if find "ashu" assign s1 to "ashu" ,if not create in pool 
		String sobj2=new String("ashu");//create new obj same as sobj
		String s2="ashu";//assign "ashu" as s1 and sobj already have same string in pool area 

		System.out.println(sobj);
		System.out.println(s1);
		
		System.out.println(s1==sobj);//false as s1 is in pool only but sobj is heap area
		System.out.println(sobj2==sobj);//false Different obj
		System.out.println(s1==s2);//true  as s1 and s2 are assigned to same string 
		
		s1="raj"; //string are immutable ,"ashu" is still in pool area it adds "raj" in pool

		System.out.println(s2);//not change to s1 
		
		System.out.println(s1==s2);// false as now both assigned  to different stings 
		
		System.out.println(s1.charAt(2));//print letter at index 2 (starts from 0)
		
		System.out.println(sobj.charAt(3));
		
		System.out.println(sobj2.length());//prints length of the string
		
		System.out.println(s2.compareTo(sobj));//0 as both values are equal 
		System.out.println(sobj2.compareTo(sobj));//0 as both values are equal 
		String s3="ashu";
		System.out.println(s3.compareTo(s2));//0
		System.out.println(s3.compareTo(s1));//-ve no
		System.out.println(s1.compareTo(s3));//+ve no
		
		System.out.println(s2.substring(2));//hu from ashu
		System.out.println(s2.substring(1, 4));//shu from ashu
		
		System.out.println(sobj.contains(s2));//true
		System.out.println(sobj.contains("hu"));//true
		
		System.out.println(s2.equals(s3));//true
		System.out.println(s2.equals("hu"));//false
		
		String name=s2+" "+s1;//concat : ashu raj
		System.out.println(name.concat(" Shaw")); // concat ashu raj Shaw
		System.out.println(name.replace("a", "A"));//print Ashu rAj
		System.out.println();
		
		String list="ram,pendrive,mouce,datacard,rom,cpu";
		String arrList[]=list.split(",");

		for (String com:arrList)
			System.out.println(com);
		String space="     ashu k shaw   ";
		System.out.println(space.trim());//remove spasce front back
		
	}

}
