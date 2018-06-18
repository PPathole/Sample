package dailyneed;
import java.util.*;
public class needs{
	public static void main(String[] args){
		String[] stuff = {"watermelns", "melons", "fudge", "babies"};
		LinkedList<String> list1 = new LinkedList<String>(Arrays.asList(stuff));
		list1.add("pencisl");
		list1.add("item");
		stuff = list1.toArray(new String[list1.size()]);
		for(String x : stuff){
			System.out.printf("%s ", x);
		}
	}
}
