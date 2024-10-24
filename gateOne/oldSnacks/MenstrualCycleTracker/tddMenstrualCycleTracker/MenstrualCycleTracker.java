import java.util.Scanner;

public class MenstrualCycleTracker {



	public static long calculateMillisecondsSince1970(int year, int month, int day) {
		long daysSince1970 = (year - 1970) * 365 + (year - 1970) / 4 - (year - 1970) / 100 + (year - 1970) / 400;
		int[] daysInMonth;

		if (isLeapYear(year)) {
			daysInMonth = new int[]{0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		} else {
			daysInMonth = new int[]{0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		}

		for (int index = 1; index <= month; index++) {
			daysSince1970 += daysInMonth[index];
		}

		daysSince1970 += day - 1;
		
		return daysSince1970 * 24 * 60 * 60 * 1000L;
	}

	public static long calculateNextPeriod(long lastPeriodDate, int cycleLength) {
		return lastPeriodDate + (cycleLength * 24 * 60 * 60 * 1000L);
	}

	public static long calculateOvulationDate(long lastPeriodDate, int cycleLength) {
		return lastPeriodDate + ((cycleLength - 14) * 24 * 60 * 60 * 1000L);
	}

	public static long[] calculateSafePeriods(long nextPeriodDate, int periodDuration, int cycleLength) {
		long safeStart = nextPeriodDate + (periodDuration * 24 * 60 * 60 * 1000L);
		long safeEnd = nextPeriodDate + ((cycleLength - 5) * 24 * 60 * 60 * 1000L);
		return new long[]{safeStart, safeEnd};
	}

	public static String getDateformat(long milliseconds) {
		long totalSeconds = milliseconds / 1000;
		long currentSeconds = totalSeconds % 60;
		
		long totalMinutes = totalSeconds / 60;
		long currentMinutes = totalMinutes % 60;
		
		long totalHours = totalMinutes / 60;
		long currentHours = totalHours % 24;
		
		long totalDays = totalHours / 24;
		long year = 1970;

		while (totalDays >= (isLeapYear(year) ? 366 : 365)) {
			totalDays -= isLeapYear(year) ? 366 : 365;
			year++;
		}

		int month = 1;
		int[] daysInMonth;

		if (isLeapYear(year)) {
			daysInMonth = new int[]{0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		} else {
			daysInMonth = new int[]{0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		}

		while (totalDays >= daysInMonth[month]) {
			totalDays -= daysInMonth[month];
			month++;
		}

		int day = (int) totalDays + 1;

		String formattedDate = year + "-";
		if (month < 10) {
			formattedDate += "0";
		}
		formattedDate += month + "-";
		if (day < 10) {
			formattedDate += "0";
		}
		formattedDate += day;

		return formattedDate;
	}

	public static boolean isLeapYear(long year) {
		return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
	}
}
