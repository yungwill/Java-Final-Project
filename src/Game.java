// Single battle using old school dragon quest model

import java.awt.Image;
import java.awt.image.BufferedImage; // imports libraries
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Game implements ActionListener{
	// Buffers
	static JLabel space = new JLabel("                                           "
			+ "                                                         ");
	static JLabel space2 = new JLabel("                                             "
			+ "                                                          ");
	
	static JLabel name = new JLabel(); // stores user input name
	
	// labels that show user's hp and mp
	static JLabel hp = new JLabel("HP: ");
	static JLabel mp = new JLabel("MP: ");
	static JLabel current_hp = new JLabel();
	static JLabel total_hp = new JLabel();
	static JLabel current_mp = new JLabel();
	static JLabel total_mp = new JLabel();
	
	// integers to store stats
	int str, dex, con, intel, wis, cha;
	String char_class;
	
	// labels that show enemy hp and mp
	static JLabel enemy_hp = new JLabel("HP: ");
	static JLabel enemy_mp = new JLabel("MP: ");
	static JLabel enemy_current_hp = new JLabel("200");
	static JLabel enemy_total_hp = new JLabel("/200");
	static JLabel enemy_current_mp = new JLabel("50");
	static JLabel enemy_total_mp = new JLabel("/50");
	
	// creates an image icon and stores image of the monster
	ImageIcon enemy_img = new ImageIcon("C:\\Users\\will0\\eclipse-workspace\\FinalProject\\src\\Images\\Monster.png");
	// resizes the monster to be bigger
	Image transformed = enemy_img.getImage().getScaledInstance(300, 300, java.awt.Image.SCALE_SMOOTH);
	
	static JLabel enemy = new JLabel(); // label to store monster image
	
	// buttons to take action during the battle
	static JButton button1 = new JButton("Attack");
	static JButton button2 = new JButton("Skill");
	static JButton button3 = new JButton("Run");
	
	static JTextArea description = new JTextArea(); // text area to display what just happened
	
	// panels to place all the components in the right place
	static JPanel game_panel = new JPanel(new BorderLayout());
	static JPanel user_panel = new JPanel(new GridLayout(2, 1));
	static JPanel action_panel = new JPanel(new GridLayout(1, 4));
	static JPanel name_panel = new JPanel(new GridLayout(2, 1));
	static JPanel health_panel = new JPanel(new GridLayout(2, 3, 5, 5));
	
	static JPanel enemy_panel = new JPanel(new BorderLayout());
	static JPanel enemy_health_panel = new JPanel(new GridLayout(2, 3));
	
	public Game() {
		// sets the font for all text in on the page
		name.setFont(new Font("Arial", Font.BOLD, 25));
		
		hp.setFont(new Font("Arial", Font.BOLD, 20));
		mp.setFont(new Font("Arial", Font.BOLD, 20));
		current_hp.setFont(new Font("Arial", Font.BOLD, 20));
		current_mp.setFont(new Font("Arial", Font.BOLD, 20));
		total_hp.setFont(new Font("Arial", Font.BOLD, 20));
		total_mp.setFont(new Font("Arial", Font.BOLD, 20));
		
		enemy_hp.setFont(new Font("Arial", Font.BOLD, 20));
		enemy_mp.setFont(new Font("Arial", Font.BOLD, 20));
		enemy_current_hp.setFont(new Font("Arial", Font.BOLD, 20));
		enemy_current_mp.setFont(new Font("Arial", Font.BOLD, 20));
		enemy_total_hp.setFont(new Font("Arial", Font.BOLD, 20));
		enemy_total_mp.setFont(new Font("Arial", Font.BOLD, 20));
		
		description.setFont(new Font("Arial", Font.BOLD,20));
		
		button1.setFont(new Font("Arial", Font.BOLD, 20));
		button2.setFont(new Font("Arial", Font.BOLD, 20));
		button3.setFont(new Font("Arial", Font.BOLD, 20));
		
		enemy.setIcon(new ImageIcon(transformed)); // store image in label
		enemy.setHorizontalAlignment(JLabel.CENTER); // centers the image
		
		button1.addActionListener(this); // adds buttons to action listener
		button2.addActionListener(this);
		button3.addActionListener(this);
		
		game_panel.add(enemy_panel, BorderLayout.CENTER); // adds enemy and user panels to main panel
		game_panel.add(user_panel, BorderLayout.SOUTH);
		
		enemy_panel.add(enemy, BorderLayout.NORTH); // adds enemy image, health and buffers to panel
		enemy_panel.add(enemy_health_panel, BorderLayout.CENTER);
		enemy_panel.add(space, BorderLayout.EAST);
		enemy_panel.add(space2, BorderLayout.WEST);
		
		enemy_health_panel.add(enemy_hp); // adds enemy hp and mp to panel
		enemy_health_panel.add(enemy_current_hp);
		enemy_health_panel.add(enemy_total_hp);
		
		enemy_health_panel.add(enemy_mp);
		enemy_health_panel.add(enemy_current_mp);
		enemy_health_panel.add(enemy_total_mp);
		
		user_panel.add(description); // adds description and sub panel to user panel
		user_panel.add(action_panel);
		
		action_panel.add(name_panel); // adds name panel and the 3 control buttons to action panel
		action_panel.add(button1);
		action_panel.add(button2);
		action_panel.add(button3);
		
		name_panel.add(name); // add name label and health panel to name panel
		name_panel.add(health_panel);
		
		health_panel.add(hp); // add hp and mp to health panel
		health_panel.add(current_hp);
		health_panel.add(total_hp);
		
		health_panel.add(mp);
		health_panel.add(current_mp);
		health_panel.add(total_mp);
	}
	
	public static JPanel getGamePanel() { // returns main panel when called
		return game_panel;
	}
	
	// takes user inputed stats and sets the hp and mp of character
	public void setStats(String str_data, String dex_data, String con_data, String int_data, 
			String wis_data, String cha_data) {
		str = Integer.parseInt(str_data);
		dex = Integer.parseInt(dex_data);
		con = Integer.parseInt(con_data);
		intel = Integer.parseInt(int_data);
		wis = Integer.parseInt(wis_data);
		cha = Integer.parseInt(cha_data);
		// adds to base 150 hp based on con stat
		current_hp.setText(Integer.toString((int)(150 + (150*(.1*con)))));
		total_hp.setText("/" + (150 + (150*(.1*con))));
		// adds to base 150 mp based on wis stat
		current_mp.setText(Integer.toString((int)(150 + (150*(.1*wis)))));
		total_mp.setText("/" + (150 + (150*(.1*wis))));
	}
	// sets the class the user is based on string taken when called
	public void getClass(String temp_class) {
		char_class = temp_class;
	}
	// sets user name based on string taken when called
	public void getName(String temp_name) {
		name.setText(temp_name);
	}
	
	// function that controls enemies attacks
	public void EnemyAttack() {
		int rand = (int)(Math.random() * 3) + 1; // randomizes int to choose what type of attack enemy does
		int health = Integer.parseInt(current_hp.getText()); // gets user hp
		int mana = Integer.parseInt(enemy_current_mp.getText()); // gets enemy mp
		int dmg;
		
		if (rand == 2) { // checks for which action is taken
			if (mana - 20 > 0) { // checks if there is enough mana to take action
				dmg = (int) (int)(Math.random() * 10) + 30; // calculates damage by randomizing from 1 - 10 + 30
				if(health - dmg > 0) { // checks if user has any health after taking the damage
					current_hp.setText(Integer.toString(health-dmg)); // sets current hp to be after dmg is taken
					// adds to textarea of what happened and damage taken
					description.append("Enemy slashes " + name.getText() + ".\n" + "Damage Dealt: " + dmg + "\n");	
				}
				else if(health - dmg < 0) { // checks if user hp is < 0 after taking dmg
					current_hp.setText("0"); // sets hp to 0
					description.append(Text.setSelfDead()); // tell user that they are dead
					endGame(); // call function to end game
				}
				enemy_current_mp.setText(Integer.toString(mana-20)); // updates enemy mp
			}
			else rand = 1; // if enemy doesn't have enough mana have it do a basic attack
		}
		
		if (rand == 3) {
			if (mana - 25 > 0) {
				dmg = (int) (int)(Math.random() * 10) + 35;
				if(health - dmg > 0) {
					current_hp.setText(Integer.toString(health-dmg));
					description.append("Enemy pounces on " + name.getText() + ".\n" + "Damage Dealt: " + dmg + "\n");
				}
				else if(health - dmg < 0) {
					current_hp.setText("0");
					description.append(Text.setSelfDead());
					endGame();
				}
				enemy_current_mp.setText(Integer.toString(mana-25));
			}
			else rand = 1;
		}
		
		if (rand == 1) {
			dmg = (int) (int)(Math.random() * 10) + 20;
			if(health - dmg > 0) {
				current_hp.setText(Integer.toString(health-dmg));
				description.append("Enemy attacks " + name.getText() +".\n" + "Damage Dealt: " + dmg + "\n");	
			}
			else if(health - dmg < 0) {
				current_hp.setText("0");
				description.append(Text.setSelfDead());
				endGame();
			}
			
		}
	}
	
	// function that ends the game
	public void endGame() {
		button1.setText("");
		button2.setText("");
		button3.setText("Exit");
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Object source = e.getSource();
		
		if (source == button1) { // checks if button1 is pressed
			int temp = Integer.parseInt(enemy_current_hp.getText()); // gets enemy's current hp
			int mana = Integer.parseInt(current_mp.getText()); // gets user's current mp
			int rand, dmg;
			
			if(button1.getText() == "Attack") { // checks what text the button has
				rand = (int)(Math.random() * 10) + 10; // randomizes damage
				dmg = (int) (rand + (rand*(.1*str))); // adds to that damage based on str stat since it is a physical attack
				description.setText(null); // clears textarea
				// adds to text area a description of what happened and dmg done
				description.append(name.getText() + Text.setAttack() + "Damage Dealt: " + dmg + "\n");
				if(temp - dmg > 0) { // checks if enemy health is above 0 after taking dmg
					enemy_current_hp.setText(Integer.toString(temp - dmg)); // updates enemy current hp
					EnemyAttack(); // has the monster do its attack
				}
				else if(temp - dmg < 0) { // checks if enemy hp is < 0
					enemy_current_hp.setText("0"); // sets enemy hp to 0
					description.append(Text.setDead()); // display text saying monster is dead
					endGame(); // end game
				}
			}
			
			// checks what text the button has, the next 3 are based on what class the user chose
			else if(button1.getText() == "Bash") { 
				if (mana - 20 > 0) {
					rand = (int)(Math.random() * 10) + 30;
					dmg = (int) (rand + (rand*(.1*str)));
					description.setText(null);
					description.append(name.getText() + Text.setBash() + "Damage Dealt: " + dmg + "\n");
					if(temp - dmg > 0) {
						enemy_current_hp.setText(Integer.toString(temp - dmg));
						EnemyAttack();
					}
					else if(temp - dmg < 0) {
						enemy_current_hp.setText("0");
						description.append(Text.setDead());
						endGame();
					}
					current_mp.setText(Integer.toString(mana-20));
				}
			}
			else if(button1.getText() == "Explosive Arrow") {
				if (mana - 15 > 0) {
					rand = (int)(Math.random() * 10) + 25;
					dmg = (int) (rand + (rand*(.1*str)));
					description.setText(null);
					description.append(name.getText() + Text.setExplosive() + "Damage Dealt: " + dmg + "\n");
					if(temp - dmg > 0) {
						enemy_current_hp.setText(Integer.toString(temp - dmg));
						EnemyAttack();
					}
					else if(temp - dmg < 0) {
						enemy_current_hp.setText("0");
						description.append(Text.setDead());
						endGame();
					}
					current_mp.setText(Integer.toString(mana-15));
				}
			}
			else if(button1.getText() == "Fireball") {
				if (mana - 25 > 0) {
					rand = (int)(Math.random() * 10) + 30;
					dmg = (int) (rand + (rand*(.1*intel))); // dmg modifier is intel since it is a magic attack
					description.setText(null);
					description.append(name.getText() + Text.setFireball() + "Damage Dealt: " + dmg + "\n");
					if(temp - dmg > 0) {
						enemy_current_hp.setText(Integer.toString(temp - dmg));
						EnemyAttack();
					}
					else if(temp - dmg < 0) {
						enemy_current_hp.setText("0");
						description.append(Text.setDead());
						endGame();
					}
					current_mp.setText(Integer.toString(mana-25));
				}
			}
		}
		
		if (source == button2) { // check if button2 is pressed
			int temp = Integer.parseInt(enemy_current_hp.getText());
			int mana = Integer.parseInt(current_mp.getText());
			int rand, dmg;
			
			if(button2.getText() == "Skill") { // check if text is Skill
				if (char_class == "Fighter") { // based on class if button is pressed change text to different skills
					button1.setText("Bash");
					button2.setText("Charge");
				}
				if (char_class == "Ranger") {
					button1.setText("Explosive Arrow");
					button2.setText("Sneak Attack");
				}
				if (char_class == "Wizard") {
					button1.setText("Fireball");
					button2.setText("Icicle");
				}
				button3.setText("Back"); // 3d button is always back button
			}
			
			// checks which skill user has pressed and deals the damage to enemy
			else if(button2.getText() == "Charge") {
				if (mana - 30 > 0) {
					rand = (int)(Math.random() * 10) + 35;
					dmg = (int) (rand + (rand*(.1*str)));
					description.setText(null);
					description.append(name.getText() + Text.setCharge() + "Damage Dealt: " + dmg + "\n");
					if(temp - dmg > 0) {
						enemy_current_hp.setText(Integer.toString(temp - dmg));
						EnemyAttack();
					}
					else if(temp - dmg < 0) {
						enemy_current_hp.setText("0");
						description.append(Text.setDead());
						endGame();
					}
					current_mp.setText(Integer.toString(mana-30));
				}
			}
			else if(button2.getText() == "Sneak Attack") {
				if (mana - 15 > 0) {
					rand = (int)(Math.random() * 10) + 20;
					dmg = (int) (rand + (rand*(.1*str)));
					description.setText(null);
					description.append(name.getText() + Text.setSneak() + "Damage Dealt: " + dmg + "\n");
					if(temp - dmg > 0) {
						enemy_current_hp.setText(Integer.toString(temp - dmg));
						EnemyAttack();
					}
					else if(temp - dmg < 0) {
						enemy_current_hp.setText("0");
						description.append(Text.setDead());
						endGame();
					}
					current_mp.setText(Integer.toString(mana-15));
				}
			}
			else if(button2.getText() == "Icicle") {
				if (mana - 20 > 0) {
					rand = (int)(Math.random() * 10) + 25;
					dmg = (int) (rand + (rand*(.1*intel)));
					description.setText(null);
					description.append(name.getText() + Text.setIcicle() + "Damage Dealt: " + dmg + "\n");
					if(temp - dmg > 0) {
						enemy_current_hp.setText(Integer.toString(temp - dmg));
						EnemyAttack();
					}
					else if(temp - dmg < 0) {
						enemy_current_hp.setText("0");
						description.append(Text.setDead());
						endGame();
					}
					current_mp.setText(Integer.toString(mana-20));
				}
			}
		}
		
		if (source == button3) { // check if 3rd button 
			if(button3.getText() == "Run") { // ends game if pressed
				description.append(Text.setSelfDead());
				endGame();
			}
			if(button3.getText() == "Back") { // takes user from skills menu to main menu button controls
				button1.setText("Attack");
				button2.setText("Skill");
				button3.setText("Run");
			}
		}
	}
}
