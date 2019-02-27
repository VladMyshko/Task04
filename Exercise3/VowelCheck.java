final class VowelCheck {
	
	
	private static final char[] VOWELS={'e', 'y', 'u', 'i', 'o', 'a', 'E', 'Y', 'U', 'I', 'O', 'A'};
	
	static boolean isVowel(char letter) {
		
		boolean isVowel=false;
		
		for(char c:VOWELS){
			if(letter == c){
				isVowel=true;
			}
		}
    		return isVowel;
	
	}
}

