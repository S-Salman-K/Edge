package src.FactoryDesignPattern;

import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        OSFactory osFactory = new OSFactory();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the type of OS(Windows/IOS/Android): ");
        String osType = sc.next();
        OS os = osFactory.getOS(osType);
        os.welcome();
    }
}
