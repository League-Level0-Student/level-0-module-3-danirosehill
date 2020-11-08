package _01_else_if._5_own_adventure;

import javax.swing.JOptionPane;

public class own_adventure {
public static void main(String[] args) {
	String answer= JOptionPane.showInputDialog("You are going on an ocean adventure. Would you like to ride on a boat or a surfboard?");
	if (answer.equals("surfboard")) {
	String activity = JOptionPane.showInputDialog("Radical. Do you want to 'surf waves' or 'find an island'");
	if (activity.equals("surf waves")){
		JOptionPane.showMessageDialog(null, "Congrats. You caught a huge wave!");
	}
	if (activity.equals("find an island")){
		JOptionPane.showMessageDialog(null, "Congrats. You landed on a beautiful, tropical island!");
	}
	if (answer.equals("boat"))
		JOptionPane.showMessageDialog(null, "Wrong choice! Your boat immediately sunk.");
	}
}
}
