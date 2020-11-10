
package _99_extra;

import javax.swing.JOptionPane;

public class BirthdayReminder {

	public static void main(String[] args) {
	
		// 1. correct the birthdays for your family below
		String momsBirthday = "October 3rd";
		String dadsBirthday = "Febrary 10th";
		String myBirthday = "May 8th";

		// 2. Find out which birthday the user wants and and store their response in a variable
		
		String choice = JOptionPane.showInputDialog("Whose birthday would you like to see?");
	
		// 3. Print out what the user typed
		
		System.out.println(choice);
		
		if (choice.equals("mom")) {
			System.out.println(momsBirthday);
		}
		else if (choice.equals("dad")) {
			System.out.println(dadsBirthday);
		}
		else if (choice.equals("mine")) {
			System.out.println(myBirthday);
			
		} else {
		JOptionPane.showMessageDialog(null, "I don't remember that birthday, sorry!");
		}
		
		
		
		// 4. if user asked for "mom"
			//print mom's birthday
		// 5. if user asked for "dad"
			// print dad's birthday
		// 6. if user asked for your name
			// print myBirthday
		//7. otherwise print "Sorry, i don't remember that person's birthday!"

	} 
}
