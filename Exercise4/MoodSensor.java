final class MoodSensor {
	
	private static final int LOWER_RANGE = 1;
	private static final int UPPER_RANGE = 5;
	private static final String[] FACES = { ":)", ":(", ">:", ":|"};
	
	static int generationOfRandomNum() {
		
		int randomNum;
		
		randomNum = (int) ((Math.random() * (UPPER_RANGE - LOWER_RANGE)) + LOWER_RANGE);
		
		return randomNum;
		
	}
	
	static String moodDefinition(int randomNum) {
		
		String mood = "";
		
		switch(randomNum) {
				
				case 1: 
					mood = FACES[0];
					break;
				case 2:
					mood = FACES[1];
					break;
				case 3: 
					mood = FACES[2];
					break;
				case 4:
					mood = FACES[3];
					break;
				
				}
		
		return mood;
	}

}
