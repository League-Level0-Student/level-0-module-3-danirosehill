
package _02_loop_variables._3_robot_walk_of_fame;

import org.jointheleague.graphical.robot.Robot;

public class WalkOfFame {
	public static void main(String[] args) {
		Robot rob = new Robot();
		rob.hide();
		rob.setX(50);
		int z;
		for (z=0; z<10; z++) {
		int x;
		for (x=0; x < 5; x++) {
		rob.penDown();
		rob.setSpeed(100);
		rob.move(30);
		rob.turn(144);
		}
		rob.penUp();
		rob.setAngle(90);
		rob.move(50);
		}
		

	
		
		
		// 1. Set the X position of the robot so that it starts on the left. 
		// You also need to show the robot to see the result of this line.

		// 2. Make the robot draw a star shape. Hint: angle=144.

		// 3. Set the length of each line in the star to 30.

		/** THE CHALLENGE: **/
		/*
		 * Make the robot draw a line of stars like this:
		 * http://bit.ly/RobotWalk
		 * 
		 * Hint: The distance between stars is 50.
		 */

	}

}
