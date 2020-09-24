package Day_4;

public class Question_7 {

	public static void main(String[] args) {
	int price= 45;
	int change,quarters,dimes,nickles;
	change=100-price;
	quarters=change/25;
	int quartersleft= change%25;
	dimes=quartersleft/10;
	int dimesleft=quartersleft%10;
	nickles=dimesleft/5;
	System.out.println("Price in cent: " + price);
	System.out.println();
	System.out.println("Your change is "+quarters+ " quarters, " + dimes + " dimes ,"+ " and " + nickles + " nickles ")  ;
		

	}

}