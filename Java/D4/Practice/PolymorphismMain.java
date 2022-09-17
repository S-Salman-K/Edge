class Windows {
    private String name;
    private String edition;

    void about() {
        System.out.println("Welcome to Windows");
    }
}

// Encapsulation
// Inheritance
// IS-A Relationship
class WindowsX extends Windows {
    //    Abstraction
    private String name;
    private String edition;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEdition() {
        return edition;
    }

    public void setEdition(String edition) {
        this.edition = edition;
    }

    //    Default Constructor
    public WindowsX() {
    }

    //    Constructor Overloading
    public WindowsX(String name) {
        this.setName(name);
    }

    //    Constructor Overloading
    public WindowsX(String name, String edition) {
        this(name);
        this.setEdition(edition);
    }

    //    Overriding
    public void about() {
        System.out.println("Welcome to Windows X");
    }

    //    Overloading
    public void logIn() {
        System.out.println("User logged in");
    }

    //    Overloading
    public void logIn(String user) {
        System.out.println(user + " logged in");
    }

    //    Overriding
    @Override
    public String toString() {
        return name + " " + edition;
    }

}


public class PolymorphismMain {
    public static void main(String[] args) {
        WindowsX windowsX = new WindowsX("Windows X", "Ultimate");
        System.out.println(windowsX);
        windowsX.about();
        windowsX.logIn();
        windowsX.logIn("Tobi");
    }
}
