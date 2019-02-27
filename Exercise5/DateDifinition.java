final class DateDifinition {

	private static final int MAX_DAY_THIRTY = 30;
	private static final int MAX_DAY_THIRTYONE = 31;
	private static final int MAX_DAY_FEB_LEAP = 29;
	private static final int MAX_DAY_FEB_NONLEAP = 28;

	private static int maxDayFinder(int month, int year) {
		int maxDays;
		if (month <= 7) {

			if (month % 2 == 1) {
				maxDays = MAX_DAY_THIRTYONE;
			} else {

				if (month == 2) {
					if (((year % 4 == 0) && !(year % 100 == 0)) || (year % 400 == 0)) {
						maxDays = MAX_DAY_FEB_LEAP;
					}

					else {
						maxDays = MAX_DAY_FEB_NONLEAP;
					}
				} else {
					maxDays = MAX_DAY_THIRTY;
				}
			}

		} else {

			if (month % 2 == 0) {
				maxDays = MAX_DAY_THIRTYONE;
			} else {
				maxDays = MAX_DAY_THIRTY;
			}

		}

		return maxDays;
	}

	public static int nextDayDateFinder(int day, int month, int year) {
		int maxDay = maxDayFinder(month, year);

		int newDay = day;
		int newMonth = month;
		int newYear = year;

		if (newDay == maxDay) {
			newDay = 1;

			if (month == 12) {
				newMonth = 1;
				newYear++;
			} else {
				newMonth++;
			}
		} else {
			newDay = ++day;
		}

		return date(newDay, newMonth, newYear);
	}

	private static int date(int day, int month, int year) {

		int date = year;
		date += month * 10000;
		date += day * 1000000;
		return date;
	}

}