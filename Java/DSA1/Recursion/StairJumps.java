package Recursion;

public class StairJumps {
    static int countWays(int n) {
        if (n < 0)
            return 0;
        if (n < 3)
            return n;
        int[] t = new int[n + 1];
        int M = 1_000_000_007;
        t[1] = 1;
        t[2] = 2;
        t[3] = 4;
        for (int i = 4; i < n + 1; i++)
            t[i] = (t[i - 1] + t[i - 2] + t[i - 3]) % M;
//        for (int e : t)
//            System.out.print(e + " ");
//        System.out.println();
        return t[n];
    }

    public static void main(String[] args) {
        int n = 6;
        int stepCount = countWays(n);
        System.out.println(stepCount);
    }
}
