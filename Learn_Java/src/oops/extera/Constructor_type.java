package oops.extera;
class Vehicale{
	int wheels;//imp1
	int headlight=2;
	String color="white";
	Vehicale(){
		wheels=4;
	}
//	Vehicale(int noOfWheels){
//		wheels=noOfWheels;
//	}
	Vehicale(int wheels){//constructor overloading
		this.wheels=wheels;//this.wheels is wheels at comment imp1
	}
	Vehicale(int wheels,String color){//constructor overloading
		this.wheels=wheels;//this.wheels is wheels at comment imp1
		this.color=color;//update default color
	}
}
public class Constructor_type {
	int inte;
	Constructor_type(){//no arg Constructor as no parameter passed 
		System.out.println("I am a no arg Constructor");
	}

	public static void main(String[] args) {
		Constructor_type ob=new Constructor_type();
		ob.inte=5;
		System.out.println(ob.inte+" num using initialize in main ");
		System.out.println();
		Vehicale v=new Vehicale();
		System.out.println(v.wheels+" wheels using constructor");
		System.out.println();
		Vehicale bike=new Vehicale(2);
		System.out.println(bike.wheels+" wheels using parameterize constructor "+bike.color);
		System.out.println();
		Vehicale car=new Vehicale(2,"red");
		System.out.println(car.wheels+" wheels using parameterize constructor "+car.color);
		

	}

}
