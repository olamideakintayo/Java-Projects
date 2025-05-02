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
                            while (true) {
    			    System.out.println("Press 0 to go back");
    		            int back = input.nextInt();
    			    if (back == 0) {
        		    break;  
    			    } else {
       			    System.out.println("Invalid input! Please press 0 to go back.");
   				 }
				}
                                continue phoneBookMenu;
                               

                            case 2:
                            System.out.println("Service Nos.");
                            while (true) {
    			    System.out.println("Press 0 to go back");
    		            int back = input.nextInt();
    			    if (back == 0) {
        		    break;  
    			    } else {
       			    System.out.println("Invalid input! Please press 0 to go back.");
   				 }
				}
                                continue phoneBookMenu;
                               

                            case 3:
                            System.out.println("Add name");
                            while (true) {
    			    System.out.println("Press 0 to go back");
    		            int back = input.nextInt();
    			    if (back == 0) {
        		    break;  
    			    } else {
       			    System.out.println("Invalid input! Please press 0 to go back.");
   				 }
				}
                                continue phoneBookMenu;
                               

                            case 4:
                            System.out.println("Erase");
                            while (true) {
    			    System.out.println("Press 0 to go back");
    		            int back = input.nextInt();
    			    if (back == 0) {
        		    break;  
    			    } else {
       			    System.out.println("Invalid input! Please press 0 to go back.");
   				 }
				}
                                continue phoneBookMenu;
                               

                            case 5:
                                System.out.println("Edit");
                                while (true) {
    			    System.out.println("Press 0 to go back");
    		            int back = input.nextInt();
    			    if (back == 0) {
        		    break;  
    			    } else {
       			    System.out.println("Invalid input! Please press 0 to go back.");
   				 }
				}
                                continue phoneBookMenu;
                               

                            case 6:
                                System.out.println("Assign tone");
                                 while (true) {
    			    System.out.println("Press 0 to go back");
    		            int back = input.nextInt();
    			    if (back == 0) {
        		    break;  
    			    } else {
       			    System.out.println("Invalid input! Please press 0 to go back.");
   				 }
				}
                                continue phoneBookMenu;
                               

                            case 7:
                            System.out.println("Send b'card");
                            while (true) {
    			    System.out.println("Press 0 to go back");
    		            int back = input.nextInt();
    			    if (back == 0) {
        		    break;  
    			    } else {
       			    System.out.println("Invalid input! Please press 0 to go back.");
   				 }
				}
                                continue phoneBookMenu;
                                

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
                            while (true) {
    			    System.out.println("Press 0 to go back");
    		            int back = input.nextInt();
    			    if (back == 0) {
        		    break;  
    			    } else {
       			    System.out.println("Invalid input! Please press 0 to go back.");
   				 }
				}
                                continue optionsMenu;
                                           

                            case 2:
                            System.out.println("Memory status");
                            while (true) {
    			    System.out.println("Press 0 to go back");
    		            int back = input.nextInt();
    			    if (back == 0) {
        		    break;  
    			    } else {
       			    System.out.println("Invalid input! Please press 0 to go back.");
   				 }
				}
                                continue optionsMenu;
                                           


			    case 0:
		            while(true)  {
    			    System.out.println("Press 0 to go back");
    		            int back = input.nextInt();
    			    if (back == 0) {
        		    break;  
    			    } else {
       			    System.out.println("Invalid input! Please press 0 to go back.");
   				 }
				}
				    continue phoneBookMenu;
				}
				break;

                                    }
                                    break;
                                

                            case 9:
                                System.out.println("Speed dials");
                                 while (true) {
    			    System.out.println("Press 0 to go back");
    		            int back = input.nextInt();
    			    if (back == 0) {
        		    break;  
    			    } else {
       			    System.out.println("Invalid input! Please press 0 to go back.");
   				 }
				}
                                continue phoneBookMenu;
                                

                            case 10:
                                System.out.println("Voice tags");
                                 while (true) {
    			    System.out.println("Press 0 to go back");
    		            int back = input.nextInt();
    			    if (back == 0) {
        		    break;  
    			    } else {
       			    System.out.println("Invalid input! Please press 0 to go back.");
   				 }
				}
                                    continue phoneBookMenu;
                               

			    case 0:
				 while (true) {
    			    System.out.println("Press 0 to go back");
    		            int back = input.nextInt();
    			    if (back == 0) {
        		    break;  
    			    } else {
       			    System.out.println("Invalid input! Please press 0 to go back.");
   				 }
				}
				    continue mainMenu;
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
                                while (true) {
    			    System.out.println("Press 0 to go back");
    		            int back = input.nextInt();
    			    if (back == 0) {
        		    break;  
    			    } else {
       			    System.out.println("Invalid input! Please press 0 to go back.");
   				 }
				}
                                    continue messagesMenu;
                               

                            case 2:
                                System.out.println("Inbox");
                                 while (true) {
    			    System.out.println("Press 0 to go back");
    		            int back = input.nextInt();
    			    if (back == 0) {
        		    break;  
    			    } else {
       			    System.out.println("Invalid input! Please press 0 to go back.");
   				 }
				}
                                    continue messagesMenu;
                               

                            case 3:
                                System.out.println("Outbox");
                                while (true) {
    			    System.out.println("Press 0 to go back");
    		            int back = input.nextInt();
    			    if (back == 0) {
        		    break;  
    			    } else {
       			    System.out.println("Invalid input! Please press 0 to go back.");
   				 }
				}
                                    continue messagesMenu;
                               

                            case 4:
                                System.out.println("Picture messages");
                                 while (true) {
    			    System.out.println("Press 0 to go back");
    		            int back = input.nextInt();
    			    if (back == 0) {
        		    break;  
    			    } else {
       			    System.out.println("Invalid input! Please press 0 to go back.");
   				 }
				}
                                    continue messagesMenu;
                              

                            case 5:
                                System.out.println("Templates");
                                while (true) {
    			    System.out.println("Press 0 to go back");
    		            int back = input.nextInt();
    			    if (back == 0) {
        		    break;  
    			    } else {
       			    System.out.println("Invalid input! Please press 0 to go back.");
   				 }
				}
                                    continue messagesMenu;
                               

                            case 6:
                                System.out.println("Smileys");
                                 while (true) {
    			    System.out.println("Press 0 to go back");
    		            int back = input.nextInt();
    			    if (back == 0) {
        		    break;  
    			    } else {
       			    System.out.println("Invalid input! Please press 0 to go back.");
   				 }
				}
                                    continue messagesMenu;
                                                       

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
                            while (true) {
    			    System.out.println("Press 0 to go back");
    		            int back = input.nextInt();
    			    if (back == 0) {
        		    break;  
    			    } else {
       			    System.out.println("Invalid input! Please press 0 to go back.");
   				 }
				}
                                continue set1Menu;
                                                        


                            case 2:
                            System.out.println("Messages sent as");
                            while (true) {
    			    System.out.println("Press 0 to go back");
    		            int back = input.nextInt();
    			    if (back == 0) {
        		    break;  
    			    } else {
       			    System.out.println("Invalid input! Please press 0 to go back.");
   				 }
				}
                                continue set1Menu;
                                                                                    
			
			    case 3:
                            System.out.println("Message validity");
                            while (true) {
    			    System.out.println("Press 0 to go back");
    		            int back = input.nextInt();
    			    if (back == 0) {
        		    break;  
    			    } else {
       			    System.out.println("Invalid input! Please press 0 to go back.");
   				 }
				}
                                continue set1Menu;
                                                       
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
                            while (true) {
    			    System.out.println("Press 0 to go back");
    		            int back = input.nextInt();
    			    if (back == 0) {
        		    break;  
    			    } else {
       			    System.out.println("Invalid input! Please press 0 to go back.");
   				 }
				}
                                continue commonMenu;
                                                        

                            case 2:
                            System.out.println("Reply via same centre");
                            while (true) {
    			    System.out.println("Press 0 to go back");
    		            int back = input.nextInt();
    			    if (back == 0) {
        		    break;  
    			    } else {
       			    System.out.println("Invalid input! Please press 0 to go back.");
   				 }
				}
                                continue commonMenu;
                                                       

                             case 3:
                             System.out.println("Character support");
                             while (true) {
    			    System.out.println("Press 0 to go back");
    		            int back = input.nextInt();
    			    if (back == 0) {
        		    break;  
    			    } else {
       			    System.out.println("Invalid input! Please press 0 to go back.");
   				 }
				}
                                continue commonMenu;
                                                        
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
                                 while (true) {
    			    System.out.println("Press 0 to go back");
    		            int back = input.nextInt();
    			    if (back == 0) {
        		    break;  
    			    } else {
       			    System.out.println("Invalid input! Please press 0 to go back.");
   				 }
				}
                                    continue messagesMenu;
                               

                            case 9:
                                System.out.println("Voice mailbox number");
                                while (true) {
    			    System.out.println("Press 0 to go back");
    		            int back = input.nextInt();
    			    if (back == 0) {
        		    break;  
    			    } else {
       			    System.out.println("Invalid input! Please press 0 to go back.");
   				 }
				}
                                    continue messagesMenu;
                               

                            case 10:
                                System.out.println("Service command editor");
                                 while (true) {
    			    System.out.println("Press 0 to go back");
    		            int back = input.nextInt();
    			    if (back == 0) {
        		    break;  
    			    } else {
       			    System.out.println("Invalid input! Please press 0 to go back.");
   				 }
				}
                                    continue messagesMenu;
                              
		
			   case 0:
				 while (true) {
    			    System.out.println("Press 0 to go back");
    		            int back = input.nextInt();
    			    if (back == 0) {
        		    break;  
    			    } else {
       			    System.out.println("Invalid input! Please press 0 to go back.");
   				 }
				}
				    continue mainMenu;
				
                        }
                        break;
                    }
                    break;

                case 3:
                    System.out.println("Chat");
                     while (true) {
    			    System.out.println("Press 0 to go back");
    		            int back = input.nextInt();
    			    if (back == 0) {
        		    break;  
    			    } else {
       			    System.out.println("Invalid input! Please press 0 to go back.");
   				 }
				}
                        continue mainMenu;
                
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
                                while (true) {
    			    System.out.println("Press 0 to go back");
    		            int back = input.nextInt();
    			    if (back == 0) {
        		    break;  
    			    } else {
       			    System.out.println("Invalid input! Please press 0 to go back.");
   				 }
				}
                                    continue callRegisterMenu;
                                

			    case 2:
                                System.out.println("Received calls");
                               while (true) {
    			    System.out.println("Press 0 to go back");
    		            int back = input.nextInt();
    			    if (back == 0) {
        		    break;  
    			    } else {
       			    System.out.println("Invalid input! Please press 0 to go back.");
   				 }
				}
                                    continue callRegisterMenu;
                               
			    
			    case 3:
                                System.out.println("Dialled numbers");
                                while (true) {
    			    System.out.println("Press 0 to go back");
    		            int back = input.nextInt();
    			    if (back == 0) {
        		    break;  
    			    } else {
       			    System.out.println("Invalid input! Please press 0 to go back.");
   				 }
				}
                                    continue callRegisterMenu;
                                

			    case 4:
                                System.out.println("Erase recent call lists");
                                while (true) {
    			    System.out.println("Press 0 to go back");
    		            int back = input.nextInt();
    			    if (back == 0) {
        		    break;  
    			    } else {
       			    System.out.println("Invalid input! Please press 0 to go back.");
   				 }
				}
                                    continue callRegisterMenu;
                              
	
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
                                while (true) {
    			    System.out.println("Press 0 to go back");
    		            int back = input.nextInt();
    			    if (back == 0) {
        		    break;  
    			    } else {
       			    System.out.println("Invalid input! Please press 0 to go back.");
   				 }
				}
                                    continue showCallDurationMenu;
                              

				case 2:
                                System.out.println("All calls' duration");
                                while (true) {
    			    System.out.println("Press 0 to go back");
    		            int back = input.nextInt();
    			    if (back == 0) {
        		    break;  
    			    } else {
       			    System.out.println("Invalid input! Please press 0 to go back.");
   				 }
				}
                                    continue showCallDurationMenu;
                              
				
   				case 3:
                                System.out.println("Received calls' duration");
                                 while (true) {
    			    System.out.println("Press 0 to go back");
    		            int back = input.nextInt();
    			    if (back == 0) {
        		    break;  
    			    } else {
       			    System.out.println("Invalid input! Please press 0 to go back.");
   				 }
				}
                                    continue showCallDurationMenu;
                               

				case 4:
                                System.out.println("Dialled calls' duration");
                                while (true) {
    			    System.out.println("Press 0 to go back");
    		            int back = input.nextInt();
    			    if (back == 0) {
        		    break;  
    			    } else {
       			    System.out.println("Invalid input! Please press 0 to go back.");
   				 }
				}
                                    continue showCallDurationMenu;
                               

				case 5:
                                System.out.println("Clear timers");
                                while (true) {
    			    System.out.println("Press 0 to go back");
    		            int back = input.nextInt();
    			    if (back == 0) {
        		    break;  
    			    } else {
       			    System.out.println("Invalid input! Please press 0 to go back.");
   				 }
				}
                                    continue showCallDurationMenu;
                             	
			
				case 0:
				while (true) {
    			    System.out.println("Press 0 to go back");
    		            int back = input.nextInt();
    			    if (back == 0) {
        		    break;  
    			    } else {
       			    System.out.println("Invalid input! Please press 0 to go back.");
   				 }
				}
				continue callRegisterMenu;
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
                                while (true) {
    			    System.out.println("Press 0 to go back");
    		            int back = input.nextInt();
    			    if (back == 0) {
        		    break;  
    			    } else {
       			    System.out.println("Invalid input! Please press 0 to go back.");
   				 }
				}
                                continue showCallCostsMenu;
                               		

				case 2:
                                System.out.println("All call cost");
                                while (true) {
    			    System.out.println("Press 0 to go back");
    		            int back = input.nextInt();
    			    if (back == 0) {
        		    break;  
    			    } else {
       			    System.out.println("Invalid input! Please press 0 to go back.");
   				 }
				}
                                continue showCallCostsMenu;
                               		 

				case 3:
                                System.out.println("Clear counters");
                                while (true) {
    			    System.out.println("Press 0 to go back");
    		            int back = input.nextInt();
    			    if (back == 0) {
        		    break;  
    			    } else {
       			    System.out.println("Invalid input! Please press 0 to go back.");
   				 }
				}
                                continue showCallCostsMenu;
                               							
				case 0:
				while (true) {
    			    System.out.println("Press 0 to go back");
    		            int back = input.nextInt();
    			    if (back == 0) {
        		    break;  
    			    } else {
       			    System.out.println("Invalid input! Please press 0 to go back.");
   				 }
				}
				continue callRegisterMenu;
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
                                while (true) {
    			    System.out.println("Press 0 to go back");
    		            int back = input.nextInt();
    			    if (back == 0) {
        		    break;  
    			    } else {
       			    System.out.println("Invalid input! Please press 0 to go back.");
   				 }
				}
                                continue callCostSettingsMenu;
                               		
	
				case 2:
                                System.out.println("Show costs in");
                                while (true) {
    			    System.out.println("Press 0 to go back");
    		            int back = input.nextInt();
    			    if (back == 0) {
        		    break;  
    			    } else {
       			    System.out.println("Invalid input! Please press 0 to go back.");
   				 }
				}
                                continue callCostSettingsMenu;
                               	

			    case 0:
			    while(true) {
    			    System.out.println("Press 0 to go back");
    		            int back = input.nextInt();
    			    if (back == 0) {
        		    break;  
    			    } else {
       			    System.out.println("Invalid input! Please press 0 to go back.");
   				 }
				}
				continue callRegisterMenu;
				}
				}
					
			    case 8:
			    System.out.println("Prepaid credit");
			    while(true) {
    			    System.out.println("Press 0 to go back");
    		            int back = input.nextInt();
    			    if (back == 0) {
        		    break;  
    			    } else {
       			    System.out.println("Invalid input! Please press 0 to go back.");
   				 }
				}
				    continue callRegisterMenu;
					

			    case 0:
			    while(true) {
    			    System.out.println("Press 0 to go back");
    		            int back = input.nextInt();
    			    if (back == 0) {
        		    break;  
    			    } else {
       			    System.out.println("Invalid input! Please press 0 to go back.");
   				 }
				}
				    continue mainMenu;
					
				}
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
                        while (true) {
    			    System.out.println("Press 0 to go back");
    		            int back = input.nextInt();
    			    if (back == 0) {
        		    break;  
    			    } else {
       			    System.out.println("Invalid input! Please press 0 to go back.");
   				 }
				}
                        continue tonesMenu;
                   
			case 2:
                        System.out.println("Ringing volume");
                        while (true) {
    			    System.out.println("Press 0 to go back");
    		            int back = input.nextInt();
    			    if (back == 0) {
        		    break;  
    			    } else {
       			    System.out.println("Invalid input! Please press 0 to go back.");
   				 }
				}
                        continue tonesMenu;
                     
			case 3:
                        System.out.println("Incoming call alert");
                         while (true) {
    			    System.out.println("Press 0 to go back");
    		            int back = input.nextInt();
    			    if (back == 0) {
        		    break;  
    			    } else {
       			    System.out.println("Invalid input! Please press 0 to go back.");
   				 }
				}
                        continue tonesMenu;
                       

			case 4:
                        System.out.println("Composer");
                        while (true) {
    			    System.out.println("Press 0 to go back");
    		            int back = input.nextInt();
    			    if (back == 0) {
        		    break;  
    			    } else {
       			    System.out.println("Invalid input! Please press 0 to go back.");
   				 }
				}
                        continue tonesMenu;
                      

			case 5:
                        System.out.println("Message alert tone");
                         while (true) {
    			    System.out.println("Press 0 to go back");
    		            int back = input.nextInt();
    			    if (back == 0) {
        		    break;  
    			    } else {
       			    System.out.println("Invalid input! Please press 0 to go back.");
   				 }
				}
                        continue tonesMenu;
          

			case 6:
                        System.out.println("Keypad tones");
                        while (true) {
    			    System.out.println("Press 0 to go back");
    		            int back = input.nextInt();
    			    if (back == 0) {
        		    break;  
    			    } else {
       			    System.out.println("Invalid input! Please press 0 to go back.");
   				 }
				}
                        continue tonesMenu;
			
			case 7:
                        System.out.println("Warning and game tones");
                       while (true) {
    			    System.out.println("Press 0 to go back");
    		            int back = input.nextInt();
    			    if (back == 0) {
        		    break;  
    			    } else {
       			    System.out.println("Invalid input! Please press 0 to go back.");
   				 }
				}
                        continue tonesMenu;

			case 8:
                        System.out.println("Vibrating alert");
                         while (true) {
    			    System.out.println("Press 0 to go back");
    		            int back = input.nextInt();
    			    if (back == 0) {
        		    break;  
    			    } else {
       			    System.out.println("Invalid input! Please press 0 to go back.");
   				 }
				}
                        continue tonesMenu;
                    

			case 9:
                        System.out.println("Screen saver");
                        while (true) {
    			    System.out.println("Press 0 to go back");
    		            int back = input.nextInt();
    			    if (back == 0) {
        		    break;  
    			    } else {
       			    System.out.println("Invalid input! Please press 0 to go back.");
   				 }
				}
                        continue tonesMenu;
                        
			case 0:
			 while (true) {
    			    System.out.println("Press 0 to go back");
    		            int back = input.nextInt();
    			    if (back == 0) {
        		    break;  
    			    } else {
       			    System.out.println("Invalid input! Please press 0 to go back.");
   				 }
				}
			continue mainMenu;
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
			    while (true) {
    			    System.out.println("Press 0 to go back");
    		            int back = input.nextInt();
    			    if (back == 0) {
        		    break;  
    			    } else {
       			    System.out.println("Invalid input! Please press 0 to go back.");
   				 }
				}
			    continue callSettingsMenu;


			case 2:
			    System.out.println("Speed dialling");
			     while (true) {
    			    System.out.println("Press 0 to go back");
    		            int back = input.nextInt();
    			    if (back == 0) {
        		    break;  
    			    } else {
       			    System.out.println("Invalid input! Please press 0 to go back.");
   				 }
				}
                                continue callSettingsMenu; 
                    

			case 3:
			    System.out.println("Call waiting options");
			     while (true) {
    			    System.out.println("Press 0 to go back");
    		            int back = input.nextInt();
    			    if (back == 0) {
        		    break;  
    			    } else {
       			    System.out.println("Invalid input! Please press 0 to go back.");
   				 }
				}
                                continue callSettingsMenu; 

			case 4:
			    System.out.println("Own number sending");
			    while (true) {
    			    System.out.println("Press 0 to go back");
    		            int back = input.nextInt();
    			    if (back == 0) {
        		    break;  
    			    } else {
       			    System.out.println("Invalid input! Please press 0 to go back.");
   				 }
				}
                                continue callSettingsMenu; 
            

			case 5:
			    System.out.println("Phone line in use");
			     while (true) {
    			    System.out.println("Press 0 to go back");
    		            int back = input.nextInt();
    			    if (back == 0) {
        		    break;  
    			    } else {
       			    System.out.println("Invalid input! Please press 0 to go back.");
   				 }
				}
                                continue callSettingsMenu; 
                        

			case 6:
			    System.out.println("Automatic answer");
			     while (true) {
    			    System.out.println("Press 0 to go back");
    		            int back = input.nextInt();
    			    if (back == 0) {
        		    break;  
    			    } else {
       			    System.out.println("Invalid input! Please press 0 to go back.");
   				 }
				}
                                continue callSettingsMenu; 

			case 0:
			 while (true) {
    			    System.out.println("Press 0 to go back");
    		            int back = input.nextInt();
    			    if (back == 0) {
        		    break;  
    			    } else {
       			    System.out.println("Invalid input! Please press 0 to go back.");
   				 }
				}
			continue callSettingsMenu;	
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
                            while (true) {
    			    System.out.println("Press 0 to go back");
    		            int back = input.nextInt();
    			    if (back == 0) {
        		    break;  
    			    } else {
       			    System.out.println("Invalid input! Please press 0 to go back.");
   				 }
				}
                                continue phoneSettingsMenu; 

			case 2:
                            System.out.println("Cell info display");
                             while (true) {
    			    System.out.println("Press 0 to go back");
    		            int back = input.nextInt();
    			    if (back == 0) {
        		    break;  
    			    } else {
       			    System.out.println("Invalid input! Please press 0 to go back.");
   				 }
				}
                                continue phoneSettingsMenu; 
                           

			case 3:
                            System.out.println("Welcome note");
                             while (true) {
    			    System.out.println("Press 0 to go back");
    		            int back = input.nextInt();
    			    if (back == 0) {
        		    break;  
    			    } else {
       			    System.out.println("Invalid input! Please press 0 to go back.");
   				 }
				}
                                continue phoneSettingsMenu; 
          
	
			case 4:
                            System.out.println("Network selection");
                             while (true) {
    			    System.out.println("Press 0 to go back");
    		            int back = input.nextInt();
    			    if (back == 0) {
        		    break;  
    			    } else {
       			    System.out.println("Invalid input! Please press 0 to go back.");
   				 }
				}
                                continue phoneSettingsMenu; 

			case 5:
                            System.out.println("Lights");
                            while (true) {
    			    System.out.println("Press 0 to go back");
    		            int back = input.nextInt();
    			    if (back == 0) {
        		    break;  
    			    } else {
       			    System.out.println("Invalid input! Please press 0 to go back.");
   				 }
				}
                                continue phoneSettingsMenu; 

			case 6:
                            System.out.println("Confirm SIM service actions");
                             while (true) {
    			    System.out.println("Press 0 to go back");
    		            int back = input.nextInt();
    			    if (back == 0) {
        		    break;  
    			    } else {
       			    System.out.println("Invalid input! Please press 0 to go back.");
   				 }
				}
                                continue phoneSettingsMenu; 

			case 0:
			 while (true) {
    			    System.out.println("Press 0 to go back");
    		            int back = input.nextInt();
    			    if (back == 0) {
        		    break;  
    			    } else {
       			    System.out.println("Invalid input! Please press 0 to go back.");
   				 }
				}
			continue phoneSettingsMenu;

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
                             while (true) {
    			    System.out.println("Press 0 to go back");
    		            int back = input.nextInt();
    			    if (back == 0) {
        		    break;  
    			    } else {
       			    System.out.println("Invalid input! Please press 0 to go back.");
   				 }
				}
                                continue securitySettingsMenu; 
                          
			case 2:
                            System.out.println("Call barring service");
                            while (true) {
    			    System.out.println("Press 0 to go back");
    		            int back = input.nextInt();
    			    if (back == 0) {
        		    break;  
    			    } else {
       			    System.out.println("Invalid input! Please press 0 to go back.");
   				 }
				}
                                continue securitySettingsMenu; 
                          
			case 3:
                            System.out.println("Fixed dialling");
                             while (true) {
    			    System.out.println("Press 0 to go back");
    		            int back = input.nextInt();
    			    if (back == 0) {
        		    break;  
    			    } else {
       			    System.out.println("Invalid input! Please press 0 to go back.");
   				 }
				}
                                continue securitySettingsMenu; 
                         

			case 4:
                            System.out.println("Closed user group");
                             while (true) {
    			    System.out.println("Press 0 to go back");
    		            int back = input.nextInt();
    			    if (back == 0) {
        		    break;  
    			    } else {
       			    System.out.println("Invalid input! Please press 0 to go back.");
   				 }
				}
                                continue securitySettingsMenu; 

			case 5:
                            System.out.println("Phone security");
                             while (true) {
    			    System.out.println("Press 0 to go back");
    		            int back = input.nextInt();
    			    if (back == 0) {
        		    break;  
    			    } else {
       			    System.out.println("Invalid input! Please press 0 to go back.");
   				 }
				}
                                continue securitySettingsMenu; 
              

			case 6:
                            System.out.println("Change access codes");
                             while (true) {
    			    System.out.println("Press 0 to go back");
    		            int back = input.nextInt();
    			    if (back == 0) {
        		    break;  
    			    } else {
       			    System.out.println("Invalid input! Please press 0 to go back.");
   				 }
				}
                                continue securitySettingsMenu; 
			
			case 0:
			 while (true) {
    			    System.out.println("Press 0 to go back");
    		            int back = input.nextInt();
    			    if (back == 0) {
        		    break;  
    			    } else {
       			    System.out.println("Invalid input! Please press 0 to go back.");
   				 }
				}
			continue securitySettingsMenu;
			}
			}
		
			case 4:
                            System.out.println("Restore factory settings");
                             while (true) {
    			    System.out.println("Press 0 to go back");
    		            int back = input.nextInt();
    			    if (back == 0) {
        		    break;  
    			    } else {
       			    System.out.println("Invalid input! Please press 0 to go back.");
   				 }
				}
                                continue settingsMenu; 

			case 0:
			 while (true) {
    			    System.out.println("Press 0 to go back");
    		            int back = input.nextInt();
    			    if (back == 0) {
        		    break;  
    			    } else {
       			    System.out.println("Invalid input! Please press 0 to go back.");
   				 }
				}
			continue mainMenu;
			}	
			}
	
			case 7:
                            System.out.println("Call divert");
                             while (true) {
    			    System.out.println("Press 0 to go back");
    		            int back = input.nextInt();
    			    if (back == 0) {
        		    break;  
    			    } else {
       			    System.out.println("Invalid input! Please press 0 to go back.");
   				 }
				}
                                continue mainMenu; 	

			case 8:
                            System.out.println("Games");
                             while (true) {
    			    System.out.println("Press 0 to go back");
    		            int back = input.nextInt();
    			    if (back == 0) {
        		    break;  
    			    } else {
       			    System.out.println("Invalid input! Please press 0 to go back.");
   				 }
				}
                                continue mainMenu; 

			case 9:
                            System.out.println("Calculator");
                             while (true) {
    			    System.out.println("Press 0 to go back");
    		            int back = input.nextInt();
    			    if (back == 0) {
        		    break;  
    			    } else {
       			    System.out.println("Invalid input! Please press 0 to go back.");
   				 }
				}
                                continue mainMenu; 	

			case 10:
                            System.out.println("Reminders");
                            while (true) {
    			    System.out.println("Press 0 to go back");
    		            int back = input.nextInt();
    			    if (back == 0) {
        		    break;  
    			    } else {
       			    System.out.println("Invalid input! Please press 0 to go back.");
   				 }
				}
                                continue mainMenu; 	

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
                         while (true) {
    			    System.out.println("Press 0 to go back");
    		            int back = input.nextInt();
    			    if (back == 0) {
        		    break;  
    			    } else {
       			    System.out.println("Invalid input! Please press 0 to go back.");
   				 }
				}
                        continue clockMenu;
                    
		
			case 2:
                        System.out.println("Clock settings");
                         while (true) {
    			    System.out.println("Press 0 to go back");
    		            int back = input.nextInt();
    			    if (back == 0) {
        		    break;  
    			    } else {
       			    System.out.println("Invalid input! Please press 0 to go back.");
   				 }
				}
                        continue clockMenu;

			case 3:
                        System.out.println("Date setting");
                         while (true) {
    			    System.out.println("Press 0 to go back");
    		            int back = input.nextInt();
    			    if (back == 0) {
        		    break;  
    			    } else {
       			    System.out.println("Invalid input! Please press 0 to go back.");
   				 }
				}
                        continue clockMenu;

			case 4:
                        System.out.println("Stopwatch");
                        while (true) {
    			    System.out.println("Press 0 to go back");
    		            int back = input.nextInt();
    			    if (back == 0) {
        		    break;  
    			    } else {
       			    System.out.println("Invalid input! Please press 0 to go back.");
   				 }
				}
                        continue clockMenu;
                    

			case 5:
                        System.out.println("Countdown timer");
                         while (true) {
    			    System.out.println("Press 0 to go back");
    		            int back = input.nextInt();
    			    if (back == 0) {
        		    break;  
    			    } else {
       			    System.out.println("Invalid input! Please press 0 to go back.");
   				 }
				}
                        continue clockMenu;
                 

			case 6:
                        System.out.println("Auto update of date and time");
                       while (true) {
    			    System.out.println("Press 0 to go back");
    		            int back = input.nextInt();
    			    if (back == 0) {
        		    break;  
    			    } else {
       			    System.out.println("Invalid input! Please press 0 to go back.");
   				 }
				}
                        continue clockMenu;
   

			case 0:
			 while (true) {
    			    System.out.println("Press 0 to go back");
    		            int back = input.nextInt();
    			    if (back == 0) {
        		    break;  
    			    } else {
       			    System.out.println("Invalid input! Please press 0 to go back.");
   				 }
				}
			continue mainMenu;
			}
			}

			case 12:
                            System.out.println("Profiles");
                             while (true) {
    			    System.out.println("Press 0 to go back");
    		            int back = input.nextInt();
    			    if (back == 0) {
        		    break;  
    			    } else {
       			    System.out.println("Invalid input! Please press 0 to go back.");
   				 }
				}
                                continue mainMenu; 	

			case 13:
                            System.out.println("SIM services");
                            while (true) {
    			    System.out.println("Press 0 to go back");
    		            int back = input.nextInt();
    			    if (back == 0) {
        		    break;  
    			    } else {
       			    System.out.println("Invalid input! Please press 0 to go back.");
   				 }
				}
                                continue mainMenu; 
			}		
			break;
        }
    }
}
