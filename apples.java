package apples;
import java.util.*;
public class apples{
	public static void main(String[] args){
		Integer[] iray = {7,3,9,1,3,4};
		List<Integer> l1 = Arrays.asList(iray);
		System.out.println("Original list: ");
		output(l1);
		
		
		Collections.sort(l1);
		System.out.println("Sorted list: ");
		output(l1);
		
		
		Collections.reverse(l1);
		System.out.println("Reverse list: ");
		output(l1);
		
		
		Collections.fill(l1, 3);
		System.out.println("Filled list: ");
		output(l1);
		
		
		Character[] cray = {'p','r','a','n','a','y'};
		List<Character> l2 = Arrays.asList(cray);
		System.out.println("Original Character List: ");
		output(l2);
		
		Collections.sort(l2);
		System.out.println("Sorted CLIST: ");
		output(l2);
		
		Collections.reverse(l2);
		System.out.println("Reversed CLIST: ");
		output(l2);
		
		Collections.fill(l2, 'X');
		System.out.println("Filled CLIST: ");
		output(l2);
	}
	
	public static <T> void output(List<T> l){
		for(T b : l){
			System.out.printf("%s ", b);
		}
		System.out.println();
	}
		
}