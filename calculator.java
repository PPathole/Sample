import java.util.*;
public class calculator{
	public static void main(String[] args){
		Character[] ray = {'p', 'w', 'n', 'e', 'p', 'w'};
		List<Character> list1 = Arrays.asList(ray);
		System.out.println("Original list is: ");
		output(list1);
		
		Collections.sort(list1);
		System.out.println("Sorted list is: ");
		output(list1);
		
		Collections.reverse(list1);
		System.out.println("Reverse list is: ");
		output(list1);
		
		Collections.frequency(list1, 'p');
		System.out.println("Number of occurances of P is: ");
		output(list1);
		
		Collections.fill(list1, 'X');
		System.out.println("Filled list is: ");
		output(list1);
		
		
	}
	
	private static void output(List<Character> l1){
		for(Character x : l1){
			System.out.printf("%s ", x);
		}
		System.out.println();
	}
}