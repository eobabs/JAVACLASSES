import java.util.Scanner;

public class MBTIPersonalityTest {

	public static void main(String[] args) {
		Scanner mbti = new Scanner(System.in);	

		String[][] questions = {
				{" A. Expend energy, enjoy groups"," B. Conserve energy, enjoy one-on-one"},
				{" A. Interpret literally"," B. look for meaning and possibilities"},
				{" A. logical, thinking, questioning"," B. empathetic, feeling, accommodating"},
				{" A. organized, orderly"," B. flexible, adoptable"},
				{" A. more outgoing, think out loud"," B. more reserved, think to yourself"},
				{" A. practical, realistic, experiential"," B. imaginative, innovative, theoretical"},
				{" A. candid, straight forward, frank"," B. tactful, kind, encouraging"},
				{" A. plan, schedule"," B. unplanned, spontaneous"},
				{" A. seek many tasks, public activities, interaction with others"," B. seek private, solitary activities with quiet to concentrate"},
				{" A. standard, usual, conventional"," B. different, novel, unique"},
				{" A. firm, tend to criticize, hold the line"," B. gentle, tend to appreciate, conciliate"},
				{" A. regulated, structured"," B. easy going, live and let live"},
				{" A. external, communicative, express yourself"," B. internal, reticent, keep to yourself"},
				{" A. focus on here and now"," B. look to the future, global perspective, big picture"},
				{" A. tough-minded, just"," B. tender-hearted, merciful"},
				{" A. preparation, plan ahead"," B. go with the flow, adapt as you go"},
				{" A. active, initiate"," B. reflective, deliberate"},
				{" A. facts things what is"," B. ideas dreams, what would be, philosophical"},
				{" A. matter of fact issue-oriented"," B. sensitive, people-oriented, compassionate"},
				{" A. control, govern"," B. latitude, freedom"}
				};

		System.out.println("What is your name?");
		String name = mbti.nextLine();

		String mbtiType = extractTypeOne(questions) + extractTypeTwo(questions) + extractTypeThree(questions) + extractTypeFour(questions);

		System.out.println(name + "'s MBTI type is: " + mbtiType);
		displayPersonalityTraits(mbtiType);
	}

	public static String extractTypeOne(String[][] questions) {
		Scanner mbti = new Scanner(System.in);
		String[][] energyOrientation = new String[5][2];
		int indexTwo = 0;

		for (int index = 0; index < 20; index += 4) {
			energyOrientation[indexTwo][0] = questions[index][0];
			energyOrientation[indexTwo][1] = questions[index][1];
			indexTwo++;
		}

		int count = 0;
		for (int index = 0; index < 5; index++) {
			System.out.print(energyOrientation[index][0] + " " + energyOrientation[index][1] + "\nSelect A or B: ");
			String response;
			while (true) {
				response = mbti.next();
				if (response.equalsIgnoreCase("A") || response.equalsIgnoreCase("B")) {
					break; 
				} else {
					System.out.print("Invalid input. Please select A or B: ");
				}
			}
			if (response.equalsIgnoreCase("A")) count++;
		}

		System.out.println("The number of A selected is: " + count);
    		System.out.println("The number of B selected is: " + (5 - count));

		System.out.println();

		return (count > 2) ? "E" : "I";
	}

	public static String extractTypeTwo(String[][] questions) {
		Scanner mbti = new Scanner(System.in);
		String[][] informationProcessing = new String[5][2];
		int indexTwo = 0;

		for (int index = 1; index < 20; index += 4) {
			informationProcessing[indexTwo][0] = questions[index][0];
			informationProcessing[indexTwo][1] = questions[index][1];
			indexTwo++;
		}

		int count = 0;
		for (int index = 0; index < 5; index++) {
			System.out.print(informationProcessing[index][0] + " " + informationProcessing[index][1] + "\nSelect A or B: ");
			String response;
			while (true) {
				response = mbti.next();
				if (response.equalsIgnoreCase("A") || response.equalsIgnoreCase("B")) {
					break; 
				} else {
					System.out.print("Invalid input. Please select A or B: ");
				}
			}
			if (response.equalsIgnoreCase("A")) count++;
		}

		System.out.println("The number of A selected is: " + count);
    		System.out.println("The number of B selected is: " + (5 - count));

		System.out.println();

		return (count > 2) ? "S" : "N";
	}

	public static String extractTypeThree(String[][] questions) {
		Scanner mbti = new Scanner(System.in);
		String[][] decisionMaking = new String[5][2];
		int indexTwo = 0;

		for (int index = 2; index < 20; index += 4) {
			decisionMaking[indexTwo][0] = questions[index][0];
			decisionMaking[indexTwo][1] = questions[index][1];
			indexTwo++;
		}

		int count = 0;
		for (int index = 0; index < 5; index++) {
			System.out.print(decisionMaking[index][0] + " " + decisionMaking[index][1] + "\nSelect A or B: ");
			String response;
			while (true) {
				response = mbti.next();
				if (response.equalsIgnoreCase("A") || response.equalsIgnoreCase("B")) {
					break; 
				} else {
					System.out.print("Invalid input. Please select A or B: ");
				}
			}
			if (response.equalsIgnoreCase("A")) count++;
		}

		System.out.println("The number of A selected is: " + count);
    		System.out.println("The number of B selected is: " + (5 - count));

		System.out.println();

		return (count > 2) ? "T" : "F";
	}

