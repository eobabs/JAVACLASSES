import java.util.Scanner;

public class NokiaMenuMaps {

    	public static void main(String... nokia) {
        	mainMenu(); 
    	}

    	public static void mainMenu() {
        String introduction = """
NOKIA 3310 MENU MAP
Let us help you learn about your new Nokia phone. 
The menu map you see will take you through the main 
menu functions in the order they appear on your phone.

We've included visuals of the 13 menu functions and 
they are numbered 1-13 so you can see the sequence at a glance. 
And right next to each menu function screen we've listed the special 
features in your Nokia phone, also in order of appearance so 
they'll be easy to find.

                ********************************

                input 1 for Phone Book
                input 2 for Messages
                input 3 for Chat
                input 4 for Call Register
                input 5 for Tones
                input 6 for Settings
                input 7 for Call Divert
                input 8 for Games
                input 9 for Calculator
                input 10 for Reminders
                input 11 for Clock
                input 12 for Profiles
                input 13 for SIM Services

                ********************************

                What do you want to do?

                """;
        	System.out.print(introduction);

        	Scanner input = new Scanner(System.in);
        	int menuOptions = input.nextInt();

	        switch (menuOptions) {
        	    	case 1 : phoneBookMenu(); break;
            		case 2 : messagesMenu(); break;
            		case 3 : System.out.println("Chat"); break;
            		case 4 : callRegisterMenu(); break;
            		case 5 : tonesMenu(); break;
            		case 6 : settingsMenu(); break;
            		case 7 : System.out.println("Call Divert"); break;
            		case 8 : System.out.println("Games"); break;
            		case 9 : System.out.println("Calculator"); break;
            		case 10 : System.out.println("Reminders"); break;
            		case 11 : clockMenu(); break;
            		case 12 : System.out.println("Profiles"); break;
            		case 13 : System.out.println("SIM Services"); break;
            		default : System.out.println("This number is invalid. Thank you"); break;
        			}

        	System.out.println("\nThank you for using this service\nNOKIA... connecting people.");
    	}

    	public static void phoneBookMenu() {
        	Scanner input = new Scanner(System.in);
       		String phonebookMenu = """
                ********************************
                
                input 1 for Search
                input 2 for Service Nos.
                input 3 for Add name
                input 4 for Erase
                input 5 for Edit
                input 6 for Assign Tone
                input 7 for Send b'card
                input 8 for Options
                input 9 for Speed Dials
                input 10 for Voice Tags
                input 0 to go back to Main menu

                ********************************
                What do you want to do?

                """;
        	System.out.print(phonebookMenu);
        	int phoneBook = input.nextInt();
        	switch (phoneBook) {
           		case 1 : System.out.println("Search"); break;
           		case 2 : System.out.println("Service Nos."); break;
            		case 3 : System.out.println("Add name"); break;
            		case 4 : System.out.println("Erase"); break;
            		case 5 : System.out.println("Edit"); break;
            		case 6 : System.out.println("Assign Tone"); break;
            		case 7 : System.out.println("Send b'card"); break;
            		case 8 : optionsMenu(); break;
            		case 9 : System.out.println("Speed Dials"); break;
            		case 10 : System.out.println("Voice Tags"); break;
            		case 0 : mainMenu();  break; 
            		default : System.out.println("This menu does not exist"); break;
        			}
    	}

    	public static void messagesMenu() {
        	Scanner input = new Scanner(System.in);
        	String messagesMenu = """
                ********************************
                
                input 1 for Write Messages
                input 2 for Inbox
                input 3 for Outbox
                input 4 for Picture Messages
                input 5 for Templates
                input 6 for Smileys
                input 7 for Message Settings
                input 8 for Info Service
                input 9 for Voice mailbox number
                input 10 for Service command editor
                input 0 to go back to Main menu

                ********************************
                What do you want to do?

                """;
        	System.out.print(messagesMenu);
        	int messages = input.nextInt();
        	switch (messages) {
            		case 1 : System.out.println("Write Messages"); break;
            		case 2 : System.out.println("Inbox"); break;
            		case 3 : System.out.println("Outbox"); break;
           		case 4 : System.out.println("Picture Messages"); break;
            		case 5 : System.out.println("Templates"); break;
            		case 6 : System.out.println("Smileys"); break;
           		case 7 : messageSettingsMenu(); break;
            		case 8 : System.out.println("Info Service"); break;
            		case 9 : System.out.println("Voice Mailbox Number"); break;
            		case 10 : System.out.println("Service Command Editor"); break;
            		case 0 : mainMenu(); break;
            		default : System.out.println("This menu does not exist"); break;
        			}
   	}

