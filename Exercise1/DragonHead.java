public class DragonHead {
	
	private static final int LOWER_RANGE = 200;
	private static final int UPPER_RANGE = 300;
	private static final int FIRST_HEADS_MULTIPLIER = 3;
	private static final int SECOND_HEADS_MULTIPLIER = 2;
	private static final int DRAGON_EYES = 2;
	
	static int getNumOfHeads(int age) {
		int heads;
		
		if(age < LOWER_RANGE) {
			heads = age * FIRST_HEADS_MULTIPLIER; 
		} else if(age < UPPER_RANGE) {
			
			heads = age * SECOND_HEADS_MULTIPLIER - LOWER_RANGE * SECOND_HEADS_MULTIPLIER 
					+ FIRST_HEADS_MULTIPLIER * LOWER_RANGE;
			
		} else {
			
			heads = LOWER_RANGE * FIRST_HEADS_MULTIPLIER + (UPPER_RANGE - LOWER_RANGE)
					* SECOND_HEADS_MULTIPLIER - UPPER_RANGE + age;
			
		}
		
		return heads;
		
	}
	
	static int getNumOfEyes(int heads) {
		
		return heads * DRAGON_EYES;
	}

}
