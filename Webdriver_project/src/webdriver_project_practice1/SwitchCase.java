package webdriver_project_practice1;

public class SwitchCase {

	public static void main(String[] args) {
		int key=5;
		switch (key) {
		case 1:System.out.println("Monday");			break;
		case 2:System.out.println("Tuseday");			break;
		case 3:System.out.println("Wednesday");			break;
		case 4:System.out.println("Thursday");			break;
		case 5:System.out.println("Friday");			break;
		case 6:System.out.println("Saturday");			break;
		default:System.out.println("Sunday");break;

		}
		if (key>5) {
			System.out.println("Weekend");
		}
		else 
			System.out.println("WeekDay");
	}

}
