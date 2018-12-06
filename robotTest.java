package assignment7p3;
/** Main class that tests the State pattern design
 * @author Shashi Kumar Kadari Mallikarjuna
 * @version Assignment 7 part 3
 * @since Due - 11/5/18
 */
public class robotTest {
	public static void main(String [] args) {
		robotContext context=new robotContext();
		System.out.println("Happy state");
		context.setState(new happyState());
		context.robotAction();
		System.out.println("------------------");
		System.out.println("Boring state");
		context.setState(new boringState());
		context.robotAction();
		context.robotAction();
	}
}

