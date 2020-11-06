
package _01_else_if._1_robot_color_chooser;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

import java.awt.Color;

public class RobotColorChooser {
	public static void main(String[] args) {
		
		//1. Create a new Robot
		Robot robot = new Robot();
		
	    //2. Make the robot draw a shape (this will take more than one line of code)	

		while (0==0) {
		
		robot.penDown();
		robot.setPenWidth(10);
		robot.setSpeed(30);
		for (int i=0; i<4; i++) {
		robot.move(100);
		robot.turn(90);
		}
		
	String color = JOptionPane.showInputDialog("What color pen would you like the robot to draw with?");
		
		if (color.equals("blue")){
			robot.setPenColor(Color.blue);
		}
		if (color.equals("red")) {
			robot.setPenColor(Color.red);
		}
		if (color.equals("yellow")) {
			robot.setPenColor(Color.yellow);
		}
		if (color.equals("pink")) {
			robot.setPenColor(Color.pink);
		}
		if (color.equals("green")) {
			robot.setPenColor(Color.green);
		}
		if (color.equals("magenta")) {
			robot.setPenColor(Color.magenta);
		}
		if (color.equals("orange")) {
			robot.setPenColor(Color.orange);
		} else {
			robot.setRandomPenColor();
		
		
		
		//3. Set the pen width to 10
		//4. Ask the user what color pen they would like the robot to draw with
		//5. Use an if/else statement to set the pen color that the user requested
        //6. If the user doesn't enter anything, choose a random color
        //7. Put a loop around your code so that you keep asking the user for more colors & drawing them
		

		



	}
		}
	
