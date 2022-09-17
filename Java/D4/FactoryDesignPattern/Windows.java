package src.FactoryDesignPattern;

public class Windows implements OS{

    @Override
    public void welcome() {
        System.out.println("Welcome to Windows");
    }
}
