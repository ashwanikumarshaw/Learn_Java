package _Generics;

public class Pair <X,Y>{//we are not defining types of var , it will be define at run time
	 X x;
	 Y y;
	Pair(X x,Y y){
		this.x=x;
		this.y=y;
	}
	public void Display () {
		System.out.println(x+ "  "+y);
	}

}
