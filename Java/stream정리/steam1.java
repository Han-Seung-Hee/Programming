import java.util.stream.*;
import java.util.*;

class stream1 {
	public static void main(String[] args) {
		String[] arr = new String[]{"a","b","c"};
		Stream<String> stream = Arrays.stream(arr);
		Stream<String> streamOfArrayPart = 
			Arrays.stream(arr,1,3); // 1~2
	}
}