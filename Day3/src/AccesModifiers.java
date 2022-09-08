class Modifiers{
	public String publicData = "public data";
	String defaultData = "default data";
	protected String protectedData = "protected data";
	private String privateData = "priavate data";

	@Override
	public String toString() {
		return publicData+"\n"+defaultData+"\n"+protectedData+"\n"+privateData;
	}	
}



public class AccesModifiers {

	public static void main(String[] args) {
		Modifiers ob = new Modifiers();
		System.out.println(ob);
	}

}
