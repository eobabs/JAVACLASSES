package codingChallenges;

import org.junit.jupiter.api.Test;
import codingChallenges.GeoPoliticalZoneTest;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestGeoPoliticalZone {

    @Test
    public void testThatStateCanBeFound() {
        String stateToCheck = "TARABA";

        String expected = GeoPoliticalZoneTest.checkGeoPolZone(stateToCheck);

        String actual = "NORTHEAST";

        assertEquals(expected, actual );
    }

    @Test
    public void testForIncorrectEntry() {
        String stateToCheck = "Wakanda";

        String expected = GeoPoliticalZoneTest.checkGeoPolZone(stateToCheck);

        String actual = "Unknown State";

        assertEquals(expected, actual );
    }




}