   	public static void callRegisterMenu() {
        	Scanner input = new Scanner(System.in);
        	String callRegisterMenu = """
                ********************************
                
                input 1 for Missed Calls
                input 2 for Received Calls
                input 3 for Dialled Numbers
                input 4 for Erase recent call lists
                input 5 for Show Call duration
                input 6 for Show Call costs
                input 7 for Call Cost settings
                input 8 for Prepaid Credit
                input 0 to go back to main menu

                ********************************
                What do you want to do?

                """;
        	System.out.print(callRegisterMenu);
       		int callRegister = input.nextInt();
        	switch (callRegister) {
            		case 1 : System.out.println("Missed Calls"); break;
           		case 2 : System.out.println("Received Calls"); break;
            		case 3 : System.out.println("Dialled Numbers"); break;
            		case 4 : System.out.println("Erase recent call lists"); break;
            		case 5 : showCallDurationMenu(); break;
            		case 6 : showCallCostsMenu(); break;
            		case 7 : callCostSettingsMenu(); break;
            		case 8 : System.out.println("Prepaid Credit"); break;
            		case 0 : mainMenu(); break;
            		default : System.out.println("This menu does not exist"); break;
       				}
   	}

   	public static void tonesMenu() {
        	Scanner input = new Scanner(System.in);
      		String tonesMenu = """
                ********************************
                
                input 1 for Ringing Tone
                input 2 for Ringing Volume
                input 3 for Incoming Call alert
                input 4 for Composer
                input 5 for Message alert tone
                input 6 for Keypad tones
                input 7 for Warning and game tones
                input 8 for Vibrating alert
                input 9 for Screen saver
                input 0 to go back to Main menu

                ********************************
                What do you want to do?

                """;
        	System.out.print(tonesMenu);
        	int tonesOptions = input.nextInt();
        	switch (tonesOptions) {
           		case 1 : System.out.println("Ringing Tone"); break;
            		case 2 : System.out.println("Ringing Volume"); break;
            		case 3 : System.out.println("Incoming Call alert"); break;
            		case 4 : System.out.println("Composer"); break;
            		case 5 : System.out.println("Message alert tone"); break;
            		case 6 : System.out.println("Keypad tones"); break;
            		case 7 : System.out.println("Warning and game tones"); break;
            		case 8 : System.out.println("Vibrating alert"); break;
            		case 9 : System.out.println("Screen saver"); break;
            		case 0 : mainMenu(); break;
            		default : System.out.println("This menu does not exist"); break;
        				}
   	}

   	public static void clockMenu() {
        	Scanner input = new Scanner(System.in);
        	String clockMenu = """
                ********************************
                
                input 1 for Alarm Clock
                input 2 for Clock Settings
                input 3 for Date Setting
                input 4 for Stopwatch
                input 5 for Countdown timer
                input 6 for Auto update of date and time
                input 0 to go back to Main menu

                ********************************
                What do you want to do?

                """;
        	System.out.print(clockMenu);
        	int clockOptions = input.nextInt();
        	switch (clockOptions) {
           		case 1 : System.out.println("Alarm Clock"); break;
            		case 2 : System.out.println("Clock Settings"); break;
            		case 3 : System.out.println("Date Setting"); break;
            		case 4 : System.out.println("Stopwatch"); break;
            		case 5 : System.out.println("Countdown timer"); break;
            		case 6 : System.out.println("Auto update of date and time"); break;
            		case 0 : mainMenu(); break;
            		default : System.out.println("This menu does not exist"); break;
       					}
   	}

   	public static void settingsMenu() {
        	Scanner input = new Scanner(System.in);
        	String settingsMenu = """
                ********************************
                
                input 1 for Call Settings
                input 2 for Phone Settings
                input 3 for Security Settings
                input 4 for Restore Factory Settings
                input 0 to go back to Main menu

                ********************************
                What do you want to do?

                """;
        	System.out.print(settingsMenu);
        	int settings = input.nextInt();
        	switch (settings) {
            		case 1 : callSettingsMenu(); break;
            		case 2 : phoneSettingsMenu(); break;
            		case 3 : securitySettingsMenu(); break;
            		case 4 : System.out.println("Restore Factory Settings"); break;
            		case 0 : mainMenu(); break;
            		default : System.out.println("This menu does not exist"); break;
        			}
    	}

