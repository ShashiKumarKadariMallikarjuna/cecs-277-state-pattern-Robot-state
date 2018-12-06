package assignment7p3;
/** Class that contains the actions that the robot will perform during the boring state
 * @author Shashi Kumar Kadari Mallikarjuna
 * @version Assignment 7 part 3
 * @since Due - 11/5/18
 */
public class boringState implements robotState {
	/**method that the robot will do while in boring state*/
	@Override
	public void action(robotActions a) {
		a.sing();
	}
}
