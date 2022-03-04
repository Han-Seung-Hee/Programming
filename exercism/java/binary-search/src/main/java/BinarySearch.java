import java.util.List;
import java.util.Arrays;

public class BinarySearch {
    private List<Integer> list;

    public BinarySearch(List<Integer> list){
        this.list = list;
    }

    public int indexOf(int pos) throws ValueNotFoundException{
        int first = 0;
        int last = list.size()-1;
        int mid = (first + last) /2;

        if(list.size() == 1) return 0;
        if(list.size() == 0) throw new ValueNotFoundException("Value not in array");
        while(first <= last){
            if(pos == list.get(mid)){
                return mid;
            }else if(pos > list.get(mid)){
                first = mid ; // stackoverflow 방지
            }else{
                last = mid  ;
            }
            mid = (first + last) /2;
            String st = String.format("%d + %d  /2 = %d" , first , last , mid);
            System.out.println(st);
        }

        throw new ValueNotFoundException("Value not in array");
    }
}