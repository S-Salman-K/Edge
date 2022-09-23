package Array;

import java.util.HashSet;

public class UniqueCharacters {
    static boolean isUnique(String str) {
        HashSet<Character> set = new HashSet<>();
        for (char e : str.toCharArray()) {
            if (e!=' ' && set.contains(e))
                return false;
            set.add(e);
        }
        return true;
    }

    public static void main(String[] args) {
        String str = "1  2 jb 4";
        boolean areAllUnique = isUnique(str);
        System.out.println(areAllUnique);
    }
}
