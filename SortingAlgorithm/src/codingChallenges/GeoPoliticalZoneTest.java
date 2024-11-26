package codingChallenges;

import codingChallenges.GeoPoliticalZone;
import java.util.Scanner;

public class GeoPoliticalZoneTest {

//    public static String main(String[] args) {
//
////        Scanner input = new Scanner(System.in);
////
////
////        String comparison = "Taraba";
////

        public static String checkGeoPolZone(String stateToCheck){
            String expected = "Unknown State";
            for (GeoPoliticalZone state : GeoPoliticalZone.values() ) {
                for (String result : state.getStates()) {
                    if (result.equalsIgnoreCase(stateToCheck)) {
                        expected = state.name();
                        return expected;
                    }
                }

            }

            return expected;
        }
//            String actual = "NORTHEAST";
//        System.out.println(expected);





//    public static String checkGeoPolZone(String stateToCheck) {
//        return null;
//    }
}
