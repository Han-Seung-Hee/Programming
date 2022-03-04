import java.util.Optional;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Hamming {
    Integer hammingDistance;

    public Hamming(String leftStrand, String rightStrand) {
        if (leftStrand.isEmpty() && rightStrand.isEmpty()) {
            hammingDistance = 0;
            return;
        }
        if (leftStrand.isEmpty())
            throw new IllegalArgumentException("left strand must not be empty.");
        if (rightStrand.isEmpty())
            throw new IllegalArgumentException("right strand must not be empty.");
        if (leftStrand.length() != rightStrand.length())
            throw new IllegalArgumentException("leftStrand and rightStrand must be of equal length.");
        this.hammingDistance = IntStream.range(0, leftStrand.length())
                .reduce(0, (total, index) -> (leftStrand.charAt(index) != rightStrand.charAt(index)) ? ++total : total);
        //practice
        Stream<Integer> numbers01 = Stream.of(1,2,3,4,5,6,7,8,9,10);
        Optional<Integer> sum = numbers01.reduce((x,y) -> x+y);
        sum.ifPresent(s-> System.out.println(s));        
    }
    public int getHammingDistance() {
        return this.hammingDistance;
    }
}

