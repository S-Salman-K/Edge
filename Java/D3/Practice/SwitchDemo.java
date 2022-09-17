
public class SwitchDemo {
	
	static char getGrade(int marks) {
		char grade = '?';
		marks /=10;
		switch(marks) {
			case 9:
				grade = 'A';
				break;
			case 8:
				grade = 'B';
				break;
			case 7:
				grade = 'C';
				break;
			case 6:
				grade = 'D';
				break;
			case 5:
				grade = 'E';
				break;
			case 4:
				grade = 'E';
				break;
			default:
				grade = 'F';
		}
		return grade;
	}

	public static void main(String[] args) {
		int marks = 78;
		char grade = getGrade(marks);
		System.out.println(grade);
	}

}
