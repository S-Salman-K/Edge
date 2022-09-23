import java.util.ArrayList;

public class JosephusProblemK {
    public static int josephus(int n, int k) {
        ArrayList<Integer> persons = new ArrayList<Integer>();
        for (int i = 1; i <= n; i++)
            persons.add(i);
        int swordIndex = 0;
        while (persons.size() > 1) {
            int killIndex = (swordIndex + k - 1) % persons.size();
            persons.remove(killIndex);
            swordIndex = killIndex % persons.size();
        }
        return persons.get(0);
    }

    public static void main(String[] args) {
        int n = 8;
        int k = 3;
        int safePosition = josephus(n, k);
        System.out.println("Position: " + safePosition);
    }


}
