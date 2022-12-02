import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Scores {

	public static int getValue(String word){

		Map<Character, Integer> letterValues = new HashMap<>();
		letterValues.put('a', 1);
		letterValues.put('b', 3);
		letterValues.put('d', 2);
		letterValues.put('e', 1);
		letterValues.put('f', 4);
		letterValues.put('g', 2);
		letterValues.put('h', 4);
		letterValues.put('i', 1);
		letterValues.put('j', 8);
		letterValues.put('k', 5);
		letterValues.put('l', 1);
		letterValues.put('m', 3);
		letterValues.put('n', 1);
		letterValues.put('o', 1);
		letterValues.put('p', 3);
		letterValues.put('q', 10);
		letterValues.put('r', 1);
		letterValues.put('s', 1);
		letterValues.put('t', 1);
		letterValues.put('u', 1);
		letterValues.put('v', 8);
		letterValues.put('w', 4);
		letterValues.put('x', 8);
		letterValues.put('y', 4);
		letterValues.put('z', 10);



		return word.toLowerCase().chars().map(e -> letterValues.get((char)e)).sum();
	}

	public static void main(String[] args) {

		System.out.println("The first question: ");
		Integer sum;
		List<Integer> sumList = new ArrayList<>();
		Map<String, Integer> map = new HashMap<>();
		Map<String, Integer> topThreeWords = new HashMap<>();
		String[] word = {"Java", "program", "list", "string",
				"unix", "hours", "syntax", "error"};


		//top 3 Map print
		Stream.of(word)
				.sorted((e1, e2) -> getValue(e2) - getValue(e1))
				.limit(3)
				.forEach(e -> topThreeWords.put(e, getValue(e)));
		System.out.println("Top 3 words are: " + topThreeWords);

		//get map sum list
		Stream.of(word)
				.sorted((e1, e2) -> getValue(e2) - getValue(e1))
				.forEach(e -> sumList.add(getValue(e)));

		sum = sumList.stream().collect(Collectors.summingInt(Integer::intValue));

		double average = (double)sum/sumList.size();

		System.out.println("The Average Score is : " + average);

		//put score in to map Map
		Stream.of(word)
				.sorted((e1, e2) -> getValue(e2) - getValue(e1))
				.forEach(e-> map.put(e, getValue(e)));


		//Above and below average:
		double finalAverage = average;
		Map<String, Integer> belowAverage =
				map.entrySet().stream()
						.sorted(Map.Entry.comparingByValue())
						.filter( x -> x.getValue() < finalAverage)
						.collect(Collectors.toMap(x -> x.getKey(),
								x-> x.getValue()));

		System.out.println("Below Average: " + belowAverage);
		Map<String, Integer> aboveAverage = map.entrySet().stream()
				.sorted(Map.Entry.comparingByValue())
				.filter(x -> x.getValue() > finalAverage)
				.collect(Collectors.toMap(x -> x.getKey(),
						x-> x.getValue()));
		System.out.println("Above Average: " + aboveAverage);



		System.out.println("\nThe second question: ");
		List<Integer> randomNum = new ArrayList<>();
		int min = 1;
		int max = 9;
		for(int i = 0; i <100; i++){

			randomNum.add((int) Math.floor(Math.random()*(( max-min+1)+min)));

		}

		Map<Object, Long> r = new HashMap<>();
		r = randomNum.stream().collect(Collectors.groupingBy(k -> k,
				Collectors.counting()));

		System.out.println(r);


		System.out.println("\nThe third question: ");
		int	min1 = 30;
		int max1 = 90;

		Integer[][] numberArray = new Integer[][]{

				{34, 89}, {56,3}, {27, 61}, {45, 8},
				{45, 89}, {2, 6}, {100, 200}

		};

		Integer[] results = Stream.of(numberArray)
				.flatMap(Stream::of)
				.sorted()
				.toArray(Integer[]::new);

		for(Integer i : results)
			System.out.println(i);


	}

}
