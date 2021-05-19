package _map;
/*
 * hashcode() and equals() methods
 * 
 * hashcode() and equals() methods have been defined in
 * Object class which is parent class for java objects .
 * For this reason , all java objects inherit a default 
 * implementation of these methods.
 */

import java.util.*;

public class Hashcode_Equals {

	public static void main(String[] args) {
		//
		Pen p1=new Pen(10, "red");
		Pen p2=new Pen(10, "red");
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p1.equals(p2));// before @Override equals : it will return false 
		System.out.println(p1==p2);
		System.out.println(p2.equals(p1));// before @Override equals : it will return false 
		 		
		Set<Pen> pset=new HashSet<>();//does not allow duplicate item
		pset.add(p1);
		pset.add(p2);
		System.out.println(pset);//before @Override hashCode : p1 & p2 are equal but set is treating it as diff

	}
}
	/**
	 * @author ashwani kumar shaw
	 *
	 */
	class Pen{
		int price;
		String color;
		public Pen(int price ,String color) {
			this.price=price;
			this.color=color;
		}
		
//		@Override
//		public boolean equals(Object obj) {
//			Pen that=(Pen) obj;
//			boolean isEqual=this.price==that.price&&
//					this.color.equals(that.color);
//			return isEqual;
//			
//		}
//		//after this HashSet will give same hachcode to both p1 & p2
//		@Override
//		public int hashCode() {
//			return price+color.hashCode();//String has its own hashcode fun
//		}
		
		
		//after Source-> Generate hashCode and equals : for dealing edge cases
		
        @Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Pen other = (Pen) obj;
			if (color == null) {
				if (other.color != null)
					return false;
			} else if (!color.equals(other.color))
				return false;
			if (price != other.price)
				return false;
			return true;
		}
        
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((color == null) ? 0 : color.hashCode());
			result = prime * result + price;
			return result;
		}
	}


