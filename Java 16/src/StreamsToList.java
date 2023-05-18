import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsToList {
    public static void main(String[] args) {
        // here ints and intsEquivalent shows the difference between Collectors.toList and toList method that is newly introduced.
        List<String> integersAsString = Arrays.asList("1", "2", "3");
        List<Integer> ints = integersAsString.stream().map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> intsEquivalent = integersAsString.stream().map(Integer::parseInt).toList();
    }
}
