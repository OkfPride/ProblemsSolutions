package problemssolutions.problems;

import java.util.*;
import java.util.stream.Collectors;

public class FindHnumber {
    static int result = 0;

    static Map<Integer, List<Integer>> map = new HashMap<>();

    public static void main(String[] args) {
        int[] arr1 = {9, 2, 9, 4, 5, 6, 7, 8, 9};
        System.out.println(streamH(Arrays.stream(arr1).boxed().collect(Collectors.toList())));
        System.out.println(result);
//        System.out.println(findH(arr1));
    }

    private static int streamH(List<Integer> ints) {

        ints.forEach(FindHnumber::process);
        return 0;
    }
    private static int process(int number) { // 8
        List<Integer> numbers = new ArrayList<>();
        int [] counts; // 0  0 0 0 0
        int lenth = 0;

        lenth ++;

        for(int i = 1; i <= number; i++) {
            map.computeIfPresent(i, (integer, integers) -> {
                if(integers.size() < integer) {
                    integers.add(integer);
                }
                return integers;
            });
            map.computeIfAbsent(i, integer -> {
                List<Integer> objects = new ArrayList<>();
                objects.add(integer);
                return objects;
            });
        }

        for(int ii:map.keySet()) {
            if(result > ii)
                continue;

            if(map.get(ii).size() == ii)
                result = ii;
        }

        // getMaxHLength
        return result;
    }

    private static int findH(int[] arr) {
        if(arr == null || arr.length < 1)
            return 0;

        int tempMaxH = 0;
        for(int i : arr) {
            if(arr[i - 1] > tempMaxH) {
                int process = process(arr, i);
                if(process > tempMaxH)
                    tempMaxH = process;
            }
        }
        return tempMaxH;
    }

    private static int process(int[] arr, int i) {
        int tempCount = 0;
        for(int j = 0; j < arr.length; j++) {
            if(arr[j] >= i)
                tempCount++;
        }
        return tempCount >= i ? i : 0;
    }
}
