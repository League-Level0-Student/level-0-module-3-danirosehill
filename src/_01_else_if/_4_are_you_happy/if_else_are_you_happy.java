package _01_else_if._4_are_you_happy;

import javax.swing.JOptionPane;

public class if_else_are_you_happy {
public static void main(String[] args) {
	String answer = JOptionPane.showInputDialog("Are you happy?");
	if (answer.equals("yes")) {
	JOptionPane.showMessageDialog(null, "Keep doing whatever you're doing.");
	}
	if (answer.equals("no")) {
	String answer1 = JOptionPane.showInputDialog(null, "Do you want to be happy?");
	if (answer1.equals("yes")){
	JOptionPane.showMessageDialog(null, "Change something.");
		}
	if (answer1.equals("no")){
		JOptionPane.showMessageDialog(null, "Keep doing whatever you're doing.");
		}
	}
	
}
	
	}
