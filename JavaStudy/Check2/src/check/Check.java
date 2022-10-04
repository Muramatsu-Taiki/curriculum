package check;

import constants.Constants;

public class Check {
	private static String  firstName = "村松";
	private static String lastName = "大樹";
	
	private void printName(String firstName,String lastName) {
		System.out.println("printNameメソッド→"+ firstName+lastName);
	}
	
//	public static String getLastName() {
//		return lastName;
//	}
//
//	public static void setLastName(String lastName) {
//		Check.lastName = lastName;
//	}
//
//	public static String getFirstName() {
//		return firstName;
//	}
//
//	public static void setFirstName(String firstName) {
//		Check.firstName = firstName;
//	}
//	
//	private void StriprintName() {
//		System.out.println(getLastName()+getFirstName());
//	}
	
	public static void main(String[] args) {
		Pet pet = new Pet(Constants.CHECK_CLASS_JAVA, Constants.CHECK_CLASS_HOGE);
		RobotPet robotpet = new RobotPet(Constants.CHECK_CLASS_R2D2,Constants.CHECK_CLASS_LUKE);
		Check check = new Check();
		check.printName(firstName,lastName);
		pet.introduce();
		robotpet.introduce();
		
	}
	
}

