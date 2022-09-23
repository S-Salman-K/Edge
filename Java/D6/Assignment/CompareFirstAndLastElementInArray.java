package Assignment;

public class CompareFirstAndLastElementInArray {
    static boolean isFirstAndLastSame(String[] array) {
        int n = array.length;
        if (n == 0)
            return false;
        if (n == 1)
            return true;
        String first = array[0];
        String last = array[n - 1];
        return first.compareTo(last) == 0;
    }

    public static void main(String[] args) {
        String[] array = new String[]{"ghjGjh&^%&", "absdfsc", "cd3423e", "f^&*ghd", "^&8gHJG76", "ghjGjh&^%&"};
        boolean isFirstAndLastSame = isFirstAndLastSame(array);
        System.out.println("Is first and last elements are same: "+isFirstAndLastSame);
    }
}
