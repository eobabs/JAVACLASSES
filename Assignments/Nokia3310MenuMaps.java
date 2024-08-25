import java.util.Scanner;

public class Nokia3310MenuMaps{

	public static void main(String... nokia){
	

	String introduction = """

NOKIA 3310 MENU MAP
Let us help you learn about your new Nokia phone. The menu map you see will take you through the main menu functions in the order they appear on your phone.

We've included visuals of the 13 menu functions and they are numbered 1-13 so you can see the sequence at a glance. And right next to each menu function screen we've listed the special features in your Nokia phone, also in order of appearance so they'll be easy to find.

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

	Scanner input = new Scanner (System.in);
	int menuOptions = input.nextInt();


	switch (menuOptions){
		case 3 : System.out.print("Chat"); break;
		case 7 : System.out.print("Call Divert"); break;
		case 8 : System.out.print("Games"); break;
		case 9 : System.out.print("Calculator"); break;
		case 10 : System.out.print("Reminders"); break;
		case 12 : System.out.print("Profiles"); break;
		case 13 : System.out.print("SIM Services"); break;
		
		case 11 : System.out.print("Clock"); 
		String clockMenu = """

********************************
	
input 1 for Alarm Clock
input 2 for Clock Settings
input 3 for Date Setting
input 4 for Stopwatch
input 5 for Countdown timer
input 6 for Auto update of date and time

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
						} break;

