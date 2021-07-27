package _03_if_else._3_secret_message_box;
//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0


import javax.swing.JOptionPane;

/**
 * Secret Message Box / Secure Messaging System
 * 
 * You want to leave a message on one of the Mac computers so that only your friend can read it.
 * You set up the passcode and the secret message. 
 * Your friend types in the passcode to retrieve the message.
 * 
 */

public class SecretMessageBox {

public static void main(String[] args) {
	

	
	// 0. Make  a main method and put steps 1-5 inside it
	System.out.println("You have to provide the password to see a message.");
	String Passoword = "1234";
	// 1. Set a password in a String variable
	String input = JOptionPane.showInputDialog("What is a scret message?");
	String guess = JOptionPane.showInputDialog("You need a password to see the message.");
	if (guess.equals(Passoword) ) {
		JOptionPane.showMessageDialog(null, input);

}
	else {
		JOptionPane.showMessageDialog(null, "INTRUDERS!!!!!!!!");

	}
	// 3. Now use a pop-up to tell the NEXT user that they can only see the secret message 
	//    if they can guess the passcode
	// 4. If their guess matches the password, show them the secret message
	// 5. If the password does not match, pop-up "INTRUDER!!"

}

	
	}
