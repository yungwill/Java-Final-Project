/* William Yung
 * CPSC 223J Section 01
 * Final Project
 * 
 * Program allows the user to create a classic RPG character that is based on Dungeons and Dragons.
 * It starts at the Race page followed by 3 sub pages that give information on the 3 available races, Human, Elf, and Dwarf
 * Then leads to the Class page which is also followed by 3 sub pages with information on the 3 classes, Fighter, Ranger,
 * and Wizard.
 * After is the Stats page which allows the user to modify his/her stats
 * From there leads to the Personal Data page which allows the user to choose their name, gender, weapon, alignment, etc.
 * This all accumulates to an Overview page which displays all the choices the user has made.
 * When the user finishes creating their character the program takes the user to a classic turn based RPG battle which
 * uses the data taken previously changes the battle accordingly.
 * Certain stats will give more health or mana or allow the user to deal more damage. Classes will give the user different
 * skills to use.
 * Defeating or losing to the enemy will finish the program.
 */

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CharacterCreationMenu menu = new CharacterCreationMenu(); // create new instance of class
		menu.setVisible(true); // sets visibility of window to be seen
	}
}
