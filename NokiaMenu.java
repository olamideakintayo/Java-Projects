// NokiaMenu.java

import java.util.Scanner;

public class NokiaMenu {

	public static void main(String[] args) {

	Scanner input = new Scanner(System.in);

	String welcomeMessage = """
	Welcome to your Nokia Phone
	Press 1 to continue
	""";

	String message = """
	List of menu functions
	1. Phone Book
	2. Messages
	3. Chat
	4. Call register
	5. Tones
	6. Settings
	7. Call divert
	8. Games
	9. Calculator
	10. Reminders
	11. Clock
	12. Profiles
	13. Sim services
	""";

	String phoneBook = """
	1. Phone book
	  1. Search	
	  2. Service Nos.
	  3. Add name
	  4. Erase
	  5. Edit
	  6. Assign tone
	  7. Send b'card
	  8. Options
	  9. Speed dials
	  10 Voice tags
	""";

	String phoneBookOptions = """
	8. Options
	  1. Type of view
	  2. Memory status
	""";

	String messages = """
	2. Messages
	  1. Write messages
	  2. Inbox
	  3. Outbox
	  4. Picture messages
	  5. Templates
	  6. Smileys
	  7. Message settings
	  8. Info service
	  9. Voice mailbox number
	  10.Service command editor
	""";

	String messageSettings = """
	1. Set 1
	2. Common
	""";

	String set1 = """
	1. Set 1
	  1. Message center number
	  2. Messages sent as
	  3. Message validity
	""";

	String common = """
	2. Common
	  1. Delivery reports
	  2. Reply via same centre
	  3.Character support
	""";

	String callRegister = """
	4. Call register
	  1. Missed calls
	  2. Received calls
	  3. Dialled numbers
	  4. Erase recent call lists
	  5. Show call duration
	  6. Show call costs
	  7. Call cost settings
	  8. Prepaid credit
	""";

	String showCallDuration = """
	5. Show call duration
	  1. Last call duration
	  2. All calls' duration
	  3. Received calls' duration
	  4. Dialled calls' duration
	  5. Clear timers
	""";

	String showCallCosts = """
	6. Show call costs
	  1. Last call costs
	  2. All calls' cost
	  3. Clear counters
	""";

	String callCostSettings = """
	7. Call cost settings
	  1. Call cost limit
	  2. Show costs in
	""";

	String tones = """
	5. Tones
	  1. Ringing tone
	  2. Ringing volume
	  3. Incoming call alert
	  4. Composer
	  5. Message alert tone
	  6. Keypad tones
	  7. Warning and game tones
	  8. Vibrating alert
	  9. Screen saver	
	""";

	String settings = """
	1. Call settings
	2. Phone settings
	3. Security settings
	4. Restore factory settings
	""";

	String callSettings = """
	1. Call settings
	  1. Automatic redial
	  2. Speed dialling
	  3. Call waiting options
	  4. Own number sending
	  5. Phone line in use
	  6. Automatic answer
	""";

	String phoneSettings = """
	2. Phone settings
	  1. Language
	  2. Cell info display
	  3. Welcome note
	  4. Network selection
	  5. Lights
	  6. Confirm SIM service actions
	""";

	String securitySettings = """
	3. Security settings
	  1. PIN code request
	  2. Call barring service
	  3. Fixed dialling
	  4. Closed user group
	  5. Phone security
	  6. Change access codes
	""";

	String clock = """
	11. Clock
	  1. Alarm clock
	  2. Clock settings
	  3. Date settings
	  4. Stopwatch
	  5. Countdown timer
	  6. Auto update of date and time
	""";


	// System.out.print("Please enter 1 to continue or 0 to end program");
	// int inputt = input.nextInt();

	System.out.print(welcomeMessage);
	int welcomeInput = input.nextInt();
	
	if (welcomeInput > 1 || welcomeInput < 1) {
	System.out.print("Invalid Input! Restart the app");
	return;
	}

	switch(welcomeInput) {
	case 1: 
	System.out.print(message);
	 break;
	}
	System.out.print("Please Enter your preferred number from the options: ");
 	int mainMenuInput = input.nextInt();
	switch(mainMenuInput) {
	case 1: System.out.print(phoneBook);{
	System.out.print("Please Enter your preferred number from the options: ");
	int phoneBookInput = input.nextInt();

	switch(phoneBookInput) {
	case 1: System.out.print("Search"); break;
	case 2: System.out.print("Service Nos"); break;
	case 3: System.out.print("Add name"); break;
	case 4: System.out.print("Erase"); break;
	case 5: System.out.print("Edit"); break;
	case 6: System.out.print("Assign tone"); break;
	case 7: System.out.print("Send b'card"); break;

	case 8: System.out.print(phoneBookOptions); {
	System.out.print("Please Enter you preferred number from the options: ");
	int phoneBookOptionsInput = input.nextInt();
	
	switch(phoneBookOptionsInput) {
	case 1: System.out.print("Type of view"); break;
	case 2: System.out.print("Memory status"); break;
	}
	break;
	}
	case 9: System.out.print("Speed dials"); break;
	case 10: System.out.print("Voice tags"); break;
	}
	break;
}
		
	case 2: System.out.print(messages); {
	System.out.print("Please Enter your preferred number from the options: ");
	int messagesInput = input.nextInt();

	switch(messagesInput) {
	case 1: System.out.print("Write messages"); break;
	case 2: System.out.print("Inbox"); break;
	case 3: System.out.print("Outbox"); break;
	case 4: System.out.print("Picture messages"); break;
	case 5: System.out.print("Templates"); break;
	case 6: System.out.print("Smileys"); break;

	case 7: System.out.print(messageSettings); {
	System.out.print("Please Enter your preferred number from the options: ");
	int messageSettingsInput = input.nextInt();

	switch(messageSettingsInput) {
	case 1: System.out.print(set1); {
	System.out.print("Please Enter your preferred number from the options: ");
	int set1Input = input.nextInt();

	switch(set1Input) {
	case 1: System.out.print("Message centre number"); break;
	case 2: System.out.print("Message sent as"); break;
	case 3: System.out.print("Message validity"); break;
	}
	break;
	}
	case 2: System.out.print(common); {
	System.out.print("Please Enter your preferred number from the options: ");
	int commonInput = input.nextInt();

	switch(commonInput) {
	case 1: System.out.print("Delivery reports"); break;
	case 2: System.out.print("Reply via same centre"); break;
	case 3: System.out.print("Character support"); break;
}
break;
}


}
break;
}

	case 8: System.out.print("Info Service"); break;
	case 9: System.out.print("Voice mailbox number"); break;
	case 10: System.out.print("Service command editor"); break;
}
break;
}
	case 3: System.out.print("Chat"); break;
	case 4: System.out.print (callRegister); {
	System.out.print("Please Enter your preferred number from the options: ");
	int callRegisterInput = input.nextInt();

	switch(callRegisterInput) {
	case 1: System.out.print("Missed calls"); break;
	case 2: System.out.print("Received calls"); break;
	case 3: System.out.print("Dialled numbers"); break;
	case 4: System.out.print("Erase recent call lists"); break;
	case 5: System.out.print(showCallDuration); {
	System.out.print("Please Enter your preferred number from the options: ");
	int showCallDurationInput = input.nextInt();

	switch(showCallDurationInput) {
	case 1: System.out.print("Last call duration"); break;
	case 2: System.out.print("All calls' duartion"); break;
	case 3: System.out.print("Received calls' duration"); break;
	case 4: System.out.print("Dialled calls' duration"); break;
	case 5: System.out.print("Clear timers"); break;
}
break;
}
	case 6: System.out.print(showCallCosts); {
	System.out.print("Please Enter your preferred number from the options: ");
	int showCallCostsInput = input.nextInt();

	switch(showCallCostsInput) {
	case 1: System.out.print("Last call cost"); break;
	case 2: System.out.print("All calls' cost");break;
	case 3: System.out.print("Clear counters"); break;
}
break;
}	
	case 7: System.out.print(callCostSettings); {
	System.out.print("Please Enter your preferred number from the options: ");
	int callCostSettingsInput = input.nextInt();

	switch(callCostSettingsInput) {
	case 1: System.out.print("Call cost limit"); break;
	case 2: System.out.print("Show costs in"); break;
}
break;
}
	
	case 8: System.out.print("Prepaid credit"); break;
}
break;
}	
	case 5: System.out.print(tones); {
	System.out.print("Please Enter your preferred number from the options: ");
	int tonesInput = input.nextInt();

	switch(tonesInput) {
	case 1: System.out.print("Ringing tone"); break;
	case 2: System.out.print("Ringing volume"); break;
	case 3: System.out.print("Incoming call alert"); break;
	case 4: System.out.print("Composer"); break;
	case 5: System.out.print("Message alert tone"); break;
	case 6: System.out.print("Keypad tones"); break;
	case 7: System.out.print("Warning and game tones"); break;
	case 8: System.out.print("Vibrating alert"); break;
	case 9: System.out.print("Screen saver"); break;

}
break;
}
		case 6: System.out.print(settings); { 
		System.out.print("Please Enter your preferred number from the options: ");
		int settingsInput = input.nextInt();

		switch(settingsInput) {
		case 1: System.out.print(callSettings); {
		System.out.print("Please Enter your preferrred number from the options: ");
		int callSettingsInput = input.nextInt();

		switch(callSettingsInput) {
		case 1: System.out.print("Automatic redial"); break;
		case 2: System.out.print("Speed dialling"); break;
		case 3: System.out.print("Call waiting options"); break;
		case 4: System.out.print("Own number sending"); break;
		case 5: System.out.print("Phone line in use"); break;
		case 6: System.out.print("Automatic answer"); break;
	
}
break;
}
		case 2: System.out.print(phoneSettings); {
		System.out.print("Please Enter your preferred number from the options: ");
		int phoneSettingInput = input.nextInt();

		switch(phoneSettingInput) {
		case 1: System.out.print("Language"); break;
		case 2: System.out.print("Cell info display"); break;
		case 3: System.out.print("Welcome note"); break;
		case 4: System.out.print("Network selection"); break;
		case 5: System.out.print("Lights"); break;
		case 6: System.out.print("Confirm SIM service actions"); break;
}
break;
}
		case 3: System.out.print(securitySettings); {
		System.out.print("Please Enter your preferred number from the options: ");
		int securitySettingsInput = input.nextInt();

		switch(securitySettingsInput) {
		case 1: System.out.print("PIN code request"); break;
		case 2: System.out.print("Call barring service"); break;
		case 3: System.out.print("Fixed dialling"); break;
		case 4: System.out.print("Closed user group"); break;
		case 5: System.out.print("Phone security"); break;
		case 6: System.out.print("Change access codes"); break;
}
break;
}
		case 4: System.out.print("Restore factory settings"); break;
}
break;
}
		case 7: System.out.print("Call divert"); break;
		case 8: System.out.print("Games"); break;
		case 9: System.out.print("Calculator"); break;
		case 10: System.out.print("Reminders"); break;

		case 11: System.out.print(clock); {
		System.out.print("Please Enter your preferred number from the options: ");
		int clockInput = input.nextInt();

		switch(clockInput) {
		case 1: System.out.print("Alarm clock"); break;
		case 2: System.out.print("Clock settings"); break;
		case 3: System.out.print("Date setting"); break;
		case 4: System.out.print("Stopwatch"); break;
		case 5: System.out.print("Countdown timer"); break;
		case 6: System.out.print("Auto update of date and time"); break;
}
break;
}
		case 12: System.out.print("Profiles"); break;
		case 13: System.out.print("SIM services"); break;
}


}
}