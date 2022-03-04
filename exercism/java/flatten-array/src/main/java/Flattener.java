import java.util.ArrayList;
import java.util.List;

final class Flattener{
	List<Object> flatten(List<Object> mat){
		List<Object> res = new ArrayList<>();

		for(Object element : mat){
			if(element instanceof List){
				res.addAll(flatten((List) element));
			}else if(element != null){
				res.add(element);
			}
		}
		return res;
	}
	
	
}