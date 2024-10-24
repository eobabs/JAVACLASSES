import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class MenstrualCycleTrackerTest {

	@Test
	public void testCalculateMillisecondsSince1970() {
		long result = MenstrualCycleTracker.calculateMillisecondsSince1970(2023, 9, 1);
		assertEquals(1696118400000L, result);
	}

	@Test
	public void testCalculateNextPeriod() {
		long lastPeriodDate = MenstrualCycleTracker.calculateMillisecondsSince1970(2023, 9, 1);
		long nextPeriodDate = MenstrualCycleTracker.calculateNextPeriod(lastPeriodDate, 28);
		assertEquals(lastPeriodDate + (28 * 24 * 60 * 60 * 1000L), nextPeriodDate);
	}

	@Test
	public void testCalculateOvulationDate() {
		long lastPeriodDate = MenstrualCycleTracker.calculateMillisecondsSince1970(2023, 9, 1);
		long ovulationDate = MenstrualCycleTracker.calculateOvulationDate(lastPeriodDate, 28);
		assertEquals(lastPeriodDate + ((28 - 14) * 24 * 60 * 60 * 1000L), ovulationDate);
	}

	@Test
	public void testCalculateSafePeriods() {
		long nextPeriodDate = MenstrualCycleTracker.calculateMillisecondsSince1970(2023, 10, 1);
		long[] safePeriods = MenstrualCycleTracker.calculateSafePeriods(nextPeriodDate, 5, 28);
		assertEquals(nextPeriodDate + (5 * 24 * 60 * 60 * 1000L), safePeriods[0]);
		assertEquals(nextPeriodDate + ((28 - 5) * 24 * 60 * 60 * 1000L), safePeriods[1]);
	}

	@Test
	public void testGetDateFormat() {
		long millis = 1696118400000L;
		String formattedDate = MenstrualCycleTracker.getDateformat(millis);
		assertEquals("2023-10-01", formattedDate);
	}

	@Test
	public void testIsLeapYear() {
		assertTrue(MenstrualCycleTracker.isLeapYear(2020));
		assertFalse(MenstrualCycleTracker.isLeapYear(2021));
		assertTrue(MenstrualCycleTracker.isLeapYear(2000));
		assertFalse(MenstrualCycleTracker.isLeapYear(1900));
	}
}
