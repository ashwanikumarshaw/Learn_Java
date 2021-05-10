package _Generics;

public class MainClass {

	public static void main(String[] args) {
		
		Pair <String,Integer> p1=new Pair<>("ashu", 34);
		Pair<Integer,Boolean> p2=new Pair<Integer, Boolean>(454, true);
		p1.Display();
		p2.Display();
		

	}

}
