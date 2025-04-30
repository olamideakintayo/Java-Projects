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



     
        mainMenu:
        while (true) {
            System.out.print(message);
            System.out.print("Please Enter your preferred number from the options: ");
            int mainMenuInput = input.nextInt();

		
		if (mainMenuInput == 0) {
		break;
		}

		if (mainMenuInput < 0 || mainMenuInput > 13) {
		System.out.println("Invalid Input!! Enter a valid number from the options");
                            continue mainMenu;
                        }

            switch (mainMenuInput) {
                case 1:
                    phoneBookMenu:
                    while (true) {
                        System.out.print(phoneBook);
                        System.out.print("Please Enter your preferred number from the options: ");
                        int phoneBookInput = input.nextInt();

			if (phoneBookInput < 0 || phoneBookInput > 10) {
			System.out.println("Invalid Input!! Enter a valid number from the options");
                            continue phoneBookMenu;
                        }
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

					if (phoneBookOptionsInput < 0 || phoneBookOptionsInput > 6) {
					System.out.println("Invalid Input!! Enter a valid number from the options");
                        		continue optionsMenu;
                        		}
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

					 case 0:
				System.out.println("You're about to go back to the previous menu");
				System.out.println("Press 0 to go back");
				if (input.nextInt() == 0) {
				    continue phoneBookMenu;
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

			if (messagesInput < 0 || messagesInput > 10) {
			System.out.println("Invalid Input!! Enter a valid number from the options");
                            continue messagesMenu;
                        }


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

				if (messageSettingsInput < 0 || messageSettingsInput > 2) {
						 System.out.println("Invalid Input!! Enter a valid number from the options");
                           			 continue messageSettingsMenu;
                        			}
                                    switch (messageSettingsInput) {
                                        case 1:
                                            set1Menu:
                                            while (true) {
                                                System.out.print(set1);
                                                System.out.print("Please Enter your preferred number from the options: ");
                                                int set1Input = input.nextInt();

						if (set1Input < 0 || set1Input > 3) {
						 System.out.println("Invalid Input!! Enter a valid number from the options");
                           			 continue set1Menu;
                        			}
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

						if (commonInput < 0 || commonInput > 3) {
						 System.out.println("Invalid Input!! Enter a valid number from the options");
                           			 continue commonMenu;
                        			}
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

			 if (callRegisterInput < 0 || callRegisterInput > 8) {
			System.out.println("Invalid Input!! Enter a valid number from the options");
                            continue callRegisterMenu;
                        }

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

				if (showCallDurationInput < 0 || showCallDurationInput > 5) {
				System.out.println("Invalid Input!! Enter a valid number from the options");
                           	continue showCallDurationMenu;
                        	}

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

					if (showCallCostsInput < 0 || showCallCostsInput > 3) {
					System.out.println("Invalid Input!! Enter a valid number from the options");
                           		continue showCallCostsMenu;
                        		}

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

					if (callCostSettingsInput < 0 || callCostSettingsInput > 2) {
					System.out.println("Invalid Input!! Enter a valid number from the options");
                           		continue callCostSettingsMenu;
                        		}

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

			 if (tonesInput < 0 || tonesInput > 9) {
			System.out.println("Invalid Input!! Enter a valid number from the options");
                            continue tonesMenu;
                        }

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

			case 4:
                        System.out.println("Composer");
                        System.out.println("Press 0 to go back");
                        if (input.nextInt() == 0) {
                        continue tonesMenu;
                        }
                        break;

			case 5:
                        System.out.println("Message alert tone");
                        System.out.println("Press 0 to go back");
                        if (input.nextInt() == 0) {
                        continue tonesMenu;
                        }
                        break;

			case 6:
                        System.out.println("Keypad tones");
                        System.out.println("Press 0 to go back");
                        if (input.nextInt() == 0) {
                        continue tonesMenu;
                        }
                        break;
			
			case 7:
                        System.out.println("Warning and game tones");
                        System.out.println("Press 0 to go back");
                        if (input.nextInt() == 0) {
                        continue tonesMenu;
                        }
                        break;

			case 8:
                        System.out.println("Vibrating alert");
                        System.out.println("Press 0 to go back");
                        if (input.nextInt() == 0) {
                        continue tonesMenu;
                        }
                        break;

			case 9:
                        System.out.println("Screen saver");
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

			case 6:
    			settingsMenu:
    			while (true) {
        		System.out.print(settings);
        		System.out.print("Please Enter your preferred number from the options: ");
        		int settingsInput = input.nextInt();

			 if (settingsInput < 0 || settingsInput > 4) {
			System.out.println("Invalid Input!! Enter a valid number from the options");
                            continue settingsMenu;
                        }

        		switch (settingsInput) {
            		case 1:
                	callSettingsMenu:
                	while (true) {
                    	System.out.print(callSettings);
                   	System.out.println("Please Enter your preferred number from call settings options:");
                    	int callSettingsInput = input.nextInt();

			if (callSettingsInput < 0 || callSettingsInput > 6) {
			System.out.println("Invalid Input!! Enter a valid number from the options");
                        continue;
                        }

                    switch (callSettingsInput) {
                        case 1:
                            System.out.println("Automatic redial");
                            System.out.println("Press 0 to go back");
                            if (input.nextInt() == 0) {
                                continue settingsMenu; 
                            }
                            break;

			case 2:
			    System.out.println("Speed dialling");
			    System.out.println("Press 0 to go back");
                            if (input.nextInt() == 0) {
                                continue callSettingsMenu; 
                            }
                            break;

			case 3:
			    System.out.println("Call waiting options");
			    System.out.println("Press 0 to go back");
                            if (input.nextInt() == 0) {
                                continue callSettingsMenu; 
                            }
                            break;

			case 4:
			    System.out.println("Own number sending");
			    System.out.println("Press 0 to go back");
                            if (input.nextInt() == 0) {
                                continue callSettingsMenu; 
                            }
                            break;

			case 5:
			    System.out.println("Phone line in use");
			    System.out.println("Press 0 to go back");
                            if (input.nextInt() == 0) {
                                continue callSettingsMenu; 
                            }
                            break;

			case 6:
			    System.out.println("Automatic answer");
			    System.out.println("Press 0 to go back");
                            if (input.nextInt() == 0) {
                                continue callSettingsMenu; 
                            }
                            break;

			case 0:
			System.out.println("You're about to go back to the previous menu");
			System.out.println("Press 0 to go back");
			if (input.nextInt() == 0) {
			continue callSettingsMenu;
			}	

			}
			}
			case 2:
                	phoneSettingsMenu:
                	while (true) {
                    	System.out.print(phoneSettings);
                   	 System.out.println("Please Enter your preferred number from call settings options:");
                    	int phoneSettingsInput = input.nextInt();

			if (phoneSettingsInput < 0 || phoneSettingsInput > 6) {
			System.out.println("Invalid Input!! Enter a valid number from the options");
                        continue phoneSettingsMenu;
                        }


                    	switch (phoneSettingsInput) {
                        case 1:
                            System.out.println("Language");
                            System.out.println("Press 0 to go back");
                            if (input.nextInt() == 0) {
                                continue phoneSettingsMenu; 
                            }
                            break;

			case 2:
                            System.out.println("Cell info display");
                            System.out.println("Press 0 to go back");
                            if (input.nextInt() == 0) {
                                continue phoneSettingsMenu; 
                            }
                            break;

			case 3:
                            System.out.println("Welcome note");
                            System.out.println("Press 0 to go back");
                            if (input.nextInt() == 0) {
                                continue phoneSettingsMenu; 
                            }
                            break;
	
			case 4:
                            System.out.println("Network selection");
                            System.out.println("Press 0 to go back");
                            if (input.nextInt() == 0) {
                                continue phoneSettingsMenu; 
                            }
                            break;

			case 5:
                            System.out.println("Lights");
                            System.out.println("Press 0 to go back");
                            if (input.nextInt() == 0) {
                                continue phoneSettingsMenu; 
                            }
                            break;

			case 6:
                            System.out.println("Confirm SIM service actions");
                            System.out.println("Press 0 to go back");
                            if (input.nextInt() == 0) {
                                continue phoneSettingsMenu; 
                            }
                            break;

			case 0:
			System.out.println("You're about to go back to the previous menu");
			System.out.println("Press 0 to go back");
			if (input.nextInt() == 0) {
			continue phoneSettingsMenu;
			}	

			}
			}

			case 3:
                	securitySettingsMenu:
                	while (true) {
                    	System.out.print(securitySettings);
                   	 System.out.println("Please Enter your preferred number from call settings options:");
                    	int securitySettingsInput = input.nextInt();

			if (securitySettingsInput < 0 || securitySettingsInput > 6) {
			System.out.println("Invalid Input!! Enter a valid number from the options");
                        continue securitySettingsMenu;
                        }


                    	switch (securitySettingsInput) {
                        case 1:
                            System.out.println("PIN code request");
                            System.out.println("Press 0 to go back");
                            if (input.nextInt() == 0) {
                                continue securitySettingsMenu; 
                            }
                            break;

			case 2:
                            System.out.println("Call barring service");
                            System.out.println("Press 0 to go back");
                            if (input.nextInt() == 0) {
                                continue securitySettingsMenu; 
                            }
                            break;

			case 3:
                            System.out.println("Fixed dialling");
                            System.out.println("Press 0 to go back");
                            if (input.nextInt() == 0) {
                                continue securitySettingsMenu; 
                            }
                            break;

			case 4:
                            System.out.println("Closed user group");
                            System.out.println("Press 0 to go back");
                            if (input.nextInt() == 0) {
                                continue securitySettingsMenu; 
                            }
                            break;

			case 5:
                            System.out.println("Phone security");
                            System.out.println("Press 0 to go back");
                            if (input.nextInt() == 0) {
                                continue securitySettingsMenu; 
                            }
                            break;

			case 6:
                            System.out.println("Change access codes");
                            System.out.println("Press 0 to go back");
                            if (input.nextInt() == 0) {
                                continue securitySettingsMenu; 
                            }
                            break;
			
			case 0:
			System.out.println("You're about to go back to the previous menu");
			System.out.println("Press 0 to go back");
			if (input.nextInt() == 0) {
			continue securitySettingsMenu;
			}

			}
			}
		
			case 4:
                            System.out.println("Restore factory settings");
                            System.out.println("Press 0 to go back");
                            if (input.nextInt() == 0) {
                                continue settingsMenu; 
                            }
			case 0:
			System.out.println("You're about to go back to the previous menu");
			System.out.println("Press 0 to go back");
			if (input.nextInt() == 0) {
			continue mainMenu;
			}

			}	
			}
	
			case 7:
                            System.out.println("Call divert");
                            System.out.println("Press 0 to go back");
                            if (input.nextInt() == 0) {
                                continue mainMenu; 
                            }	

			case 8:
                            System.out.println("Games");
                            System.out.println("Press 0 to go back");
                            if (input.nextInt() == 0) {
                                continue mainMenu; 
                            }	

			case 9:
                            System.out.println("Calculator");
                            System.out.println("Press 0 to go back");
                            if (input.nextInt() == 0) {
                                continue mainMenu; 
                            }	

			case 10:
                            System.out.println("Reminders");
                            System.out.println("Press 0 to go back");
                            if (input.nextInt() == 0) {
                                continue mainMenu; 
                            }	

			case 11:
			clockMenu:
			while(true) {
			System.out.print(clock);
			System.out.print("Please Enter your preferred number from the options: ");
                        int clockInput = input.nextInt();

			 if (clockInput < 0 || clockInput > 6) {
			System.out.println("Invalid Input!! Enter a valid number from the options");
                            continue clockMenu;
                        }

			switch (clockInput) {
                        case 1:
                        System.out.println("Alarm clock");
                        System.out.println("Press 0 to go back");
                        if (input.nextInt() == 0) {
                        continue clockMenu;
                        }
                        break; 
		
			case 2:
                        System.out.println("Clock settings");
                        System.out.println("Press 0 to go back");
                        if (input.nextInt() == 0) {
                        continue clockMenu;
                        }
                        break; 

			case 3:
                        System.out.println("Date setting");
                        System.out.println("Press 0 to go back");
                        if (input.nextInt() == 0) {
                        continue clockMenu;
                        }
                        break; 

			case 4:
                        System.out.println("Stopwatch");
                        System.out.println("Press 0 to go back");
                        if (input.nextInt() == 0) {
                        continue clockMenu;
                        }
                        break; 

			case 5:
                        System.out.println("Countdown timer");
                        System.out.println("Press 0 to go back");
                        if (input.nextInt() == 0) {
                        continue clockMenu;
                        }
                        break; 

			case 6:
                        System.out.println("Auto update of date and time");
                        System.out.println("Press 0 to go back");
                        if (input.nextInt() == 0) {
                        continue clockMenu;
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

			case 12:
                            System.out.println("Profiles");
                            System.out.println("Press 0 to go back");
                            if (input.nextInt() == 0) {
                                continue mainMenu; 
                            }	

			case 13:
                            System.out.println("SIM services");
                            System.out.println("Press 0 to go back");
                            if (input.nextInt() == 0) {
                                continue mainMenu; 
                            }	
			}		
			break;
        }
    }
}

// int backInput = input.nextInt();
                       //          if (backInput == 0) {
         //   continue phoneBookMenu;       } else {
         //   System.out.println("Invalid input. Press 0 to go back.");
       // }
