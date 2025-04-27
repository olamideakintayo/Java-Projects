import java.util.Scanner;

public class NokiaMenuResponsiveness {

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
        Press 0 to end the app
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
          10. Voice tags
        Press 0 to go back
        """;

        String phoneBookOptions = """
        8. Options
          1. Type of view
          2. Memory status
        Press 0 to go back
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
          10. Service command editor
        Press 0 to go back
        """;

        String messageSettings = """
        1. Set 1
        2. Common
        Press 0 to go back
        """;

        String set1 = """
        1. Set 1
          1. Message center number
          2. Messages sent as
          3. Message validity
        Press 0 to go back
        """;

        String common = """
        2. Common
          1. Delivery reports
          2. Reply via same centre
          3. Character support
        Press 0 to go back
        """;

	 String callRegister = """
Call Register
1. Missed Calls
2. Received Calls
3. Dialled Numbers
4. Erase Recent Call Lists
5. Show Call Duration
6. Show Call Costs
7. Call Cost Settings
8. Prepaid Credit
Press 0 to go back
""";

        String showCallDuration = """
Show Call Duration
1. Last Call Duration
2. All Calls' Duration
3. Received Calls' Duration
4. Dialled Calls' Duration
5. Clear Timers
Press 0 to go back
""";

        String showCallCosts = """
Show Call Costs
1. Last Call Cost
2. All Calls' Cost
3. Clear Counters
Press 0 to go back
""";

        String callCostSettings = """
Call Cost Settings
1. Call Cost Limit
2. Show Costs In
Press 0 to go back
""";

        String tones = """
Tones
1. Ringing Tone
2. Ringing Volume
3. Incoming Call Alert
4. Composer
5. Message Alert Tone
6. Keypad Tones
7. Warning And Game Tones
8. Vibrating Alert
9. Screen Saver
Press 0 to go back
""";

        String settings = """
Settings
1. Call Settings
2. Phone Settings
3. Security Settings
4. Restore Factory Settings
Press 0 to go back
""";

        String callSettings = """
Call Settings
1. Automatic Redial
2. Speed Dialling
3. Call Waiting Options
4. Own Number Sending
5. Phone Line In Use
6. Automatic Answer
Press 0 to go back
""";

        String phoneSettings = """
Phone Settings
1. Language
2. Cell Info Display
3. Welcome Note
4. Network Selection
5. Lights
6. Confirm SIM Service Actions
Press 0 to go back
""";

        String securitySettings = """
Security Settings
1. PIN Code Request
2. Call Barring Service
3. Fixed Dialling
4. Closed User Group
5. Phone Security
6. Change Access Codes
Press 0 to go back
""";

        String clock = """
Clock
1. Alarm Clock
2. Clock Settings
3. Date Settings
4. Stopwatch
5. Countdown Timer
6. Auto Update Of Date And Time
Press 0 to go back
""";



        System.out.print(welcomeMessage);
        int welcomeInput = input.nextInt();

        if (welcomeInput != 1) {
            System.out.print("Invalid Input! Restart the app");
            return;
        }

        mainMenu:
        while (true) {
            System.out.print(message);
            System.out.print("Please Enter your preferred number from the options: ");
            int mainMenuInput = input.nextInt();

            if (mainMenuInput == 0) {
                System.out.println("Goodbye!");
                break;
            }

            switch (mainMenuInput) {
                case 1:
                    phoneBookMenu:
                    while (true) {
                        System.out.print(phoneBook);
                        System.out.print("Please Enter your preferred number from the options: ");
                        int phoneBookInput = input.nextInt();

                        switch (phoneBookInput) {
                            case 1:
                                System.out.println("Search");
                                System.out.println("Press 0 to go back");
                                if (input.nextInt() == 0) {
                                    continue phoneBookMenu;
                                }
                                break;
                            case 2:
                                System.out.println("Service Nos.");
                                System.out.println("Press 0 to go back");
                                if (input.nextInt() == 0) {
                                    continue phoneBookMenu;
                                }
                                break;
                            case 3:
                                System.out.println("Add name");
                                System.out.println("Press 0 to go back");
                                if (input.nextInt() == 0) {
                                    continue phoneBookMenu;
                                }
                                break;
                            case 4:
                                System.out.println("Erase");
                                System.out.println("Press 0 to go back");
                                if (input.nextInt() == 0) {
                                    continue phoneBookMenu;
                                }
                                break;
                            case 5:
                                System.out.println("Edit");
                                System.out.println("Press 0 to go back");
                                if (input.nextInt() == 0) {
                                    continue phoneBookMenu;
                                }
                                break;
                            case 6:
                                System.out.println("Assign tone");
                                System.out.println("Press 0 to go back");
                                if (input.nextInt() == 0) {
                                    continue phoneBookMenu;
                                }
                                break;
                            case 7:
                                System.out.println("Send b'card");
                                System.out.println("Press 0 to go back");
                                if (input.nextInt() == 0) {
                                    continue phoneBookMenu;
                                }
                                break;
                            case 8:
                                optionsMenu:
                                while (true) {
                                    System.out.print(phoneBookOptions);
                                    System.out.print("Please Enter your preferred number from the options: ");
                                    int phoneBookOptionsInput = input.nextInt();
                                    switch (phoneBookOptionsInput) {
                                        case 1:
                                            System.out.println("Type of view");
                                            System.out.println("Press 0 to go back");
                                            if (input.nextInt() == 0) {
                                                continue optionsMenu;
                                            }
                                            break;
                                        case 2:
                                            System.out.println("Memory status");
                                            System.out.println("Press 0 to go back");
                                            if (input.nextInt() == 0) {
                                                continue optionsMenu;
                                            }
                                            break;
                                    }
                                    break;
                                }
                                break;
                            case 9:
                                System.out.println("Speed dials");
                                System.out.println("Press 0 to go back");
                                if (input.nextInt() == 0) {
                                    continue phoneBookMenu;
                                }
                                break;
                            case 10:
                                System.out.println("Voice tags");
                                System.out.println("Press 0 to go back");
                                if (input.nextInt() == 0) {
                                    continue phoneBookMenu;
                                }
                                break;
			    case 0:
				System.out.println("You're about to go back to the previous menu");
				System.out.println("Press 0 to go back");
				if (input.nextInt() == 0) {
				    continue mainMenu;
				}
				break;
                        }
                        break;
                    }
                    break;

                case 2:
                    messagesMenu:
                    while (true) {
                        System.out.print(messages);
                        System.out.print("Please Enter your preferred number from the options: ");
                        int messagesInput = input.nextInt();

                        switch (messagesInput) {
                            case 1:
                                System.out.println("Write messages");
                                System.out.println("Press 0 to go back");
                                if (input.nextInt() == 0) {
                                    continue messagesMenu;
                                }
                                break;
                            case 2:
                                System.out.println("Inbox");
                                System.out.println("Press 0 to go back");
                                if (input.nextInt() == 0) {
                                    continue messagesMenu;
                                }
                                break;
                            case 3:
                                System.out.println("Outbox");
                                System.out.println("Press 0 to go back");
                                if (input.nextInt() == 0) {
                                    continue messagesMenu;
                                }
                                break;
                            case 4:
                                System.out.println("Picture messages");
                                System.out.println("Press 0 to go back");
                                if (input.nextInt() == 0) {
                                    continue messagesMenu;
                                }
                                break;
                            case 5:
                                System.out.println("Templates");
                                System.out.println("Press 0 to go back");
                                if (input.nextInt() == 0) {
                                    continue messagesMenu;
                                }
                                break;
                            case 6:
                                System.out.println("Smileys");
                                System.out.println("Press 0 to go back");
                                if (input.nextInt() == 0) {
                                    continue messagesMenu;
                                }
                                break;
                            case 7:
                                messageSettingsMenu:
                                while (true) {
                                    System.out.print(messageSettings);
                                    System.out.print("Please Enter your preferred number from the options: ");
                                    int messageSettingsInput = input.nextInt();
                                    switch (messageSettingsInput) {
                                        case 1:
                                            set1Menu:
                                            while (true) {
                                                System.out.print(set1);
                                                System.out.print("Please Enter your preferred number from the options: ");
                                                int set1Input = input.nextInt();
                                                switch (set1Input) {
                                                    case 1:
                                                        System.out.println("Message center number");
                                                        System.out.println("Press 0 to go back");
                                                        if (input.nextInt() == 0) {
                                                            continue set1Menu;
                                                        }
                                                        break;
                                                    case 2:
                                                        System.out.println("Messages sent as");
                                                        System.out.println("Press 0 to go back");
                                                        if (input.nextInt() == 0) {
                                                            continue set1Menu;
                                                        }
                                                        break;
                                                    case 3:
                                                        System.out.println("Message validity");
                                                        System.out.println("Press 0 to go back");
                                                        if (input.nextInt() == 0) {
                                                            continue set1Menu;
                                                        }
                                                        break;
                                                    case 0:
                                                        continue messageSettingsMenu;
                                                        
                                                }
                                                break;
                                            }
                                            break;
                                        case 2:
                                            commonMenu:
                                            while (true) {
                                                System.out.print(common);
                                                System.out.print("Please Enter your preferred number from the options: ");
                                                int commonInput = input.nextInt();
                                                switch (commonInput) {
                                                    case 1:
                                                        System.out.println("Delivery reports");
                                                        System.out.println("Press 0 to go back");
                                                        if (input.nextInt() == 0) {
                                                            continue commonMenu;
                                                        }
                                                        break;
                                                    case 2:
                                                        System.out.println("Reply via same centre");
                                                        System.out.println("Press 0 to go back");
                                                        if (input.nextInt() == 0) {
                                                            continue commonMenu;
                                                        }
                                                        break;
                                                    case 3:
                                                        System.out.println("Character support");
                                                        System.out.println("Press 0 to go back");
                                                        if (input.nextInt() == 0) {
                                                            continue commonMenu;
                                                        }
                                                        break;
                                                    case 0:
                                                        continue messageSettingsMenu;
                                                        
                                                }
                                                break;
                                            }
                                            break;
                                        case 0:
                                            continue messagesMenu;
                                    }
                                    break;
                                }
                                break;
                            case 8:
                                System.out.println("Info service");
                                System.out.println("Press 0 to go back");
                                if (input.nextInt() == 0) {
                                    continue messagesMenu;
                                }
                                break;
                            case 9:
                                System.out.println("Voice mailbox number");
                                System.out.println("Press 0 to go back");
                                if (input.nextInt() == 0) {
                                    continue messagesMenu;
                                }
                                break;
                            case 10:
                                System.out.println("Service command editor");
                                System.out.println("Press 0 to go back");
                                if (input.nextInt() == 0) {
                                    continue messagesMenu;
                                }
                                break;
		
			   case 0:
				System.out.println("You're about to go back to the previous menu");
				System.out.println("Press 0 to go back");
				if (input.nextInt() == 0) {
				    continue mainMenu;
				}
				break;

                        }
                        break;
                    }
                    break;

                case 3:
                    System.out.println("Chat");
                    System.out.println("Press 0 to go back");
                    if (input.nextInt() == 0) {
                        continue mainMenu;
                   }
 		case 4:
		 callRegisterMenu:
                    while (true) {
                        System.out.print(callRegister);
                        System.out.print("Please Enter your preferred number from the options: ");
                        int callRegisterInput = input.nextInt();

			switch (callRegisterInput) {
                            case 1:
                                System.out.println("Missed calls");
                                System.out.println("Press 0 to go back");
                                if (input.nextInt() == 0) {
                                    continue callRegisterMenu;
                                }
                                break; 

			    case 2:
                                System.out.println("Received calls");
                                System.out.println("Press 0 to go back");
                                if (input.nextInt() == 0) {
                                    continue callRegisterMenu;
                                }
                                break; 
			    
			    case 3:
                                System.out.println("Dialled numbers");
                                System.out.println("Press 0 to go back");
                                if (input.nextInt() == 0) {
                                    continue callRegisterMenu;
                                }
                                break; 

			    case 4:
                                System.out.println("Erase recent call lists");
                                System.out.println("Press 0 to go back");
                                if (input.nextInt() == 0) {
                                    continue callRegisterMenu;
                                }
                                break; 
	
			   case 5:
                                showCallDurationMenu:
                    		while (true) {
                       		System.out.print(showCallDuration);
                       		System.out.print("Please Enter your preferred number from the options: ");
                        	int showCallDurationInput = input.nextInt();

				switch (showCallDurationInput) {
                                case 1:
                                System.out.println("Last call Duration");
                                System.out.println("Press 0 to go back");
                                if (input.nextInt() == 0) {
                                    continue showCallDurationMenu;
                                }
                                break; 

				case 2:
                                System.out.println("All calls' duration");
                                System.out.println("Press 0 to go back");
                                if (input.nextInt() == 0) {
                                    continue showCallDurationMenu;
                                }
                                break; 
				
   				case 3:
                                System.out.println("Received calls' duration");
                                System.out.println("Press 0 to go back");
                                if (input.nextInt() == 0) {
                                    continue showCallDurationMenu;
                                }
                                break; 

				case 4:
                                System.out.println("Dialled calls' duration");
                                System.out.println("Press 0 to go back");
                                if (input.nextInt() == 0) {
                                    continue showCallDurationMenu;
                                }
                                break; 
				
				case 5:
                                System.out.println("Clear timers");
                                System.out.println("Press 0 to go back");
                                if (input.nextInt() == 0) {
                                    continue showCallDurationMenu;
                                }
                                break; 
				
				case 0:
					System.out.println("You're about to go back to the previous menu");
					System.out.println("Press 0 to go back");
					if (input.nextInt() == 0) {
				    	continue callRegisterMenu;
					}
					break;
					

				}
				}
				case 6:
					showCallCostsMenu:
					while(true) {
					System.out.print(showCallCosts);
					System.out.print("Please Enter your preferred number from the options: ");
                        		int showCallCostsInput = input.nextInt();

					switch (showCallCostsInput) {
                                	case 1:
                                	System.out.println("Last call cost");
                                	System.out.println("Press 0 to go back");
                                	if (input.nextInt() == 0) {
                                    	continue showCallCostsMenu;
                               		}
                               		break; 
					
					case 2:
                                	System.out.println("All call cost");
                                	System.out.println("Press 0 to go back");
                                	if (input.nextInt() == 0) {
                                    	continue showCallCostsMenu;
                               		}
                               		break; 

					case 3:
                                	System.out.println("Clear counters");
                                	System.out.println("Press 0 to go back");
                                	if (input.nextInt() == 0) {
                                    	continue showCallCostsMenu;
                               		}
                               		break; 
					
					case 0:
					System.out.println("You're about to go back to the previous menu");
					System.out.println("Press 0 to go back");
					if (input.nextInt() == 0) {
				    	continue callRegisterMenu;
					}
					break;
					}
					}
			
					case 7: 
					callCostSettingsMenu:
					while(true) {
					System.out.print(callCostSettings);
					System.out.print("Please Enter your preferred number from the options: ");
                        		int callCostSettingsInput = input.nextInt();

					switch (callCostSettingsInput) {
                                	case 1:
                                	System.out.println("Call cost limit");
                                	System.out.println("Press 0 to go back");
                                	if (input.nextInt() == 0) {
                                    	continue callCostSettingsMenu;
                               		}
                               		break; 
	
					case 2:
                                	System.out.println("Show costs in");
                                	System.out.println("Press 0 to go back");
                                	if (input.nextInt() == 0) {
                                    	continue callCostSettingsMenu;
                               		}
                               		break;

					case 0:
					System.out.println("You're about to go back to the previous menu");
					System.out.println("Press 0 to go back");
					if (input.nextInt() == 0) {
				    	continue callRegisterMenu;
					}
					break;
					}
					break;
					}
					
				case 8:
				System.out.println("Prepaid credit");
				System.out.println("Press 0 to go back");
					if (input.nextInt() == 0) {
				    	continue callRegisterMenu;
					}
					break;

				case 0:
					System.out.println("You're about to go back to the previous menu");
					System.out.println("Press 0 to go back");
					if (input.nextInt() == 0) {
				    	continue mainMenu;
					}
				}
			break;
			}
	
			case 5:
			tonesMenu:
			while(true) {
			System.out.print(tones);
			System.out.print("Please Enter your preferred number from the options: ");
                        int tonesInput = input.nextInt();

			switch (tonesInput) {
                        case 1:
                        System.out.println("Ringing tone");
                        System.out.println("Press 0 to go back");
                        if (input.nextInt() == 0) {
                        continue tonesMenu;
                        }
                        break; 
			
			case 2:
                        System.out.println("Ringing volume");
                        System.out.println("Press 0 to go back");
                        if (input.nextInt() == 0) {
                        continue tonesMenu;
                        }
                        break;

			case 3:
                        System.out.println("Incoming call alert");
                        System.out.println("Press 0 to go back");
                        if (input.nextInt() == 0) {
                        continue tonesMenu;
                        }
                        break;

			case 0:
			System.out.println("You're about to go back to the previous menu");
			System.out.println("Press 0 to go back");
			if (input.nextInt() == 0) {
			continue mainMenu;
			}

					

		}
	    	}	
            }
		break;
        }
    }
}
