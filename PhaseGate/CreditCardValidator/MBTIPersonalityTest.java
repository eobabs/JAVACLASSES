import java.util.Scanner;

public class MBTIPersonalityTest {


    public static void main(String[] args) {


    String[] questions = {
        "1. You feel energized after socializing with a large group. ",
        "2. You prefer to have a detailed schedule for your activities. ",
        "3. You often follow your instincts when making choices. ",
        "4. You are comfortable meeting new people. ",
        "5. You enjoy having a set routine for your day. ",
        "6. You typically rely on data and facts in decision-making. ",
        "7. You feel more productive when working independently. ",
        "8. You enjoy exploring new hobbies or activities. ",
        "9. You find social gatherings tiring. ",
        "10. You prefer to keep options open instead of committing. ",
        "11. You like to complete projects ahead of schedule. ",
        "12. You trust tried-and-true methods over experimental ones. ",
        "13. You enjoy engaging in deep, meaningful conversations. ",
        "14. You find it easy to introduce yourself to strangers. ",
        "15. You value practical information over theoretical concepts. ",
        "16. You pay attention to the finer details in your work. ",
        "17. You think carefully before making decisions. ",
        "18. You like collaborating with others on projects. ",
        "19. You often feel overwhelmed when faced with too many options. ",
        "20. You feel accomplished when you reach a goal. "
    };

        Scanner mbti = new Scanner(System.in);
        int[] scores = new int[4];

        for (int index = 0; index < questions.length; index++) {
            String answer = "";
            while (!answer.equals("A") && !answer.equals("B")) {
                System.out.println(questions[index]);
                answer = mbti.next();
            }

            if (index == 0 || index == 3 || index == 7 || index == 17) {
                if (answer.equals("A")) {
                    scores[0]++;
                }
            }
            if (index == 1 || index == 4 || index == 9 || index == 10) {
                if (answer.equals("B")) {
                    scores[1]++;
                }
            }
            if (index == 2 || index == 5 || index == 12 || index == 18) {
                if (answer.equals("A")) {
                    scores[2]++;
                }
            }
            if (index == 6 || index == 11 || index == 13 || index == 14) {
                if (answer.equals("B")) {
                    scores[3]++;
                }
            }
        }

        String mbtiType = "";
        if (scores[0] > 2) {
            mbtiType += "E";
        } else {
            mbtiType += "I";
        }
        if (scores[1] > 2) {
            mbtiType += "S";
        } else {
            mbtiType += "N";
        }
        if (scores[2] > 2) {
            mbtiType += "F";
        } else {
            mbtiType += "T";
        }
        if (scores[3] > 2) {
            mbtiType += "J";
        } else {
            mbtiType += "P";
        }

        System.out.println("Your MBTI type is: " + mbtiType);
        displayPersonalityTraits(mbtiType);


    }

	public static void displayPersonalityTraits(String personality) {
        	switch (personality) {
            	case "ENFJ":
                System.out.println("ENFJ: The Protagonist - Charismatic and inspiring leaders.");
                break;
            case "ENTJ":
                System.out.println("ENTJ: The Commander - Bold, imaginative, and strong-willed leaders.");
                break;
            case "INFP":
                System.out.println("INFP: The Mediator - Idealistic and loyal to their values.");
                break;
            case "INTJ":
                System.out.println("INTJ: The Architect - Innovative and strategic thinkers.");
                break;
            case "ESFJ":
                System.out.println("ESFJ: The Consul - Caring and social, with a strong sense of duty.");
                break;
            case "ESTJ":
                System.out.println("ESTJ: The Executive - Organized and driven, with a focus on results.");
                break;
            case "ISFP":
                System.out.println("ISFP: The Adventurer - Creative and spontaneous, valuing freedom.");
                break;
            case "ISTP":
                System.out.println("ISTP: The Virtuoso - Practical and efficient, with a focus on solutions.");
                break;
            case "ENFP":
                System.out.println("ENFP: The Campaigner - Enthusiastic and creative, with a strong sense of possibility.");
                break;
            case "ENTP":
                System.out.println("ENTP: The Debater - Quick-witted and clever, enjoying the challenge of ideas.");
                break;
            case "INTP":
                System.out.println("INTP: The Logician - Analytical and curious, valuing logic and independence.");
                break;
            case "ISFJ":
                System.out.println("ISFJ: The Defender - Warm and conscientious, with a strong sense of duty.");
                break;
            case "ISTJ":
                System.out.println("ISTJ: The Logistician - Responsible and organized, valuing tradition and loyalty.");
                break;
            case "ESFP":
                System.out.println("ESFP: The Entertainer - Outgoing and spontaneous, enjoying life in the moment.");
                break;
            case "ESTP":
                System.out.println("ESTP: The Entrepreneur - Bold and perceptive, taking action to make things happen.");
                break;
            case "INFJ":
                System.out.println("INFJ: The Advocate - Insightful and principled, driven by their values.");
                break;
            default:
                System.out.println("Your personality type is not recognized.");
                break;
        }
    }
}
