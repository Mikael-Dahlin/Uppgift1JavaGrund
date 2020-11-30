package Password;

import java.util.Scanner;

public class Password {

	public static void main(String[] args) {
		
		// Scanner for reading input from the console.
		Scanner reader = new Scanner(System.in);
		
		// Declaration of variables.
		boolean loggedIn = false;
		String password = "password";
		String inputString;
		
		// For loop with a maximum of 3 tries to guess the password.
		for( int i = 0 ; i < 3 && !loggedIn ; i++) {
			System.out.println("Please enter password:");
			inputString = reader.nextLine();
			
			if (password.equals( inputString )) {
				loggedIn = true;
			} else if ( i == 2 ){
				System.out.println("You have been locked out for typing the wrong password 3 times!");
			} else {
				System.out.print("Incorrect password try again, ");
			}
		}		
		reader.close();
		
		// Check if the User managed to log in.
		if (loggedIn) {
			System.out.println("Hello User, you are now logged in!");
		} 
	}
}
