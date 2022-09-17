public class EnumDemo {
	
	enum Day{
		MONDAY,
		TUESDAY,
		WEDNESDAY,
		THURSDAY,
		FRIDAY,
		SATURDAY,
		SUNDAY
	}
	
	public static void main(String[] args) {
		Day day = Day.MONDAY;
		System.out.println(day);
	}

}
