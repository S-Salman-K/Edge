package Practice;

import java.util.Map;
import java.util.PriorityQueue;
import java.util.TreeMap;

class Student {
    String name;
    int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString(){
        return name+" "+age;
    }
}


public class TreeMapCompare {
    public static void main(String[] args) {
        TreeMap<Student, Integer> tree = new TreeMap<>((a, b)->a.name.compareTo(b.name));
        tree.put(new Student("Jon", 20), 1);
        tree.put(new Student("Ron", 19), 2);
        tree.put(new Student("Bon", 18), 3);
        for(Map.Entry<Student, Integer> kv : tree.entrySet())
            System.out.println(kv.getKey()+" : "+kv.getValue());

        PriorityQueue<Integer> queue = new PriorityQueue<>();
        queue.add(1);
        queue.offer(2);

    }
}
