import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Main2 {
	
public static void main(String[] args) {
	
	List<Integer> arr = new ArrayList<Integer>();
	
	for (int i = 7; i <=7777777; i++) {
		if(i%7 == 0) {
			arr.add(i);
		}
	}
	System.out.println(Arrays.toString(arr.toArray()));
	}
}