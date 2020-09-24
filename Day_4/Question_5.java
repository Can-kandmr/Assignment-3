package Day_4;

public class Question_5 {

	public static void main(String[] args) {
	int inputSeconds,hours,minutes,seconds;
	
	inputSeconds= 4265;
	hours=inputSeconds/3600;
	int remindthehours=inputSeconds%3600;
	minutes=remindthehours/60;
	int remindtheminutes=remindthehours%60;
	seconds=remindtheminutes;
	System.out.println(hours+" hours " + minutes+ " minutes "+ seconds+" seconds ");
	
	}

}
