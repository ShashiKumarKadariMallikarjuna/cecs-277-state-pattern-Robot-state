package assignment7p3;
/** Class that contains the actions that the robot will perform during the happy state
 * @author Shashi Kumar Kadari Mallikarjuna
 * @version Assignment 7 part 3
 * @since Due - 11/5/18
 */
public class happyState implements robotState {
	/**method that the robot will do while in happy state*/
	@Override
	public void action(robotActions a) {
		a.cook();
		a.talk();
	}
}
