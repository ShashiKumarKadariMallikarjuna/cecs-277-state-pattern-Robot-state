package assignment7p3;
/** robot context class
 * @author Shashi Kumar Kadari Mallikarjuna
 * @version Assignment 7 part 3
 * @since Due - 11/5/18
 */
public class robotContext {
	private robotState state=null;
	private robotActions action=new robotActions();
	/**method that sets the state of the robot
	 * @param state robot state 
	 */
	public void setState(robotState state) {
		this.state=state;
	}
	/**method that makes the robot perform actions based on the state of the robot*/
	public void robotAction() {
		state.action(action);
		if(state instanceof boringState) {
			state=new happyState();
		}
	}
}
