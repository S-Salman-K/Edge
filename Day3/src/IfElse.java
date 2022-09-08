
public class IfElse {
	static char getGrade(int marks) {
		if(marks>89)
			return 'A';
		else if(marks>79)
			return 'B';
		else if(marks>69)
			return 'C';
		else if(marks>59)
			return 'D';
		else if(marks>39)
			return 'E';
		else
			return 'F';
	}

	public static void main(String[] args) {
		int marks = 86;
		char grade = getGrade(marks);
		System.out.println(grade);
	}

}
