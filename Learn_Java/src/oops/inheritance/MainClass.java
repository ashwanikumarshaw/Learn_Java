package oops.inheritance;


public class MainClass {
	
	public static void main(String[] args) {
		People p=new People();
		p.name="Ashu";
		p.eat();
		p.sleeP();
		p.name();
		System.out.println();
		
		Teacher t=new Teacher();
		t.name="aish";
		t.eat();	
		t.sleeP();
		t.teach();
		t.name();
		System.out.println();
		
		Singer s=new Singer();
		s.name="Raj";
		s.eat();
		s.sing();
		s.sleeP();
		s.name();
		System.out.println();
		
		People si=new Singer();
		si.name="ajhsd";
		si.eat();
		si.name();// use overridden method from Singer class
		//si.sing();//parent can't inherit from child
		
		System.out.println();
		People pe=s;
		/*Up-casting (Generalization or Widening) is casting to 
			a parent type in simple words casting individual type 
					to one common type is called up-casting */
		pe.eat();
		pe.name();
		pe.sleeP();	
		System.out.println();
		
		/*down-casting (specialization or narrowing) is casting to 
		 	a child type or casting common type to individual type.
		 	
		Singer c=(Singer) p;
		c.name();
		// Through ClassCastException at run time
		*/
		Singer s1=new Singer();
		s1.name="ASHW";
		People p1=s1;
		p1.name="Ashwani";
		Singer s2=(Singer)p1;
		
		//Teacher t1=(Teacher)p1;
		s2.name();
		s2.name="Ashawni kumar";
		s2.name();
		System.out.println();
		
		System.out.println("s2 is instance of people ?" + (s2 instanceof People));
		System.out.println("s2 is instance of Singer ?" + (s2 instanceof Singer));
		System.out.println("p1 is instance of Singer ?" + (p1 instanceof Singer));
		System.out.println("s1 is instance of people ?" + (s1 instanceof People));
		//System.out.println("t1 is instance of Teacher ?" + (t1 instanceof Teacher));
		//System.out.println("t1 is instance of people ?" + (t1 instanceof People));
		
		System.out.println();
		
		HeadBoy h=new HeadBoy();
		h.name="k.j. honne";
		//h.name();
		h.noteName();
		
		
	}

}