    	public static void optionsMenu() {
        	Scanner input = new Scanner(System.in);
        	String optionsMenu = """
                ********************************
                
                input 1 for Type of View
                input 2 for Memory Status
                input 0 to go back to Phonebook menu

                ********************************
                What do you want to do?

                """;
        	System.out.print(optionsMenu);
        	int options = input.nextInt();
       		switch (options) {
           		case 1 : System.out.println("Type of View"); break;
            		case 2 : System.out.println("Memory Status"); break;
            		case 0 : phoneBookMenu(); break;
            		default : System.out.println("This menu does not exist"); break;
        			}
    	}

    	public static void messageSettingsMenu() {
        	Scanner input = new Scanner(System.in);
       		String messageSettingsMenu = """
                ********************************
                
                input 1 for Set 1
                input 2 for Common
                input 0 to go back to Message menu

                ********************************
                What do you want to do?

                """;
       		System.out.print(messageSettingsMenu);
       		int messageSettings = input.nextInt();
        	switch (messageSettings) {
            		case 1 : setMenu(); break;
            		case 2 : commonMenu(); break;
            		case 0 : messagesMenu(); break;
            		default : System.out.println("This menu does not exist"); break;
        				}
   	}

	public static void setMenu() {
        	Scanner input = new Scanner(System.in);
     		String set1Menu = """
                ********************************
                
                input 1 for Call Cost Limit
                input 2 for Show Costs in
                input 0 to go back to Message Settings menu

                ********************************
                What do you want to do?

                """;
        	System.out.print(set1Menu);
        	int set = input.nextInt();
        	switch (set) {
            		case 1 : System.out.println("Message Centre Number"); break;
            		case 2 : System.out.println("Messages sent as"); break;
	    		case 3 : System.out.println("Message Validity"); break;
            		case 0 : messageSettingsMenu(); break;
            		default : System.out.println("This menu does not exist"); break;
        		}
   	}

    	public static void commonMenu() {
        	Scanner input = new Scanner(System.in);
        	String common3Menu = """
                ********************************
                
                input 1 for Delivery Reports
                input 2 for Reply via Same Centre
		input 3 for Character Support
                input 0 to go back Message Settings menu

                ********************************
                What do you want to do?

                """;
        	System.out.print(common3Menu);
        	int common = input.nextInt();
        	switch (common) {
           		case 1 : System.out.println("Delivery Reports"); break;
            		case 2 : System.out.println("Reply via Same Centre"); break;
	    		case 3 : System.out.println("Character Support"); break;
            		case 0 : messageSettingsMenu(); break;
		        default : System.out.println("This menu does not exist"); break;
        			}
    	}

    	public static void showCallDurationMenu() {
        	Scanner input = new Scanner(System.in);
        	String showCallDurationMenu = """
                ********************************
                
                input 1 for Last Call Duration
                input 2 for All Calls' Duration
                input 3 for Received Calls' Duration
                input 4 for Dialled Calls' Duration
                input 5 for Clear Timers
                input 0 to go back to Call Register menu

                ********************************
                What do you want to do?

                """;
        	System.out.print(showCallDurationMenu);
       		int callDuration = input.nextInt();
       		switch (callDuration) {
            		case 1 : System.out.println("Last Call Duration"); break;
            		case 2 : System.out.println("All Calls' Duration"); break;
            		case 3 : System.out.println("Received Calls' Duration"); break;
            		case 4 : System.out.println("Dialled Calls' Duration"); break;
            		case 5 : System.out.println("Clear Timers"); break;
            		case 0 : callRegisterMenu();  
            		default : System.out.println("This menu does not exist"); break;
        				}
    	}

