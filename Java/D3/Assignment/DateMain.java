package Assignment;

class Date{
	private int day;
	private int month;
	private int year;
	
	public Date(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}
	
	@Override
	public String toString() {
		return String.format("%02d-%02d-%4d", day, month, year);
	}
	
	public void displayDate() {
		System.out.printf("%02d-%02d-%4d\n", day, month, year);
	}
	
	boolean isLeapYear(int year) {
		if(year%4==0 && year%100!=0 || year%400==0)
			return true;
		return false;
	}
	
	public boolean checkDate() {
		if(year<1)
			return false;
		if(month == 2) {
			if(isLeapYear(year)) 
				return day>=1 && day<=29;
			return day>=1 && day<=28;
		}
		if(month==1 || month==3 || month==5 || month==7 || month==8 || month==10 || month==12) {
			return day>=1 && day<=31;
				
		}
		else
			return day>=1 && day<=30;
	}
}

public class DateMain {

	public static void main(String[] args) {
		Date date = new Date(29, 2, 2022);
		date.displayDate();
		boolean isValidDate = date.checkDate();
		System.out.println("Date(dd-mm-yyyy):"+date+" is "+(isValidDate?"valid":"invalid"));
	}

}