	public static String extractTypeFour(String[][] questions) {
		Scanner mbti = new Scanner(System.in);
		String[][] lifestyleOrientation = new String[5][2];
		int indexTwo = 0;

		for (int index = 3; index < 20; index += 4) {
			lifestyleOrientation[indexTwo][0] = questions[index][0];
			lifestyleOrientation[indexTwo][1] = questions[index][1];
			indexTwo++;
		}

		int count = 0;
		for (int index = 0; index < 5; index++) {
			System.out.print(lifestyleOrientation[index][0] + " " + lifestyleOrientation[index][1] + "\nSelect A or B: ");
			String response;
			while (true) {
				response = mbti.next();
				if (response.equalsIgnoreCase("A") || response.equalsIgnoreCase("B")) {
					break; 
				} else {
					System.out.print("Invalid input. Please select A or B: ");
				}
			}
			if (response.equalsIgnoreCase("A")) count++;
		}

		System.out.println("The number of A selected is: " + count);
    		System.out.println("The number of B selected is: " + (5 - count));

		System.out.println();

		return (count > 2) ? "J" : "P";
	}

	public static void displayPersonalityTraits(String personality) {
		switch (personality) {
			case "ENFJ":
				System.out.println("ENFJ (Protagonist) is a personality type with the Extroverted, Intuitive, Feeling, and Judging traits. They are charismatic and inspiring leaders, often driven to help others realize their potential.");
				break;
			case "ENTJ":
				System.out.println("ENTJ (Commander) is a personality type with the Extroverted, Intuitive, Thinking, and Judging traits. Bold and imaginative, they are strong-willed leaders who enjoy organizing and directing people and projects.");
				break;
			case "INFP":
				System.out.println("INFP (Mediator) is a personality type with the Introverted, Intuitive, Feeling, and Prospecting traits. Idealistic and loyal to their values, they are driven by their beliefs and desire to make the world a better place.");
				break;
			case "INTJ":
				System.out.println("INTJ (Architect) is a personality type with the Introverted, Intuitive, Thinking, and Judging traits. These thoughtful tacticians love perfecting the details of life, applying creativity and rationality to everything they do. Their inner world is often a private, complex one.");
				break;
			case "ESFJ":
				System.out.println("ESFJ (Consul) is a personality type with the Extroverted, Sensing, Feeling, and Judging traits. Caring and social, they have a strong sense of duty and are eager to help others.");
				break;
			case "ESTJ":
				System.out.println("ESTJ (Executive) is a personality type with the Extroverted, Sensing, Thinking, and Judging traits. Organized and driven, they focus on results and managing tasks efficiently.");
				break;
			case "ISFP":
				System.out.println("ISFP (Adventurer) is a personality type with the Introverted, Sensing, Feeling, and Prospecting traits. Creative and spontaneous, they value freedom and often express themselves through art and other forms of creativity.");
				break;
			case "ISTP":
				System.out.println("ISTP (Virtuoso) is a personality type with the Introverted, Sensing, Thinking, and Prospecting traits. They tend to have an individualistic mindset, pursuing goals without needing much external connection. They engage in life with inquisitiveness and personal skill, varying their approach as needed.");
				break;
			case "ENFP":
				System.out.println("ENFP (Campaigner) is a personality type with the Extroverted, Intuitive, Feeling, and Prospecting traits. Enthusiastic and creative, they have a strong sense of possibility and are driven by their values and ideas.");
				break;
			case "ENTP":
				System.out.println("ENTP (Debater) is a personality type with the Extroverted, Intuitive, Thinking, and Prospecting traits. Quick-witted and clever, they enjoy the challenge of ideas and often think outside the box.");
				break;
			case "INTP":
				System.out.println("INTP (Logician) is a personality type with the Introverted, Intuitive, Thinking, and Prospecting traits. These flexible thinkers enjoy taking an unconventional approach to many aspects of life. They often seek out unlikely paths, mixing willingness to experiment with personal creativity.");
				break;
			case "ISFJ":
				System.out.println("ISFJ (Defender) is a personality type with the Introverted, Sensing, Feeling, and Judging traits. Warm and conscientious, they have a strong sense of duty and take pride in their responsibilities.");
				break;
			case "ISTJ":
				System.out.println("ISTJ (Logistician) is a personality type with the Introverted, Sensing, Thinking, and Judging traits. These people tend to be reserved yet willful, with a rational outlook on life. They compose their actions carefully and carry them out with methodical purpose.");
				break;
			case "ESFP":
				System.out.println("ESFP (Entertainer) is a personality type with the Extroverted, Sensing, Feeling, and Prospecting traits. Outgoing and spontaneous, they enjoy life in the moment and often seek new experiences.");
				break;
			case "ESTP":
				System.out.println("ESTP (Entrepreneur) is a personality type with the Extroverted, Sensing, Thinking, and Prospecting traits. Bold and perceptive, they take action to make things happen and enjoy living on the edge.");
				break;
			case "INFJ":
				System.out.println("INFJ (Advocate) is a personality type with the Introverted, Intuitive, Feeling, and Judging traits. They tend to approach life with deep thoughtfulness and imagination. Their inner vision, personal values, and a quiet, principled version of humanism guide them in all things.");
				break;
			default:
				System.out.println("Your personality type is not recognized.");
				break;
		}
	}


}
