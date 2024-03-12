package Task12;

import java.util.LinkedList;
import java.util.List;

public class Ans4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> obj = new LinkedList<String>();
		obj.add("car");
		obj.add("bike");
		obj.add("cycle");
		obj.add("airline");

		String[] arr = obj.toArray(new String[0]);

		for (String x : arr)
			System.out.print(x + " ");

	}

}
