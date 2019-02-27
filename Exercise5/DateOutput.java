public class DateOutput {
	private static final int YEAR_DIVIDER = 10000;
	private static final int MONTH_DIVIDER = 100;
	private static final int DAY_DIVIDER = 100;

	private DateOutput() {

	}

	public static void dateOutput(int date) {
		int day, month, year;

		year = date % YEAR_DIVIDER;
		date /= YEAR_DIVIDER;

		month = date % MONTH_DIVIDER;
		date /= MONTH_DIVIDER;

		day = date % DAY_DIVIDER;
		date /= DAY_DIVIDER;

		System.out.println("d:" + day + "|m:" + month + "|y:" + year);
	}

}