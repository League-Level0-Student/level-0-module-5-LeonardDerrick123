package _03_method_writing._2_happy_pet;

import javax.swing.JOptionPane;

public class HappyPet {

	// 2. Add the following variable to the next line: static int happinessLevel =
	// 0;
	// this will be used to store the happiness of your pet
	static int happinessLevel = 0;

	public static void main(String[] args) {
		// 1. Ask the user what kind of pet they want to buy, and store their answer in
		// a variable
		String TGyu1 = JOptionPane.showInputDialog("what kind of pet do you whant to buy");
		// 7. REPEAT steps 3 - 6 enough times to make your pet happy!

		// 3. Use showOptionDialog to ask the user what they want to do to make their
		// pet happy
		// (eg: cuddle, food, water, take a walk, groom, clean up poop).
		// Make sure to customize the title and question too.
		for (int i = 0; i < 30; i++) {

			int task = JOptionPane.showOptionDialog(null, "What do you whant to do to make your pet happy", "Happy pet",
					0, JOptionPane.INFORMATION_MESSAGE, null,
					new String[] { "food", "water", "walk", "groom", "pøØP$¢O0P", "neuter" }, null);

			// 5. Use user input to call the appropriate method created in step 4.
			if (happinessLevel > 25) {
				JOptionPane.showMessageDialog(null, "your pet is happy");
				break;
			}

			// 6. If you determine the happiness level is large enough, tell the
			// user that he loves his pet and use break; to exit for loop.
			if (task == 0) {
				food();
			}
			if (task == 1) {
				water();
			}
			if (task == 2) {
				walk();
			}
			if (task == 3) {
				groom();
			}
			if (task == 4) {
				pøØP$¢O0P();
			}
			if (task == 5) {
				neuter();
			}
			
			JOptionPane.showMessageDialog(null, happinessLevel);
		}
	}

	// 4. Create methods to handle each of your user selections.
	// Each method should create a pop-up with the pet's response (eg. cat might
	// purr when pet),
	// and INCREMENT the pet's happiness Level.
	public static void food() {
		happinessLevel += 70;
		System.out.println("pet is happy while eating");
	}

	public static void water() {
		happinessLevel++;
		System.out.println("pet is happy while drinking");
	}

	public static void walk() {
		happinessLevel++;
		System.out.println("pet is happy getting exercise");
	}

	public static void groom() {
		happinessLevel--;
		System.out.println("pet is not happy being groomed");
	}

	public static void pøØP$¢O0P() {
		happinessLevel -= 70;
		System.out.println(
				"pet is not happy having its poop scooped so people wont step on it and carry the smell around all day or tripping an falling with is falling out their shoe so it is stinky and slippery the whole way");
	}

	public static void neuter() {
		happinessLevel -= 7000;
		System.out.println("pet is angry and depressed you monster");
	}
}