		case 5 : System.out.print("Tones"); 
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
						} break;


		case 1 : System.out.println("Phone Book"); 
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
			case 8 : System.out.println("Options"); 
		String optionsMenu = """

********************************
	
input 1 for Type of View
input 2 for Memory Status

********************************
What do you want to do?

""";
	System.out.print(optionsMenu);
				int options = input.nextInt();
				switch (options) {
					case 1 : System.out.println("Type of View"); break;
					case 2 : System.out.println("Memory Status"); break;
					default : System.out.println("This menu does not exist"); 
					} break;	
			case 9 : System.out.println("Speed Dials"); break;
			case 10 : System.out.println("Voice Tags"); break;
						} break;


		case 2 : System.out.println("Messages"); 
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
			case 7 : System.out.println("Message Settings"); 
		String messageSettingsMenu = """

********************************
	
input 1 for Set
input 2 for Common

********************************
What do you want to do?

""";
	System.out.print(messageSettingsMenu);
				int optionsMessageSettings = input.nextInt();
				switch (optionsMessageSettings) {
					case 1 : System.out.println("Set"); 
		String setMenu = """

********************************
	
input 1 for Message Centre Number
input 2 for Message Sent As
input 3 for Message Validity

********************************
What do you want to do?

""";
	System.out.print(setMenu);
						int optionsSet = input.nextInt();
						switch (optionsSet) {
							case 1 : System.out.println("Message Centre Number"); break;
							case 2 : System.out.println("Message Sent As"); break;
							case 3 : System.out.println("Message Validity"); break;
							default : System.out.println("This menu does not exist"); break;
								} break;
					case 2 : System.out.println("Common"); 
		String commonMenu = """

********************************
	
input 1 for Delivery Reports
input 2 for Reply via Same Centre
input 3 for Character Support

********************************
What do you want to do?

""";
	System.out.print(commonMenu);
						int optionsCommon = input.nextInt();
						switch (optionsCommon) {
							case 1 : System.out.println("Delivery Reports "); break;
							case 2 : System.out.println("Reply via Same Centre"); break;
							case 3 : System.out.println("Character Support"); break;
							default : System.out.println("This menu does not exist"); break;
								} break;
								} break;
			case 8 : System.out.println("Info Service"); break;
			case 9 : System.out.println("Voice Mailbox Number"); break;
			case 10 : System.out.println("Service Command Editor"); break;
					
						} break;




		case 4 : System.out.print("Call Register"); 
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
			case 8 : System.out.println("Prepaid Credit"); break;

			case 5 : System.out.println("Show Call duration");
		String showCallDurationMenu = """

********************************
	
input 1 for Last Call Duration
input 2 for All Calls' Duration
input 3 for Dialled Calls' Duration
input 4 for Dialled Calls' Duration
input 5 for Clear Timers

********************************
What do you want to do?

""";
	System.out.print(showCallDurationMenu);
				int showCallDuration = input.nextInt();
				switch (showCallDuration) {
					case 1 : System.out.println("Last Call Duration"); break;
					case 2 : System.out.println("All Calls' Duration"); break;
					case 3 : System.out.println("Received Calls' Duration"); break;
					case 4 : System.out.println("Dialled Calls' Duration"); break;
					case 5 : System.out.println("Clear Timers"); break;
					default : System.out.println("This menu does not exist"); 
					} break;


			case 6 : System.out.println("Show Call costs"); 
		String showCallCostsMenu = """

********************************
	
input 1 for Last Call Cost
input 2 for All Calls' Costs
input 3 for Clear Counters

********************************
What do you want to do?

""";
	System.out.print(showCallCostsMenu);
				int showCallCosts = input.nextInt();
				switch (showCallCosts) {
					case 1 : System.out.println("Last Call Cost"); break;
					case 2 : System.out.println("All Calls' Costs"); break;
					case 3 : System.out.println("Clear Counters"); break;
					default : System.out.println("This menu does not exist"); 
					} break;

			case 7 : System.out.println("Call Cost settings"); 

		String callCostSettingsMenu = """

********************************
	
input 1 for Call Cost limit
input 2 for Show Costs in

********************************
What do you want to do?

""";
	System.out.print(callCostSettingsMenu);
				int callCostSettings = input.nextInt();
				switch (callCostSettings) {
					case 1 : System.out.println("Call Cost limit"); break;
					case 2 : System.out.println("Show Costs in"); break;
					default : System.out.println("This menu does not exist"); 
					} break;	

						} break;

		case 6 : System.out.print("Settings");
		String settingsMenu = """

********************************
	
input 1 for Call Settings
input 2 for Phone Settings
input 3 for Security Settings
input 4 for Restore Factory Settings

********************************
What do you want to do?

""";
	System.out.print(settingsMenu);
			int settings = input.nextInt();
			switch (settings) {
			case 4 : System.out.println("Restore Factory Settings"); break;

			case 1 : System.out.println("Call Settings"); 
		String callSettingsMenu = """

********************************
	
input 1 for Automatic Redial
input 2 for Speed Dialling
input 3 for Call waiting options
input 4 for Own number sending
input 5 for Phone line in use
input 6 for Automatic Answer

********************************
What do you want to do?

""";
	System.out.print(callSettingsMenu);
				int callSettings = input.nextInt();
				switch (callSettings) {
					case 1 : System.out.println("Automatic Redial"); break;
					case 2 : System.out.println("Speed Dialling"); break;
					case 3 : System.out.println("Call waiting options"); break;
					case 4 : System.out.println("Own number sending"); break;
					case 5 : System.out.println("Phone line in use"); break;
					case 6 : System.out.println("Automatic Answer"); break;
					default : System.out.println("This menu does not exist"); 
					} break;			


			case 2 : System.out.println("Phone Settings"); 
		String phoneSettingsMenu = """

********************************
	
input 1 for Langauge
input 2 for Cell Info Display
input 3 for Welcome Note
input 4 for Network Selection
input 5 for Lights
input 6 for Confirm SIM service actions

********************************
What do you want to do?

""";
	System.out.print(phoneSettingsMenu);
				int phoneSettings = input.nextInt();
				switch (phoneSettings) {
					case 1 : System.out.println("Langauge"); break;
					case 2 : System.out.println("Cell Info Display"); break;
					case 3 : System.out.println("Welcome Note"); break;
					case 4 : System.out.println("Network Selection"); break;
					case 5 : System.out.println("Lights"); break;
					case 6 : System.out.println("Confirm SIM service actions"); break;
					default : System.out.println("This menu does not exist"); 
					} break;

			case 3 : System.out.println("Security Settings");			 
		String securitySettingsMenu = """

********************************
	
input 1 for PIN Code Request
input 2 for Call barring service
input 3 for Fixed Dialling
input 4 for Closed user group
input 5 for Phone security
input 6 for Change access codes

********************************
What do you want to do?

""";
	System.out.print(securitySettingsMenu);
				int securitySettings = input.nextInt();
				switch (securitySettings) {
					case 1 : System.out.println("PIN Code Request"); break;
					case 2 : System.out.println("Call barring service"); break;
					case 3 : System.out.println("Fixed Dialling"); break;
					case 4 : System.out.println("Closed user group"); break;
					case 5 : System.out.println("Phone security"); break;
					case 6 : System.out.println("Change access codes"); break;
					default : System.out.println("This menu does not exist"); 
					} break;				

						} break;

		default : System.out.print("This number is invalid. Thank you"); break;

		}

		System.out.println("\nThank you for using this service\nNOKIA... connecting people."); 


	}

}