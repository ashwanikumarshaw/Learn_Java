package oops.extera.staticClass;

import oops.extera.staticClass.A.B;
import oops.extera.staticClass.A.C;

public class MainClass {

	public static void main(String[] args) {
	
		A Aobj=new A();
		//B Bobj=new B();//cant make obj directly
		B Bobj=Aobj.new B();//non static
		C Cobj=new C();//Static class C act like it is out side the class A
		//or
		C objC=new A.C();
		//B objB=new A.B();//

		Bobj.x=1;
		Cobj.y=5;
		Bobj.out();
		Cobj.out();
		objC.y=8;
		objC.out(); 
	}

}
