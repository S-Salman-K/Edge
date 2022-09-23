package Array;

import java.util.Arrays;
import java.util.HashSet;

public class Duplicates {
    static boolean isHavingDuplicate(int[] arr) {
        return !(arr.length == new HashSet<>(Arrays.asList(arr)).size());
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 3, 5};
        boolean doesHaveDuplicate = isHavingDuplicate(arr);
        System.out.println(doesHaveDuplicate);
    }
}
