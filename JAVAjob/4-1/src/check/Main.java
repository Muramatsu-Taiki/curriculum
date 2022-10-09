package check;

import constants.Constants;

public class Main {
	private static String  firstName = "村松";
	private static String lastName = "大樹";
	
	private void printName(String firstName,String lastName) {
		System.out.println("printNameメソッド→"+ firstName+lastName);
	}
	
	public static void main(String[] args) {
		Pet pet = new Pet(Constants.CHECK_CLASS_JAVA, Constants.CHECK_CLASS_HOGE);
		RobotPet robotpet = new RobotPet(Constants.CHECK_CLASS_R2D2,Constants.CHECK_CLASS_LUKE);
		Main main = new Main();
		main.printName(firstName,lastName);
		pet.introduce();
		robotpet.introduce();
		
	}
}
