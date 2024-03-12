package Task12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeMap;

public class Ans3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<Integer, String> Empdt = new TreeMap<>();
		Empdt.put(101, "sandy");
		Empdt.put(102, "bala");
		Empdt.put(103, "sathesh");
		Empdt.put(104, "raja");

		System.out.println("The Employee name in Alphabetical order :");
		List<String> names = new ArrayList<>(Empdt.values());
		Collections.sort(names);
		for (String name : names) {
			System.out.println(name);
		}

	}

}
