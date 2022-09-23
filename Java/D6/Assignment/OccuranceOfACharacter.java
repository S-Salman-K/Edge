package Assignment;

public class OccuranceOfACharacter {
    static int countOccuranceInString(String str, char key) {
        int count = 0;
        for (char e : str.toCharArray()) {
            if (e == key)
                count++;
        }
        return count;
    }

    public static void main(String[] args) {
        String str = "safsrgstrbdrg";
        char key = 's';
        int count = countOccuranceInString(str, key);
        System.out.printf("Character \'%c\' has occurred %d time(s) in string \"%s\"", key, count, str);
    }
}
