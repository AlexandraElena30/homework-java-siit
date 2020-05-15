package homework11.exercise1;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ClothingStore {

//    public static void main(String[] args) {
//        List<Integer> inputList = Arrays.asList(1, 2, 3, 1, 2, 2, 1, 4, 5);
//
//        int[] arr = {1, 2, 3, 1, 2, 2, 1, 4, 5};
//
//        Map<Integer, Long> map = inputList.stream()
//                .collect(Collectors.groupingBy(x -> x, Collectors.counting()));
//
//        System.out.println(map);
//        System.out.println(map.values().stream().map(x -> x / 2).reduce(0l, (a, b) -> a + b));
//
//    }

    public long countPairs(List<Integer>inputList){
        Map<Integer, Long> map = inputList.stream()
                .collect(Collectors.groupingBy(x -> x, Collectors.counting()));

        return map.values().stream().map(x -> x / 2).reduce(0l, (a, b) -> a + b);
    }


}
