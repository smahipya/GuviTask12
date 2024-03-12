package Task12;

import java.util.ArrayList;

public class Ans2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list = new ArrayList<String>();

		list.add("One");
		list.add("Two");
		list.add("Three");
		list.add("Four");
		list.add("Five");

		System.out.println("ArrayList before clearing :" + list);
		list.clear();
		System.out.println("ArrayList after clearing :" + list);

	}

}
