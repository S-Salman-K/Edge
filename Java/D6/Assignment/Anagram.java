package Assignment;

import java.util.HashMap;

public class Anagram {
    static boolean areAnagramStrings(String s1, String s2){
        HashMap<Character, Integer> freq = new HashMap<>();
        for(char e: s1.toCharArray())
            freq.put(e, freq.getOrDefault(e, 0)+1);
        for(char e: s2.toCharArray()){
            if(freq.containsKey(e)){
                freq.put(e, freq.get(e)-1);
                if(freq.get(e)==-1)
                    return false;
            }
            else
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String s1 = "JdsfH&6845";
        String s2 = "fH4&J68ds5";
        boolean areAnagrams = areAnagramStrings(s1, s2);
        System.out.printf("Are %s and %s anagrams: %b", s1, s2, areAnagrams);
    }
}
