public class Task1 {

	public static void main(String[] args) {
		
		int age = 2;
		
		System.out.println("Number of heads: " + DragonHead.getNumOfHeads(age) + "\nNumber of eyes: " 
		+ DragonHead.getNumOfEyes(DragonHead.getNumOfHeads(age)));

	}

}
