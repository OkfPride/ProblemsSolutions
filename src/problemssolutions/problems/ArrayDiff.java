package problemssolutions.problems;

import java.util.Arrays;

public class ArrayDiff {

    public static void main(String[] args) {
        int[] a = {1, 2, 3 , 3, 3,2, 6,100};
        int[] b = {1, 2,6,8,2,88};

        int[] ints = arrayDiff(a, b);
        System.out.printf(Arrays.toString(ints));
    }

    public static int[] arrayDiff(int[] a, int[] b) {
        // Your code here
        return Arrays.stream(a)
                     .filter(aa -> Arrays.stream(b)
                                         .noneMatch(bb -> bb == aa))
                     .toArray();
    }

}
