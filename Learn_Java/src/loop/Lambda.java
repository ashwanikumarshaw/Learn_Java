package loop;

import java.util.*;

public class Lambda {

	public static void main(String[] args) {

		List<Integer> num=new ArrayList<>();
		num.add(5);
		num.add(55);
		num.add(50);
		num.add(6);
		num.add(9);
		num.forEach(System.out::println);

	}

}
