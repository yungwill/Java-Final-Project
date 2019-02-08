// Helper class that contains a majority of the text in the program

public class Text {
	
	// Strings that contain the text for the game portion of program
	static String attack = " attacked the enemy.\n";
	
	static String enemy_dead = "The enemy is dead.\nYOU WIN!\n";
	
	static String dead = "You are dead.\nGAME OVER\n";
	
	static String bash1 = " ran and bashed the enemy in the head.\n";
	static String bash2 = " flipped behind the enemy and bashed it.\n";
	
	static String charge1 = " charged forward and stabbed the enemy.\n";
	static String charge2 = " circled the enemy before suddenly dashing forward slamming into it.\n";
	
	static String explosive1 = " aimed at the enemy and fired the arrow, exploding in its face.\n";
	static String explosive2 = " shot the arrow into the enemy's mouth causing its head to explode.\n";
	
	static String sneak1 = " disappeared and flanked the enemy, stabbing its behind.\n";
	static String sneak2 = " faded from view and jumped on the enemy stabbing it.\n";
	
	static String fireball1 = " summoned a fireball and launched it at the enemy.\n";
	static String fireball2 = " conjured several small fireballs surrounding the enemy and struck the enemy with them.\n";
	
	static String icicle1 = " created a single large icicle and threw it at the enemy, freezing it in place.\n";
	static String icicle2 = " summoned a field of icicles below the enemy, impaling it.\n";
	
	// Descriptions borrowed from http://dnd.wizards.com/dungeons-and-dragons/what-is-dnd/
	// Text for descriptions of races
	static String human = "Humans are the most adaptable and ambitious people among "
			+ "the common races. \nThey have widely varying tastes, morals, and customs in the many "
			+ "different lands where \nthey have settled. When they settle, though, they stay: they "
			+ "build cities to last \nfor the ages, and great kingdoms that can persist for long centuries. "
			+ "An individual human \nmight have a relatively short life span, but a human nation or culture"
			+ " preserves traditions \nwith origins far beyond the reach of any single human’s memory. "
			+ "They live fully in the \npresent—making them well suited to the adventuring life—but also "
			+ "plan for the future, \nstriving to leave a lasting legacy. Individually and as a group, humans "
			+ "are adaptable \nopportunists, and they stay alert to changing political and social dynamics.";
	
	static String elf = "Elves love nature and magic, art and artistry, music and poetry, "
			+ "and the good things \nof the world. They are more often amused than excited, and more likely "
			+ "to be curious than \ngreedy. They tend to remain aloof and unfazed by petty happenstance. When "
			+ "pursuing \na goal, however, whether adventuring on a mission or learning a new skill or art, "
			+ "elves can \nbe focused and relentless. They are slow to make friends and enemies, and even slower "
			+ "\nto forget them. They reply to petty insults with disdain and to serious insults with vengeance.";
	
	static String dwarf = "Dwarves respect the traditions of their clans, tracing their ancestry "
			+ "back to the founding \nof their most ancient strongholds in the youth of the world, and do not abandon "
			+ "\nthose traditions lightly. Part of those traditions is devotion to the gods of the dwarves, who "
			+ "\nuphold the dwarven ideals of industrious labor, skill in battle, and devotion to the forge.";
	
	// Descriptions borrowed from http://dnd.wizards.com/dungeons-and-dragons/what-is-dnd/
	// Text for descriptions of classes
	static String fighter = "Fighters learn the basics of all combat "
			+ "styles. Every fighter can swing an axe, fence with \na rapier, wield a longsword or a "
			+ "greatsword, use a bow, and even trap foes in a net \nwith some degree of skill. Likewise, "
			+ "a fighter is adept with shields and every form of armor. \nBeyond that basic degree of "
			+ "familiarity, every fighter specializes in certain styles \nof combat. Some concentrate on "
			+ "archery, some on fighting with two weapons at \nonce, and some on augmenting their martial "
			+ "skills with magic. This combination of \nbroad general ability and extensive specialization "
			+ "makes fighters superior combatants on \nbattlefields and in dungeons alike.\nSkills:"
			+ "\nBash - 20 MP\nCharge - 30 MP";
	
	static String ranger = "Warriors of the wilderness, rangers specialize in "
			+ "hunting the monsters that threaten the edges \nof civilization—humanoid raiders, rampaging "
			+ "beasts and monstrosities, terrible giants, \nand even dragons. They learn to track their prey "
			+ "as a predator does, moving stealthily \nthrough the wilds and hiding themselves in brush and rubble. "
			+ "Rangers focus their combat \ntraining on techniques that are particularly useful against their "
			+ "specific favored foes. Thanks \nto their intimate familiarity with the wilds, rangers alsp acquire "
			+ "the ability to cast spells that \nharness nature’s power, much as a druid does. Their spells, like "
			+ "their combat abilities, focus \non speed, stealth, and the hunt.\nSkills:\nExplosive Arrow - 15 MP"
			+ "\nSneak Attack - 15 MP";
	
	static String wizard = "Wizards are supreme magic-users, defined and united as "
			+ "a class by the spells they cast. \nTheir magic conjures elementals from other planes of existence, "
			+ "glimpses the future, or turns \nslain foes into shambling zombies. Their mightiest spells change one "
			+ "substance into another \nor alter a creature’s form, open pathways to other planes of existence, or "
			+ "even kill with a \nsingle word.\nSkills:\nFireball - 25 MP\nIcicle - 20 MP";
	
	// functions that are called based on button pressed and picks and returns randomly between 2 sentences 
	public static String setBash() {
		int rand = (int)(Math.random() * 2) + 1;
		if (rand == 1) return bash1;
		else return bash2;
	}
	
	// functions that are called based on button pressed and picks and returns randomly between 2 sentences 
	public static String setCharge() {
		int rand = (int)(Math.random() * 2) + 1;
		if (rand == 1) return charge1;
		else return charge2;
	}
	
	// functions that are called based on button pressed and picks and returns randomly between 2 sentences 
	public static String setExplosive() {
		int rand = (int)(Math.random() * 2) + 1;
		if (rand == 1) return explosive1;
		else return explosive2;
	}
	
	// functions that are called based on button pressed and picks and returns randomly between 2 sentences 
	public static String setSneak() {
		int rand = (int)(Math.random() * 2) + 1;
		if (rand == 1) return sneak1;
		else return sneak2;
	}
	
	// functions that are called based on button pressed and picks and returns randomly between 2 sentences 
	public static String setFireball() {
		int rand = (int)(Math.random() * 2) + 1;
		if (rand == 1) return fireball1;
		else return fireball2;
	}
	
	// functions that are called based on button pressed and picks and returns randomly between 2 sentences 
	public static String setIcicle() {
		int rand = (int)(Math.random() * 2) + 1;
		if (rand == 1) return icicle1;
		else return icicle2;
	}
	
	// called when basic attack happens and returns string
	public static String setAttack() {
		return attack;
	}
	
	// called when enemy dies and returns string
	public static String setDead() {
		return enemy_dead;
	}
	
	// calls when user dies and returns string
	public static String setSelfDead() {
		return dead;
	}
	
	// takes an int and based on int returns corresponding text for race
	public static String setRaceText(int check) {
		if (check == 1) return human;
		else if (check == 2) return elf;
		else return dwarf;
	}
	
	// takes an int and based on int returns corresponding text for class
	public static String setClassText(int check) {
		if (check == 1) return fighter;
		else if (check == 2) return ranger;
		else return wizard;
	}
}
