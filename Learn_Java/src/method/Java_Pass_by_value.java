package method;

public class Java_Pass_by_value {

	public static void main(String[] args) {
		// ex1
		int a = 5, b = 9;
		Java_Pass_by_value ob = new Java_Pass_by_value();
		ob.swap(a, b);
		System.out.println(a + "   " + b);// not swap as java is pass by value

		// ex2
		Dog a1 = new Dog();
		a1.legs = 4;
		Dog b1 = new Dog();
		b1.legs = 8;
		ob.swapUseObj(a1, b1);// passed obj ref
		System.out.println(a1.legs + "   " + b1.legs);// not swap as java is pass by value
		System.out.println();

		ob.swapByObjVal(a1, b1);
		System.out.println(a1.legs + "   " + b1.legs);// not swap as java is pass by value
		System.out.println();
		// ex3
		Dog dogobj = new Dog();
		dogobj.legs = 4;
		ob.dogChan(dogobj);
		System.out.println(dogobj.legs);// Changed but still its pass by value as obj are same and we update the old val
	}

	void swap(int a, int b) {
		int temp = a;
		a = b;
		b = temp;// Swapped
		return;
	}

	void swapUseObj(Dog a, Dog b) {
		Dog temp = a;
		a = b;
		b = temp;
	}

	void swapByObjVal(Dog a, Dog b) {
		Dog temp = new Dog();
		temp.legs = a.legs;
		a.legs = b.legs;
		b.legs = temp.legs;
	}

	void dogChan(Dog d) {
		d.legs = 8;
	}
}

class Dog {
	int legs;
}