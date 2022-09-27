package Recursion;

import java.util.ArrayList;
import java.util.List;

public class PrintAllValidParentheses {
    static void f(int open, int close, String ds, List<String> ans) {
        if (open == 0 && close == 0) {
            ans.add(ds);
            return;
        }
        if (open == 0) {
            f(open, close - 1, ds + ")", ans);
            return;
        }
        if (open == close) {
            f(open - 1, close, ds + "(", ans);
            return;
        }
        f(open - 1, close, ds + "(", ans);
        f(open, close - 1, ds + ")", ans);
    }

    static public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        f(n, n, "", ans);
        return ans;
    }

    public static void main(String[] args) {
        int n = 3;
        List<String> parenthesis = generateParenthesis(n);
        for (String e : parenthesis)
            System.out.println(e);
    }
}
