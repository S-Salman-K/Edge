package src.FactoryDesignPattern;

public class OSFactory {
    public OS getOS(String osType){
        if(osType == null){
            return null;
        }
        if(osType.equalsIgnoreCase("Windows")) {
            return new Windows();
        }
        else if(osType.equalsIgnoreCase("IOS")){
            return new IOS();
        }
        else if(osType.equalsIgnoreCase("Andriod")) {
            return new Andriod();
        }
        return null;
    }
}