	public static void showCallCostsMenu() {
        	Scanner input = new Scanner(System.in);
        	String showCallCostsMenu = """
                ********************************
                
                input 1 for Last Call Cost
                input 2 for All Calls' Cost
                input 3 for Clear Counters
                input 0 to go back to Call Register menu

                ********************************
                What do you want to do?

                """;
        	System.out.print(showCallCostsMenu);
        	int callCosts = input.nextInt();
        	switch (callCosts) {
            		case 1 : System.out.println("Last Call Cost"); break;
            		case 2 : System.out.println("All Calls' Cost"); break;
            		case 3 : System.out.println("Clear Counters"); break;
            		case 0 : callRegisterMenu(); break;
            		default : System.out.println("This menu does not exist"); break;
        			}
    	}

    	public static void callCostSettingsMenu() {
        	Scanner input = new Scanner(System.in);
        	String callCostSettingsMenu = """
                ********************************
                
                input 1 for Call Cost Limit
                input 2 for Show Costs in
                input 0 to go back to Call Register menu

                ********************************
                What do you want to do?

                """;
        	System.out.print(callCostSettingsMenu);
        	int callCostSettings = input.nextInt();
        	switch (callCostSettings) {
           		case 1 : System.out.println("Call Cost Limit"); break;
            		case 2 : System.out.println("Show Costs in"); break;
            		case 0 : callRegisterMenu(); break;
            		default : System.out.println("This menu does not exist"); break;
        				}
    	}

    	public static void callSettingsMenu() {
        	Scanner input = new Scanner(System.in);
        	String callSettingsMenu = """
                ********************************
                
                input 1 for Automatic Redial
                input 2 for Speed Dialling
                input 3 for Call Waiting Options
                input 4 for Own Number Sending
                input 5 for Phone Line in Use
                input 6 for Automatic Answer
                input 0 to go back to Settings menu

                ********************************
                What do you want to do?

                """;
       		System.out.print(callSettingsMenu);
        	int callSettings = input.nextInt();
        	switch (callSettings) {
            		case 1 : System.out.println("Automatic Redial"); break;
            		case 2 : System.out.println("Speed Dialling"); break;
            		case 3 : System.out.println("Call Waiting Options"); break;
           		case 4 : System.out.println("Own Number Sending"); break;
            		case 5 : System.out.println("Phone Line in Use"); break;
            		case 6 : System.out.println("Automatic Answer"); break;
            		case 0 : settingsMenu(); break;
            		default : System.out.println("This menu does not exist"); break;
        				}
    	}

    	public static void phoneSettingsMenu() {
        	Scanner input = new Scanner(System.in);
        	String phoneSettingsMenu = """
                ********************************
                
                input 1 for Language
                input 2 for Cell Info Display
                input 3 for Welcome Note
                input 4 for Network Selection
                input 5 for Lights
                input 6 for Confirm SIM Service Actions
                input 0 to go back to Settings menu

                ********************************
                What do you want to do?

                """;
        	System.out.print(phoneSettingsMenu);
        	int phoneSettings = input.nextInt();
        	switch (phoneSettings) {
            		case 1 : System.out.println("Language"); break;
            		case 2 : System.out.println("Cell Info Display"); break;
            		case 3 : System.out.println("Welcome Note"); break;
            		case 4 : System.out.println("Network Selection"); break;
            		case 5 : System.out.println("Lights"); break;
            		case 6 : System.out.println("Confirm SIM Service Actions"); break;
            		case 0 : settingsMenu(); break;
 		        default : System.out.println("This menu does not exist"); break;
        				}
    	}

    public static void securitySettingsMenu() {
        	Scanner input = new Scanner(System.in);
        	String securitySettingsMenu = """
                ********************************
                
                input 1 for PIN Code Request
                input 2 for Call Barring Service
                input 3 for Fixed Dialling
                input 4 for Closed User Group
                input 5 for Phone Security
                input 6 for Change Access Codes
                input 0 to go back to Settings menu

                ********************************
                What do you want to do?

                """;
        	System.out.print(securitySettingsMenu);
        	int securitySettings = input.nextInt();
        	switch (securitySettings) {
            		case 1 : System.out.println("PIN Code Request"); break;
            		case 2 : System.out.println("Call Barring Service"); break;
            		case 3 : System.out.println("Fixed Dialling"); break;
            		case 4 : System.out.println("Closed User Group"); break;
            		case 5 : System.out.println("Phone Security"); break;
            		case 6 : System.out.println("Change Access Codes"); break;
            		case 0 : settingsMenu(); break;
            		default : System.out.println("This menu does not exist"); break;
        				}
    	}

}