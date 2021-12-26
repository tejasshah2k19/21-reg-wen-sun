package collectiond;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo {

	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
		System.out.println(numbers);

		// square
		// cube
		// for each
		// index --> iterate

		List<Integer> cubes = new ArrayList<Integer>();
		for (int i = 0; i < numbers.size(); i++) {
			System.out.println(numbers.get(i) * numbers.get(i));
			cubes.add(numbers.get(i) * numbers.get(i) * numbers.get(i));
		}

//		numbers.stream().map(x->x*x);
		List cube = numbers.stream().map(x -> x * x * x).collect(Collectors.toList());//
		// .collect(Collectors.toSet());
		// toMap();

		// map filter
		System.out.println(cube);
	}
}
