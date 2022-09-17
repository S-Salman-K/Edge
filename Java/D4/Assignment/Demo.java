package Assignment;

// parent or base class
class A {

    // a parameterized constructor
//    A(int x, int y) {
//
//    }

    void foo() {
        System.out.println("Inside the foo method of base class.");
    }
}

// child or derived class
class B extends A {
//    B(int x, int y) {
//        super(x, y);
//    }

    void foo() {
        System.out.println("Inside the foo method of derived class.");
    }
}

public class Demo {
    // main method
    public static void main(String argvs[]) {
// creating an object of class B
        B obj = new B();
        obj.foo();
    }
}
